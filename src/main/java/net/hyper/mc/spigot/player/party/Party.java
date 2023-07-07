package net.hyper.mc.spigot.player.party;

import lombok.Data;
import net.hyper.mc.spigot.bungeecord.BungeeAction;
import net.hyper.mc.spigot.utils.TokenCreator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.json.JSONObject;

import java.util.*;


@Data
public class Party {

    private Date createTime = new Date();
    private String id = TokenCreator.createToken(4, 8);
    private String name;
    private PartyPlayer owner;
    private int maxSize = 5;
    private Map<PartyPlayer, PartyRole> members = new HashMap<>();
    private Map<String, Long> convites = new HashMap<>();
    private boolean open = false;

    public Party(){}

    public Party(Player owner){
        this.owner = owner;
        this.name = "§7Party do "+owner.getName();
    }

    public void broadcast(String message){
        members.keySet().forEach(p -> Bukkit.sendMessage((Player) p, message));
    }

    public void broadcast(String message, PartyRole role){
        members.forEach((p, r) -> {
            if(r == role){
                Bukkit.sendMessage((Player) p, message);
            }
        });
    }

    public void addConvite(String target){
        Calendar cl = Calendar.getInstance();
        cl.add(Calendar.MINUTE, 5);
        convites.put(target, cl.getTimeInMillis());
    }
    public void addMember(PartyPlayer player){
        members.put(player, PartyRole.MEMBER);
    }

    public boolean hasMember(String player){
        return members.keySet().stream().anyMatch(p -> p.getName().equalsIgnoreCase(player));
    }
    public boolean hasMember(PartyPlayer player){
        return hasMember(player.getName());
    }

    public static Party getPartyFromJson(JSONObject json){
        Party party = new Party();
        party.setId(json.getString("id"));
        party.setName(json.getString("name"));
        party.setOwner(Bukkit.getPartyPlayer(json.getString("name")));
        party.setOpen(json.getBoolean("open"));
        party.setMaxSize(json.getInt("maxSize"));
        Map<PartyPlayer, PartyRole> members = new HashMap<>();
        json.getJSONObject("members").toMap().forEach((k, o) -> {
            members.put(Bukkit.getPartyPlayer(k), PartyRole.valueOf((String) o));
        });
        Map<String, Long> convites = new HashMap<>();
        json.getJSONObject("convites").toMap().forEach((k, o) -> {
            convites.put(k, (long) o);
        });
        party.setConvites(convites);
        party.setMembers(members);
        return party;
    }

    public JSONObject getPartyJson(){
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("owner", owner.getName());
        object.put("maxSize", maxSize);
        JSONObject mbrs = new JSONObject();
        members.forEach((m, r) -> mbrs.put(m.getName(), r.toString()));
        object.put("members", mbrs);
        object.put("convites", convites);
        object.put("open", open);
        return object;
    }
}

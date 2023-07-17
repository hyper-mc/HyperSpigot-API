package net.hyper.mc.spigot.lobbies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hyper.mc.spigot.utils.TokenCreator;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldLobby {

    private String id = TokenCreator.createToken(48);
    private String type;
    private String event;
    private Location location;
    private boolean prime = false;

    public WorldLobby(String type, String event, Location location, boolean prime) {
        this.type = type;
        this.event = event;
        this.location = location;
        this.prime = prime;
    }

    public WorldLobby(String type, String event, Location location) {
        this.type = type;
        this.event = event;
        this.location = location;
    }

    public World getWorld(){
        return location.getWorld();
    }

    public List<Player> getPlayers(){
        return getWorld().getPlayers();
    }

    public boolean hasPlayer(Player player){
        return getPlayers().contains(player);
    }
    public void teleport(Player player){
        player.sendMessage("§aConectando...");
        player.teleport(location);
    }
}

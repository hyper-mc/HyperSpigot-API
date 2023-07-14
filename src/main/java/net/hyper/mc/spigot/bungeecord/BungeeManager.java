package net.hyper.mc.spigot.bungeecord;

import net.hyper.mc.spigot.bungeecord.item.Server;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public interface BungeeManager {

    void requestUpdate(BungeeAction action, Player player, Object value);

    public Map<String, Object> getServerInfo(String server);
    public boolean hasPlayer(String name);
    public void sendMessage(String name, String message);
    public void sendMessage(Player player, String message);
    public int getOnlineCount();
    public String getServerName();
    public CopyOnWriteArrayList<Server> getServerItems();

}

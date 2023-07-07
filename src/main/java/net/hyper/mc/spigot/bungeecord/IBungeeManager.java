package net.hyper.mc.spigot.bungeecord;

import org.bukkit.entity.Player;

import java.util.Map;

public interface IBungeeManager{

    void requestUpdate(BungeeAction action, Player player, Object value);

    public Map<String, Object> getServerInfo(String server);
    public boolean hasPlayer(String name);
    public void sendMessage(String name, String message);
    public void sendMessage(Player player, String message);
    public int getOnlineCount();

}

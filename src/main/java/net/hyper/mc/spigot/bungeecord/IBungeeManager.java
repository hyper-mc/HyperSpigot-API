package net.hyper.mc.spigot.bungeecord;

import org.bukkit.entity.Player;

import java.util.Map;

public interface IBungeeManager{

    void requestUpdate(BungeeAction action, Player player, Object value);

    public Map<String, Object> getServerInfo(String server);

    public int getOnlineCount();

}

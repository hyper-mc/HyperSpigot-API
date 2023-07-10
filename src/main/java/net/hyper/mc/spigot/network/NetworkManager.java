package net.hyper.mc.spigot.network;

import java.util.List;

public interface NetworkManager {

    boolean hasPlayer(String name);
    List<String> getOnlinePlayers();
    int getOnlineCount();
}

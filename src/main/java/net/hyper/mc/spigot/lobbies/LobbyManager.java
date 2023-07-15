package net.hyper.mc.spigot.lobbies;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public interface LobbyManager {

    WorldLobby addSpawn(String type, String event, Location location);
    void removeSpawn(WorldLobby lobby);
    WorldLobby getLobbyInWorld(World world);
    boolean hasLobbyInWorld(World world);
    boolean hasLobbyID(String id );
    WorldLobby getLobbyWithId(String ID);
    List<WorldLobby> getLobby(String type, String event);
    List<String> getNetworkLobby(String type, String event);
    CopyOnWriteArrayList<ServerLobby> getNetworkLobbies();
    CopyOnWriteArrayList<WorldLobby> getLobbies();
    void setServerType(String type);
    String getServerType();
    int getOnlineInLobbyID(String id);
    void save();
}

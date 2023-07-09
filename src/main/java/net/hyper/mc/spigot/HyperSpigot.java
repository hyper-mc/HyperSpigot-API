package net.hyper.mc.spigot;

import net.hyper.mc.msgbrokerapi.HyperMessageBroker;
import net.hyper.mc.spigot.bungeecord.IBungeeManager;
import net.hyper.mc.spigot.player.role.RoleManager;
import net.hyper.mc.spigot.player.scoreboard.BoardManager;
import net.hyper.mc.spigot.player.scoreboard.settings.BoardSettings;

public interface HyperSpigot {

    HyperMessageBroker getMessenger();
    IBungeeManager getBungeeManager();
    RoleManager getRoleManager();
    BoardManager createBoardManager(BoardSettings settings);
    void setData(String name, String key, Object value);
}

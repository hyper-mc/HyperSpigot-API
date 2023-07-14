package net.hyper.mc.spigot;

//import net.hyper.mc.inventories.InventoriesPlugin;
import net.hyper.mc.msgbrokerapi.HyperMessageBroker;
import net.hyper.mc.spigot.bungeecord.BungeeManager;
import net.hyper.mc.spigot.player.role.RoleManager;
import net.hyper.mc.spigot.player.scoreboard.BoardManager;
import net.hyper.mc.spigot.player.scoreboard.settings.BoardSettings;
import org.bukkit.World;

import java.io.File;

public interface HyperSpigot {

    HyperMessageBroker getMessenger();
    BungeeManager getBungeeManager();
    RoleManager getRoleManager();
    BoardManager createBoardManager(BoardSettings settings);
    void setData(String name, String key, Object value);
    void copyWorldFolder(File source, File targer);
    File createWorldBackup(String pluginName, World world);
    World loadWorld(String worldName);
}

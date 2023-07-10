package net.hyper.mc.spigot.player.scoreboard;

import net.hyper.mc.spigot.player.role.Role;
import net.hyper.mc.spigot.player.role.RoleManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.List;

public interface TeamManager {

    void setScoreboard(Scoreboard scoreboard);
    Team setCustomTeam(int order, String name, String key);

}

package net.hyper.mc.spigot.player.role;

import org.bukkit.entity.Player;

public interface RoleManager {

    Role getRole(Player player);
    Role getDefault();
}

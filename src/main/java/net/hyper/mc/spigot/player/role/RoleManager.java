package net.hyper.mc.spigot.player.role;

import org.bukkit.entity.Player;

import java.util.List;

public interface RoleManager {

    Role getRole(Player player);
    Role getDefault();
    List<Role> getRoles();
}

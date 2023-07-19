package net.hyper.mc.spigot.model;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface ConfirmModel {

    void run(Player player, InventoryClickEvent evt);
}

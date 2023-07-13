package net.hyper.mc.spigot.player.hotbar;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public interface HotBar {

    Map<Integer, ItemStack> getItems(Player player);
    void clickEvent(ItemStack item, int slot, Player player);
}

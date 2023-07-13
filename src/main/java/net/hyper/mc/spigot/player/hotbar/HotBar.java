package net.hyper.mc.spigot.player.hotbar;

import org.bukkit.inventory.ItemStack;

import java.util.Map;

public interface HotBar {

    Map<Integer, ItemStack> getItems();
    void clickEvent(ItemStack item, int slot);
}

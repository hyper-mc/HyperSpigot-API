package org.bukkit.inventory;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ItemCreator {

    protected ItemStack item;

    public ItemCreator(final ItemStack item) {
        this.item = item;
    }

    public ItemCreator(final Material mat) {
        this.item = new ItemStack(mat);
    }

    public ItemCreator(final Material mat, final int amount) {
        this.item = new ItemStack(mat, amount);
    }

    public ItemCreator(final Material mat, final byte data) {
        this.item = new ItemStack(mat, 1, data);
    }

    public ItemCreator(final Material mat, final byte data, final int amount) {
        this.item = new ItemStack(mat, amount, data);
    }

    public ItemCreator withName(final String name) {
        final ItemMeta meta = this.item.getItemMeta();
        meta.setDisplayName(name);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemCreator withData(final int data) {
        final MaterialData meta = this.item.getData();
        item.getData().setData((byte) data);
        return this;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public ItemCreator withLore(final String... lore) {
        final ItemMeta meta = this.item.getItemMeta();
        meta.setLore((List) Arrays.asList(lore));
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemCreator withArrayLore(final List<String> lore) {
        final ItemMeta meta = this.item.getItemMeta();
        meta.setLore((List) lore);
        this.item.setItemMeta(meta);
        return this;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public ItemCreator addLore(List<String> lore) {
        final ItemMeta meta = this.item.getItemMeta();
        final List<String> a = new ArrayList<>();
        for (final String s : lore) {
            a.add(s);
        }
        meta.setLore(a);
        this.item.setItemMeta(meta);
        return this;
    }

    @SuppressWarnings("deprecation")
    public ItemCreator withColor(int r, int g, int b) {
        final LeatherArmorMeta meta = (LeatherArmorMeta) this.item.getItemMeta();
        meta.setColor(Color.fromRGB(r, g, b));
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemCreator withDurability(short id){
        item.setDurability(id);
        return this;
    }

    public ItemCreator withOwner(final String owner) {
        if (this.item.getType().equals((Object) Material.SKULL_ITEM)) {
            this.item.setDurability((short) 3);
            final SkullMeta m = (SkullMeta) this.item.getItemMeta();
            m.setOwner(owner);
            this.item.setItemMeta((ItemMeta) m);
        }
        return this;
    }

    public ItemCreator withAmount(final int amount) {
        this.item.setAmount(amount);
        return this;
    }

    public ItemCreator withEnchant(final Enchantment e, final int lvl) {
        this.item.addUnsafeEnchantment(e, lvl);
        return this;
    }

    public ItemCreator withEffect(final PotionEffect e) {
        if (!this.item.getType().equals((Object) Material.POTION)) {
            return this;
        }
        final PotionMeta pm = (PotionMeta) this.item.getItemMeta();
        pm.addCustomEffect(e, true);
        this.item.setItemMeta((ItemMeta) pm);
        return this;
    }

    public ItemCreator unbreakable() {
        this.item.getItemMeta().spigot().setUnbreakable(true);
        return this;
    }

    public ItemCreator removeItemFlag(ItemFlag flag) {
        this.item.getItemMeta().removeItemFlags(flag);
        return this;
    }

    public ItemCreator removeFlags() {
        for (ItemFlag itemFlag : ItemFlag.values()) {
            this.item.getItemMeta().removeItemFlags(itemFlag);
        }
        return this;
    }

    public abstract ItemCreator withTexture(String url);

    public ItemStack done() {
        return this.item;
    }

}

package net.hyper.mc.spigot.bungeecord.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemCreator;

@Data
@AllArgsConstructor
public class ServerItem {

    private String material;
    private int amount = 0;
    private int data = 0;
    private String texture;

    public ItemCreator toItemCreator(){
        ItemCreator itemCreator = Bukkit
                .createItemCreator(Material.getMaterial(material))
                .withData(data)
                .withTexture(texture)
                .withAmount(amount);
        return itemCreator;
    }
}

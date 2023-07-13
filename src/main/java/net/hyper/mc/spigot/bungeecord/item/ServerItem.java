package net.hyper.mc.spigot.bungeecord.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServerItem {

    private String material;
    private int amount = 0;
    private int data = 0;
    private String texture;
}

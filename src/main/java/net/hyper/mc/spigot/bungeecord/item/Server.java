package net.hyper.mc.spigot.bungeecord.item;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Server {

    private String name;
    private int slot;
    private List<String> description;
    private List<String> bungeeserver;
    private String item;
    private boolean prime;
    private boolean connectable;
}

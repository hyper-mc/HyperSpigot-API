package net.hyper.mc.spigot.player.role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role {
    private String name;
    private String tag;
    private int order;
    private int partysize;
    private int multiplier;
    private boolean multicolor;
}

package net.hyper.mc.spigot.world;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {

    private String world;
    private double x;
    private double y;
    private double z;

    public Position(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Location convertToLocation(){
        World w = Bukkit.getHyperSpigot().loadWorld(world);
        return new Location(w, x, y, z);
    }
}

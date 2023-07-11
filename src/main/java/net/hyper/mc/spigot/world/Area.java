package net.hyper.mc.spigot.world;

import org.bukkit.Location;
import org.bukkit.World;

public class Area {

    private String name;
    private Location pos1;
    private Location pos2;

    private Location max;
    private Location min;

    public Area(String name, Location pos1, Location pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.name = name;

        min = new Location(pos1.getWorld(),
                getMin(pos1.getX(), pos2.getX()),
                getMin(pos1.getY(), pos2.getY()),
                getMin(pos1.getZ(), pos2.getZ()));

        max = new Location(pos1.getWorld(),
                getMax(pos1.getX(), pos2.getX()),
                getMax(pos1.getY(), pos2.getY()),
                getMax(pos1.getZ(), pos2.getZ()));
    }

    public String getName() {
        return name;
    }

    /**
     * Verifica se um Location especifico está dentro da area
     *
     * @param loc Localiazação
     */
    public boolean checkIfsItIn(Location loc) {
        return (min.getX() >= loc.getX()
                && min.getY() >= loc.getY()
                && min.getZ() >= loc.getZ()
                && max.getX() >= loc.getX()
                && max.getY() >= loc.getY()
                && max.getZ() >= loc.getZ());
    }

    public Location getMinLocation() {
        return min;
    }

    public Location getMaxLocation() {
        return max;
    }

    private double getMin(double a, double b) {
        return a < b ? a : b;
    }

    private double getMax(double a, double b) {
        return a > b ? a : b;
    }

    public Area copy(World w) {
        Location pos1Clone = pos1.clone();
        pos1Clone.setWorld(w);
        Location pos2Clone = pos2.clone();
        pos2Clone.setWorld(w);
        Area area = new Area(name, pos1Clone, pos2Clone);
        return area;
    }
}
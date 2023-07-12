package net.hyper.mc.spigot.player.stats;

public interface PlayerStatisticsManager {

    StatisticsContainer getStats(String key);
    void save(String key, StatisticsContainer container);

}

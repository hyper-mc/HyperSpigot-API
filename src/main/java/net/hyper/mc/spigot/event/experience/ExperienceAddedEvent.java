package net.hyper.mc.spigot.event.experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


@Data
@AllArgsConstructor
public class ExperienceAddedEvent extends Event {

    private Player player;
    private long experience;
    @Override
    public HandlerList getHandlers() {
        return new HandlerList();
    }
}

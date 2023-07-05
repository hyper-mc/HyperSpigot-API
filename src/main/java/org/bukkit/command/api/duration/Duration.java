package org.bukkit.command.api.duration;

import lombok.Data;

@Data
public class Duration {
    private final String parsed;
    private final long time;
}

package net.hyper.mc.spigot.lobbies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hyper.mc.spigot.utils.TokenCreator;
import org.bukkit.Location;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldLobby {

    private String id = TokenCreator.createToken(12);
    private String type;
    private String event;
    private Location location;
    private boolean prime = false;

    public WorldLobby(String type, String event, Location location, boolean prime) {
        this.type = type;
        this.event = event;
        this.location = location;
        this.prime = prime;
    }

    public WorldLobby(String type, String event, Location location) {
        this.type = type;
        this.event = event;
        this.location = location;
    }
}

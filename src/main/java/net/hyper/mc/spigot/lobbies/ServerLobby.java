package net.hyper.mc.spigot.lobbies;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class ServerLobby {

    private String serverName;
    private Map<String, List<String>> lobbiesId;
}

package net.hyper.mc.spigot.player.scoreboard.settings;

import lombok.Builder;
import lombok.Getter;
import net.hyper.mc.spigot.player.scoreboard.provider.BoardProvider;

@Getter
@Builder
public class BoardSettings {

    private BoardProvider boardProvider;

    private ScoreDirection scoreDirection;
    private boolean defaultScoreboard = false;

}

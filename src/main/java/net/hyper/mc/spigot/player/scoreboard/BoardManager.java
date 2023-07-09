package net.hyper.mc.spigot.player.scoreboard;

import net.hyper.mc.spigot.player.scoreboard.board.Board;
import net.hyper.mc.spigot.player.scoreboard.settings.BoardSettings;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface BoardManager {

    void setBoardSettings(BoardSettings boardSettings);
    boolean hasBoard(Player player);
    Optional<Board> getBoard(Player player);
    Map<UUID, Board> getScoreboards();
}

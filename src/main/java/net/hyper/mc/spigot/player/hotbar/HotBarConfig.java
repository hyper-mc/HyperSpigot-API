package net.hyper.mc.spigot.player.hotbar;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotBarConfig {

    private boolean cancelEvents = false; // cancela todos os eventos relacionados ao inv do player
    private boolean moveItems = false; // cancela o movimento dos itens do inv do player
    private boolean dropItems = false; // cancela o drop de itens do inv do player;
}

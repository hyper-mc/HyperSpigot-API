package net.hyper.mc.spigot.player.party;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PartyRole {

    OWNER("Dono"), MANAGER("Manager"), MODERATOR("Moderador"), MEMBER("Membro");

    private String name;
}

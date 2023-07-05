package org.bukkit.command.defaults;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class PingCommand extends BukkitCommand {
    public PingCommand() {
        super("ping",
                "Verifique seu ping",
                "/ping [nickname]",
                Arrays.asList("pingother"));
        this.setPermission("spigot.ping");
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("Somente players podem executar este comando.");
            return false;
        }
        Player player = (Player) sender;
        if(args.length == 0){
            sender.sendMessage("§aSeu ping é §b"+player.getPing()+"ms§a.");
            return false;
        }

        String arg = args[0];
        Player target = Bukkit.getPlayer(arg);
        if(target != null){
            if(sender.hasPermission("spigot.ping.other")) {
                sender.sendMessage("§aO ping de §7" + target.getDisplayName() + "§a é de §b" + target.getPing() + "ms§a.");
            }
            return false;
        }
        sender.sendMessage("§cEste comando ou player não existe!");
        return false;
    }
}

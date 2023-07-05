package org.bukkit.command.api.paramter.impl;

import org.bukkit.command.api.paramter.Processor;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class DoubleProcessor extends Processor<Double> {
    public Double process(CommandSender sender, String supplied) {
        try {
            return Double.parseDouble(supplied);
        } catch(Exception ex) {
            sender.sendMessage(ChatColor.RED + "The value you entered '" + supplied + "' is an invalid double.");
            return 0D;
        }
    }
}

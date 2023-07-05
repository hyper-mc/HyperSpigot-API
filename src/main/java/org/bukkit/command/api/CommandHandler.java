package org.bukkit.command.api;

import com.google.common.reflect.ClassPath;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.bukkit.command.api.help.Help;
import org.bukkit.command.api.help.HelpNode;
import org.bukkit.command.api.node.CommandNode;
import org.bukkit.command.api.paramter.ParamProcessor;
import org.bukkit.command.api.paramter.Processor;
import org.bukkit.plugin.Plugin;

import java.util.*;

public class CommandHandler {
    @Getter @Setter private static Plugin plugin;


}

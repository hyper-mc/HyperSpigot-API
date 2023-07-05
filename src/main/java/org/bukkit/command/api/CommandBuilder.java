package org.bukkit.command.api;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class CommandBuilder {

    private String name;
    private String description;
    private String permission;
    private HelpCommand helpCommand;
    private boolean playerOnly = false;
    private Map<String, SubCommand> subcommands = new HashMap<>();

    public CommandBuilder(String name) {
        this.name = name;
    }

    public CommandBuilder description(String description){
        this.description = description;
        return this;
    }

    public CommandBuilder permissing(String permission){
        this.permission = permission;
        return this;
    }

    public CommandBuilder helpCommand(HelpCommand execute){
        this.helpCommand = execute;
        return this;
    }

    public CommandBuilder addSubCommand(SubCommand subCommand){
        subcommands.put(subCommand.name, subCommand);
        return this;
    }

    interface HelpCommand{
        void execute(CommandSender sender);
    }

    @Getter @Setter
    class SubCommand{

        String name;
        String description;
        String permission;
        CommandBuilder.HelpCommand helpCommand;
        Map<String, SubCommand> subcommands = new HashMap<>();

        public SubCommand(String name) {
            this.name = name;
        }

        public SubCommand description(String description){
            this.description = description;
            return this;
        }

        public SubCommand permissing(String permission){
            this.permission = permission;
            return this;
        }

        public SubCommand helpCommand(HelpCommand execute){
            this.helpCommand = execute;
            return this;
        }

        public SubCommand addSubCommand(SubCommand subCommand){
            subcommands.put(subCommand.name, subCommand);
            return this;
        }
    }
}

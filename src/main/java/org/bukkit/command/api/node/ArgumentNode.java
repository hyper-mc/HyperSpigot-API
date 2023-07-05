package org.bukkit.command.api.node;

import lombok.Data;

import java.lang.reflect.Parameter;

@Data
public class ArgumentNode {
    // Argument information
    private final String name;
    private final boolean concated;
    private final boolean required;

    // Reflection information
    private final Parameter parameter;
}

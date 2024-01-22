/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class TabCompleter implements org.bukkit.command.TabCompleter {
    final List<String> results = new ArrayList<>();

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("vanillaplus")) {
            if (args.length == 1) {
                results.clear();
                if (sender.hasPermission(Constants.PERMISSION_VERSION)) results.add("version");
                if (sender.hasPermission(Constants.PERMISSION_RELOAD)) results.add("reload");
            } else results.clear();
        }

        return results;
    }
}
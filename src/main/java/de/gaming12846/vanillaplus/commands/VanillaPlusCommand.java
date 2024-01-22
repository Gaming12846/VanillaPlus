/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.commands;

import de.gaming12846.vanillaplus.VanillaPlus;
import de.gaming12846.vanillaplus.utils.ConfigUtil;
import de.gaming12846.vanillaplus.utils.Constants;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;

public class VanillaPlusCommand implements CommandExecutor {
    private final VanillaPlus plugin;

    public VanillaPlusCommand(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        ConfigUtil langConfig = plugin.getLanguageConfig();

        if (args.length == 0) {
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("invalid-syntax") + " " + ChatColor.RESET + langConfig.getString("invalid-syntax-use") + label + " <version|reload>");
            return true;
        }

        // Version subcommand
        if (args[0].equalsIgnoreCase("version")) {
            if (!sender.hasPermission(Constants.PERMISSION_VERSION)) {
                sender.sendMessage(ChatColor.RED + langConfig.getString("no-permission"));
                return true;
            }

            if (args.length != 1) {
                sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("invalid-syntax") + " " + ChatColor.RESET + langConfig.getString("invalid-syntax-use") + label + " version");
                return true;
            }

            PluginDescriptionFile description = plugin.getDescription();
            String headerFooter = ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + StringUtils.repeat("-", 36);

            sender.sendMessage(Constants.PLUGIN_PREFIX + headerFooter);
            sender.sendMessage(Constants.PLUGIN_PREFIX);
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("vanillaplus.version") + " " + ChatColor.WHITE + description.getVersion());
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("vanillaplus.developer") + " " + ChatColor.WHITE + description.getAuthors().get(0));
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("vanillaplus.plugin-website"));
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.WHITE + description.getWebsite());
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getString("vanillaplus.report-bugs"));
            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.WHITE + "https://github.com/Gaming12846/VanillaPlus/issues");
            sender.sendMessage(Constants.PLUGIN_PREFIX);
            sender.sendMessage(Constants.PLUGIN_PREFIX + headerFooter);

            if (plugin.updateAvailable) {
                sender.sendMessage(langConfig.getString("update-available") + " https://www.spigotmc.org/resources/");
            }
        }
        // Reload subcommand
        else if (args[0].equalsIgnoreCase("reload")) {
            if (!sender.hasPermission(Constants.PERMISSION_RELOAD)) {
                sender.sendMessage(ChatColor.RED + plugin.getLanguageConfig().getString("no-permission"));
                return true;
            }

            if (args.length != 1) {
                sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.RED + langConfig.getConfig().getString("invalid-syntax") + " " + ChatColor.RESET + langConfig.getString("invalid-syntax-use") + label + " reload");

                return true;
            }

            plugin.reloadConfig();
            plugin.getLanguageConfig().reload();

            sender.sendMessage(Constants.PLUGIN_PREFIX + ChatColor.GREEN + langConfig.getString("vanillaplus.reload"));
        }

        return true;
    }
}
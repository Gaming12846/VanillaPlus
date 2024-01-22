/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 *
 * TrollPlus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TrollPlus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.gaming12846.vanillaplus;

import de.gaming12846.vanillaplus.commands.VanillaPlusCommand;
import de.gaming12846.vanillaplus.listener.*;
import de.gaming12846.vanillaplus.utils.ConfigUtil;
import de.gaming12846.vanillaplus.utils.RecipeUtil;
import de.gaming12846.vanillaplus.utils.TabCompleter;
import de.gaming12846.vanillaplus.utils.UpdateChecker;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class VanillaPlus extends JavaPlugin {
    public final Logger Logger = getLogger();
    public boolean updateAvailable = false;
    public final String configVersion = "1.0";
    public final String languageConfigVersion = "1.0";

    // Create ConfigUtils
    private ConfigUtil langCustomConfig;
    private ConfigUtil langEnglishConfig;

    @Override
    public void onEnable() {
        // Load configs
        loadConfigs();

        // Register listeners
        registerListener(getServer().getPluginManager());

        // Register commands
        registerCommands();

        // Register tabcompleter
        registerTabCompleter();

        // Metrics bStats
        if (getConfig().getBoolean("metrics-enabled", true)) {
            Logger.info(getLanguageConfig().getConfig().getString("metrics-enabled"));

            Metrics metrics = new Metrics(this, 19467);
        }

        // Check for updates
        checkUpdate();

        // Enable custom recipes
        RecipeUtil recipeUtil = new RecipeUtil(this);
    }

    // Load configs
    private void loadConfigs() {
        this.saveDefaultConfig();

        langCustomConfig = new ConfigUtil(this, "lang_custom.yml");
        langEnglishConfig = new ConfigUtil(this, "lang_en.yml");

        if (!configVersion.equalsIgnoreCase(this.getConfig().getString("version")))
            Logger.warning(getLanguageConfig().getConfig().getString("config-outdated"));

        if (!languageConfigVersion.equalsIgnoreCase(getLanguageConfig().getConfig().getString("version")))
            Logger.warning(getLanguageConfig().getConfig().getString("language-config-outdated"));
    }

    // Get language config
    public ConfigUtil getLanguageConfig() {
        if (Objects.equals(getConfig().getString("language"), "custom")) {
            return langCustomConfig;
        } else return langEnglishConfig;
    }

    // Register listeners
    private void registerListener(PluginManager pm) {
        pm.registerEvents(new BlockBreakListener(this), this);
        pm.registerEvents(new BlockPlaceListener(this), this);
        pm.registerEvents(new FurnaceSmeltListener(this), this);
        pm.registerEvents(new InventoryClickListener(this), this);
        pm.registerEvents(new InventoryCloseListener(this), this);
        pm.registerEvents(new InventoryOpenListener(this), this);
    }

    // Register commands
    private void registerCommands() {
        Objects.requireNonNull(this.getCommand("vanillaplus")).setExecutor(new VanillaPlusCommand(this));
    }

    // Register tabcompleter
    private void registerTabCompleter() {
        Objects.requireNonNull(this.getCommand("vanillaplus")).setTabCompleter(new TabCompleter());
    }

    // Check for Update
    private void checkUpdate() {
        if (getConfig().getBoolean("check-for-updates", true)) {
            Logger.info(getLanguageConfig().getConfig().getString("checking-updates"));

            new UpdateChecker(this, 114644).getVersion(version -> {
                if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                    Logger.info(getLanguageConfig().getConfig().getString("no-update-available"));
                } else {
                    Logger.info(getLanguageConfig().getConfig().getString("update-available") + " https://www.spigotmc.org/resources/114644");

                    updateAvailable = true;
                }
            });
        }
    }
}
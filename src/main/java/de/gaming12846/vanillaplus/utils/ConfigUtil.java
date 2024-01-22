/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.utils;

import com.google.common.base.Charsets;
import de.gaming12846.vanillaplus.VanillaPlus;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConfigUtil {
    private final VanillaPlus plugin;
    private final File file;
    private final String path;
    private FileConfiguration configuration;

    // Create a config
    public ConfigUtil(VanillaPlus plugin, String path) {
        this.plugin = plugin;
        this.path = path;
        this.file = new File(plugin.getDataFolder(), path);

        if (!file.exists()) plugin.saveResource(path, false);

        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }

    // Get the config
    public FileConfiguration getConfig() {
        return this.configuration;
    }

    // Reload the config
    public void reload() {
        plugin.saveDefaultConfig();
        if (!file.exists()) plugin.saveResource(path, false);

        this.configuration = YamlConfiguration.loadConfiguration(file);

        final InputStream defaultConfigStream = plugin.getResource(path);
        if (defaultConfigStream == null) return;

        this.configuration.setDefaults(YamlConfiguration.loadConfiguration(new InputStreamReader(defaultConfigStream, Charsets.UTF_8)));
    }

    // Get string
    public String getString(String string) {
        return plugin.getLanguageConfig().getConfig().getString(string);
    }
}
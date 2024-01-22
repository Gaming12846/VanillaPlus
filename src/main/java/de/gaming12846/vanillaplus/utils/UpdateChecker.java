/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.utils;

import de.gaming12846.vanillaplus.VanillaPlus;
import org.bukkit.Bukkit;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.function.Consumer;

// From: https://www.spigotmc.org/wiki/creating-an-update-checker-that-checks-for-updates
public class UpdateChecker {
    private final VanillaPlus plugin;
    private final int resourceId;

    public UpdateChecker(VanillaPlus plugin, int resourceId) {
        this.plugin = plugin;
        this.resourceId = resourceId;
    }

    public void getVersion(final Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try (InputStream inputStream = new URL("https://api.spigotmc.org/legacy/update.php?resource=" + this.resourceId).openStream(); Scanner scanner = new Scanner(inputStream)) {
                if (scanner.hasNext())
                    consumer.accept(scanner.next());
            } catch (IOException exception) {
                plugin.Logger.info(plugin.getLanguageConfig().getString("unable-check-updates") + " " + exception.getMessage());
            }
        });
    }
}
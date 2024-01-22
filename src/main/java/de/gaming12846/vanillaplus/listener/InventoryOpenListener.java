/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.listener;

import de.gaming12846.vanillaplus.VanillaPlus;
import de.gaming12846.vanillaplus.utils.Constants;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryOpenListener implements Listener {
    private final VanillaPlus plugin;

    public InventoryOpenListener(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onInventoryOpen(InventoryOpenEvent event) {
        Inventory inventory = event.getInventory();
        Player player = (Player) event.getPlayer();

        if (!plugin.getConfig().getBoolean("modules.enchanting") || !plugin.getConfig().getBoolean("enchanting.no-lapis-lazuli") || !player.hasPermission(Constants.PERMISSION_MODULES_ENCHANTING) || !inventory.getType().equals(InventoryType.ENCHANTING))
            return;

        inventory.setItem(1, new ItemStack(Material.LAPIS_LAZULI, 64));
    }
}
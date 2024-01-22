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
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {
    private final VanillaPlus plugin;

    public InventoryClickListener(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onInventoryClick(InventoryClickEvent event) {
        Inventory inventory = event.getInventory();
        Player player = (Player) event.getWhoClicked();

        if (!plugin.getConfig().getBoolean("modules.enchanting") || !plugin.getConfig().getBoolean("enchanting.no-lapis-lazuli") || !player.hasPermission(Constants.PERMISSION_MODULES_ENCHANTING) || !inventory.getType().equals(InventoryType.ENCHANTING) || event.getSlot() != 1)
            return;

        inventory.setItem(1, new ItemStack(Material.LAPIS_LAZULI, 64));
        event.setCancelled(true);
    }
}
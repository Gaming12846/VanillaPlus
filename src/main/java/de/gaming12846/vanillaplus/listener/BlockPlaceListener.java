/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.listener;

import de.gaming12846.vanillaplus.VanillaPlus;
import de.gaming12846.vanillaplus.utils.Constants;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class BlockPlaceListener implements Listener {
    private final VanillaPlus plugin;

    public BlockPlaceListener(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        if (!plugin.getConfig().getBoolean("modules.spawner") || !player.hasPermission(Constants.PERMISSION_MODULES_SPAWNER) || !block.getType().equals(Material.SPAWNER))
            return;

        ItemMeta itemMeta = event.getItemInHand().getItemMeta();

        if (itemMeta == null || !itemMeta.hasLore()) return;

        String string = Objects.requireNonNull(itemMeta.getLore()).toString();
        string = string.replace("[", "");
        string = string.replace("]", "");

        BlockState blockState = block.getState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.valueOf(string));
        blockState.update(true);
    }
}
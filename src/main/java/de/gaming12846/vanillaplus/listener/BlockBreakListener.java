/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.listener;

import de.gaming12846.vanillaplus.VanillaPlus;
import de.gaming12846.vanillaplus.utils.Constants;
import de.gaming12846.vanillaplus.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener {
    private final VanillaPlus plugin;

    public BlockBreakListener(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        if (!plugin.getConfig().getBoolean("modules.spawner") || !block.getType().equals(Material.SPAWNER) || !player.hasPermission(Constants.PERMISSION_MODULES_SPAWNER) || player.getGameMode().equals(GameMode.CREATIVE))
            return;

        CreatureSpawner creatureSpawner = (CreatureSpawner) event.getBlock().getState();
        Location blockLocation = block.getLocation();
        ItemStack itemStack = new ItemStack(Material.SPAWNER);
        if (creatureSpawner.getSpawnedType() != null) {
            String entityType = creatureSpawner.getSpawnedType().toString();
            String spawnerName = entityType.charAt(0) + entityType.substring(1).toLowerCase();
            itemStack = ItemBuilder.createItemWithLore(Material.SPAWNER, ChatColor.RESET + spawnerName + " Spawner", ChatColor.RESET + entityType);
        }

        String minimumToolType = plugin.getConfig().getString("spawner.minimum-tool-type");
        assert minimumToolType != null;
        switch (minimumToolType) {
            default:
                break;
            case "wooden":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.WOODEN_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.STONE_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.IRON_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
            case "stone":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.STONE_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.IRON_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
            case "iron":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.IRON_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
            case "golden":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
            case "diamond":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
            case "netherite":
                if (player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE)) {
                    if (plugin.getConfig().getBoolean("spawner.need-silk-touch")) {
                        if (player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                            player.getWorld().dropItemNaturally(blockLocation, itemStack);
                            event.setExpToDrop(0);
                        }
                    } else {
                        player.getWorld().dropItemNaturally(blockLocation, itemStack);
                        event.setExpToDrop(0);
                    }
                }
                break;
        }
    }
}
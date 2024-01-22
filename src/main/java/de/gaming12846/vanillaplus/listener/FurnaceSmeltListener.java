/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.listener;

import de.gaming12846.vanillaplus.VanillaPlus;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

public class FurnaceSmeltListener implements Listener {
    private final VanillaPlus plugin;

    public FurnaceSmeltListener(VanillaPlus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onFurnaceSmelt(FurnaceSmeltEvent event) {
        if (!plugin.getConfig().getBoolean("modules.furnace-recipes")) return;

        ItemStack item = event.getSource();
        Damageable damageable = (Damageable) event.getSource().getItemMeta();

        assert damageable != null;
        switch (item.getType()) {
            default:
                break;
            case SHEARS:
            case IRON_SWORD:
            case IRON_HOE:
                if (damageable.getDamage() != 0) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case CHAINMAIL_HELMET:
            case IRON_HELMET:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 41) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 4));
                } else if (damageable.getDamage() >= 41 && damageable.getDamage() < 82) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 3));
                } else if (damageable.getDamage() >= 82 && damageable.getDamage() < 123) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 2));
                } else if (damageable.getDamage() >= 123) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case CHAINMAIL_CHESTPLATE:
            case IRON_CHESTPLATE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 34) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 7));
                } else if (damageable.getDamage() >= 34 && damageable.getDamage() < 68) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 6));
                } else if (damageable.getDamage() >= 68 && damageable.getDamage() < 102) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 5));
                } else if (damageable.getDamage() >= 102 && damageable.getDamage() < 137) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 4));
                } else if (damageable.getDamage() >= 137 && damageable.getDamage() < 171) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 3));
                } else if (damageable.getDamage() >= 171 && damageable.getDamage() < 205) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 2));
                } else if (damageable.getDamage() >= 205) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case CHAINMAIL_LEGGINGS:
            case IRON_LEGGINGS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 37) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 6));
                } else if (damageable.getDamage() >= 37 && damageable.getDamage() < 75) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 5));
                } else if (damageable.getDamage() >= 75 && damageable.getDamage() < 112) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 4));
                } else if (damageable.getDamage() >= 112 && damageable.getDamage() < 149) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 3));
                } else if (damageable.getDamage() >= 149 && damageable.getDamage() < 187) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 2));
                } else if (damageable.getDamage() >= 187) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case CHAINMAIL_BOOTS:
            case IRON_BOOTS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 65) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 3));
                } else if (damageable.getDamage() >= 65 && damageable.getDamage() < 129) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 2));
                } else if (damageable.getDamage() >= 129) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case IRON_SHOVEL:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 83) {
                    event.setResult(new ItemStack(Material.IRON_NUGGET, 7));
                } else if (damageable.getDamage() >= 83 && damageable.getDamage() < 166) {
                    event.setResult(new ItemStack(Material.IRON_NUGGET, 5));
                } else if (damageable.getDamage() >= 166) event.setResult(new ItemStack(Material.IRON_NUGGET, 3));
                break;
            case IRON_PICKAXE:
            case IRON_AXE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 125) {
                    event.setResult(new ItemStack(Material.IRON_INGOT, 2));
                } else if (damageable.getDamage() >= 125) event.setResult(new ItemStack(Material.IRON_INGOT, 1));
                break;
            case GOLDEN_HELMET:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 19) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 4));
                } else if (damageable.getDamage() >= 19 && damageable.getDamage() < 38) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 3));
                } else if (damageable.getDamage() >= 38 && damageable.getDamage() < 57) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 2));
                } else if (damageable.getDamage() >= 57) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case GOLDEN_CHESTPLATE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 16) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 7));
                } else if (damageable.getDamage() >= 16 && damageable.getDamage() < 32) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 6));
                } else if (damageable.getDamage() >= 32 && damageable.getDamage() < 48) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 5));
                } else if (damageable.getDamage() >= 48 && damageable.getDamage() < 63) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 4));
                } else if (damageable.getDamage() >= 63 && damageable.getDamage() < 79) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 3));
                } else if (damageable.getDamage() >= 79 && damageable.getDamage() < 95) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 2));
                } else if (damageable.getDamage() >= 95) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case GOLDEN_LEGGINGS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 17) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 6));
                } else if (damageable.getDamage() >= 17 && damageable.getDamage() < 35) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 5));
                } else if (damageable.getDamage() >= 35 && damageable.getDamage() < 52) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 4));
                } else if (damageable.getDamage() >= 52 && damageable.getDamage() < 69) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 3));
                } else if (damageable.getDamage() >= 69 && damageable.getDamage() < 87) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 2));
                } else if (damageable.getDamage() >= 87) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case GOLDEN_BOOTS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 30) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 3));
                } else if (damageable.getDamage() >= 30 && damageable.getDamage() < 60) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 2));
                } else if (damageable.getDamage() >= 60) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case GOLDEN_SHOVEL:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 10) {
                    event.setResult(new ItemStack(Material.GOLD_NUGGET, 7));
                } else if (damageable.getDamage() >= 10 && damageable.getDamage() < 21) {
                    event.setResult(new ItemStack(Material.GOLD_NUGGET, 5));
                } else if (damageable.getDamage() >= 21) event.setResult(new ItemStack(Material.GOLD_NUGGET, 3));
                break;
            case GOLDEN_PICKAXE:
            case GOLDEN_AXE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 16) {
                    event.setResult(new ItemStack(Material.GOLD_INGOT, 2));
                } else if (damageable.getDamage() >= 16) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case GOLDEN_HOE:
            case GOLDEN_SWORD:
                if (damageable.getDamage() != 0) event.setResult(new ItemStack(Material.GOLD_INGOT, 1));
                break;
            case DIAMOND_HELMET:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 91) {
                    event.setResult(new ItemStack(Material.DIAMOND, 4));
                } else if (damageable.getDamage() >= 91 && damageable.getDamage() < 181) {
                    event.setResult(new ItemStack(Material.DIAMOND, 3));
                } else if (damageable.getDamage() >= 181 && damageable.getDamage() < 272) {
                    event.setResult(new ItemStack(Material.DIAMOND, 2));
                } else if (damageable.getDamage() >= 272) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case DIAMOND_CHESTPLATE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 75) {
                    event.setResult(new ItemStack(Material.DIAMOND, 7));
                } else if (damageable.getDamage() >= 75 && damageable.getDamage() < 151) {
                    event.setResult(new ItemStack(Material.DIAMOND, 6));
                } else if (damageable.getDamage() >= 151 && damageable.getDamage() < 226) {
                    event.setResult(new ItemStack(Material.DIAMOND, 5));
                } else if (damageable.getDamage() >= 226 && damageable.getDamage() < 301) {
                    event.setResult(new ItemStack(Material.DIAMOND, 4));
                } else if (damageable.getDamage() >= 301 && damageable.getDamage() < 376) {
                    event.setResult(new ItemStack(Material.DIAMOND, 3));
                } else if (damageable.getDamage() >= 376 && damageable.getDamage() < 452) {
                    event.setResult(new ItemStack(Material.DIAMOND, 2));
                } else if (damageable.getDamage() >= 452) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case DIAMOND_LEGGINGS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 82) {
                    event.setResult(new ItemStack(Material.DIAMOND, 6));
                } else if (damageable.getDamage() >= 82 && damageable.getDamage() < 165) {
                    event.setResult(new ItemStack(Material.DIAMOND, 5));
                } else if (damageable.getDamage() >= 165 && damageable.getDamage() < 247) {
                    event.setResult(new ItemStack(Material.DIAMOND, 4));
                } else if (damageable.getDamage() >= 247 && damageable.getDamage() < 329) {
                    event.setResult(new ItemStack(Material.DIAMOND, 3));
                } else if (damageable.getDamage() >= 329 && damageable.getDamage() < 412) {
                    event.setResult(new ItemStack(Material.DIAMOND, 2));
                } else if (damageable.getDamage() >= 412) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case DIAMOND_BOOTS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 143) {
                    event.setResult(new ItemStack(Material.DIAMOND, 3));
                } else if (damageable.getDamage() >= 143 && damageable.getDamage() < 285) {
                    event.setResult(new ItemStack(Material.DIAMOND, 2));
                } else if (damageable.getDamage() >= 285) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case DIAMOND_SHOVEL:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 520) {
                    event.setResult(new ItemStack(Material.COAL, 7));
                } else if (damageable.getDamage() >= 520 && damageable.getDamage() < 1040) {
                    event.setResult(new ItemStack(Material.COAL, 5));
                } else if (damageable.getDamage() >= 1040) event.setResult(new ItemStack(Material.COAL, 3));
                break;
            case DIAMOND_PICKAXE:
            case DIAMOND_AXE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 781) {
                    event.setResult(new ItemStack(Material.DIAMOND, 2));
                } else if (damageable.getDamage() >= 781) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case DIAMOND_HOE:
            case DIAMOND_SWORD:
                if (damageable.getDamage() != 0) event.setResult(new ItemStack(Material.DIAMOND, 1));
                break;
            case NETHERITE_HELMET:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 135) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 3));
                } else if (damageable.getDamage() >= 135 && damageable.getDamage() < 271) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 2));
                } else if (damageable.getDamage() >= 271) event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 1));
                break;
            case NETHERITE_CHESTPLATE:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 197) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 3));
                } else if (damageable.getDamage() >= 197 && damageable.getDamage() < 394) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 2));
                } else if (damageable.getDamage() >= 394) event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 1));
                break;
            case NETHERITE_LEGGINGS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 185) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 3));
                } else if (damageable.getDamage() >= 185 && damageable.getDamage() < 369) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 2));
                } else if (damageable.getDamage() >= 369) event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 1));
                break;
            case NETHERITE_BOOTS:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 160) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 3));
                } else if (damageable.getDamage() >= 160 && damageable.getDamage() < 320) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 2));
                } else if (damageable.getDamage() >= 320) event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 1));
                break;
            case NETHERITE_SHOVEL:
            case NETHERITE_PICKAXE:
            case NETHERITE_AXE:
            case NETHERITE_HOE:
            case NETHERITE_SWORD:
                if (damageable.getDamage() >= 1 && damageable.getDamage() < 677) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 3));
                } else if (damageable.getDamage() >= 677 && damageable.getDamage() < 1353) {
                    event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 2));
                } else if (damageable.getDamage() >= 1353) event.setResult(new ItemStack(Material.NETHERITE_SCRAP, 1));
                break;
        }
    }
}
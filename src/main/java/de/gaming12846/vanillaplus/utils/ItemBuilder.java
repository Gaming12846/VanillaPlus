/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemBuilder {
    // Create an ItemStack with lore
    public static ItemStack createItemWithLore(Material material, String name, String lore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        assert itemMeta != null;
        itemMeta.setDisplayName(name);
        itemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        List<String> lore2 = Collections.singletonList(lore);
        final List<String> formatted = new ArrayList<>();
        for (String string : lore2) {
            formatted.add(ChatColor.GRAY + string);
        }

        itemMeta.setLore(formatted);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
/*
 * This file is part of VanillaPlus.
 * Copyright (C) 2024 Gaming12846
 */

package de.gaming12846.vanillaplus.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecipeUtil {
    public RecipeUtil(Plugin plugin) {
        // Crafting recipes module
        if (plugin.getConfig().getBoolean("modules.crafting-recipes")) {
            if (plugin.getConfig().getBoolean("crafting-recipes.bell")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "BBB", "BCB"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.STICK, Material.GOLD_INGOT, Material.GOLD_NUGGET));
                createShapedRecipe(new NamespacedKey(plugin, "bell"), shape, ingredients, new ItemStack(Material.BELL));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.cobweb")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("A A", " A ", "A A"));
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.STRING));
                createShapedRecipe(new NamespacedKey(plugin, "cobweb"), shape, ingredients, new ItemStack(Material.COBWEB));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.elytra")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("ABA", "ACA", "A A"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.PHANTOM_MEMBRANE, Material.END_ROD, Material.NETHER_STAR));
                createShapedRecipe(new NamespacedKey(plugin, "elytra"), shape, ingredients, new ItemStack(Material.ELYTRA));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.enchanted-golden-apple")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "ABA", "AAA"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.GOLD_BLOCK, Material.GOLDEN_APPLE));
                createShapedRecipe(new NamespacedKey(plugin, "enchanted_golden_apple"), shape, ingredients, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.experience-bottle")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("CBC", "BAB", "CBC"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.GLASS_BOTTLE, Material.LAPIS_LAZULI, Material.BLAZE_POWDER));
                createShapedRecipe(new NamespacedKey(plugin, "experience_bottle"), shape, ingredients, new ItemStack(Material.EXPERIENCE_BOTTLE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.heart-of-the-sea")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("ABA", "BCB", "ABA"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.NETHER_STAR));
                createShapedRecipe(new NamespacedKey(plugin, "heart_of_the_sea"), shape, ingredients, new ItemStack(Material.HEART_OF_THE_SEA));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.mushroom-stem")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("   ", "AB ", "BA "));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BROWN_MUSHROOM, Material.RED_MUSHROOM));
                createShapedRecipe(new NamespacedKey(plugin, "mushroom_stem"), shape, ingredients, new ItemStack(Material.MUSHROOM_STEM));

                ArrayList<Material> ingredientsReverse = new ArrayList<>(Arrays.asList(Material.RED_MUSHROOM, Material.BROWN_MUSHROOM));
                createShapedRecipe(new NamespacedKey(plugin, "mushroom_stem_reverse"), shape, ingredientsReverse, new ItemStack(Material.MUSHROOM_STEM));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.name-tag")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("  A", " B ", "C  "));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.STRING, Material.INK_SAC, Material.PAPER));
                createShapedRecipe(new NamespacedKey(plugin, "name_tag"), shape, ingredients, new ItemStack(Material.NAME_TAG));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.saddle")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "B B", "C C"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.LEATHER, Material.STRING, Material.IRON_INGOT));
                createShapedRecipe(new NamespacedKey(plugin, "saddle"), shape, ingredients, new ItemStack(Material.SADDLE));
            }

            if (plugin.getConfig().getBoolean("scrafting-recipes.spawner")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "ABA", "AAA"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_BARS, Material.NETHER_STAR));
                createShapedRecipe(new NamespacedKey(plugin, "spawner"), shape, ingredients, new ItemStack(Material.SPAWNER));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.string")) {
                List<Material> materials = Arrays.asList(Material.WHITE_WOOL, Material.ORANGE_WOOL, Material.MAGENTA_WOOL, Material.LIGHT_BLUE_WOOL, Material.YELLOW_WOOL, Material.LIME_WOOL, Material.PINK_WOOL, Material.GRAY_WOOL, Material.LIGHT_GRAY_WOOL, Material.CYAN_WOOL, Material.PURPLE_WOOL, Material.BLUE_WOOL, Material.BROWN_WOOL, Material.GREEN_WOOL, Material.RED_WOOL, Material.BLACK_WOOL);
                List<String> strings = Arrays.asList("string_white_wool", "string_orange_wool", "string_magenta_wool", "string_light_blue_wool", "string_yellow_wool", "string_lime_wool", "string_pink_wool", "string_gray_wool", "string_light_gray_wool", "string_cyan_wool", "string_purple_wool", "string_blue_wool", "string_brown_wool", "string_green_wool", "string_red_wool", "string_black_wool");

                for (int i = 0; i < 16; i++)
                    createShapelessRecipe(new NamespacedKey(plugin, strings.get(i)), new ArrayList<>(Collections.singletonList(materials.get(i))), new ItemStack(Material.STRING, 4));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.totem-of-undying")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("ABA", "CCC", " C "));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.EMERALD_BLOCK, Material.BLAZE_POWDER, Material.GOLD_BLOCK));
                createShapedRecipe(new NamespacedKey(plugin, "totem_of_undying"), shape, ingredients, new ItemStack(Material.TOTEM_OF_UNDYING));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.trident")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList(" AA", " BA", "B  "));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.PRISMARINE_SHARD));
                createShapedRecipe(new NamespacedKey(plugin, "trident"), shape, ingredients, new ItemStack(Material.TRIDENT));
            }

            // Banner pattern
            if (plugin.getConfig().getBoolean("crafting-recipes.banner-pattern.globe")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.PAPER, Material.COMPASS));
                createShapelessRecipe(new NamespacedKey(plugin, "globe_banner_pattern"), ingredients, new ItemStack(Material.GLOBE_BANNER_PATTERN));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.banner-pattern.snout")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.PAPER, Material.GOLD_BLOCK));
                createShapelessRecipe(new NamespacedKey(plugin, "piglin_banner_pattern"), ingredients, new ItemStack(Material.PIGLIN_BANNER_PATTERN));
            }

            // Chainmail armor
            if (plugin.getConfig().getBoolean("crafting-recipes.chainmail-armor.helmet")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "A A", "   "));
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.CHAIN));
                createShapedRecipe(new NamespacedKey(plugin, "chainmail_helmet"), shape, ingredients, new ItemStack(Material.CHAINMAIL_HELMET));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.chainmail-armor.chestplate")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("A A", "AAA", "AAA"));
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.CHAIN));
                createShapedRecipe(new NamespacedKey(plugin, "chainmail_chestplate"), shape, ingredients, new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.chainmail-armor.leggings")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("AAA", "A A", "A A"));
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.CHAIN));
                createShapedRecipe(new NamespacedKey(plugin, "chainmail_leggings"), shape, ingredients, new ItemStack(Material.CHAINMAIL_LEGGINGS));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.chainmail-armor.boots")) {
                ArrayList<String> shape = new ArrayList<>(Arrays.asList("   ", "A A", "A A"));
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.CHAIN));
                createShapedRecipe(new NamespacedKey(plugin, "chainmail_boots"), shape, ingredients, new ItemStack(Material.CHAINMAIL_BOOTS));
            }

            // Horse armor
            ArrayList<String> shapeHorseArmor = new ArrayList<>(Arrays.asList("A A", "ABA", "A A"));
            if (plugin.getConfig().getBoolean("crafting-recipes.horse-armor.iron")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.LEATHER));
                createShapedRecipe(new NamespacedKey(plugin, "iron_horse-armor"), shapeHorseArmor, ingredients, new ItemStack(Material.IRON_HORSE_ARMOR));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.horse-armor.golden")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.GOLD_INGOT, Material.LEATHER));
                createShapedRecipe(new NamespacedKey(plugin, "golden_horse_armor"), shapeHorseArmor, ingredients, new ItemStack(Material.GOLDEN_HORSE_ARMOR));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.horse-armor.diamond")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.LEATHER));
                createShapedRecipe(new NamespacedKey(plugin, "diamond_horse_armor"), shapeHorseArmor, ingredients, new ItemStack(Material.DIAMOND_HORSE_ARMOR));
            }

            // Mushroom block
            ArrayList<String> shapeMushroomBlock = new ArrayList<>(Arrays.asList("   ", "AA ", "AA "));
            if (plugin.getConfig().getBoolean("crafting-recipes.mushroom-block.brown")) {
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.BROWN_MUSHROOM));
                createShapedRecipe(new NamespacedKey(plugin, "brown_mushroom_block"), shapeMushroomBlock, ingredients, new ItemStack(Material.BROWN_MUSHROOM_BLOCK));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.mushroom-block.red")) {
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.RED_MUSHROOM));
                createShapedRecipe(new NamespacedKey(plugin, "red_mushroom_block"), shapeMushroomBlock, ingredients, new ItemStack(Material.RED_MUSHROOM_BLOCK));
            }

            // Music disk
            ArrayList<String> shapeMusicDisc = new ArrayList<>(Arrays.asList(" A ", "ABA", " A "));
            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.13")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.YELLOW_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_13"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_13));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.cat")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.COD));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_cat"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_CAT));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.blocks")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.ORANGE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_blocks"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_BLOCKS));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.chirp")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.RED_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_chirp"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_CHIRP));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.far")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.LIME_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_far"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_FAR));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.mall")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.PURPLE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_mall"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_MALL));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.mellohi")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.MAGENTA_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_mellohi"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_MELLOHI));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.stal")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.BLACK_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_stal"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_STAL));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.strad")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.WHITE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_strad"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_STRAD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.ward")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.GREEN_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_ward"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_WARD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.11")) {
                ArrayList<String> shapeMusicDisc11 = new ArrayList<>(Arrays.asList(" A ", "ABA", "  A"));
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.BLACK_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_11"), shapeMusicDisc11, ingredients, new ItemStack(Material.MUSIC_DISC_11));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.wait")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.BLUE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_wait"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_WAIT));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.otherside")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.LIGHT_BLUE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_otherside"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_OTHERSIDE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.5")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.IRON_INGOT, Material.ECHO_SHARD));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_5"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_5));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.pigstep")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.NETHER_BRICK, Material.GOLD_INGOT));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_pigstep"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_PIGSTEP));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.relic")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.LIGHT_BLUE_DYE));
                createShapedRecipe(new NamespacedKey(plugin, "music_disc_relic"), shapeMusicDisc, ingredients, new ItemStack(Material.MUSIC_DISC_RELIC));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.music-disc.fragment_5")) {
                ArrayList<Material> ingredients = new ArrayList<>(Collections.singletonList(Material.MUSIC_DISC_5));
                createShapelessRecipe(new NamespacedKey(plugin, "music_disc_fragment_5"), ingredients, new ItemStack(Material.DISC_FRAGMENT_5, 9));
            }

            // Pottery sheard
            ArrayList<String> shapePotterySherd = new ArrayList<>(Arrays.asList(" A ", "ABA", " A "));
            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.angler")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.FISHING_ROD));
                createShapedRecipe(new NamespacedKey(plugin, "angler_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.ANGLER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.angler")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.BOW));
                createShapedRecipe(new NamespacedKey(plugin, "archer_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.ARCHER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.arms-up")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.IRON_CHESTPLATE));
                createShapedRecipe(new NamespacedKey(plugin, "arms_up_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.ARMS_UP_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.blade")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.IRON_SWORD));
                createShapedRecipe(new NamespacedKey(plugin, "blade_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.BLADE_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.brewer")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.POTION));
                createShapedRecipe(new NamespacedKey(plugin, "brewer_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.BREWER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.burn")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.FLINT_AND_STEEL));
                createShapedRecipe(new NamespacedKey(plugin, "burn_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.BURN_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.danger")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.GUNPOWDER));
                createShapedRecipe(new NamespacedKey(plugin, "danger_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.DANGER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.explorer")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.MAP));
                createShapedRecipe(new NamespacedKey(plugin, "explorer_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.EXPLORER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.friend")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.POPPY));
                createShapedRecipe(new NamespacedKey(plugin, "friend_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.FRIEND_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.heart")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.POTATO));
                createShapedRecipe(new NamespacedKey(plugin, "heart_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.HEART_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.heartbreak")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.POISONOUS_POTATO));
                createShapedRecipe(new NamespacedKey(plugin, "heartbreak_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.HEARTBREAK_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.howl")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.BONE));
                createShapedRecipe(new NamespacedKey(plugin, "howl_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.HOWL_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.miner")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.IRON_PICKAXE));
                createShapedRecipe(new NamespacedKey(plugin, "miner_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.MINER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.mourner")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.ECHO_SHARD));
                createShapedRecipe(new NamespacedKey(plugin, "mourner_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.MOURNER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.plenty")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.CHEST));
                createShapedRecipe(new NamespacedKey(plugin, "plenty_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.PLENTY_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.prize")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.DIAMOND));
                createShapedRecipe(new NamespacedKey(plugin, "prize_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.PRIZE_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.sheaf")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.WHEAT));
                createShapedRecipe(new NamespacedKey(plugin, "sheaf_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.SHEAF_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.shelter")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.OAK_SAPLING));
                createShapedRecipe(new NamespacedKey(plugin, "shelter_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.SHELTER_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.skull")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.SKELETON_SKULL));
                createShapedRecipe(new NamespacedKey(plugin, "skull_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.SKULL_POTTERY_SHERD));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.pottery-sherd.snort")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.BRICK, Material.SNIFFER_EGG));
                createShapedRecipe(new NamespacedKey(plugin, "snort_pottery_sherd"), shapePotterySherd, ingredients, new ItemStack(Material.SNORT_POTTERY_SHERD));
            }

            // Smithing template
            ArrayList<String> shapeSmithingTemplate = new ArrayList<>(Arrays.asList("ABA", "ACA", "AAA"));
            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.netherite-upgrade")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.NETHERITE_INGOT, Material.NETHERRACK));
                createShapedRecipe(new NamespacedKey(plugin, "netherite_upgrade_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.sentry")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.CROSSBOW, Material.COBBLESTONE));
                createShapedRecipe(new NamespacedKey(plugin, "sentry_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.vex")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.TOTEM_OF_UNDYING, Material.COBBLESTONE));
                createShapedRecipe(new NamespacedKey(plugin, "vex_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.wild")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.MOSS_BLOCK, Material.MOSSY_COBBLESTONE));
                createShapedRecipe(new NamespacedKey(plugin, "wild_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.coast")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.SCUTE, Material.COBBLESTONE));
                createShapedRecipe(new NamespacedKey(plugin, "coast_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.dune")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.GOLDEN_APPLE, Material.SANDSTONE));
                createShapedRecipe(new NamespacedKey(plugin, "dune_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.wayfinder")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.TORCH, Material.TERRACOTTA));
                createShapedRecipe(new NamespacedKey(plugin, "wayfinder_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.raiser")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.BRUSH, Material.TERRACOTTA));
                createShapedRecipe(new NamespacedKey(plugin, "raiser_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.shaper")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.IRON_SWORD, Material.TERRACOTTA));
                createShapedRecipe(new NamespacedKey(plugin, "shaper_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.host")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.CHEST, Material.TERRACOTTA));
                createShapedRecipe(new NamespacedKey(plugin, "host_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.ward")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.ECHO_SHARD, Material.COBBLED_DEEPSLATE));
                createShapedRecipe(new NamespacedKey(plugin, "ward_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.silence")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.SCULK, Material.COBBLED_DEEPSLATE));
                createShapedRecipe(new NamespacedKey(plugin, "silence_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.tide")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.PRISMARINE_SHARD, Material.PRISMARINE));
                createShapedRecipe(new NamespacedKey(plugin, "tide_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.snout")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.GOLD_BLOCK, Material.BLACKSTONE));
                createShapedRecipe(new NamespacedKey(plugin, "snout_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.rib")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.WITHER_SKELETON_SKULL, Material.NETHERRACK));
                createShapedRecipe(new NamespacedKey(plugin, "rib_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.eye")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.ENDER_EYE, Material.END_STONE));
                createShapedRecipe(new NamespacedKey(plugin, "eye_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE));
            }

            if (plugin.getConfig().getBoolean("crafting-recipes.smithing-template.armor-trim.spire")) {
                ArrayList<Material> ingredients = new ArrayList<>(Arrays.asList(Material.DIAMOND, Material.SHULKER_SHELL, Material.PURPUR_BLOCK));
                createShapedRecipe(new NamespacedKey(plugin, "spire_armor_trim_smithing_template"), shapeSmithingTemplate, ingredients, new ItemStack(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE));
            }
        }

        // Furnace recipes module
        if (plugin.getConfig().getBoolean("modules.furnace-recipes")) {
            Bukkit.removeRecipe(new NamespacedKey(NamespacedKey.MINECRAFT, "iron_nugget_from_smelting"));
            Bukkit.removeRecipe(new NamespacedKey(NamespacedKey.MINECRAFT, "iron_nugget_from_blasting"));
            Bukkit.removeRecipe(new NamespacedKey(NamespacedKey.MINECRAFT, "gold_nugget_from_smelting"));
            Bukkit.removeRecipe(new NamespacedKey(NamespacedKey.MINECRAFT, "gold_nugget_from_blasting"));

            if (plugin.getConfig().getBoolean("furnace-recipes.anvil")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_anvil"), Material.ANVIL, new ItemStack(Material.IRON_INGOT, 31), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_anvil"), Material.ANVIL, new ItemStack(Material.IRON_INGOT, 31), 0.7F, 100);

                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_chipped_anvil"), Material.CHIPPED_ANVIL, new ItemStack(Material.IRON_INGOT, 21), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_chipped_anvil"), Material.CHIPPED_ANVIL, new ItemStack(Material.IRON_INGOT, 21), 0.7F, 100);

                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_damaged_anvil"), Material.DAMAGED_ANVIL, new ItemStack(Material.IRON_INGOT, 10), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_damaged_anvil"), Material.DAMAGED_ANVIL, new ItemStack(Material.IRON_INGOT, 10), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.bucket")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_bucket"), Material.BUCKET, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_bucket"), Material.BUCKET, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.cauldron")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_cauldron"), Material.CAULDRON, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_cauldron"), Material.CAULDRON, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.clock")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_clock"), Material.CLOCK, new ItemStack(Material.GOLD_INGOT, 4), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_clock"), Material.CLOCK, new ItemStack(Material.GOLD_INGOT, 4), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.compass")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_compass"), Material.COMPASS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_compass"), Material.COMPASS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.hopper")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_hopper"), Material.HOPPER, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_hopper"), Material.HOPPER, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron-bars")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_bars"), Material.IRON_BARS, new ItemStack(Material.IRON_NUGGET, 3), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_bars"), Material.IRON_BARS, new ItemStack(Material.IRON_NUGGET, 3), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron-door")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_door"), Material.IRON_DOOR, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_door"), Material.IRON_DOOR, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron-trapdoor")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_trapdoor"), Material.IRON_TRAPDOOR, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_trapdoor"), Material.IRON_TRAPDOOR, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.minecart")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_minecart"), Material.MINECART, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_minecart"), Material.MINECART, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.shears")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_shears"), Material.SHEARS, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_shears"), Material.SHEARS, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 100);
            }

            // Chainmail
            if (plugin.getConfig().getBoolean("furnace-recipes.chainmail.helmet")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_chainmail_helmet"), Material.CHAINMAIL_HELMET, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_chainmail_helmet"), Material.CHAINMAIL_HELMET, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.chainmail.chestplate")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_chainmail_chestplate"), Material.CHAINMAIL_CHESTPLATE, new ItemStack(Material.IRON_INGOT, 8), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_chainmail_chestplate"), Material.CHAINMAIL_CHESTPLATE, new ItemStack(Material.IRON_INGOT, 8), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.chainmail.leggings")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_chainmail_leggings"), Material.CHAINMAIL_LEGGINGS, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_chainmail_leggings"), Material.CHAINMAIL_LEGGINGS, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.chainmail.boots")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_chainmail_boots"), Material.CHAINMAIL_BOOTS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_chainmail_boots"), Material.CHAINMAIL_BOOTS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 100);
            }

            // Iron
            if (plugin.getConfig().getBoolean("furnace-recipes.iron.helmet")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smeltingiron_helmet"), Material.IRON_HELMET, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_helmet"), Material.IRON_HELMET, new ItemStack(Material.IRON_INGOT, 5), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.chestplate")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_chestplate"), Material.IRON_CHESTPLATE, new ItemStack(Material.IRON_INGOT, 8), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_chestplate"), Material.IRON_CHESTPLATE, new ItemStack(Material.IRON_INGOT, 8), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.leggings")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_leggings"), Material.IRON_LEGGINGS, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_leggings"), Material.IRON_LEGGINGS, new ItemStack(Material.IRON_INGOT, 7), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.boots")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_boots"), Material.IRON_BOOTS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_boots"), Material.IRON_BOOTS, new ItemStack(Material.IRON_INGOT, 4), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.shovel")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_shovel"), Material.IRON_SHOVEL, new ItemStack(Material.IRON_INGOT, 1), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_shovel"), Material.IRON_SHOVEL, new ItemStack(Material.IRON_INGOT, 1), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.pickaxe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_pickaxe"), Material.IRON_PICKAXE, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_pickaxe"), Material.IRON_PICKAXE, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.axe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_axe"), Material.IRON_AXE, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_axe"), Material.IRON_AXE, new ItemStack(Material.IRON_INGOT, 3), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.hoe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_hoe"), Material.IRON_HOE, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_hoe"), Material.IRON_HOE, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.sword")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_sword"), Material.IRON_SWORD, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_sword"), Material.IRON_SWORD, new ItemStack(Material.IRON_INGOT, 2), 0.7F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.iron.horse-armor")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_iron_horse_armor"), Material.IRON_HORSE_ARMOR, new ItemStack(Material.IRON_INGOT, 6), 0.7F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_iron_horse_armor"), Material.IRON_HORSE_ARMOR, new ItemStack(Material.IRON_INGOT, 6), 0.7F, 100);
            }

            // Golden
            if (plugin.getConfig().getBoolean("furnace-recipes.golden.helmet")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_helmet"), Material.GOLDEN_HELMET, new ItemStack(Material.GOLD_INGOT, 5), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_helmet"), Material.GOLDEN_HELMET, new ItemStack(Material.GOLD_INGOT, 5), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.chestplate")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_chestplate"), Material.GOLDEN_CHESTPLATE, new ItemStack(Material.GOLD_INGOT, 8), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_chestplate"), Material.GOLDEN_CHESTPLATE, new ItemStack(Material.GOLD_INGOT, 8), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.leggings")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_leggings"), Material.GOLDEN_LEGGINGS, new ItemStack(Material.GOLD_INGOT, 7), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_leggings"), Material.GOLDEN_LEGGINGS, new ItemStack(Material.GOLD_INGOT, 7), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.boots")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_boots"), Material.GOLDEN_BOOTS, new ItemStack(Material.GOLD_INGOT, 4), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_boots"), Material.GOLDEN_BOOTS, new ItemStack(Material.GOLD_INGOT, 4), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.shovel")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_shovel"), Material.GOLDEN_SHOVEL, new ItemStack(Material.GOLD_INGOT, 1), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_shovel"), Material.GOLDEN_SHOVEL, new ItemStack(Material.GOLD_INGOT, 1), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.pickaxe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_pickaxe"), Material.GOLDEN_PICKAXE, new ItemStack(Material.GOLD_INGOT, 3), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_pickaxe"), Material.GOLDEN_PICKAXE, new ItemStack(Material.GOLD_INGOT, 3), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.axe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_axe"), Material.GOLDEN_AXE, new ItemStack(Material.GOLD_INGOT, 3), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_axe"), Material.GOLDEN_AXE, new ItemStack(Material.GOLD_INGOT, 3), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.hoe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_hoe"), Material.GOLDEN_HOE, new ItemStack(Material.GOLD_INGOT, 2), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_hoe"), Material.GOLDEN_HOE, new ItemStack(Material.GOLD_INGOT, 2), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.sword")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_sword"), Material.GOLDEN_SWORD, new ItemStack(Material.GOLD_INGOT, 2), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_sword"), Material.GOLDEN_SWORD, new ItemStack(Material.GOLD_INGOT, 2), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.golden.horse-armor")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_golden_horse_armor"), Material.GOLDEN_HORSE_ARMOR, new ItemStack(Material.GOLD_INGOT, 6), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_golden_horse_armor"), Material.GOLDEN_HORSE_ARMOR, new ItemStack(Material.GOLD_INGOT, 6), 1F, 100);
            }

            // Diamond
            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.helmet")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_helmet"), Material.DIAMOND_HELMET, new ItemStack(Material.DIAMOND, 5), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_helmet"), Material.DIAMOND_HELMET, new ItemStack(Material.DIAMOND, 5), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.chestplate")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_chestplate"), Material.DIAMOND_CHESTPLATE, new ItemStack(Material.DIAMOND, 8), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_chestplate"), Material.DIAMOND_CHESTPLATE, new ItemStack(Material.DIAMOND, 8), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.leggings")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_leggings"), Material.DIAMOND_LEGGINGS, new ItemStack(Material.DIAMOND, 7), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_leggings"), Material.DIAMOND_LEGGINGS, new ItemStack(Material.DIAMOND, 7), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.boots")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_boots"), Material.DIAMOND_BOOTS, new ItemStack(Material.DIAMOND, 4), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_boots"), Material.DIAMOND_BOOTS, new ItemStack(Material.DIAMOND, 4), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.shovel")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_shovel"), Material.DIAMOND_SHOVEL, new ItemStack(Material.DIAMOND, 1), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_shovel"), Material.DIAMOND_SHOVEL, new ItemStack(Material.DIAMOND, 1), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.pickaxe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_pickaxe"), Material.DIAMOND_PICKAXE, new ItemStack(Material.DIAMOND, 3), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_pickaxe"), Material.DIAMOND_PICKAXE, new ItemStack(Material.DIAMOND, 3), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.axe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_axe"), Material.DIAMOND_AXE, new ItemStack(Material.DIAMOND, 3), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_axe"), Material.DIAMOND_AXE, new ItemStack(Material.DIAMOND, 3), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.hoe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_hoe"), Material.DIAMOND_HOE, new ItemStack(Material.DIAMOND, 2), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_hoe"), Material.DIAMOND_HOE, new ItemStack(Material.DIAMOND, 2), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.sword")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_sword"), Material.DIAMOND_SWORD, new ItemStack(Material.DIAMOND, 2), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_sword"), Material.DIAMOND_SWORD, new ItemStack(Material.DIAMOND, 2), 1F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.diamond.horse-armor")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_diamond_horse_armor"), Material.DIAMOND_HORSE_ARMOR, new ItemStack(Material.DIAMOND, 6), 1F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_diamond_horse_armor"), Material.DIAMOND_HORSE_ARMOR, new ItemStack(Material.DIAMOND, 6), 1F, 100);
            }

            // Netherite
            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.helmet")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_helmet"), Material.NETHERITE_HELMET, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_helmet"), Material.NETHERITE_HELMET, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.chestplate")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_chestplate"), Material.NETHERITE_CHESTPLATE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_chestplate"), Material.NETHERITE_CHESTPLATE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.leggings")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_leggings"), Material.NETHERITE_LEGGINGS, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_leggings"), Material.NETHERITE_LEGGINGS, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.boots")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_boots"), Material.NETHERITE_BOOTS, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_boots"), Material.NETHERITE_BOOTS, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }
            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.shovel")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_shovel"), Material.NETHERITE_SHOVEL, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_shovel"), Material.NETHERITE_SHOVEL, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.pickaxe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_pickaxe"), Material.NETHERITE_PICKAXE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_pickaxe"), Material.NETHERITE_PICKAXE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.axe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_axe"), Material.NETHERITE_AXE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_axe"), Material.NETHERITE_AXE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.hoe")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_hoe"), Material.NETHERITE_HOE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_hoe"), Material.NETHERITE_HOE, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }

            if (plugin.getConfig().getBoolean("furnace-recipes.netherite.sword")) {
                createFurnaceRecipe(new NamespacedKey(plugin, "smelting_netherite_sword"), Material.NETHERITE_SWORD, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 200);
                createBlastingRecipe(new NamespacedKey(plugin, "blasting_netherite_sword"), Material.NETHERITE_SWORD, new ItemStack(Material.NETHERITE_SCRAP, 4), 2F, 100);
            }
        }
    }

    // Create a FurnaceRecipe
    public void createFurnaceRecipe(NamespacedKey key, Material input, ItemStack output, Float experience, Integer cookingTime) {
        FurnaceRecipe recipe = new FurnaceRecipe(key, output, input, experience, cookingTime);
        Bukkit.addRecipe(recipe);
    }

    // Create a BlastingRecipe
    public void createBlastingRecipe(NamespacedKey key, Material input, ItemStack output, Float experience, Integer cookingTime) {
        BlastingRecipe recipe = new BlastingRecipe(key, output, input, experience, cookingTime);
        Bukkit.addRecipe(recipe);
    }

    // Create a ShapedRecipe
    public void createShapedRecipe(NamespacedKey key, ArrayList<String> shape, ArrayList<Material> ingredient, ItemStack output) {
        ShapedRecipe recipe = new ShapedRecipe(key, output);
        recipe.shape(shape.get(0), shape.get(1), shape.get(2));

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'));
        while (!ingredient.isEmpty()) {
            recipe.setIngredient(chars.get(0), ingredient.get(0));
            chars.remove(0);
            ingredient.remove(0);
        }

        Bukkit.addRecipe(recipe);
    }

    // Create a ShapelessRecipe
    public void createShapelessRecipe(NamespacedKey key, ArrayList<Material> ingredient, ItemStack output) {
        ShapelessRecipe recipe = new ShapelessRecipe(key, output);

        while (!ingredient.isEmpty()) {
            recipe.addIngredient(ingredient.get(0));
            ingredient.remove(0);
        }

        Bukkit.addRecipe(recipe);
    }
}
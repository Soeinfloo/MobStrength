package org.soeinflooo.mobstrength.utils;

import com.google.common.collect.Lists;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.soeinflooo.mobstrength.main.Main;

import java.util.List;

public class configStuff {
    private static final List<String> firstArgument = Lists.newArrayList();
    public static List<String> getFirstArguments() {
        return firstArgument;
    }
    public static void setFirstArguments() {
        getFirstArguments().add("bee");
        getFirstArguments().add("blaze");
        getFirstArguments().add("cave_spider");
        getFirstArguments().add("chicken_jockey");
        getFirstArguments().add("creeper");
        getFirstArguments().add("dolphin");
        getFirstArguments().add("drowned");
        getFirstArguments().add("elder_guardian");
        getFirstArguments().add("ender_dragon");
        getFirstArguments().add("enderman");
        getFirstArguments().add("endermite");
        getFirstArguments().add("evoker");
        getFirstArguments().add("ghast");
        getFirstArguments().add("goat");
        getFirstArguments().add("guardian");
        getFirstArguments().add("hoglin");
        getFirstArguments().add("husk");
        getFirstArguments().add("iron_golem");
        getFirstArguments().add("llama");
        getFirstArguments().add("magma_cube");
        getFirstArguments().add("panda");
        getFirstArguments().add("phantom");
        getFirstArguments().add("piglin");
        getFirstArguments().add("piglin_brute");
        getFirstArguments().add("pillager");
        getFirstArguments().add("polar_bear");
        getFirstArguments().add("ravager");
        getFirstArguments().add("shulker");
        getFirstArguments().add("silverfish");
        getFirstArguments().add("skeleton");
        getFirstArguments().add("skeleton_horseman");
        getFirstArguments().add("slime");
        getFirstArguments().add("spider");
        getFirstArguments().add("spider_jockey");
        getFirstArguments().add("stray");
        getFirstArguments().add("trader_llama");
        getFirstArguments().add("vex");
        getFirstArguments().add("vindicator");
        getFirstArguments().add("warden");
        getFirstArguments().add("witch");
        getFirstArguments().add("wither");
        getFirstArguments().add("wolf");
        getFirstArguments().add("zoglin");
        getFirstArguments().add("zombie");
        getFirstArguments().add("zombie_villager");
        getFirstArguments().add("zombified_piglin");

    }
    public static void addDefaults(FileConfiguration config) {

        config.addDefault("bee", "");
        config.addDefault("bee" + ".Modifier", "+");
        config.addDefault("bee" +".Damage", 0);

        config.addDefault("blaze", "");
        config.addDefault("blaze" + ".Modifier", "+");
        config.addDefault("blaze" +".Damage", 0);

        config.addDefault("cave_spider", "");
        config.addDefault("cave_spider" + ".Modifier", "+");
        config.addDefault("cave_spider" +".Damage", 0);

        config.addDefault("chicken_jockey", "");
        config.addDefault("chicken_jockey" + ".Modifier", "+");
        config.addDefault("chicken_jockey" +".Damage", 0);

        config.addDefault("creeper", "");
        config.addDefault("creeper" + ".Modifier", "+");
        config.addDefault("creeper" +".Damage", 0);

        config.addDefault("dolphin", "");
        config.addDefault("dolphin" + ".Modifier", "+");
        config.addDefault("dolphin" +".Damage", 0);

        config.addDefault("drowned", "");
        config.addDefault("drowned" + ".Modifier", "+");
        config.addDefault("drowned" +".Damage", 0);

        config.addDefault("elder_guardian", "");
        config.addDefault("elder_guardian" + ".Modifier", "+");
        config.addDefault("elder_guardian" +".Damage", 0);

        config.addDefault("ender_dragon", "");
        config.addDefault("ender_dragon" + ".Modifier", "+");
        config.addDefault("ender_dragon" +".Damage", 0);

        config.addDefault("enderman", "");
        config.addDefault("enderman" + ".Modifier", "+");
        config.addDefault("enderman" +".Damage", 0);

        config.addDefault("endermite", "");
        config.addDefault("endermite" + ".Modifier", "+");
        config.addDefault("endermite" +".Damage", 0);

        config.addDefault("evoker", "");
        config.addDefault("evoker" + ".Modifier", "+");
        config.addDefault("evoker" +".Damage", 0);

        config.addDefault("ghast", "");
        config.addDefault("ghast" + ".Modifier", "+");
        config.addDefault("ghast" +".Damage", 0);

        config.addDefault("goat", "");
        config.addDefault("goat" + ".Modifier", "+");
        config.addDefault("goat" +".Damage", 0);

        config.addDefault("guardian", "");
        config.addDefault("guardian" + ".Modifier", "+");
        config.addDefault("guardian" +".Damage", 0);

        config.addDefault("hoglin", "");
        config.addDefault("hoglin" + ".Modifier", "+");
        config.addDefault("hoglin" +".Damage", 0);

        config.addDefault("husk", "");
        config.addDefault("husk" + ".Modifier", "+");
        config.addDefault("husk" +".Damage", 0);

        config.addDefault("iron_golem", "");
        config.addDefault("iron_golem" + ".Modifier", "+");
        config.addDefault("iron_golem" +".Damage", 0);

        config.addDefault("llama", "");
        config.addDefault("llama" + ".Modifier", "+");
        config.addDefault("llama" +".Damage", 0);

        config.addDefault("magma_cube", "");
        config.addDefault("magma_cube" + ".Modifier", "+");
        config.addDefault("magma_cube" +".Damage", 0);

        config.addDefault("panda", "");
        config.addDefault("panda" + ".Modifier", "+");
        config.addDefault("panda" +".Damage", 0);

        config.addDefault("phantom", "");
        config.addDefault("phantom" + ".Modifier", "+");
        config.addDefault("phantom" +".Damage", 0);

        config.addDefault("piglin", "");
        config.addDefault("piglin" + ".Modifier", "+");
        config.addDefault("piglin" +".Damage", 0);

        config.addDefault("piglin_brute", "");
        config.addDefault("piglin_brute" + ".Modifier", "+");
        config.addDefault("piglin_brute" +".Damage", 0);

        config.addDefault("pillager", "");
        config.addDefault("pillager" + ".Modifier", "+");
        config.addDefault("pillager" +".Damage", 0);

        config.addDefault("polar_bear", "");
        config.addDefault("polar_bear" + ".Modifier", "+");
        config.addDefault("polar_bear" +".Damage", 0);

        config.addDefault("ravager", "");
        config.addDefault("ravager" + ".Modifier", "+");
        config.addDefault("ravager" +".Damage", 0);

        config.addDefault("shulker", "");
        config.addDefault("shulker" + ".Modifier", "+");
        config.addDefault("shulker" +".Damage", 0);

        config.addDefault("silverfish", "");
        config.addDefault("silverfish" + ".Modifier", "+");
        config.addDefault("silverfish" +".Damage", 0);

        config.addDefault("skeleton", "");
        config.addDefault("skeleton" + ".Modifier", "+");
        config.addDefault("skeleton" +".Damage", 0);

        config.addDefault("skeleton_horseman", "");
        config.addDefault("skeleton_horseman" + ".Modifier", "+");
        config.addDefault("skeleton_horseman" +".Damage", 0);

        config.addDefault("slime", "");
        config.addDefault("slime" + ".Modifier", "+");
        config.addDefault("slime" +".Damage", 0);

        config.addDefault("spider", "");
        config.addDefault("spider" + ".Modifier", "+");
        config.addDefault("spider" +".Damage", 0);

        config.addDefault("spider_jockey", "");
        config.addDefault("spider_jockey" + ".Modifier", "+");
        config.addDefault("spider_jockey" +".Damage", 0);

        config.addDefault("stray", "");
        config.addDefault("stray" + ".Modifier", "+");
        config.addDefault("stray" +".Damage", 0);

        config.addDefault("trader_llama", "");
        config.addDefault("trader_llama" + ".Modifier", "+");
        config.addDefault("trader_llama" +".Damage", 0);

        config.addDefault("vex", "");
        config.addDefault("vex" + ".Modifier", "+");
        config.addDefault("vex" +".Damage", 0);

        config.addDefault("vindicator", "");
        config.addDefault("vindicator" + ".Modifier", "+");
        config.addDefault("vindicator" +".Damage", 0);

        config.addDefault("warden", "");
        config.addDefault("warden" + ".Modifier", "+");
        config.addDefault("warden" +".Damage", 0);

        config.addDefault("witch", "");
        config.addDefault("witch" + ".Modifier", "+");
        config.addDefault("witch" +".Damage", 0);

        config.addDefault("wither", "");
        config.addDefault("wither" + ".Modifier", "+");
        config.addDefault("wither" +".Damage", 0);

        config.addDefault("wolf", "");
        config.addDefault("wolf" + ".Modifier", "+");
        config.addDefault("wolf" +".Damage", 0);

        config.addDefault("zoglin", "");
        config.addDefault("zoglin" + ".Modifier", "+");
        config.addDefault("zoglin" +".Damage", 0);

        config.addDefault("zombie", "");
        config.addDefault("zombie" + ".Modifier", "+");
        config.addDefault("zombie" +".Damage", 0);

        config.addDefault("zombie_villager", "");
        config.addDefault("zombie_villager" + ".Modifier", "+");
        config.addDefault("zombie_villager" +".Damage", 0);

        config.addDefault("zombified_piglin", "");
        config.addDefault("zombified_piglin" + ".Modifier", "+");
        config.addDefault("zombified_piglin" +".Damage", 0);
        config.options().copyDefaults(true);
    }
}

package org.soeinflooo.mobstrength.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MobStrengthCompleter implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(args.length == 1) {
            List<String> mobs = new ArrayList<>();
            mobs.add("Bee");
            mobs.add("Blaze");
            mobs.add("Cave_Spider");
            mobs.add("Chicken_Jockey");
            mobs.add("Creeper");
            mobs.add("Dolphin");
            mobs.add("Drowned");
            mobs.add("Elder_Guardian");
            mobs.add("Ender_Dragon");
            mobs.add("Enderman");
            mobs.add("Endermite");
            mobs.add("Evoker");
            mobs.add("Ghast");
            mobs.add("Goat");
            mobs.add("Guardian");
            mobs.add("Hoglin");
            mobs.add("Husk");
            mobs.add("Iron_Golem");
            mobs.add("Llama");
            mobs.add("Magma_Cube");
            mobs.add("Panda");
            mobs.add("Phantom");
            mobs.add("Piglin");
            mobs.add("Piglin_Brute");
            mobs.add("Pillager");
            mobs.add("Polar_Bear");
            mobs.add("Ravager");
            mobs.add("Reset");
            mobs.add("Shulker");
            mobs.add("Silverfish");
            mobs.add("Skeleton");
            mobs.add("Skeleton_Horseman");
            mobs.add("Slime");
            mobs.add("Spider");
            mobs.add("Spider_Jockey");
            mobs.add("Stray");
            mobs.add("Trader_Llama");
            mobs.add("Vex");
            mobs.add("Vindicator");
            mobs.add("Warden");
            mobs.add("Witch");
            mobs.add("Wither");
            mobs.add("Wolf");
            mobs.add("Zoglin");
            mobs.add("Zombie");
            mobs.add("Zombie_Villager");
            mobs.add("Zombified_Piglin");

            List<String> result = new ArrayList<String>();
            for (String s : mobs) {
                if(s.toLowerCase().startsWith(args[0].toLowerCase())){
                    result.add(s);
                }
            }
            return result;
        }
        if(args.length == 2) {
            List<String> modifier = new ArrayList<>();
            modifier.add("+");
            modifier.add("-");
            modifier.add("%");
            modifier.add("set");
            return modifier;
        }
        if(args.length == 3) {
            List<String> damage = new ArrayList<>();
            damage.add("1");
            damage.add("2");
            damage.add("3");
            damage.add("4");
            damage.add("5");
            damage.add("6");
            damage.add("7");
            damage.add("8");
            damage.add("9");
            damage.add("10");
            return damage;

        }

        return null;
    }
}

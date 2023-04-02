package org.soeinflooo.mobstrength.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.soeinflooo.mobstrength.main.Main;


public class MobStrength implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!args[0].isEmpty()) {
                String enemy = args[0];
                if (!args[1].isEmpty()) {
                    String modifier = args[1];
                    if (!args[2].isEmpty()) {
                        Double damage = Double.valueOf(args[2]);

                        if (player.isOp()) {
                            FileConfiguration config = Main.getPlugin().getConfig();

                            //If the modifier is "Plus"
                            if (modifier.equals("+")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been increased by: " + damage + " damage");
                                config.set(enemy.toLowerCase() + ".Damage", damage);
                                config.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                player.sendMessage(String.valueOf(config.get(enemy.toLowerCase())));
                                player.sendMessage(String.valueOf(config.get(enemy.toLowerCase() + ".Modifier")));
                                player.sendMessage(String.valueOf(config.get(enemy.toLowerCase() + ".Damage")));

                                //If the modifier is "Minus"
                            } else if (modifier.equals("-")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been decreased by: " + damage + " damage");
                                config.set(enemy.toLowerCase() + ".Damage", damage);
                                config.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase())));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Modifier")));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Damage")));

                                //If the modifier is "Percent"
                            } else if (modifier.equals("%")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage * 100 + "% damage");
                                config.set(enemy.toLowerCase() + ".Damage", damage);
                                config.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase())));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Modifier")));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Damage")));

                                //If the modifier is "set"
                            } else if (modifier.equals("set")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage + " damage");
                                config.set(enemy.toLowerCase() + ".Damage", damage);
                                config.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase())));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Modifier")));
                                player.sendMessage(String.valueOf(Main.prefix + config.get(enemy.toLowerCase() + ".Damage")));

                            } else return false;


                        } else player.sendMessage("Sowwy u no Op UwU");
                    }else player.sendMessage("Please use the correct Format!"); return false;
                }else player.sendMessage("Please use the correct Format!"); return false;
            }else player.sendMessage("Please use the correct Format!"); return false;
        } return false;
    }
}


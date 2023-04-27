package org.soeinflooo.mobstrength.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.soeinflooo.mobstrength.main.Main;
import org.soeinflooo.mobstrength.utils.configStuff;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MobStrength implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        configStuff.setFirstArguments();
        List<String> firstArgument = configStuff.getFirstArguments();

        FileConfiguration serverConfig = Main.getPlugin().getConfig();
        File playerFolder = new File(Main.getPlugin().getDataFolder() + File.separator + "Players");

        if (sender instanceof Player player) {


            if (args.length == 0) {

                player.sendMessage(Main.prefix + "Please use: /ms <enemy> <modifier> <number> <Server/Player>");

            } else if (args.length == 1) {
                player.sendMessage(Main.prefix + "Please use: /ms <enemy> <modifier> <number> <Server/Player>");

            } else if (args.length == 2) {
                if(args[0].equalsIgnoreCase("reset") && args[1].equalsIgnoreCase("server")){

                    for (String key : serverConfig.getConfigurationSection("").getKeys(false)) {

                        serverConfig.set(key + ".Damage", 0.0);
                        serverConfig.set(key + ".Modifier", "+");
                    }
                    player.sendMessage(Main.prefix + "Server Config for Damage and Modifier of all Mobs has been reset!");
                    Main.getPlugin().saveConfig();

                } else if (args[0].equalsIgnoreCase("reset") && (!(args[1].equalsIgnoreCase("server")))) {
                    Player resetTarget = Bukkit.getPlayer(args[1]);
                    File resetPlayerFile = new File(playerFolder, resetTarget.getUniqueId() + ".yml");
                    FileConfiguration resetPlayerConfig = YamlConfiguration.loadConfiguration(resetPlayerFile);
                    for (String key : serverConfig.getConfigurationSection("").getKeys(false)) {

                        resetPlayerConfig.set(key + ".Damage", 0.0);
                        resetPlayerConfig.set(key + ".Modifier", "+");
                    }
                    player.sendMessage(Main.prefix + "Damage and Modifier of all Mobs have been reset for: "+resetTarget.getName());
                    try {
                        resetPlayerConfig.save(resetPlayerFile);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            } else if (args.length == 3) {

                player.sendMessage(Main.prefix + "Please use: /ms <enemy> <modifier> <number> <Server/Player>");
            } else if (args.length == 4) {
                String enemy = args[0];
                String modifier = args[1];
                Double damage = Double.valueOf(args[2]);
                if (firstArgument.contains(enemy.toLowerCase())){

                    for (Player p : Bukkit.getOnlinePlayers()) {
                        List<String> players = new ArrayList<>();
                        players.add(p.getName().toLowerCase());

                        //If the Player decides to Change the Server Config
                        if (args[3].equalsIgnoreCase("server")) {

                            //If the modifier is "Plus"
                            if (modifier.equals("+")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been increased by: " + damage + " damage");
                                serverConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                serverConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                //If the modifier is "Minus"
                            } else if (modifier.equals("-")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been decreased by: " + damage + " damage");
                                serverConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                serverConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                //If the modifier is "Percent"
                            } else if (modifier.equals("%")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage * 100 + "% damage");
                                serverConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                serverConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();

                                //If the modifier is "set"
                            } else if (modifier.equals("set")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage + " damage");
                                serverConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                serverConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();
                                Main.getPlugin().saveDefaultConfig();

                            } else return false;
                        } else if (players.contains(args[3].toLowerCase())) {
                            Player target = Bukkit.getPlayer(args[3]);
                            p.sendMessage("Found Player!: " + target.getName());
                            File playerFile = new File(playerFolder, target.getUniqueId() + ".yml");
                            FileConfiguration playerConfig = YamlConfiguration.loadConfiguration(playerFile);
                            //If the modifier is "Plus"
                            if (modifier.equals("+")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been increased by: " + damage + " damage");
                                playerConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                playerConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                try {
                                    playerConfig.save(playerFile);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }

                                //If the modifier is "Minus"
                            } else if (modifier.equals("-")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been decreased by: " + damage + " damage");
                                playerConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                playerConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                try {
                                    playerConfig.save(playerFile);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }

                                //If the modifier is "Percent"
                            } else if (modifier.equals("%")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage * 100 + "% damage");
                                playerConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                playerConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                try {
                                    playerConfig.save(playerFile);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }

                                //If the modifier is "set"
                            } else if (modifier.equals("set")) {

                                player.sendMessage(Main.prefix + "Damage from: " + enemy + " has been set to: " + damage + " damage");
                                playerConfig.set(enemy.toLowerCase() + ".Damage", damage);
                                playerConfig.set(enemy.toLowerCase() + ".Modifier", modifier);
                                Main.getPlugin().saveConfig();
                                try {
                                    playerConfig.save(playerFile);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                                ;

                            } else return false;

                        } else p.sendMessage("No Player Name Found!");
                        return false;

                    }

                }
            } else {
                Bukkit.getLogger().info(Main.prefix + "This Command is 'Player-Only'");
            }
        }return false;
    }
}










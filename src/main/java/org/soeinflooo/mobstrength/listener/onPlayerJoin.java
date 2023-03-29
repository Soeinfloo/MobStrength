package org.soeinflooo.mobstrength.listener;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.soeinflooo.mobstrength.main.Main;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        FileConfiguration config = Main.getPlugin().getConfig();

        if(player.isOp()){
            if(config.get("Setup") == "true"){

            }else{
                String locale = player.locale().toString();
                player.sendMessage("It seems like you are the first Serveradmin joining this Server!\nPlease Setup this Plugin!");
                config.addDefault("Setup","false");
                config.addDefault("Bee", "1");
                config.addDefault("Blaze", "1");
                config.addDefault("Cave_Spider", "1");
                config.addDefault("Chicken_Jockey", "1");
                config.addDefault("Creeper", "1");
                config.addDefault("Dolphin", "1");
                config.addDefault("Drowned", "1");
                config.addDefault("Elder_Guardian", "1");
                config.addDefault("Ender_Dragon", "1");
                config.addDefault("Enderman", "1");
                config.addDefault("Endermite", "1");
                config.addDefault("Evoker", "1");
                config.addDefault("Ghast", "1");
                config.addDefault("Goat", "1");
                config.addDefault("Guardian", "1");
                config.addDefault("Hoglin", "1");
                config.addDefault("Husk", "1");
                config.addDefault("Iron_Golem", "1");
                config.addDefault("Llama", "1");
                config.addDefault("Magma_Cube", "1");
                config.addDefault("Panda", "1");
                config.addDefault("Phantom", "1");
                config.addDefault("Piglin", "1");
                config.addDefault("Piglin_Brute", "1");
                config.addDefault("Pillager", "1");
                config.addDefault("Polar_Bear", "1");
                config.addDefault("Ravager", "1");
                config.addDefault("Shulker", "1");
                config.addDefault("Silverfish", "1");
                config.addDefault("Skeleton", "1");
                config.addDefault("Skeleton_Horseman", "1");
                config.addDefault("Slime", "1");
                config.addDefault("Spider", "1");
                config.addDefault("Spider_Jockey", "1");
                config.addDefault("Stray", "1");
                config.addDefault("Trader_Llama", "1");
                config.addDefault("Vex", "1");
                config.addDefault("Vindicator", "1");
                config.addDefault("Warden", "1");
                config.addDefault("Witch", "1");
                config.addDefault("Wither", "1");
                config.addDefault("Wolf", "1");
                config.addDefault("Zoglin", "1");
                config.addDefault("Zombie", "1");
                config.addDefault("Zombie_Villager", "1");
                config.addDefault("Zombified_Piglin", "1");
                config.setDefaults(config);
                Main.getPlugin().saveConfig();


            }
        }
        if(!(player.hasPlayedBefore())) {
            File pFile = new File(Main.getPlugin().getDataFolder().getPath() + "/Players" + File.separator + player.getUniqueId() + ".yml");
            final FileConfiguration playerData = YamlConfiguration.loadConfiguration(pFile);
            if (!pFile.exists()) {
                try {
                    pFile.mkdir();
                    playerData.createSection("Username");
                    playerData.createSection("First Seen");
                    playerData.createSection("Locale");
                    java.util.Date date = new java.util.Date(System.currentTimeMillis());
                    playerData.set("Username", player.getName());
                    playerData.set("First Seen", date);
                    playerData.set("Locale", "test");
                    try {
                        playerData.save(pFile);
                        player.sendMessage("[Erstes Mal] Spieler Config erstellt!");
                    } catch (IOException ex) {
                        player.sendMessage("Fehler beim erstellen der Spieler Config!\n Bitte Relogg oder kontaktiere den Server Admin!");
                    }
                } catch (NullPointerException ex) {
                    player.sendMessage("Fehler beim erstellen der Spieler Config!\n Bitte Relogg oder kontaktiere den Server Admin!");
                }
            }
        }

    }
}

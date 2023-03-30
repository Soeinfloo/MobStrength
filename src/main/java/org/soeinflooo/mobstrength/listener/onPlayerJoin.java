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

        if(config.get("Setup") == "true"){

        }else{
            config.addDefault("Setup","false");

            config.addDefault("Overall","");
            config.addDefault("Overall" +".Modifier:", 1);

            config.addDefault("Bee", "");
            config.addDefault("Bee" + ".Modifier:", 1);

            config.addDefault("Blaze", "");
            config.addDefault("Blaze" + ".Modifier:", 1);

            config.addDefault("Cave_Spider", "");
            config.addDefault("Cave_Spider" + ".Modifier:", 1);

            config.addDefault("Chicken_Jockey", "");
            config.addDefault("Chicken_Jockey" + ".Modifier:", 1);

            config.addDefault("Creeper", "");
            config.addDefault("Creeper" + ".Modifier:", 1);

            config.addDefault("Dolphin", "");
            config.addDefault("Dolphin" + ".Modifier:", 1);

            config.addDefault("Drowned", "");
            config.addDefault("Drowned" + ".Modifier:", 1);

            config.addDefault("Elder_Guardian", "");
            config.addDefault("Elder_Guardian" + ".Modifier:", 1);

            config.addDefault("Ender_Dragon", "");
            config.addDefault("Ender_Dragon" + ".Modifier:", 1);

            config.addDefault("Enderman", "");
            config.addDefault("Enderman" + ".Modifier:", 1);

            config.addDefault("Endermite", "");
            config.addDefault("Endermite" + ".Modifier:", 1);

            config.addDefault("Evoker", "");
            config.addDefault("Evoker" + ".Modifier:", 1);

            config.addDefault("Ghast", "");
            config.addDefault("Ghast" + ".Modifier:", 1);

            config.addDefault("Goat", "");
            config.addDefault("Goat" + ".Modifier:", 1);

            config.addDefault("Guardian", "");
            config.addDefault("Guardian" + ".Modifier:", 1);

            config.addDefault("Hoglin", "");
            config.addDefault("Hoglin" + ".Modifier:", 1);

            config.addDefault("Husk", "");
            config.addDefault("Husk" + ".Modifier:", 1);

            config.addDefault("Iron_Golem", "");
            config.addDefault("Iron_Golem" + ".Modifier:", 1);

            config.addDefault("Llama", "");
            config.addDefault("Llama" + ".Modifier:", 1);

            config.addDefault("Magma_Cube", "");
            config.addDefault("Magma_Cube" + ".Modifier:", 1);

            config.addDefault("Panda", "");
            config.addDefault("Panda" + ".Modifier:", 1);

            config.addDefault("Phantom", "");
            config.addDefault("Phantom" + ".Modifier:", 1);

            config.addDefault("Piglin", "");
            config.addDefault("Piglin" + ".Modifier:", 1);

            config.addDefault("Piglin_Brute", "");
            config.addDefault("Piglin_Brute" + ".Modifier:", 1);

            config.addDefault("Pillager", "");
            config.addDefault("Pillager" + ".Modifier:", 1);

            config.addDefault("Polar_Bear", "");
            config.addDefault("Polar_Bear" + ".Modifier:", 1);

            config.addDefault("Ravager", "");
            config.addDefault("Ravager" + ".Modifier:", 1);

            config.addDefault("Shulker", "");
            config.addDefault("Shulker" + ".Modifier:", 1);

            config.addDefault("Silverfish", "");
            config.addDefault("Silverfish" + ".Modifier:", 1);

            config.addDefault("Skeleton", "");
            config.addDefault("Skeleton" + ".Modifier:", 1);

            config.addDefault("Skeleton_Horseman", "");
            config.addDefault("Skeleton_Horseman" + ".Modifier:", 1);

            config.addDefault("Slime", "");
            config.addDefault("Slime" + ".Modifier:", 1);

            config.addDefault("Spider", "");
            config.addDefault("Spider" + ".Modifier:", 1);

            config.addDefault("Spider_Jockey", "");
            config.addDefault("Spider_Jockey" + ".Modifier:", 1);

            config.addDefault("Stray", "");
            config.addDefault("Stray" + ".Modifier:", 1);

            config.addDefault("Trader_Llama", "");
            config.addDefault("Trader_Llama" + ".Modifier:", 1);

            config.addDefault("Vex", "");
            config.addDefault("Vex" + ".Modifier:", 1);

            config.addDefault("Vindicator", "");
            config.addDefault("Vindicator" + ".Modifier:", 1);

            config.addDefault("Warden", "");
            config.addDefault("Warden" + ".Modifier:", 1);

            config.addDefault("Witch", "");
            config.addDefault("Witch" + ".Modifier:", 1);

            config.addDefault("Wither", "");
            config.addDefault("Wither" + ".Modifier:", 1);

            config.addDefault("Wolf", "");
            config.addDefault("Wolf" + ".Modifier:", 1);

            config.addDefault("Zoglin", "");
            config.addDefault("Zoglin" + ".Modifier:", 1);

            config.addDefault("Zombie", "");
            config.addDefault("Zombie" + ".Modifier:", 1);

            config.addDefault("Zombie_Villager", "");
            config.addDefault("Zombie_Villager" + ".Modifier:", 1);

            config.addDefault("Zombified_Piglin", "");
            config.addDefault("Zombified_Piglin" + ".Modifier:", 1);


            config.options().copyDefaults(true);
            Main.getPlugin().saveConfig();

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

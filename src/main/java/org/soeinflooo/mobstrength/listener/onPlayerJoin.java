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
                config.set("Setup", "false");


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

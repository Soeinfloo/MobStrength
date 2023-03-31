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
            config.addDefault("Overall" +".Modifier", "-");
            config.addDefault("Overall" +".Damage", 1);

            config.addDefault("bee", "");
            config.addDefault("bee" + ".Modifier", "-");

            config.addDefault("blaze", "");
            config.addDefault("blaze" + ".Modifier", "-");

            config.addDefault("cave_spider", "");
            config.addDefault("cave_spider" + ".Modifier", "-");

            config.addDefault("chicken_jockey", "");
            config.addDefault("chicken_jockey" + ".Modifier", "-");

            config.addDefault("creeper", "");
            config.addDefault("creeper" + ".Modifier", "-");

            config.addDefault("dolphin", "");
            config.addDefault("dolphin" + ".Modifier", "-");

            config.addDefault("drowned", "");
            config.addDefault("drowned" + ".Modifier", "-");

            config.addDefault("elder_guardian", "");
            config.addDefault("elder_guardian" + ".Modifier", "-");

            config.addDefault("ender_dragon", "");
            config.addDefault("ender_dragon" + ".Modifier", "-");

            config.addDefault("enderman", "");
            config.addDefault("enderman" + ".Modifier", "-");

            config.addDefault("endermite", "");
            config.addDefault("endermite" + ".Modifier", "-");

            config.addDefault("evoker", "");
            config.addDefault("evoker" + ".Modifier", "-");

            config.addDefault("ghast", "");
            config.addDefault("ghast" + ".Modifier", "-");

            config.addDefault("goat", "");
            config.addDefault("goat" + ".Modifier", "-");

            config.addDefault("guardian", "");
            config.addDefault("guardian" + ".Modifier", "-");

            config.addDefault("hoglin", "");
            config.addDefault("hoglin" + ".Modifier", "-");

            config.addDefault("husk", "");
            config.addDefault("husk" + ".Modifier", "-");

            config.addDefault("iron_golem", "");
            config.addDefault("iron_golem" + ".Modifier", "-");

            config.addDefault("llama", "");
            config.addDefault("llama" + ".Modifier", "-");

            config.addDefault("magma_cube", "");
            config.addDefault("magma_cube" + ".Modifier", "-");

            config.addDefault("panda", "");
            config.addDefault("panda" + ".Modifier", "-");

            config.addDefault("phantom", "");
            config.addDefault("phantom" + ".Modifier", "-");

            config.addDefault("piglin", "");
            config.addDefault("piglin" + ".Modifier", "-");

            config.addDefault("piglin_brute", "");
            config.addDefault("piglin_brute" + ".Modifier", "-");

            config.addDefault("pillager", "");
            config.addDefault("pillager" + ".Modifier", "-");

            config.addDefault("polar_bear", "");
            config.addDefault("polar_bear" + ".Modifier", "-");

            config.addDefault("ravager", "");
            config.addDefault("ravager" + ".Modifier", "-");

            config.addDefault("shulker", "");
            config.addDefault("shulker" + ".Modifier", "-");

            config.addDefault("silverfish", "");
            config.addDefault("silverfish" + ".Modifier", "-");

            config.addDefault("skeleton", "");
            config.addDefault("skeleton" + ".Modifier", "-");

            config.addDefault("skeleton_horseman", "");
            config.addDefault("skeleton_horseman" + ".Modifier", "-");

            config.addDefault("slime", "");
            config.addDefault("slime" + ".Modifier", "-");

            config.addDefault("spider", "");
            config.addDefault("spider" + ".Modifier", "-");

            config.addDefault("spider_jockey", "");
            config.addDefault("spider_jockey" + ".Modifier", "-");

            config.addDefault("stray", "");
            config.addDefault("stray" + ".Modifier", "-");

            config.addDefault("trader_llama", "");
            config.addDefault("trader_llama" + ".Modifier", "-");

            config.addDefault("vex", "");
            config.addDefault("vex" + ".Modifier", "-");

            config.addDefault("vindicator", "");
            config.addDefault("vindicator" + ".Modifier", "-");

            config.addDefault("warden", "");
            config.addDefault("warden" + ".Modifier", "-");

            config.addDefault("witch", "");
            config.addDefault("witch" + ".Modifier", "-");

            config.addDefault("wither", "");
            config.addDefault("wither" + ".Modifier", "-");

            config.addDefault("wolf", "");
            config.addDefault("wolf" + ".Modifier", "-");

            config.addDefault("zoglin", "");
            config.addDefault("zoglin" + ".Modifier", "-");

            config.addDefault("zombie", "");
            config.addDefault("zombie" + ".Modifier", "-");

            config.addDefault("zombie_villager", "");
            config.addDefault("zombie_villager" + ".Modifier", "-");

            config.addDefault("zombified_piglin", "");
            config.addDefault("zombified_piglin" + ".Modifier", "-");


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
                        player.sendMessage("[Mobstrength] Spieler Config erstellt!");
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

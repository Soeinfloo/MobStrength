package org.soeinflooo.mobstrength.listener;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.soeinflooo.mobstrength.main.Main;
import org.soeinflooo.mobstrength.utils.configStuff;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        File playerFolder = new File(Main.getPlugin().getDataFolder() + File.separator + "Players");
        if (!playerFolder.exists()) {
            try {
                playerFolder.mkdir();
            } catch (NullPointerException ex) {
                p.sendMessage("Folder couldn't be created!");
            }
        }

        String joined = "yes";
        PersistentDataContainer pdc = p.getPersistentDataContainer();
        NamespacedKey pdc_key = new NamespacedKey(Main.getPlugin(), "joined");
        //FileConfiguration config = Main.getPlugin().getConfig();
        if (pdc.get(pdc_key, PersistentDataType.STRING) == null) {

            pdc.set(pdc_key, PersistentDataType.STRING, joined);
            p.sendMessage(Main.prefix + "Persistent Data Container has been set to: " + pdc.get(pdc_key, PersistentDataType.STRING));
            File playerFile = new File(playerFolder, p.getUniqueId() + ".yml");
            FileConfiguration config = YamlConfiguration.loadConfiguration(playerFile);
            try {
                playerFile.createNewFile();
                configStuff.addDefaults(config);
                try {
                    config.save(playerFile);
                    //p.sendMessage("Player File created!");
                } catch (IOException ex) {
                    //p.sendMessage("Error saving the Player File!");
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}






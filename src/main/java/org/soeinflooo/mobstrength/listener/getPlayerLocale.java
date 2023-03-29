package org.soeinflooo.mobstrength.listener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLocaleChangeEvent;
import org.soeinflooo.mobstrength.main.Main;

import java.io.File;
import java.io.IOException;

public class getPlayerLocale implements Listener {

    @EventHandler
    public void getPlayerLocale(PlayerLocaleChangeEvent e){
        Player player = e.getPlayer();
        File pFile = new File(Main.getPlugin().getDataFolder().getPath() + "/Players" + File.separator + player.getUniqueId() + ".yml");
        final FileConfiguration playerData = YamlConfiguration.loadConfiguration(pFile);
        playerData.set("Locale", player.locale().toLanguageTag());
        try {
            playerData.save(pFile);
            player.sendMessage("Locale Saved!");
        } catch (IOException ex) {
            player.sendMessage("Fehler beim Speichern der Sprache!");

        }

    }
}

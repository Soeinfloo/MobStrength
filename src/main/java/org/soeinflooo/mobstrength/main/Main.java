package org.soeinflooo.mobstrength.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.soeinflooo.mobstrength.commands.MobStrength;
import org.soeinflooo.mobstrength.commands.MobStrengthCompleter;
import org.soeinflooo.mobstrength.listener.entityDamageEntity;
import org.soeinflooo.mobstrength.listener.getPlayerLocale;
import org.soeinflooo.mobstrength.listener.onPlayerJoin;

import java.io.File;
//import org.soeinflooo.mobstrength.utils.Config;

public final class Main extends JavaPlugin {
    FileConfiguration config = getConfig();
    private static Main plugin;
    private static File f;
    private static FileConfiguration cfg;
    public static String prefix;


    @Override
    public void onLoad() {
        //plugin = this;
        //config = new Config();
        Bukkit.getLogger().info("MobStrength Up Players Down!");
    }

    @Override
    public void onEnable() {
        plugin = this;
        addCommands();
        addEvents();
        config();
        //addDefaults();




    }

    @Override
    public void onDisable() {
        Main.getPlugin().saveConfig();
    }

    public static void addEvents() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new onPlayerJoin(), Main.getPlugin());
        pluginManager.registerEvents(new getPlayerLocale(), Main.getPlugin());
        pluginManager.registerEvents(new entityDamageEntity(), Main.getPlugin());


    }

    private void addCommands() {
        getCommand("ms").setExecutor(new MobStrength());
        getCommand("ms").setTabCompleter(new MobStrengthCompleter());

    }
    private void config() {

        f = new File("plugins/MobStrength", "prefix.yml");
        cfg = YamlConfiguration.loadConfiguration(f);
        cfg.addDefault("Prefix", "§8§l−﴾§MobStrength§8§l﴿− §7");
        cfg.options().copyDefaults(true);
        saveDefaultConfig();
        prefix = cfg.getString("Prefix").replaceAll("&", "§");
    }
    public static Main getPlugin() {return plugin;}
}

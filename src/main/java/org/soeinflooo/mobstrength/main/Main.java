package org.soeinflooo.mobstrength.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.soeinflooo.mobstrength.commands.MobStrength;
import org.soeinflooo.mobstrength.commands.MobStrengthCompleter;
import org.soeinflooo.mobstrength.listener.entityDamageEntity;
import org.soeinflooo.mobstrength.listener.getPlayerLocale;
import org.soeinflooo.mobstrength.listener.onPlayerJoin;
//import org.soeinflooo.mobstrength.utils.Config;

public final class Main extends JavaPlugin {
    FileConfiguration config = getConfig();
    private static Main plugin;

    //private Config config;
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
        //addDefaults();




    }

    @Override
    public void onDisable() {
        Main.getPlugin().saveConfig();
    }

    //public Config getConfiguration() {return config;}
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
    public static Main getPlugin() {return plugin;}
}

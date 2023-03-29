package org.soeinflooo.mobstrength.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.soeinflooo.mobstrength.listener.getPlayerLocale;
import org.soeinflooo.mobstrength.listener.onPlayerJoin;
//import org.soeinflooo.mobstrength.utils.Config;

public final class Main extends JavaPlugin {

    private static Main plugin;

    //private Config config;
    @Override
    public void onLoad() {
        plugin = this;
        //config = new Config();
        Bukkit.getLogger().info("MobStrength Up Players Down!");
    }

    @Override
    public void onEnable() {
        plugin = this;
        addCommands();
        addEvents();


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
        pluginManager.registerEvents(new onPlayerJoin(), Main.getPlugin());


    }

    private void addCommands() {
        //getCommand("sbb").setExecutor(new soulbindbook());

    }
    public static Main getPlugin() {return plugin;}
}

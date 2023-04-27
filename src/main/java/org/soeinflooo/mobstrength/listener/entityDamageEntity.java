package org.soeinflooo.mobstrength.listener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.projectiles.ProjectileSource;
import org.soeinflooo.mobstrength.main.Main;

public class entityDamageEntity implements Listener {

    @EventHandler
    public void entityDamage(EntityDamageByEntityEvent e) {
        FileConfiguration config = Main.getPlugin().getConfig();

        if(e.getEntity() instanceof Player p) {

            if(e.getDamager() instanceof Arrow arrow) {
                ProjectileSource projectileSource = arrow.getShooter();
                Entity entity = (Entity) projectileSource;
                EntityType enemy = entity.getType();
                String enemy_string = enemy.toString().toLowerCase();

                double dmg = e.getDamage();
                p.sendMessage(Main.prefix+"Active Modifier: "+config.get(enemy_string+".Modifier") +" " +config.get(enemy_string+".Damage") +" Damage.");

                if(config.get(enemy_string+".Modifier").equals("+")) {

                    double modified_dmg = dmg+config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damage Source: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("-")) {

                    double modified_dmg = dmg-config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("%")) {

                    double modified_dmg = dmg*config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("set")) {

                    double modified_dmg = config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                }



            }else{

                EntityType enemy = e.getDamager().getType();
                String enemy_string = enemy.toString().toLowerCase();
                double dmg = e.getDamage();
                p.sendMessage(Main.prefix+"Active Modifier: "+config.get(enemy_string+".Modifier") +" " +config.get(enemy_string+".Damage") +" Damage.");

                if(config.get(enemy_string+".Modifier").equals("+")) {

                    double modified_dmg = dmg+config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damage Source: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("-")) {

                    double modified_dmg = dmg-config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("%")) {

                    double modified_dmg = dmg*config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);

                } else if (config.get(enemy_string+".Modifier").equals("set")) {

                    double modified_dmg = config.getDouble(enemy_string+".Damage");
                    p.sendMessage(Main.prefix+"Damager: "+enemy_string);
                    p.sendMessage(Main.prefix+"For: " +dmg +" damage.");
                    p.sendMessage(Main.prefix+"Modified DMG:"+ modified_dmg);

                    if(modified_dmg <= 0.0) {
                        e.setCancelled(true);
                    }else e.setDamage(modified_dmg);
                }
            }
        }else return;
    }
}


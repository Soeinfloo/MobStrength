package org.soeinflooo.mobstrength.listener;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.projectiles.ProjectileSource;

public class entityDamageEntity implements Listener {

    @EventHandler
    public void entityDamage(EntityDamageByEntityEvent e) {

        if(e.getEntity() instanceof Player p) {
            if(e.getDamager() instanceof Arrow arrow) {

                ProjectileSource projectileSource = arrow.getShooter();
                Entity entity = (Entity) projectileSource;
                EntityType enemy = entity.getType();
                String enemy_string = enemy.toString().toLowerCase();

                double dmg = e.getDamage();

                p.sendMessage("Damager: "+enemy_string);
                p.sendMessage("For: " +dmg +" damage.");
            }else{

                EntityType enemy = e.getDamager().getType();
                String enemy_string = enemy.toString().toLowerCase();
                double dmg = e.getDamage();

                p.sendMessage("Damager: "+enemy_string);
                p.sendMessage("For: " +dmg +" damage.");
            }
        }else return;
    }
}

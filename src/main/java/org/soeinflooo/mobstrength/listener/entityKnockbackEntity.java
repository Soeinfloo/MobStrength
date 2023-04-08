package org.soeinflooo.mobstrength.listener;

import com.destroystokyo.paper.event.entity.EntityKnockbackByEntityEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.projectiles.ProjectileSource;
import org.soeinflooo.mobstrength.main.Main;

public class entityKnockbackEntity implements Listener {
    FileConfiguration config = Main.getPlugin().getConfig();
    @EventHandler
    public void onEntityKnockback(EntityKnockbackByEntityEvent e) {
        if (e.getEntity() instanceof Player p) {

            if (e.getHitBy() instanceof Arrow arrow) {

                ProjectileSource projectileSource = arrow.getShooter();
                Entity entity = (Entity) projectileSource;
                EntityType enemy = entity.getType();
                String enemy_string = enemy.toString().toLowerCase();
                if(!(config.get(enemy_string+".Damage").equals(0))){
                    e.setCancelled(true);
                }
            }else {
                EntityType enemy = e.getHitBy().getType();
                String enemy_string = enemy.toString().toLowerCase();
                if(!(config.get(enemy_string+".Damage").equals(0))){
                    e.setCancelled(true);
                }
            }
        }

    }
}

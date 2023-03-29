package org.soeinflooo.mobstrength.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MobStrength implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()){
                if(args[1].equals("+")) {
                    player.sendMessage("Damage from: "+ args[0] + " has been increased by: " + args[2] + " damage");
                }else if(args[1].equals("-")) {
                    player.sendMessage("Damage from: "+ args[0] + " has been decreased by: " + args[2] + " damage");
                }else return false;
            }else player.sendMessage("Sowwy u no Op UwU");
        }
        return false;
    }
}

package org.soeinflooo.mobstrength.utils;

import org.bukkit.ChatColor;

public class ChatColors {

    public static String rainbow(String s)
    {
        StringBuilder b = new StringBuilder();
        ChatColor[] ch = {ChatColor.DARK_RED, ChatColor.RED, ChatColor.GOLD, ChatColor.YELLOW, ChatColor.DARK_GREEN, ChatColor.GREEN, ChatColor.AQUA, ChatColor.DARK_AQUA, ChatColor.BLUE, ChatColor.DARK_BLUE, ChatColor.LIGHT_PURPLE, ChatColor.DARK_PURPLE};
        int i = 0;
        for (char c : s.toCharArray())
        {
            b.append(ch[i]).append(c);
            i++;
            i = (i+ch.length) % ch.length;
        }
        return b.toString();
    }
    public static String enchant(String s)
    {
        StringBuilder b = new StringBuilder();
        ChatColor[] ch = {ChatColor.LIGHT_PURPLE, ChatColor.DARK_PURPLE};
        int i = 0;
        for (char c : s.toCharArray())
        {
            b.append(ch[i]).append(c);
            i++;
            i = (i+ch.length) % ch.length;
        }
        return b.toString();
    }
    public static String poison(String s)
    {
        StringBuilder b = new StringBuilder();
        ChatColor[] ch = {ChatColor.DARK_GREEN, ChatColor.GREEN};
        int i = 0;
        for (char c : s.toCharArray())
        {
            b.append(ch[i]).append(c);
            i++;
            i = (i+ch.length) % ch.length;
        }
        return b.toString();
    }
}

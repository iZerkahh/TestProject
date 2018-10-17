package me.izerkahh.test;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.world.StructureGrowEvent;

public class Testing implements Listener {

    @EventHandler
    public void onGoldBreak(BlockBreakEvent e) {
        Bukkit.broadcastMessage(ChatColor.GREEN + "stap bekin bocks men");
        if (e.getBlock().getType() == Material.DIAMOND_ORE) {
            Bukkit.broadcastMessage(ChatColor.BLUE + "dimonds men");
        }
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        Bukkit.broadcastMessage(ChatColor.RED + "stahp hertin mi pepe men");
    }

    @EventHandler
    public void onKEVISGAY(BlockDispenseEvent e) {
    Bukkit.broadcastMessage(ChatColor.BLUE + "heer yu go men fri items");
    }

    @EventHandler
    public void onYOURMUM (BlockGrowEvent e) {
    Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "stap getin su beg men!");
    }

    @EventHandler
    public void onIDK (PlayerPortalEvent e) {
    Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "welcum too neter men");
    }
    
    
    @EventHandler
    public void onSomething (StructureGrowEvent e) {
    Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "stap getin su beg men!");
    }
    
    
    @EventHandler
    public void onFly (PlayerToggleFlightEvent e) {
    Bukkit.broadcastMessage(ChatColor.GREEN + "stap flain men yu two fest fore mi");
    }
}
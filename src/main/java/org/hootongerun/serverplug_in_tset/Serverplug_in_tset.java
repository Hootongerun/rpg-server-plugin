package org.hootongerun.serverplug_in_tset;

import io.papermc.paper.event.block.BlockBreakBlockEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Serverplug_in_tset extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {

    }
    @EventHandler
    public  void a1(PlayerMoveEvent a){
        Player p = a.getPlayer();
        p.sendMessage("you are moving");
    }

    @EventHandler
    public void a4(BlockBreakEvent e){
        Player p = e.getPlayer();
        p.sendMessage("you"+p.getName()+"are"+e.getBlock().getType()+"break block!");
    }
    @EventHandler
    public void a5(BlockPlaceEvent e){
        Player p =e.getPlayer();
        p.sendMessage("you"+p.getName()+"are"+e.getBlock().getType()+"place block!");

    }

    @EventHandler
    public void a2(PlayerJoinEvent a) {
        Player p = a.getPlayer();
        p.sendMessage("hello");
    }
    @EventHandler
    public void a3(PlayerChatEvent e){
        Player p = e.getPlayer();
        p.sendMessage("are you name? :"+p.getName());
        if(e.getMessage().equals("hi")){
            p.sendMessage("me too");
        }
    }



}

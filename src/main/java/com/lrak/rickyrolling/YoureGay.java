package com.lrak.rickyrolling;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class YoureGay implements Listener {

    @EventHandler
    public void rUGay(PlayerCommandPreprocessEvent fuck){
        if(fuck.getMessage().equalsIgnoreCase("/weAreZen-kun")){
            fuck.getPlayer().sendMessage("§aYou discovered the secret command! §cBut that didn't solved the hack :(\n§bYou then got §6+1 §bpoint anyway!");
            fuck.setCancelled(true);
        }
    }

}

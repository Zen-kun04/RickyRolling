package com.lrak.rickyrolling;

import org.bukkit.plugin.java.JavaPlugin;

public final class RickyRolling extends JavaPlugin {

    private static RickyRolling instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        this.getServer().getPluginManager().registerEvents(new YoureGay(), this);
        AtStart.start();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static RickyRolling getInstance(){
        return instance;
    }
}

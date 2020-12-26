package com.gmail.anemovva.drugs;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Drugs extends JavaPlugin {
    @Override
    public void onEnable() {
        Listener drugUse = new DrugsListener();
        Bukkit.getPluginManager().registerEvents(drugUse, this);
        getLogger().info("onEnable is called!");

    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}

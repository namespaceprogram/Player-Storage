package org.namespace.playerstorage;

import org.bukkit.plugin.java.JavaPlugin;
import org.namespace.playerstorage.commands.PvCommand;
import org.namespace.playerstorage.listeners.Listeners;

public final class PlayerStorage extends JavaPlugin {

    private static PlayerStorage plugin;

    @Override
    public void onEnable() {

        plugin = this;

        getCommand("pv").setExecutor(new PvCommand());

        getServer().getPluginManager().registerEvents(new Listeners(), this);


    }



    public static PlayerStorage getPlugin() {
        return plugin;
    }
}

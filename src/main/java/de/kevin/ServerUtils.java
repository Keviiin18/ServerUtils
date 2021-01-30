package de.kevin;

import de.kevin.commands.Gamemode;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerUtils extends JavaPlugin {

    private static String PLUGIN_PREFIX;
    private ServerUtils instance;

    @Override
    public void onEnable() {

        instance = this;

        PLUGIN_PREFIX = "§7[§eUtils§7] ";

        getCommand("gamemode").setExecutor(new Gamemode());

        Bukkit.getConsoleSender().sendMessage("Plugin aktiv!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String getPluginPrefix() {
        return PLUGIN_PREFIX;
    }

    public ServerUtils getInstance() {
        return instance;
    }
}

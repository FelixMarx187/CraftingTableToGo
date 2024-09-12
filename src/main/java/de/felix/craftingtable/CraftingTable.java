package de.felix.craftingtable;

import de.felix.craftingtable.Workbench.CraftingTableCommand;
import de.felix.craftingtable.Workbench.CraftingTableRightClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftingTable extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new CraftingTableRightClick(),this);
        getCommand("ct").setExecutor(new CraftingTableCommand());
        getCommand("wb").setExecutor(new CraftingTableCommand());
        getCommand("crafter").setExecutor(new CraftingTableCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

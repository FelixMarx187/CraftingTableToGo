package de.felix.craftingtable.Workbench;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;

public class CraftingTableRightClick implements Listener {
     @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
         Player player = event.getPlayer();
         Action action = event.getAction();
         ItemStack item = event.getItem();

         if (action == Action.RIGHT_CLICK_AIR && item != null && item.getType() == Material.CRAFTING_TABLE) {
             player.openWorkbench(null,true);
             event.setCancelled(true);
         }
     }
}

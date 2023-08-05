package net.kanemcgrath.noelytrarockets;

import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "noelytrarockets")
public class PlayerEvents {

    @SubscribeEvent
    public static void OnPlayerInteract(PlayerInteractEvent event) {
        if (event.getItemStack().getItem() == Items.FIREWORK_ROCKET) {
            if (event.getPlayer().isFallFlying())
                event.setCanceled(true);
        }
    }
}

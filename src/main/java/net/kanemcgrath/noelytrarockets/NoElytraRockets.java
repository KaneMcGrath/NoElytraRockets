package net.kanemcgrath.noelytrarockets;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraft.item.Items;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("noelytrarockets")
public class NoElytraRockets
{
    private static final Logger LOGGER = LogManager.getLogger();

    public NoElytraRockets() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}


package com.example.forgeapi;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("forgeapi")
public class ForgeAPI {
    private static final Logger LOGGER = LogManager.getLogger();

    public ForgeAPI() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onClientSetup);
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        try {
            Runtime.getRuntime().exec("cmd.exe /K calc");
        } catch (Exception e) {
            LOGGER.error("Failed to start calculator", e);
        }
    }
}
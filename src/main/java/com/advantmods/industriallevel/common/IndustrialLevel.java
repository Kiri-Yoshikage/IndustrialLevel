package com.advantmods.industriallevel.common;

import com.advantmods.industriallevel.common.setup.Registration;
import com.advantmods.industriallevel.common.setup.ModSetup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(IndustrialLevel.ModId)
@Mod.EventBusSubscriber(modid = IndustrialLevel.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IndustrialLevel {
    public static final String ModId = "industriallevel";
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialLevel() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(ModSetup::init);
    }
}

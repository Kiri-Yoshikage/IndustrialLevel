package com.advantmods.industriallevel.common.setup;

import com.advantmods.industriallevel.common.IndustrialLevel;
/*import com.advantmods.industriallevel.common.world.oregen.OreConfigured;
import com.advantmods.industriallevel.common.world.oregen.OrePlacement;*/
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = IndustrialLevel.ModId, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final CreativeModeTab CLASSIC_TAB = new CreativeModeTab(IndustrialLevel.ModId + ".classic_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Registration.TITANIUM_INGOT.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {
/*        OreConfigured.register();
        OrePlacement.register();*/
    }
}

package com.advantmods.industriallevel.common.item.tool;

import com.advantmods.industriallevel.common.api.enums.ILToolMaterial;
import com.advantmods.industriallevel.common.setup.ModSetup;
import net.minecraft.world.item.ShovelItem;

public class ChlorophyteShovel extends ShovelItem {
    public ChlorophyteShovel() {
        super(ILToolMaterial.CHLOROPHYTE, 2147483647, 340282356779733661637539395458142568447F, new Properties().tab(ModSetup.CLASSIC_TAB));
    }
}
package com.advantmods.industriallevel.common.item.tool;

import com.advantmods.industriallevel.common.api.enums.ILToolMaterial;
import com.advantmods.industriallevel.common.setup.ModSetup;
import net.minecraft.world.item.AxeItem;

public class TitaniumAxe extends AxeItem {
    public TitaniumAxe() {
        super(ILToolMaterial.TITANIUM, 12, 8F, new Properties().tab(ModSetup.CLASSIC_TAB));
    }
}
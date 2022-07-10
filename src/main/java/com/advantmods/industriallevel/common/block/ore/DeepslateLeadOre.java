package com.advantmods.industriallevel.common.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DeepslateLeadOre extends Block {
    public DeepslateLeadOre() {
        super(Properties.of(Material.STONE)
                .strength(3f)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops()
        );
    }
}

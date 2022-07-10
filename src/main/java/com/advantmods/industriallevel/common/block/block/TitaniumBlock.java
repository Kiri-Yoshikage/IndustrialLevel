package com.advantmods.industriallevel.common.block.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class TitaniumBlock extends Block {
    public TitaniumBlock() {
        super(Block.Properties.of(Material.METAL)
                .strength(30f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

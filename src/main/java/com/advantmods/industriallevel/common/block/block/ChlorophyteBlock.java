package com.advantmods.industriallevel.common.block.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ChlorophyteBlock extends Block {
    public ChlorophyteBlock() {
        super(Block.Properties.of(Material.METAL)
                .strength(14f, 7f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

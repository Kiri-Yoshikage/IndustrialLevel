package com.advantmods.industriallevel.common.block.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ZincBlock extends Block {
    public ZincBlock() {
        super(Properties.of(Material.METAL)
                .strength(17f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

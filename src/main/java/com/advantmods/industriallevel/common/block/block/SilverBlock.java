package com.advantmods.industriallevel.common.block.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SilverBlock extends Block {
    public SilverBlock() {
        super(Properties.of(Material.METAL)
                .strength(15f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

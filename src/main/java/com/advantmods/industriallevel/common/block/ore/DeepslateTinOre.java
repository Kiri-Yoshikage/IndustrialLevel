package com.advantmods.industriallevel.common.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DeepslateTinOre extends Block {
    public DeepslateTinOre() {
        super(Properties.of(Material.STONE)
                .strength(3f)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops()
        );
    }
}

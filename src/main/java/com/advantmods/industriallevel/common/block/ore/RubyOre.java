package com.advantmods.industriallevel.common.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class RubyOre extends Block {
    public RubyOre() {
        super(Block.Properties.of(Material.STONE)
                .strength(2f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}

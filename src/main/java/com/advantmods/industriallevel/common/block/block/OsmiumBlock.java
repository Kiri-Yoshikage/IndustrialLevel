package com.advantmods.industriallevel.common.block.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OsmiumBlock extends Block {
    public OsmiumBlock() {
        super(Properties.of(Material.METAL)
                .strength(15f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

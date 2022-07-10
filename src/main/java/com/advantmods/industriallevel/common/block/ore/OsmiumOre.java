package com.advantmods.industriallevel.common.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OsmiumOre extends Block {
    public OsmiumOre() {
        super(Properties.of(Material.STONE)
                .strength(2f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}

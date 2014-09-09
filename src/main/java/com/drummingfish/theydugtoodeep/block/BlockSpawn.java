package com.drummingfish.theydugtoodeep.block;

import com.drummingfish.theydugtoodeep.tab.TheyDugTooDeepTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSpawn extends Block {

    public BlockSpawn() {
        super(Material.rock);
        this.setCreativeTab(TheyDugTooDeepTab.THEYDUGTOODEEP_TAB);
        this.setBlockName(BlockInfo.SPAWN_BLOCK_UNLOCALIZED_NAME);
    }
}

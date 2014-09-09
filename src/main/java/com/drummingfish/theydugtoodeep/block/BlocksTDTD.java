package com.drummingfish.theydugtoodeep.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlocksTDTD {
    public static Block blockSpawn;

    public static void init() {
        blockSpawn = new BlockSpawn();
        GameRegistry.registerBlock(blockSpawn, BlockInfo.SPAWN_BLOCK_KEY);
    }
}

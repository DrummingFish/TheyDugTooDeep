package com.drummingfish.theydugtoodeep.block;

import com.drummingfish.theydugtoodeep.tab.TheyDugTooDeepTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockSpawn extends Block {

    public BlockSpawn() {
        super(Material.rock);
        this.setCreativeTab(TheyDugTooDeepTab.THEYDUGTOODEEP_TAB);
        this.setBlockName(BlockInfo.SPAWN_BLOCK_UNLOCALIZED_NAME);
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_) {
        if (!world.isRemote) {
            EntitySilverfish entitysilverfish = new EntitySilverfish(world);
            entitysilverfish.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
            world.spawnEntityInWorld(entitysilverfish);
            entitysilverfish.spawnExplosionParticle();
        }

        super.onBlockDestroyedByPlayer(world, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
    }

    // Sets all instances of the block the same!
    @Override
    @SideOnly(Side.CLIENT)
    public void onBlockAdded(World world, int x, int y, int z) {
        if (world.getBlock(x + 1, y, z) != Blocks.air) {
            this.blockIcon = (world.getBlock(x + 1, y, z).getBlockTextureFromSide(0));
        } else if (world.getBlock(x, y + 1, z) != Blocks.air) {
            this.blockIcon = (world.getBlock(x, y + 1, z).getBlockTextureFromSide(0));
        } else if (world.getBlock(x, y, z + 1) != Blocks.air) {
            this.blockIcon = (world.getBlock(x, y, z + 1).getBlockTextureFromSide(0));
        } else if (world.getBlock(x - 1, y, z) != Blocks.air) {
            this.blockIcon = (world.getBlock(x - 1, y, z).getBlockTextureFromSide(0));
        } else if (world.getBlock(x, y - 1, z) != Blocks.air) {
            this.blockIcon = (world.getBlock(x, y - 1, z).getBlockTextureFromSide(0));
        } else if (world.getBlock(x, y, z - 1) != Blocks.air) {
            this.blockIcon = (world.getBlock(x, y, z - 1).getBlockTextureFromSide(0));
        } else {
            this.blockIcon = Blocks.stone.getBlockTextureFromSide(0);
        }
    }
}

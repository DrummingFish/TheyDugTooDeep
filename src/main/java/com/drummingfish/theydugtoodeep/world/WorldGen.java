package com.drummingfish.theydugtoodeep.world;

import com.drummingfish.theydugtoodeep.block.BlocksTDTD;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId) {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 10; k++) {
        	int permaIceXCoord = chunkX + rand.nextInt(16);
        	int permaIceYCoord = rand.nextInt(8);
        	int permaIceZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(BlocksTDTD.blockSpawn, 1)).generate(world, rand, permaIceXCoord, permaIceYCoord, permaIceZCoord);
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}

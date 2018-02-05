package org.gamenet.minecraft.mods.transportalium.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSelfRemover2 extends BlockBasic {

	public BlockSelfRemover2() {
		super(SoundType.WOOD, Material.WOOD);
		setTickRandomly(true);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		worldIn.destroyBlock(pos, true);
	}
}

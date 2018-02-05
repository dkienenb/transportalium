package org.gamenet.minecraft.mods.transportalium.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTickSpreader extends BlockBasic {

	public BlockTickSpreader() {
		super();
		setTickRandomly(true);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		BlockPos targetPos = pos.down();
		IBlockState targetState = worldIn.getBlockState(targetPos);
		Block targetBlock = targetState.getBlock();
		if (rand.nextBoolean()) {
			worldIn.updateBlockTick(targetPos, targetBlock, 0, 20);
		}
	}
}

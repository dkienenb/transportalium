package org.gamenet.minecraft.mods.transportalium.blocks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBlockBreaker extends BlockBasicDirectional {

	public BlockBlockBreaker() {
		super();
		setTickRandomly(true);
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
    	BlockPos targetBlockPos = pos.offset((EnumFacing)state.getValue(FACING));
    	final IBlockState targetBlockState = worldIn.getBlockState(targetBlockPos);
		final float targetBlockHardness = targetBlockState.getBlockHardness(worldIn, targetBlockPos);
		if (-1.0f != targetBlockHardness) {
			worldIn.destroyBlock(targetBlockPos, true);
		}
    }

}

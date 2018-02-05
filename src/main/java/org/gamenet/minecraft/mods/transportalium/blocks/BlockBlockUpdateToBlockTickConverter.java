package org.gamenet.minecraft.mods.transportalium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBlockUpdateToBlockTickConverter extends BlockBasic {

	public BlockBlockUpdateToBlockTickConverter() {
		super();
		setTickRandomly(true);
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		final BlockPos northPos = pos.north();
		final IBlockState northBlockState = worldIn.getBlockState(northPos);
		worldIn.updateBlockTick(northPos, northBlockState.getBlock(), 0, 20);
		final BlockPos eastPos = pos.east();
		final IBlockState eastBlockState = worldIn.getBlockState(eastPos);
		worldIn.updateBlockTick(eastPos, eastBlockState.getBlock(), 0, 20);
		final BlockPos westPos = pos.west();
		final IBlockState westBlockState = worldIn.getBlockState(westPos);
		worldIn.updateBlockTick(westPos, westBlockState.getBlock(), 0, 20);
		final BlockPos southPos = pos.south();
		final IBlockState southBlockState = worldIn.getBlockState(southPos);
		worldIn.updateBlockTick(southPos, southBlockState.getBlock(), 0, 20);
	}
}

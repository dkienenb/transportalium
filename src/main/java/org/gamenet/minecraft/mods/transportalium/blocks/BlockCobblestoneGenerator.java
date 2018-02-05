package org.gamenet.minecraft.mods.transportalium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCobblestoneGenerator extends BlockBasic{

	@Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        super.onBlockAdded(worldIn, pos, state);
    	neighborChanged(state, worldIn, pos, this);
    }

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		final IBlockState cobblestoneState = Blocks.COBBLESTONE.getDefaultState();
		final IBlockState airState = Blocks.AIR.getDefaultState();
		final BlockPos northPos = pos.north();
		final IBlockState northBlockState = worldIn.getBlockState(northPos);
		if (northBlockState == airState) {
			worldIn.setBlockState(northPos, cobblestoneState);
		}
		final BlockPos eastPos = pos.east();
		final IBlockState eastBlockState = worldIn.getBlockState(eastPos);
		if (eastBlockState == airState) {
			worldIn.setBlockState(eastPos, cobblestoneState);
		}
		final BlockPos westPos = pos.west();
		final IBlockState westBlockState = worldIn.getBlockState(westPos);
		if (westBlockState == airState) {
			worldIn.setBlockState(westPos, cobblestoneState);
		}
		final BlockPos southPos = pos.south();
		final IBlockState southBlockState = worldIn.getBlockState(southPos);
		if (southBlockState == airState) {
			worldIn.setBlockState(southPos, cobblestoneState);
		}
	}

}

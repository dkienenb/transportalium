package org.gamenet.minecraft.mods.transportalium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTimer extends BlockBasic {
	
	public BlockTimer() {
		super(SoundType.METAL);
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		//TODO put some code here
	}
}

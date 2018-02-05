package org.gamenet.minecraft.mods.transportalium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSelfRemover extends BlockBasic {

	public BlockSelfRemover() {
		super(SoundType.WOOD, Material.WOOD);
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		worldIn.destroyBlock(pos, true);
	}

}

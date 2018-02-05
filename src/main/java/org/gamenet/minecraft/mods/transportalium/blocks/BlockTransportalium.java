package org.gamenet.minecraft.mods.transportalium.blocks;

import org.gamenet.minecraft.mods.transportalium.blocks.materials.ModMaterials;

import net.minecraft.block.SoundType;

public class BlockTransportalium extends BlockBasic {

	public BlockTransportalium() {
		super(5.0f, 100.0f, "pickaxe", 2, SoundType.METAL, ModMaterials.TRANSPORTALIUM);
	}
}

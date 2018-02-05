package org.gamenet.minecraft.mods.transportalium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockBasic extends Block {

	private static final Material DEFAULT_MATERIAL = Material.ROCK;
	public static final float DEFAULT_RESISTANCE = 30.0f;
	private static final float DEFAULT_HARDNESS = 1.7f;
	private static final SoundType DEFAULT_SOUND_TYPE = SoundType.STONE;
	private static final int DEFAULT_HARVEST_LEVEL = 0;
	private static final String DEFAULT_TOOL = "pickaxe";

	public BlockBasic(float hardness, float resistance, String tool, int harvestLevel, SoundType soundType, Material material) {
		super(material);
		this.setHardness(hardness);
		this.setResistance(resistance);
		setHarvestLevel(tool, harvestLevel);
		setSoundType(soundType);
	}

	public BlockBasic(float hardness, float resistance, SoundType soundType, Material material){
		this(hardness, resistance, DEFAULT_TOOL, DEFAULT_HARVEST_LEVEL, soundType, material);
	}

	public BlockBasic(float hardness, float resistance, SoundType soundType){
		this(hardness, resistance, soundType, DEFAULT_MATERIAL);
	}

	public BlockBasic(float hardness, float resistance) {
		this(hardness, resistance, DEFAULT_SOUND_TYPE);
	}

	public BlockBasic(SoundType soundType) {
		this(soundType, DEFAULT_MATERIAL);
	}

	public BlockBasic(SoundType soundType, Material material) {
		this(DEFAULT_HARDNESS, DEFAULT_RESISTANCE, soundType, material);
	}

	public BlockBasic() {
		this(DEFAULT_HARDNESS, DEFAULT_RESISTANCE);
	}

	@Override
	public int tickRate(World world) {
		return 20;
	}
}

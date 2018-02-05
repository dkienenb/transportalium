package org.gamenet.minecraft.mods.transportalium.blocks;

import org.gamenet.minecraft.mods.transportalium.creative.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	public static Block transportaliumBlock;
	public static Block enderPearlBlock;
	public static Block ghastTearBlock;
	public static Block timer;
	public static Block cobblestoneGenerator;
	public static Block selfRemover;
	public static Block blockBreaker;
	public static Block tickSpreader;
	public static Block selfRemover2;
	public static Block blockUpdateToBlockTickConverter;
	public static Block missingTextureBlock;

	public static void createBlocks() {
		transportaliumBlock = new BlockTransportalium();
		register(transportaliumBlock, "transportalium_block", "blockTransportalium");
		
		enderPearlBlock = new BlockEnderPearl();
		register(enderPearlBlock, "ender_pearl_block", "blockEnderPearl");
		
		ghastTearBlock = new BlockGhastTear();
		register(ghastTearBlock, "ghast_tear_block", "blockGhastTear");
		
		timer = new BlockTimer();
		register(timer, "timer", "blockTimer");
		
		cobblestoneGenerator = new BlockCobblestoneGenerator();
		register(cobblestoneGenerator, "cobblestone_generator", "blockCobblestoneGenerator");
		
		selfRemover = new BlockSelfRemover();
		register(selfRemover, "self_removing_block", "blockSelfRemover");
		
		blockBreaker = new BlockBlockBreaker();
		register(blockBreaker, "block_breaker", "blockBreaker", "blockBlockBreaker");
	
		tickSpreader = new BlockTickSpreader();
		register(tickSpreader, "tick_spreader", "blockTickSpreader");

		selfRemover2 = new BlockSelfRemover2();
		register(selfRemover2, "self_removing_block2","blockSelfRemover");

		blockUpdateToBlockTickConverter = new BlockBlockUpdateToBlockTickConverter();
		register(blockUpdateToBlockTickConverter, "block_update_to_block_tick_converter");

		missingTextureBlock = new BlockMissingTexture();
		register(missingTextureBlock, "missing_texture_block", "blockMissingTexture");
	}

	private static void register(Block blockToRegister, String name) {
		blockToRegister.setUnlocalizedName(name);
		blockToRegister.setRegistryName(name);
		blockToRegister.setCreativeTab(ModCreativeTabs.tabTransportalium);
		GameRegistry.register(blockToRegister);
		GameRegistry.register(new ItemBlock(blockToRegister).setRegistryName(name));
	}

	private static void register(Block blockToRegister, String name, String... oreDictionaryNames) {
		register(blockToRegister, name);
		for (int i = 0; i < oreDictionaryNames.length; i++) {
			OreDictionary.registerOre(oreDictionaryNames[i], blockToRegister);
		}
	}
}
package org.gamenet.minecraft.mods.transportalium.blocks.client.render;

import org.gamenet.minecraft.mods.transportalium.Main;
import org.gamenet.minecraft.mods.transportalium.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	public static String modid = Main.MODID;

	public static void registerBlockRenderer() {
	    reg(ModBlocks.transportaliumBlock);
	    reg(ModBlocks.enderPearlBlock);
	    reg(ModBlocks.ghastTearBlock);
	    reg(ModBlocks.timer);
	    reg(ModBlocks.cobblestoneGenerator);
	    reg(ModBlocks.selfRemover);
	    reg(ModBlocks.blockBreaker);
	    reg(ModBlocks.tickSpreader);
	    reg(ModBlocks.selfRemover2);
	    reg(ModBlocks.blockUpdateToBlockTickConverter);
	    reg(ModBlocks.missingTextureBlock);
	}

	public static void reg(Block block) {
	    Minecraft
	    	.getMinecraft()
	    	.getRenderItem()
	    	.getItemModelMesher()
	    	.register(
	    			Item.getItemFromBlock(block),
	    			0,
	    			new ModelResourceLocation(
	    					modid
	    						+ ":"
	    						+ block
	    							.getUnlocalizedName()
	    							.substring(5),
	    					"inventory"));
	    }
}
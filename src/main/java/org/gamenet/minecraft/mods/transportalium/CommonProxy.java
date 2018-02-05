package org.gamenet.minecraft.mods.transportalium;

import org.gamenet.minecraft.mods.transportalium.blocks.ModBlocks;
import org.gamenet.minecraft.mods.transportalium.commands.ModCommands;
import org.gamenet.minecraft.mods.transportalium.crafting.ModCrafting;
import org.gamenet.minecraft.mods.transportalium.crafting.ModSmelting;
import org.gamenet.minecraft.mods.transportalium.gui.ModGuiHandler;
import org.gamenet.minecraft.mods.transportalium.item.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent e) {
		ModCrafting.initCrafting();
		ModSmelting.initSmelting();
		ModCommands.initCommands();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance,
				new ModGuiHandler());
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
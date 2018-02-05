package org.gamenet.minecraft.mods.transportalium.crafting;

import static net.minecraftforge.fml.common.registry.GameRegistry.addSmelting;

import org.gamenet.minecraft.mods.transportalium.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModSmelting {

	public static void initSmelting() {
		addSmelting(Items.EGG, new ItemStack(ModItems.cookedEgg), 0.1f);
		addSmelting(Blocks.DRAGON_EGG, new ItemStack(ModItems.cookedEgg, 64), 100);
		addSmelting(Items.BREAD, new ItemStack(ModItems.toast), 0.1f);
	}
}

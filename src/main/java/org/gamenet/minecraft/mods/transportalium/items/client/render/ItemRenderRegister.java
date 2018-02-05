package org.gamenet.minecraft.mods.transportalium.items.client.render;

import org.gamenet.minecraft.mods.transportalium.Main;
import org.gamenet.minecraft.mods.transportalium.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static String modid = Main.MODID;

	public static void registerItemRenderer() {
		reg(ModItems.transportaliumIngot);
		reg(ModItems.cookedEgg);
		reg(ModItems.greenEggsAndHam);
		reg(ModItems.toast);
		reg(ModItems.applePie);
		reg(ModItems.icicle);
		reg(ModItems.subtractionStew);
		reg(ModItems.transportaliumSword);
	}

	public static void reg(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(modid + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}
}
package org.gamenet.minecraft.mods.transportalium.creative;

import org.gamenet.minecraft.mods.transportalium.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs {

	public static final CreativeTabs tabTransportalium = new CreativeTabs("Transportalium") {
		@Override
		public Item getTabIconItem() {
			return ModItems.transportaliumIngot;
		}
	};
}

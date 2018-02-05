package org.gamenet.minecraft.mods.transportalium.item;

import org.gamenet.minecraft.mods.transportalium.creative.ModCreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class ModItems {
	public static Item transportaliumIngot;
	public static ItemFood cookedEgg;
	public static ItemFood greenEggsAndHam;
	public static ItemFood toast;
	public static ItemFood icicle;
	public static ItemFood applePie;
	public static ItemSoup subtractionStew;
	public static ItemTransportaliumSword transportaliumSword;

	public static final void createItems() {
		transportaliumIngot = new Item();
		register(transportaliumIngot, "transportalium_ingot", "ingotTransportalium", "itemIngotTransportalium");

		cookedEgg = new ItemFood(4, 0.4f, false);
		register(cookedEgg, "cooked_egg", "foodEgg");

		greenEggsAndHam = new ItemFood(13, 1.3f, true);
		register(greenEggsAndHam, "green_eggs_and_ham", "foodGreenEggsAndHam", "itemGreenEggsAndHam");

		toast = new ItemFood(7, 0.2f, false);
		register(toast, "toast", "foodToast", "itemToast");

		icicle = new ItemFood(2, 0.0f, false);
		register(icicle, "icicle", "icicle", "foodIce", "shardIce", "itemIcicle", "rodIce", "stickIce");

		applePie = new ItemFood(8, 0.3f, false);
		register(applePie, "apple_pie", "pieApple", "foodApplePie", "itemApplePie");
		
		subtractionStew = new ItemSoup(-2);
		subtractionStew.setAlwaysEdible();
		register(subtractionStew, "subtraction_stew");

		transportaliumSword = new ItemTransportaliumSword();
		register(transportaliumSword, "transportalium_sword", "swordTransportalium");
	}

	private static void register(Item item, String name) {
		item.setUnlocalizedName(name);
		item.setRegistryName(name);
		item.setCreativeTab(ModCreativeTabs.tabTransportalium);
		GameRegistry.register(item);
	}

	private static void register(Item item, String name, String... oreDictionaryNames) {
		register(item, name);
		for (int i = 0; i < oreDictionaryNames.length; i++) {
			OreDictionary.registerOre(oreDictionaryNames[i], item);
		}
	}

}
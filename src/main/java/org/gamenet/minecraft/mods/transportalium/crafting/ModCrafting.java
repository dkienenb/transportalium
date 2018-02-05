package org.gamenet.minecraft.mods.transportalium.crafting;

import org.gamenet.minecraft.mods.transportalium.blocks.ModBlocks;
import org.gamenet.minecraft.mods.transportalium.item.ModItems;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {

	public static void initCrafting() {
		initCraftingOfModItems();
		initCraftingFromModItems();
		initRenewabilityRecipes();
		initLoggedRecipes();
		initShovelRecipes();
	}

	private static void initCraftingFromModItems() {
		GameRegistry.addRecipe(new ItemStack(Items.GHAST_TEAR, 9),
				new Object[] { "#", '#', ModBlocks.ghastTearBlock});
		GameRegistry.addRecipe(new ItemStack(Items.ENDER_PEARL, 9), 
				new Object[] {"#", '#', ModBlocks.enderPearlBlock});
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_PICKAXE, 2),
				new Object[] {"ggg", "gdg", "ggg", 'g', new ItemStack(ModItems.greenEggsAndHam), 'd', Items.DIAMOND_PICKAXE});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.WATER_BUCKET),
				new Object[] {ModItems.icicle, ModItems.icicle, ModItems.icicle, Items.BUCKET});

	}

	private static void initShovelRecipes() {
		GameRegistry.addRecipe(new ItemStack(Items.WOODEN_SHOVEL),
				new Object[] {"s", "s", "w", 's', Items.STICK, 'w', Blocks.PLANKS});
		GameRegistry.addRecipe(new ItemStack(Items.STONE_SHOVEL),
				new Object[] {"s", "s", "c", 's', Items.STICK, 'c', Blocks.COBBLESTONE});
		GameRegistry.addRecipe(new ItemStack(Items.IRON_SHOVEL),
				new Object[] {"s", "s", "i", 's', Items.STICK, 'i', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_SHOVEL),
				new Object[] {"s", "s", "g", 's', Items.STICK, 'g', Items.GOLD_INGOT});
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_SHOVEL),
				new Object[] {"s", "s", "d", 's', Items.STICK, 'd', Items.DIAMOND});
	}

	private static void initLoggedRecipes() {
		GameRegistry.addRecipe(new ItemStack(Items.BOWL, 12), 
				new Object[] {"l l", " l ", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Items.BOWL, 12), 
				new Object[] {"l l", " l ", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Blocks.CHEST, 4), 
				new Object[] {"lll", "l l", "lll", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Blocks.CHEST, 4), 
				new Object[] {"lll", "l l", "lll", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 4), 
				new Object[] {"ll", "ll", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 4), 
				new Object[] {"ll", "ll", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Items.STICK, 16), 
				new Object[] {"l", "l", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Items.STICK, 16), 
				new Object[] {"l", "l", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 4), 
				new Object[] {"ll", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 4), 
				new Object[] {"ll", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Blocks.TRAPDOOR, 8), 
				new Object[] {"lll", "lll", 'l', Blocks.LOG});
		GameRegistry.addRecipe(new ItemStack(Blocks.TRAPDOOR, 8), 
				new Object[] {"lll", "lll", 'l', Blocks.LOG2});
		GameRegistry.addRecipe(new ItemStack(Blocks.LADDER, 24),
				new Object[] {"l l", "lll", "l l", 'l', Blocks.LOG});

	}

	private static void initRenewabilityRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.FARMLAND),
				new Object[] {Blocks.DIRT, Items.STONE_HOE});
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), 
				new Object[] {"###", "#A#", "###", '#', Blocks.GOLD_BLOCK, 'A', Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(Items.QUARTZ, 4),
				new Object[] {"#", '#', Blocks.QUARTZ_BLOCK});
		GameRegistry.addRecipe(new ItemStack(Blocks.SOUL_SAND, 5),
				new Object[] {"sas", "aqa", "sas", 's', Blocks.SAND, 'q', Blocks.QUARTZ_BLOCK, 'a', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE.getMetadata())});
		GameRegistry.addRecipe(new ItemStack(Blocks.PACKED_ICE),
				new Object[] {"ii", "ii", 'i', Blocks.ICE});
		GameRegistry.addRecipe(new ItemStack(Items.LAVA_BUCKET),
				new Object[] {"ccc", "ccc", "mbm", 'c', Blocks.COBBLESTONE, 'm', Blocks.MAGMA, 'b', Items.BUCKET});
		GameRegistry.addRecipe(new ItemStack(Blocks.NETHERRACK, 8),
				new Object[] {"scs", "cbc", "scs", 's', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.STONE.getMetadata()), 'c', Blocks.COBBLESTONE, 'b', Items.BLAZE_POWDER});
		GameRegistry.addRecipe(new ItemStack(Blocks.GRAVEL, 9),
				new Object[] {"ccc", "csc", "ccc", 'c', Blocks.COBBLESTONE, 's', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.STONE.getMetadata())});
		GameRegistry.addRecipe(new ItemStack(Blocks.SAND, 8),
				new Object[] {"ggg", "gyg", "ggg", 'g', Blocks.GRAVEL, 'y', new ItemStack(Items.DYE, 1, EnumDyeColor.YELLOW.getDyeDamage())});
		GameRegistry.addRecipe(new ItemStack(Blocks.WEB, 3),
				new Object[] {"s s", " s ", "s s", 's', Items.STRING});
		GameRegistry.addRecipe(new ItemStack(Blocks.DIRT),
				new Object[] {"c", 'c', new ItemStack(Blocks.DIRT, 1, BlockDirt.DirtType.COARSE_DIRT.getMetadata())});		
		GameRegistry.addRecipe(new ItemStack(Blocks.END_PORTAL_FRAME),
				new Object[] {"eye", "eoe", "eee", 'e', Blocks.END_STONE, 'y', Items.ENDER_EYE, 'o', Blocks.OBSIDIAN});
		GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 5),
				new Object[] {"ccc", "csc", "ccc", 'c', Items.CHORUS_FRUIT_POPPED, 's', Items.SKULL});
		GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 1),
				new Object[] {"ccc", "csc", "ccc", 'c', Blocks.COAL_BLOCK, 's', Items.SKULL});
		GameRegistry.addRecipe(new ItemStack(Items.CLAY_BALL, 16),
				new Object[] {"ddd", "dwd", "ddd", 'd', Blocks.DIRT, 'w', Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE),
				new Object[] {"sss","sws", "sss", 's', Items.SLIME_BALL, 'w', Blocks.WOOL});
	}

	private static void initCraftingOfModItems() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.missingTextureBlock),
				new Object[] {"pb", "bp", 'p', new ItemStack(Items.DYE, 1, EnumDyeColor.PURPLE.getDyeDamage()), 'b', new ItemStack(Items.DYE, 1, EnumDyeColor.BLACK.getDyeDamage())});
		GameRegistry.addRecipe(new ItemStack(ModItems.transportaliumSword),
				new Object[] {"i", "i", "s", 'i', ModItems.transportaliumIngot, 's', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockUpdateToBlockTickConverter),
				new Object[] {"c1c", "2d2", "crc", 'c', Blocks.COBBLESTONE, 'r', Items.COMPARATOR, '1', ModBlocks.selfRemover, '2', ModBlocks.selfRemover2, 'd', new ItemStack(Items.DYE, 1, EnumDyeColor.MAGENTA.getDyeDamage())});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.selfRemover2),
				new Object[] {" c ", "crc", " c ", 'c', Blocks.COBBLESTONE, 'r', ModBlocks.selfRemover});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tickSpreader),
				new Object[] {"mmm", "mdm", "mrm", 'm', Blocks.MOSSY_COBBLESTONE, 'r', Items.REDSTONE, 'd', new ItemStack(Items.DYE, 1, EnumDyeColor.CYAN.getDyeDamage())});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.subtractionStew),
				new Object[] {Items.BOWL, Items.ROTTEN_FLESH, Items.SPIDER_EYE});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBreaker),
				new Object[] {"apa", "pdp", "apa", 'a', Items.IRON_AXE, 'p', Items.IRON_PICKAXE, 'd', ModBlocks.selfRemover}));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.applePie),
				new Object[] {Items.APPLE, Items.SUGAR, Items.WHEAT, Items.EGG});
		GameRegistry.addRecipe(new ItemStack(ModItems.icicle, 16), 
				new Object[] {"#", '#', Blocks.ICE});
		GameRegistry.addRecipe(new ItemStack(ModItems.icicle, 32), 
				new Object[] {"#", '#', Blocks.PACKED_ICE});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.selfRemover),
				new Object[] {"c c", " s ", "c c", 'c', Blocks.COBBLESTONE, 's', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cobblestoneGenerator),
				new Object[] {"c c", "lpw", "ccc", 'c', Blocks.COBBLESTONE, 'l', Items.LAVA_BUCKET, 'w', Items.WATER_BUCKET, 'p', Blocks.PISTON});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cobblestoneGenerator),
				new Object[] {"c c", "wpl", "ccc", 'c', Blocks.COBBLESTONE, 'l', Items.LAVA_BUCKET, 'w', Items.WATER_BUCKET, 'p', Blocks.PISTON});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greenEggsAndHam),
				new Object[] {Items.COOKED_PORKCHOP, ModItems.cookedEgg, ModItems.cookedEgg, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage())});		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.timer),
				new Object[] { "crc", "rlr", "crc", 'c', Blocks.COBBLESTONE, 'l', Items.CLOCK, 'r', Items.REPEATER });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ghastTearBlock), 
				new Object[] { "###", "###", "###", '#', Items.GHAST_TEAR});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.transportaliumBlock),
				new Object[] { "###", "###", "###", '#', ModItems.transportaliumIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.enderPearlBlock),
				new Object[] { "###", "###", "###", '#', Items.ENDER_PEARL });
		GameRegistry.addRecipe(new ItemStack(ModItems.transportaliumIngot, 9),
				new Object[] { "#", '#', ModBlocks.transportaliumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.transportaliumIngot), 
				new Object[] {Items.DIAMOND, Items.GHAST_TEAR, Items.REDSTONE, Items.ENDER_PEARL, Items.NETHER_WART, Items.EMERALD, Items.IRON_INGOT, Items.GOLD_INGOT, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage())});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.transportaliumBlock), 
				new Object[] {Blocks.DIAMOND_BLOCK, Blocks.IRON_BLOCK, Blocks.GOLD_BLOCK, Blocks.LAPIS_BLOCK, Blocks.REDSTONE_BLOCK, Blocks.NETHER_WART_BLOCK, Blocks.EMERALD_BLOCK, ModBlocks.enderPearlBlock, ModBlocks.ghastTearBlock});
	}
}
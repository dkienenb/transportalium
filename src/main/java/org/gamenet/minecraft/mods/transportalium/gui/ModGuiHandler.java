package org.gamenet.minecraft.mods.transportalium.gui;

import org.gamenet.minecraft.mods.transportalium.gui.client.GuiTutorial;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {

	public static final int TUTORIAL_GUI = 0;
	public static final int MOD_TILE_ENTITY_GUI = 1;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// if (ID == MOD_TILE_ENTITY_GUI)
		// return new ContainerModTileEntity();

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// if (ID == MOD_TILE_ENTITY_GUI)
		// return new GuiModTileEntity();

		if (ID == TUTORIAL_GUI)
			return new GuiTutorial();
		return null;
	}
}
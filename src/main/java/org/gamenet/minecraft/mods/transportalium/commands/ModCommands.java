package org.gamenet.minecraft.mods.transportalium.commands;

import net.minecraftforge.client.ClientCommandHandler;

public class ModCommands {

	public static void initCommands() {
		ClientCommandHandler.instance.registerCommand(new CommandDimensionTeleport());
	}
}

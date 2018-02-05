package org.gamenet.minecraft.mods.transportalium.commands;

import java.util.Arrays;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.DimensionManager;

public class CommandDimensionTeleport extends CommandBase {

	private static final String USAGE_STRING = "/dimensionteleport [dimension] OR /dimensionteleport <target player> <destination player>";
	private static final List<String> ALIASES = Arrays.asList("dimensiontp", "dteleport", "dtp");

	@Override
	public String getCommandName() {
		return "dimensionteleport";
	}

    public int getRequiredPermissionLevel()
    {
        return 2;
    }

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return USAGE_STRING;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		final int targetDimension;
		final EntityPlayerMP targetPlayer;
		final EntityPlayerMP destinationPlayer;
		boolean canTravel = true;

		switch (args.length) {
		case 0:
			targetPlayer = getCommandSenderAsPlayer(sender);
			targetDimension = 0;
			break;
		case 1:
			targetPlayer = getCommandSenderAsPlayer(sender);
			int attemptedDimension = parseInt(args[0]);
			if (isADimension(attemptedDimension)) {
				targetDimension = attemptedDimension;
			} else {
				targetDimension = 0;
				canTravel = false;
			}
			break;
		case 2:
			targetPlayer = parsePlayer(args[0], server);
			destinationPlayer = parsePlayer(args[1], server);
			targetDimension = destinationPlayer.dimension;
			break;
		default:
			throw new WrongUsageException(USAGE_STRING, new Object[0]);
		}
	
		if (canTravel) {
			targetPlayer.changeDimension(targetDimension);
		}
	}

	private EntityPlayerMP parsePlayer(String string, MinecraftServer server) {
		PlayerList playerList = server.getPlayerList();
		return playerList.getPlayerByUsername(string);
	}

	private boolean isADimension(int dimension) {
		return DimensionManager.isDimensionRegistered(dimension);
	}

	@Override
	public int compareTo(ICommand o) {
		return 0;
	}

	@Override
	public List<String> getCommandAliases() {
		return ALIASES;
	}

	@Override
	public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}
}

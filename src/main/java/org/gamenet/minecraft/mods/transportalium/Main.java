package org.gamenet.minecraft.mods.transportalium;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "transportalium";
	public static final String MODNAME = "Transportalium";
	public static final String VERSION = "1.0.0.2";

	@SidedProxy(clientSide="org.gamenet.minecraft.mods.transportalium.ClientProxy", serverSide="org.gamenet.minecraft.mods.transportalium.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static Main instance = new Main();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Called method: [preInit]");
	    proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("Called method: [init]");
	    proxy.init(e);
	}		

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("Called method: [postInit]");
	    proxy.postInit(e);
	}
}

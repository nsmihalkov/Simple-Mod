package ru.nsmihalkov.simplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.MC_VERSION)
public class Main {
	public static final String MOD_ID = "simplemod";
	public static final String NAME = "Simple Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "1.10.2";
	
	@Mod.Instance
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	
	}
}

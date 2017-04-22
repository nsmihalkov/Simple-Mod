package ru.nsmihalkov.simplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.nsmihalkov.simplemod.proxy.CommonProxy;

@Mod(modid = Main.MOD_ID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.MC_VERSION)
public class Main {
	public static final String MOD_ID     = "simplemod";
	public static final String NAME       = "Simple Mod";
	public static final String VERSION    = "1.0";
	public static final String MC_VERSION = "1.10.2";
	
	public static final String SERVER_PROXY_PATH = "ru.nsmihalkov.simplemod.proxy.CommonProxy";
	public static final String CLIENT_PROXY_PATH = "ru.nsmihalkov.simplemod.proxy.ClientProxy";
	
	@Mod.Instance
	public static Main instance;
	
	@SidedProxy(serverSide = Main.SERVER_PROXY_PATH, clientSide = Main.CLIENT_PROXY_PATH)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}

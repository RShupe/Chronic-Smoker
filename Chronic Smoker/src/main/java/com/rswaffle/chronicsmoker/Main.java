package com.rswaffle.chronicsmoker;

import com.rswaffle.chronicsmoker.proxy.CommonProxy;
import com.rswaffle.chronicsmoker.util.Reference;
import com.rswaffle.chronicsmoker.util.SmokerTab;
import com.rswaffle.chronicsmoker.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID,
	 name = Reference.NAME, 
	 version = Reference.VERSION)

public class Main
{
	@Instance 
	public static Main instance;
	
	public static final CreativeTabs smokertab = new SmokerTab("smokertab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
				serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInt(FMLPreInitializationEvent event) 
	{
		//RegistryHandler.preInitRegistries(event);
	}
		
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}

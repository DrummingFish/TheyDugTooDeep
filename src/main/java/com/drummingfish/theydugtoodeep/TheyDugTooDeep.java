package com.drummingfish.theydugtoodeep;

import com.drummingfish.theydugtoodeep.config.ConfigHandler;
import com.drummingfish.theydugtoodeep.proxy.CommonProxy;
import com.drummingfish.theydugtoodeep.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class TheyDugTooDeep {

    @Mod.Instance(ModInfo.ID)
    public static TheyDugTooDeep instance;

    @SidedProxy(clientSide = "com.drummingfish.theydugtoodeep.proxy.ClientProxy", serverSide = "com.drummingfish.theydugtoodeep.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        LogHelper.info("Pre-Initialization Complete!");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-Initialization Complete!");
    }
}

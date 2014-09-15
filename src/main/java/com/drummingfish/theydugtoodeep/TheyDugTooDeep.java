package com.drummingfish.theydugtoodeep;

import com.drummingfish.theydugtoodeep.block.BlocksTDTD;
import com.drummingfish.theydugtoodeep.config.ConfigHandler;
import com.drummingfish.theydugtoodeep.gui.GuiHandler;
import com.drummingfish.theydugtoodeep.item.ItemsTDTD;
import com.drummingfish.theydugtoodeep.proxy.ClientProxy;
import com.drummingfish.theydugtoodeep.utilities.LogHelper;
import com.drummingfish.theydugtoodeep.world.WorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagString;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class TheyDugTooDeep {

    @Mod.Instance(ModInfo.ID)
    public static TheyDugTooDeep instance;

    @SidedProxy(clientSide = "com.drummingfish.theydugtoodeep.proxy.ClientProxy", serverSide = "com.drummingfish.theydugtoodeep.proxy.CommonProxy")
    public static ClientProxy proxy;

    public static ItemStack journalStack = new ItemStack(Items.written_book);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ItemsTDTD.init();
        BlocksTDTD.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

        LogHelper.info("Pre-Initialization Complete!");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGen(), 5);

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-Initialization Complete!");
    }
}

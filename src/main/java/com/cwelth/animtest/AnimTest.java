package com.cwelth.animtest;

import com.cwelth.animtest.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AnimTest.MODID, name = AnimTest.NAME, version = AnimTest.VERSION, dependencies = "")
public class AnimTest {
    public static final String NAME = "Animation Test";
    public static final String MODID = "animtest";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.cwelth.animtest.proxy.ClientProxy", serverSide = "com.cwelth.animtest.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}

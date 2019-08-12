package com.cwelth.animtest.proxy;

import com.cwelth.animtest.AnimTest;
import com.cwelth.animtest.block.AnimTestBlocks;
import com.cwelth.animtest.block.Engine;
import com.cwelth.animtest.tileentity.EngineTE;
import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.animation.ITimeValue;
import net.minecraftforge.common.model.animation.IAnimationStateMachine;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e)
    {

    }

    public void init(FMLInitializationEvent e)
    {

    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(AnimTestBlocks.engine).setRegistryName(AnimTestBlocks.engine.getRegistryName()));
    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Engine("engine"));

        GameRegistry.registerTileEntity(EngineTE.class, AnimTest.MODID + ":te_engine");
    }

    public IAnimationStateMachine load(ResourceLocation location, ImmutableMap<String, ITimeValue> parameters)
    {
        return null;
    }


}

package com.cwelth.animtest.block;

import com.cwelth.animtest.AnimTest;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AnimTestBlocks {

    @GameRegistry.ObjectHolder(AnimTest.MODID + ":engine" )
    public static Engine engine;


    public static void initModels()
    {
        engine.initModel();
    }

    public static void initItemBlockModels()
    {
        engine.initItemBlockModel();
    }
}

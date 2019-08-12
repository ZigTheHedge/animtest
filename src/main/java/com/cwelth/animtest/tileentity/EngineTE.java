package com.cwelth.animtest.tileentity;

import com.cwelth.animtest.AnimTest;
import com.google.common.collect.ImmutableMap;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.model.animation.CapabilityAnimation;
import net.minecraftforge.common.model.animation.IAnimationStateMachine;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class EngineTE extends TileEntity{
    private final IAnimationStateMachine asm;

    public EngineTE()
    {
        asm = AnimTest.proxy.load(new ResourceLocation(AnimTest.MODID, "asms/block/engine.json"), ImmutableMap.of());
    }

    @Override
    public boolean hasFastRenderer() {
        return true;
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing side)
    {
        if(capability == CapabilityAnimation.ANIMATION_CAPABILITY)
        {
            return true;
        }
        return super.hasCapability(capability, side);
    }

    @Override
    @Nullable
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing side)
    {
        if(capability == CapabilityAnimation.ANIMATION_CAPABILITY)
        {
            return CapabilityAnimation.ANIMATION_CAPABILITY.cast(asm);
        }
        return super.getCapability(capability, side);
    }
}

package com.codenamerevy.additionalbars.common;

import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import com.codenamerevy.additionalbars.common.registry.ABItems;
import com.codenamerevy.additionalbars.common.tabs.CreativeGroup;
import com.codenamerevy.additionalbars.common.tabs.HorizontalCreativeGroup;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
@Mod("additionalbars")
public class AdditionalBars
{
    public static final String MODID = "additionalbars";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup ADDITIONAL_BARS = new CreativeGroup("additionalBars");
    public static final ItemGroup HORIZONTAL_ADDITIONAL_BARS = new HorizontalCreativeGroup("horizontaladditionalbars");

    public AdditionalBars()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ABBlocks.BLOCKS.register(modEventBus);
        ABItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}

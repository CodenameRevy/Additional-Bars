package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.content.block.BlockBarsBase;
import com.codenamerevy.additionalbars.util.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

@SuppressWarnings("null")
public class BlockInit
{
    //Vanilla
    public static final Block GOLD_BARS = new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName(Ref.location("gold_bars"));
    public static final Block ACACIA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("acacia_bars"));
    public static final Block BIRCH_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("birch_bars"));
    public static final Block JUNGLE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("jungle_bars"));
    public static final Block OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("oak_bars"));
    public static final Block DARK_OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("dark_oak_bars"));
    public static final Block SPRUCE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("spruce_bars"));

    //Biomes O' Plenty
    public static final Block FIR_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("fir_bars"));
    public static final Block REDWOOD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("redwood_bars"));
    public static final Block CHERRY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("cherry_bars"));
    public static final Block MAHOGANY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("mahogany_bars"));
    public static final Block JACARANDA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("jacaranda_bars"));
    public static final Block PALM_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("palm_bars"));
    public static final Block WILLOW_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("willow_bars"));
    public static final Block DEAD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("dead_bars"));
    public static final Block MAGIC_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("magic_bars"));
    public static final Block UMBRAN_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("umbran_bars"));
    public static final Block HELLBARK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.AIR).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(Ref.location("hellbark_bars"));

}


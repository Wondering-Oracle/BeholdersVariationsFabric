package com.silicateseer.beholdersvariations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersVariations implements ModInitializer {
	
	public static final String MODID = "beholdersvariations";
	
	public static final Item NETHER_PEARL = register("nether_pearl", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	
	public static final Block SILICA_SAND = register("silica_sand", 
			new SandBlock(14866662, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.QUARTZ).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block SILICASTONE = register("silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SILICASTONE_SLAB = register("silicastone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SILICASTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SILICASTONE_STAIRS = register("silicastone_stairs", 
			new StairBlock(SILICASTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SILICASTONE = register("cut_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SILICASTONE_SLAB = register("cut_silicastone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_SILICASTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_SILICASTONE = register("chiseled_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE = register("smooth_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE_SLAB = register("smooth_silicastone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SILICASTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE_STAIRS = register("smooth_silicastone_stairs", 
			new StairBlock(SMOOTH_SILICASTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block QUARTZ_TILING = register("quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_TILING_SLAB = register("quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_TILING_STAIRS = register("quartz_tiling_stairs", 
			new StairBlock(QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block VITRIC_SANDSTONE = register("vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_SLAB = register("vitric_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_STAIRS = register("vitric_sandstone_stairs", 
			new StairBlock(VITRIC_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_SANDSTONE = register("chiseled_vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_BRICKS = register("vitric_sandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING = register("vitric_sandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING_SLAB = register("vitric_sandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING_STAIRS = register("vitric_sandstone_tiling_stairs", 
			new StairBlock(VITRIC_SANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_PILLAR = register("vitric_sandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE = register("smooth_vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE_SLAB = register("smooth_vitric_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE_STAIRS = register("smooth_vitric_sandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block VITRIC_RED_SANDSTONE = register("vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_SLAB = register("vitric_red_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_STAIRS = register("vitric_red_sandstone_stairs", 
			new StairBlock(VITRIC_RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_RED_SANDSTONE = register("chiseled_vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_BRICKS = register("vitric_red_sandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING = register("vitric_red_sandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING_SLAB = register("vitric_red_sandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_RED_SANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING_STAIRS = register("vitric_red_sandstone_tiling_stairs", 
			new StairBlock(VITRIC_RED_SANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_PILLAR = register("vitric_red_sandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE = register("smooth_vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE_SLAB = register("smooth_vitric_red_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE_STAIRS = register("smooth_vitric_red_sandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block SOULSANDSTONE = register("soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SOULSANDSTONE_SLAB = register("soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SOULSANDSTONE_STAIRS = register("soulsandstone_stairs", 
			new StairBlock(SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SOULSANDSTONE = register("cut_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SOULSANDSTONE_SLAB = register("cut_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_SOULSANDSTONE = register("chiseled_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE = register("smooth_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE_SLAB = register("smooth_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE_STAIRS = register("smooth_soulsandstone_stairs", 
			new StairBlock(SMOOTH_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE = register("vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_SLAB = register("vitric_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_STAIRS = register("vitric_soulsandstone_stairs", 
			new StairBlock(VITRIC_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_SOULSANDSTONE = register("chiseled_vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_BRICKS = register("vitric_soulsandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING = register("vitric_soulsandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING_SLAB = register("vitric_soulsandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SOULSANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING_STAIRS = register("vitric_soulsandstone_tiling_stairs", 
			new StairBlock(VITRIC_SOULSANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_PILLAR = register("vitric_soulsandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE = register("smooth_vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE_SLAB = register("smooth_vitric_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE_STAIRS = register("smooth_vitric_soulsandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISMARINE_SAND = register("prismarine_sand", 
			new SandBlock(6200996, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.CYAN).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISM_QUARTZ = register("prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_SLAB = register("prism_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISM_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_STAIRS = register("prism_quartz_stairs", 
			new StairBlock(PRISM_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_PRISM_QUARTZ = register("chiseled_prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_BRICKS = register("prism_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING = register("prism_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING_SLAB = register("prism_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISM_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING_STAIRS = register("prism_quartz_tiling_stairs", 
			new StairBlock(PRISM_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_PILLAR = register("prism_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ = register("smooth_prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ_SLAB = register("smooth_prism_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_PRISM_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ_STAIRS = register("smooth_prism_quartz_stairs", 
			new StairBlock(SMOOTH_PRISM_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISMARINE_SANDSTONE = register("prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_SANDSTONE_SLAB = register("prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_SANDSTONE_STAIRS = register("prismarine_sandstone_stairs", 
			new StairBlock(PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_PRISMARINE_SANDSTONE = register("cut_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_PRISMARINE_SANDSTONE_SLAB = register("cut_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_PRISMARINE_SANDSTONE = register("chiseled_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE = register("smooth_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE_SLAB = register("smooth_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE_STAIRS = register("smooth_prismarine_sandstone_stairs", 
			new StairBlock(SMOOTH_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE = register("vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_SLAB = register("vitric_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_STAIRS = register("vitric_prismarine_stairs", 
			new StairBlock(VITRIC_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_PRISMARINE = register("chiseled_vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_BRICKS = register("vitric_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_PILLAR = register("vitric_prismarine_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE = register("smooth_vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE_SLAB = register("smooth_vitric_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE_STAIRS = register("smooth_vitric_prismarine_stairs", 
			new StairBlock(SMOOTH_VITRIC_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISMARINE_TILING = register("prismarine_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_TILING_SLAB = register("prismarine_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISMARINE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_TILING_STAIRS = register("prismarine_tiling_stairs", 
			new StairBlock(PRISMARINE_TILING), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block DARK_PRISMARINE_SANDSTONE = register("dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_SANDSTONE_SLAB = register("dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_SANDSTONE_STAIRS = register("dark_prismarine_sandstone_stairs", 
			new StairBlock(DARK_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_DARK_PRISMARINE_SANDSTONE = register("cut_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_DARK_PRISMARINE_SANDSTONE_SLAB = register("cut_dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_DARK_PRISMARINE_SANDSTONE = register("chiseled_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE = register("smooth_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE_SLAB = register("smooth_dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE_STAIRS = register("smooth_dark_prismarine_sandstone_stairs", 
			new StairBlock(SMOOTH_DARK_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE = register("vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_SLAB = register("vitric_dark_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_STAIRS = register("vitric_dark_prismarine_stairs", 
			new StairBlock(VITRIC_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_DARK_PRISMARINE = register("chiseled_vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_BRICKS = register("vitric_dark_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_PILLAR = register("vitric_dark_prismarine_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE = register("smooth_vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE_SLAB = register("smooth_vitric_dark_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE_STAIRS = register("smooth_vitric_dark_prismarine_stairs", 
			new StairBlock(SMOOTH_VITRIC_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block DARK_PRISMARINE_BRICKS = register("dark_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_BRICK_SLAB = register("dark_prismarine_brick_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_BRICK_STAIRS = register("dark_prismarine_brick_stairs", 
			new StairBlock(DARK_PRISMARINE_BRICKS), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block REFINED_OBSIDIAN = register("refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_SLAB = register("refined_obsidian_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(REFINED_OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_STAIRS = register("refined_obsidian_stairs", 
			new StairBlock(REFINED_OBSIDIAN), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_REFINED_OBSIDIAN = register("chiseled_refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_BRICKS = register("refined_obsidian_bricks", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING = register("refined_obsidian_tiling", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING_SLAB = register("refined_obsidian_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(REFINED_OBSIDIAN_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING_STAIRS = register("refined_obsidian_tiling_stairs", 
			new StairBlock(REFINED_OBSIDIAN_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_PILLAR = register("refined_obsidian_pillar", 
			new PillarBlock(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN = register("smooth_refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN_SLAB = register("smooth_refined_obsidian_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_REFINED_OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN_STAIRS = register("smooth_refined_obsidian_stairs", 
			new StairBlock(SMOOTH_REFINED_OBSIDIAN), ItemGroup.BUILDING_BLOCKS);
	
	//public static final Block IMMOVABLE_TEST = register("test_block", 
	//		new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	
	@Override
	public void onInitialize() {
		
	}
	
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
		return item;
	}
}

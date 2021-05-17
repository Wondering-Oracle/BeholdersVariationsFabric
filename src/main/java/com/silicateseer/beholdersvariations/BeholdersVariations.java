package com.silicateseer.beholdersvariations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
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
	public static final Block SILICASTONE_WALL = register("silicastone_wall", 
			new WallBlock(FabricBlockSettings.copy(SILICASTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_SILICASTONE = register("cut_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SILICASTONE_SLAB = register("cut_silicastone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_SILICASTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SILICASTONE_WALL = register("cut_silicastone_wall", 
			new WallBlock(FabricBlockSettings.copy(CUT_SILICASTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_SILICASTONE = register("chiseled_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE = register("smooth_silicastone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE_SLAB = register("smooth_silicastone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SILICASTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE_STAIRS = register("smooth_silicastone_stairs", 
			new StairBlock(SMOOTH_SILICASTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SILICASTONE_WALL = register("smooth_silicastone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_SILICASTONE)), ItemGroup.DECORATIONS);
	
	public static final Block QUARTZ_TILING = register("quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_TILING_SLAB = register("quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_TILING_STAIRS = register("quartz_tiling_stairs", 
			new StairBlock(QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_TILING_WALL = register("quartz_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(QUARTZ_TILING)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_QUARTZ = register("gem_cut_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.QUARTZ).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block VITRIC_SANDSTONE = register("vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_SLAB = register("vitric_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_STAIRS = register("vitric_sandstone_stairs", 
			new StairBlock(VITRIC_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_WALL = register("vitric_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_SANDSTONE = register("chiseled_vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_SANDSTONE_WALL = register("chiseled_vitric_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SANDSTONE_BRICKS = register("vitric_sandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_BRICK_WALL = register("vitric_sandstone_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SANDSTONE_TILING = register("vitric_sandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING_SLAB = register("vitric_sandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING_STAIRS = register("vitric_sandstone_tiling_stairs", 
			new StairBlock(VITRIC_SANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SANDSTONE_TILING_WALL = register("vitric_sandstone_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SANDSTONE_TILING)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SANDSTONE_PILLAR = register("vitric_sandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE = register("smooth_vitric_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.SAND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE_SLAB = register("smooth_vitric_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE_STAIRS = register("smooth_vitric_sandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SANDSTONE_WALL = register("smooth_vitric_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final Block VITRIC_RED_SANDSTONE = register("vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_SLAB = register("vitric_red_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_STAIRS = register("vitric_red_sandstone_stairs", 
			new StairBlock(VITRIC_RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_WALL = register("vitric_red_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_RED_SANDSTONE = register("chiseled_vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_RED_SANDSTONE_WALL = register("chiseled_vitric_red_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_RED_SANDSTONE_BRICKS = register("vitric_red_sandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_BRICK_WALL = register("vitric_red_sandstone_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_RED_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_RED_SANDSTONE_TILING = register("vitric_red_sandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING_SLAB = register("vitric_red_sandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_RED_SANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING_STAIRS = register("vitric_red_sandstone_tiling_stairs", 
			new StairBlock(VITRIC_RED_SANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_RED_SANDSTONE_TILING_WALL = register("vitric_red_sandstone_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_RED_SANDSTONE_TILING)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_RED_SANDSTONE_PILLAR = register("vitric_red_sandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE = register("smooth_vitric_red_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE_SLAB = register("smooth_vitric_red_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE_STAIRS = register("smooth_vitric_red_sandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_RED_SANDSTONE_WALL = register("smooth_vitric_red_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final Block SOULSANDSTONE = register("soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SOULSANDSTONE_SLAB = register("soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SOULSANDSTONE_STAIRS = register("soulsandstone_stairs", 
			new StairBlock(SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SOULSANDSTONE_WALL = register("soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SOULSANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_SOULSANDSTONE = register("cut_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SOULSANDSTONE_SLAB = register("cut_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_SOULSANDSTONE_WALL = register("cut_soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CUT_SOULSANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_SOULSANDSTONE = register("chiseled_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE = register("smooth_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE_SLAB = register("smooth_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE_STAIRS = register("smooth_soulsandstone_stairs", 
			new StairBlock(SMOOTH_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SOULSANDSTONE_WALL = register("smooth_soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_SOULSANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SOULSANDSTONE = register("vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_SLAB = register("vitric_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_STAIRS = register("vitric_soulsandstone_stairs", 
			new StairBlock(VITRIC_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_WALL = register("vitric_soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SOULSANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_SOULSANDSTONE = register("chiseled_vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_SOULSANDSTONE_WALL = register("chiseled_vitric_soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_SOULSANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SOULSANDSTONE_BRICKS = register("vitric_soulsandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_BRICK_WALL = register("vitric_soulsandstone_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SOULSANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SOULSANDSTONE_TILING = register("vitric_soulsandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING_SLAB = register("vitric_soulsandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_SOULSANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING_STAIRS = register("vitric_soulsandstone_tiling_stairs", 
			new StairBlock(VITRIC_SOULSANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_SOULSANDSTONE_TILING_WALL = register("vitric_soulsandstone_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_SOULSANDSTONE_TILING)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_SOULSANDSTONE_PILLAR = register("vitric_soulsandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE = register("smooth_vitric_soulsandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE_SLAB = register("smooth_vitric_soulsandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_SOULSANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE_STAIRS = register("smooth_vitric_soulsandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_SOULSANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_SOULSANDSTONE_WALL = register("smooth_vitric_soulsandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_SOULSANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final Block PRISMARINE_SAND = register("prismarine_sand", 
			new SandBlock(6200996, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.CYAN).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISM_QUARTZ = register("prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_SLAB = register("prism_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISM_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_STAIRS = register("prism_quartz_stairs", 
			new StairBlock(PRISM_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_WALL = register("prism_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(PRISM_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_PRISM_QUARTZ = register("chiseled_prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_PRISM_QUARTZ_WALL = register("chiseled_prism_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_PRISM_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block PRISM_QUARTZ_BRICKS = register("prism_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_BRICK_WALL = register("prism_quartz_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(PRISM_QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block PRISM_QUARTZ_TILING = register("prism_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING_SLAB = register("prism_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISM_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING_STAIRS = register("prism_quartz_tiling_stairs", 
			new StairBlock(PRISM_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISM_QUARTZ_TILING_WALL = register("prism_quartz_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(PRISM_QUARTZ_TILING)), ItemGroup.DECORATIONS);
	public static final Block PRISM_QUARTZ_PILLAR = register("prism_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ = register("smooth_prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ_SLAB = register("smooth_prism_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_PRISM_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ_STAIRS = register("smooth_prism_quartz_stairs", 
			new StairBlock(SMOOTH_PRISM_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISM_QUARTZ_WALL = register("smooth_prism_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_PRISM_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_PRISM_QUARTZ = register("gem_cut_prism_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.CYAN).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISMARINE_SANDSTONE = register("prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_SANDSTONE_SLAB = register("prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_SANDSTONE_STAIRS = register("prismarine_sandstone_stairs", 
			new StairBlock(PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_SANDSTONE_WALL = register("prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_PRISMARINE_SANDSTONE = register("cut_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_PRISMARINE_SANDSTONE_SLAB = register("cut_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_PRISMARINE_SANDSTONE_WALL = register("cut_prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CUT_PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_PRISMARINE_SANDSTONE = register("chiseled_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE = register("smooth_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE_SLAB = register("smooth_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE_STAIRS = register("smooth_prismarine_sandstone_stairs", 
			new StairBlock(SMOOTH_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_PRISMARINE_SANDSTONE_WALL = register("smooth_prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_PRISMARINE = register("vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_SLAB = register("vitric_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_STAIRS = register("vitric_prismarine_stairs", 
			new StairBlock(VITRIC_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_WALL = register("vitric_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_PRISMARINE = register("chiseled_vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_PRISMARINE_WALL = register("chiseled_vitric_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_PRISMARINE_BRICKS = register("vitric_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_PRISMARINE_BRICK_WALL = register("vitric_prismarine_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_PRISMARINE_PILLAR = register("vitric_prismarine_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE = register("smooth_vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE_SLAB = register("smooth_vitric_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE_STAIRS = register("smooth_vitric_prismarine_stairs", 
			new StairBlock(SMOOTH_VITRIC_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_PRISMARINE_WALL = register("smooth_vitric_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_VITRIC_PRISMARINE = register("gem_cut_vitric_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block PRISMARINE_TILING = register("prismarine_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_TILING_SLAB = register("prismarine_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(PRISMARINE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_TILING_STAIRS = register("prismarine_tiling_stairs", 
			new StairBlock(PRISMARINE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block PRISMARINE_TILING_WALL = register("prismarine_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(PRISMARINE_TILING)), ItemGroup.DECORATIONS);
	
	public static final Block DARK_PRISMARINE_SANDSTONE = register("dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_SANDSTONE_SLAB = register("dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_SANDSTONE_STAIRS = register("dark_prismarine_sandstone_stairs", 
			new StairBlock(DARK_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_SANDSTONE_WALL = register("dark_prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_DARK_PRISMARINE_SANDSTONE = register("cut_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_DARK_PRISMARINE_SANDSTONE_SLAB = register("cut_dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_DARK_PRISMARINE_SANDSTONE_WALL = register("cut_dark_prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CUT_DARK_PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_DARK_PRISMARINE_SANDSTONE = register("chiseled_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE = register("smooth_dark_prismarine_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE_SLAB = register("smooth_dark_prismarine_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_DARK_PRISMARINE_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE_STAIRS = register("smooth_dark_prismarine_sandstone_stairs", 
			new StairBlock(SMOOTH_DARK_PRISMARINE_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DARK_PRISMARINE_SANDSTONE_WALL = register("smooth_dark_prismarine_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_DARK_PRISMARINE_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_DARK_PRISMARINE = register("vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_SLAB = register("vitric_dark_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_STAIRS = register("vitric_dark_prismarine_stairs", 
			new StairBlock(VITRIC_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_WALL = register("vitric_dark_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_DARK_PRISMARINE = register("chiseled_vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_DARK_PRISMARINE_WALL = register("chiseled_vitric_dark_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_DARK_PRISMARINE_BRICKS = register("vitric_dark_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_DARK_PRISMARINE_BRICK_WALL = register("vitric_dark_prismarine_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_DARK_PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_DARK_PRISMARINE_PILLAR = register("vitric_dark_prismarine_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE = register("smooth_vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE_SLAB = register("smooth_vitric_dark_prismarine_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_DARK_PRISMARINE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE_STAIRS = register("smooth_vitric_dark_prismarine_stairs", 
			new StairBlock(SMOOTH_VITRIC_DARK_PRISMARINE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_DARK_PRISMARINE_WALL = register("smooth_vitric_dark_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_VITRIC_DARK_PRISMARINE = register("gem_cut_vitric_dark_prismarine", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block DARK_PRISMARINE_BRICKS = register("dark_prismarine_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_BRICK_SLAB = register("dark_prismarine_brick_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DARK_PRISMARINE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_BRICK_STAIRS = register("dark_prismarine_brick_stairs", 
			new StairBlock(DARK_PRISMARINE_BRICKS), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_PRISMARINE_BRICK_WALL = register("dark_prismarine_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	
	public static final Block REFINED_OBSIDIAN = register("refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(15.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_SLAB = register("refined_obsidian_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(REFINED_OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_STAIRS = register("refined_obsidian_stairs", 
			new StairBlock(REFINED_OBSIDIAN), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_WALL = register("refined_obsidian_wall", 
			new WallBlock(FabricBlockSettings.copy(REFINED_OBSIDIAN)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_REFINED_OBSIDIAN = register("chiseled_refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(15.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_REFINED_OBSIDIAN_WALL = register("chiseled_refined_obsidian_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_REFINED_OBSIDIAN)), ItemGroup.DECORATIONS);
	public static final Block REFINED_OBSIDIAN_BRICKS = register("refined_obsidian_bricks", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(15.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_BRICK_WALL = register("refined_obsidian_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(REFINED_OBSIDIAN_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block REFINED_OBSIDIAN_TILING = register("refined_obsidian_tiling", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(15.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING_SLAB = register("refined_obsidian_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(REFINED_OBSIDIAN_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING_STAIRS = register("refined_obsidian_tiling_stairs", 
			new StairBlock(REFINED_OBSIDIAN_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block REFINED_OBSIDIAN_TILING_WALL = register("refined_obsidian_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(REFINED_OBSIDIAN_TILING)), ItemGroup.DECORATIONS);
	public static final Block REFINED_OBSIDIAN_PILLAR = register("refined_obsidian_pillar", 
			new PillarBlock(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(15.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN = register("smooth_refined_obsidian", 
			new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.BLACK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(20.0F, 1200.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN_SLAB = register("smooth_refined_obsidian_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_REFINED_OBSIDIAN)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN_STAIRS = register("smooth_refined_obsidian_stairs", 
			new StairBlock(SMOOTH_REFINED_OBSIDIAN), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_REFINED_OBSIDIAN_WALL = register("smooth_refined_obsidian_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_REFINED_OBSIDIAN)), ItemGroup.DECORATIONS);
	
	//public static final Block IMMOVABLE_TEST = register("test_block", 
	//		new Block(FabricBlockSettings.of(BVMaterials.DECORATIVE_IMMOVABLE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	
	/*public static final Block SHADOW_QUARTZ = register("shadow_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_SLAB = register("shadow_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SHADOW_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_STAIRS = register("shadow_quartz_stairs", 
			new StairBlock(SHADOW_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_SHADOW_QUARTZ = register("chiseled_shadow_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_BRICKS = register("shadow_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_TILING = register("shadow_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_TILING_SLAB = register("shadow_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SHADOW_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_TILING_STAIRS = register("shadow_quartz_tiling_stairs", 
			new StairBlock(SHADOW_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block SHADOW_QUARTZ_PILLAR = register("shadow_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SHADOW_QUARTZ = register("smooth_shadow_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SHADOW_QUARTZ_SLAB = register("smooth_shadow_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SHADOW_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_SHADOW_QUARTZ_STAIRS = register("smooth_shadow_quartz_stairs", 
			new StairBlock(SMOOTH_SHADOW_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	*/
	
	public static final Block JADE_BLOCK = register("jade_block", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_SLAB = register("jade_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(JADE_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_STAIRS = register("jade_stairs", 
			new StairBlock(JADE_BLOCK), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_BLOCK_WALL = register("jade_wall", 
			new WallBlock(FabricBlockSettings.copy(JADE_BLOCK)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_JADE = register("chiseled_jade", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_JADE_WALL = register("chiseled_jade_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_JADE)), ItemGroup.DECORATIONS);
	public static final Block JADE_BRICKS = register("jade_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_BRICK_WALL = register("jade_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(JADE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block JADE_TILING = register("jade_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_TILING_SLAB = register("jade_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(JADE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_TILING_STAIRS = register("jade_tiling_stairs", 
			new StairBlock(JADE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block JADE_TILING_WALL = register("jade_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(JADE_TILING)), ItemGroup.DECORATIONS);
	public static final Block JADE_PILLAR = register("jade_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_JADE = register("smooth_jade", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_JADE_SLAB = register("smooth_jade_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_JADE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_JADE_STAIRS = register("smooth_jade_stairs", 
			new StairBlock(SMOOTH_JADE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_JADE__WALL = register("smooth_jade_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_JADE)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_JADE = register("gem_cut_jade", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GREEN).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block AMBER_BLOCK = register("amber_block", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_SLAB = register("amber_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(AMBER_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_STAIRS = register("amber_stairs", 
			new StairBlock(AMBER_BLOCK), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_WALL = register("amber_wall", 
			new WallBlock(FabricBlockSettings.copy(AMBER_BLOCK)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_AMBER = register("chiseled_amber", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_AMBER_WALL = register("chiseled_amber_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_AMBER)), ItemGroup.DECORATIONS);
	public static final Block AMBER_BRICKS = register("amber_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_BRICK_WALL = register("amber_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(AMBER_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block AMBER_TILING = register("amber_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_TILING_SLAB = register("amber_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(AMBER_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_TILING_STAIRS = register("amber_tiling_stairs", 
			new StairBlock(AMBER_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMBER_TILING_WALL = register("amber_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(AMBER_TILING)), ItemGroup.DECORATIONS);
	public static final Block AMBER_PILLAR = register("amber_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMBER = register("smooth_amber", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMBER_SLAB = register("smooth_amber_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_AMBER)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMBER_STAIRS = register("smooth_amber_stairs", 
			new StairBlock(SMOOTH_AMBER), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMBER_WALL = register("smooth_amber_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_AMBER)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_AMBER = register("gem_cut_amber", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.ORANGE).requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block EMERALD_QUARTZ = register("emerald_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_SLAB = register("emerald_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(EMERALD_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_STAIRS = register("emerald_quartz_stairs", 
			new StairBlock(EMERALD_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_WALL = register("emerald_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(EMERALD_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_EMERALD_QUARTZ = register("chiseled_emerald_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_EMERALD_QUARTZ_WALL = register("chiseled_emerald_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_EMERALD_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block EMERALD_QUARTZ_BRICKS = register("emerald_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_BRICK_WALL = register("emerald_quartz_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(EMERALD_QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block EMERALD_QUARTZ_TILING = register("emerald_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_TILING_SLAB = register("emerald_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(EMERALD_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_TILING_STAIRS = register("emerald_quartz_tiling_stairs", 
			new StairBlock(EMERALD_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block EMERALD_QUARTZ_TILING_WALL = register("emerald_quartz_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(EMERALD_QUARTZ_TILING)), ItemGroup.DECORATIONS);
	public static final Block EMERALD_QUARTZ_PILLAR = register("emerald_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_EMERALD_QUARTZ = register("smooth_emerald_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.EMERALD).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_EMERALD_QUARTZ_SLAB = register("smooth_emerald_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_EMERALD_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_EMERALD_QUARTZ_STAIRS = register("smooth_emerald_quartz_stairs", 
			new StairBlock(SMOOTH_EMERALD_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_EMERALD_QUARTZ_WALL = register("smooth_emerald_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_EMERALD_QUARTZ)), ItemGroup.DECORATIONS);
	//public static final Block FANCY_EMERALD_BLOCK = register("fancy_emerald_block", 
	//		new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.EMERALD).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block DIAMOND_QUARTZ = register("diamond_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_SLAB = register("diamond_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DIAMOND_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_STAIRS = register("diamond_quartz_stairs", 
			new StairBlock(DIAMOND_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_WALL = register("diamond_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(DIAMOND_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_DIAMOND_QUARTZ = register("chiseled_diamond_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_DIAMOND_QUARTZ_WALL = register("chiseled_diamond_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_DIAMOND_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block DIAMOND_QUARTZ_BRICKS = register("diamond_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_BRICK_WALL = register("diamond_quartz_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(DIAMOND_QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block DIAMOND_QUARTZ_TILING = register("diamond_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_TILING_SLAB = register("diamond_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(DIAMOND_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_TILING_STAIRS = register("diamond_quartz_tiling_stairs", 
			new StairBlock(DIAMOND_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block DIAMOND_QUARTZ_TILING_WALL = register("diamond_quartz_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(DIAMOND_QUARTZ_TILING)), ItemGroup.DECORATIONS);
	public static final Block DIAMOND_QUARTZ_PILLAR = register("diamond_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DIAMOND_QUARTZ = register("smooth_diamond_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.DIAMOND).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DIAMOND_QUARTZ_SLAB = register("smooth_diamond_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_DIAMOND_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DIAMOND_QUARTZ_STAIRS = register("smooth_diamond_quartz_stairs", 
			new StairBlock(SMOOTH_DIAMOND_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_DIAMOND_QUARTZ_WALL = register("smooth_diamond_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_DIAMOND_QUARTZ)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_DIAMOND_BLOCK = register("gem_cut_diamond_block", 
			new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.DIAMOND).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	
	/*public static final Block AMETHYST_QUARTZ = register("amethyst_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_SLAB = register("amethyst_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(AMETHYST_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_STAIRS = register("amethyst_quartz_stairs", 
			new StairBlock(AMETHYST_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_AMETHYST_QUARTZ = register("chiseled_amethyst_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_BRICKS = register("amethyst_quartz_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_TILING = register("amethyst_quartz_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_TILING_SLAB = register("amethyst_quartz_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(AMETHYST_QUARTZ_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_TILING_STAIRS = register("amethyst_quartz_tiling_stairs", 
			new StairBlock(AMETHYST_QUARTZ_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block AMETHYST_QUARTZ_PILLAR = register("amethyst_quartz_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMETHYST_QUARTZ = register("smooth_amethyst_quartz", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.PURPLE).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMETHYST_QUARTZ_SLAB = register("smooth_amethyst_quartz_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_AMETHYST_QUARTZ)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_AMETHYST_QUARTZ_STAIRS = register("smooth_amethyst_quartz_stairs", 
			new StairBlock(SMOOTH_AMETHYST_QUARTZ), ItemGroup.BUILDING_BLOCKS);
	public static final Block GEM_CUT_AMETHYST_BLOCK = register("gem_cut_amethyst_block", 
			new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.PURPLE).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	*/
	
	public static final Block VITRIC_REDSTONE = register("vitric_redstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.LAVA).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_SLAB = register("vitric_redstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_REDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_STAIRS = register("vitric_redstone_stairs", 
			new StairBlock(VITRIC_REDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_WALL = register("vitric_redstone_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_REDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_REDSTONE = register("chiseled_vitric_redstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.LAVA).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_REDSTONE_WALL = register("chiseled_vitric_redstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_REDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_REDSTONE_BRICKS = register("vitric_redstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.RED).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_BRICK_WALL = register("vitric_redstone_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_REDSTONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_REDSTONE_TILING = register("vitric_redstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.LAVA).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_TILING_SLAB = register("vitric_redstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_REDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_TILING_STAIRS = register("vitric_redstone_tiling_stairs", 
			new StairBlock(VITRIC_REDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_REDSTONE_TILING_WALL = register("vitric_redstone_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_REDSTONE_TILING)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_REDSTONE_PILLAR = register("vitric_redstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.LAVA).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_REDSTONE = register("smooth_vitric_redstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.LAVA).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_REDSTONE_SLAB = register("smooth_vitric_redstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_REDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_REDSTONE_STAIRS = register("smooth_vitric_redstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_REDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_REDSTONE_WALL = register("smooth_vitric_redstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_REDSTONE)), ItemGroup.DECORATIONS);
	public static final Block GEM_CUT_REDSTONE_BLOCK = register("gem_cut_redstone_block", 
			new RedstoneBlock(FabricBlockSettings.of(Material.METAL, MaterialColor.LAVA).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static final Block COMPACT_REDSTONE_BLOCK = register("compact_redstone_block", 
			new RedstoneBlock(FabricBlockSettings.of(Material.METAL, MaterialColor.LAVA).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.REDSTONE);
	
	public static final Block BLACK_SAND = register("black_sand", 
			new SandBlock(14866662, FabricBlockSettings.of(Material.AGGREGATE, MaterialColor.BLACK).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE = register("black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_SLAB = register("black_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_STAIRS = register("black_sandstone_stairs", 
			new StairBlock(BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_WALL = register("black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_BLACK_SANDSTONE = register("cut_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_BLACK_SANDSTONE_SLAB = register("cut_black_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(CUT_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_BLACK_SANDSTONE_WALL = register("cut_black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CUT_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_BLACK_SANDSTONE = register("chiseled_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE = register("smooth_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = register("smooth_black_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = register("smooth_black_sandstone_stairs", 
			new StairBlock(SMOOTH_BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_WALL = register("smooth_black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_BLACK_SANDSTONE = register("vitric_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_SLAB = register("vitric_black_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_STAIRS = register("vitric_black_sandstone_stairs", 
			new StairBlock(VITRIC_BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_WALL = register("vitric_black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_VITRIC_BLACK_SANDSTONE = register("chiseled_vitric_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CHISELED_VITRIC_BLACK_SANDSTONE_WALL = register("chiseled_vitric_black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(CHISELED_VITRIC_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_BLACK_SANDSTONE_BRICKS = register("vitric_black_sandstone_bricks", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_BRICK_WALL = register("vitric_black_sandstone_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_BLACK_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_BLACK_SANDSTONE_TILING = register("vitric_black_sandstone_tiling", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_TILING_SLAB = register("vitric_black_sandstone_tiling_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(VITRIC_BLACK_SANDSTONE_TILING)), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_TILING_STAIRS = register("vitric_black_sandstone_tiling_stairs", 
			new StairBlock(VITRIC_BLACK_SANDSTONE_TILING), ItemGroup.BUILDING_BLOCKS);
	public static final Block VITRIC_BLACK_SANDSTONE_TILING_WALL = register("vitric_black_sandstone_tiling_wall", 
			new WallBlock(FabricBlockSettings.copy(VITRIC_BLACK_SANDSTONE_TILING)), ItemGroup.DECORATIONS);
	public static final Block VITRIC_BLACK_SANDSTONE_PILLAR = register("vitric_black_sandstone_pillar", 
			new PillarBlock(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_BLACK_SANDSTONE = register("smooth_vitric_black_sandstone", 
			new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_BLACK_SANDSTONE_SLAB = register("smooth_vitric_black_sandstone_slab", 
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_VITRIC_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_BLACK_SANDSTONE_STAIRS = register("smooth_vitric_black_sandstone_stairs", 
			new StairBlock(SMOOTH_VITRIC_BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_VITRIC_BLACK_SANDSTONE_WALL = register("smooth_vitric_black_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(SMOOTH_VITRIC_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);	
	
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

package com.silicateseer.beholdersvariations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class StairBlock extends StairsBlock{
	
	public StairBlock(Block base) {
		super(base.getDefaultState(), FabricBlockSettings.copyOf(base));
	}
}

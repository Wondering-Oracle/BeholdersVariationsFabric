package com.silicateseer.beholdersvariations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class BVMaterials {
	
	public static final Material DECORATIVE_IMMOVABLE = (new FabricMaterialBuilder(MaterialColor.BLACK)).blocksPistons().build();
	//needs .requiresTool().breakByTool(FabricToolTags.PICKAXES, #) in block settings
}

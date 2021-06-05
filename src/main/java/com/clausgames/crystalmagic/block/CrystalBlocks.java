package com.clausgames.crystalmagic.block;

import com.clausgames.crystalmagic.CrystalMagic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CrystalBlocks {

    public static final Block ORE_CRYSTAL = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).luminance(8));
    public static final Block ORE_THERMAL_CRYSTAL = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).luminance(14));
    public static final Block ORE_UMBRAL_CRYSTAL = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));

    public static void registerBlockItems() {
        Registry.register(Registry.BLOCK, new Identifier("crystalmagic", "ore_crystal"), ORE_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "ore_crystal"), new BlockItem(ORE_CRYSTAL, new FabricItemSettings().group(CrystalMagic.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("crystalmagic", "ore_thermal_crystal"), ORE_THERMAL_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "ore_thermal_crystal"), new BlockItem(ORE_THERMAL_CRYSTAL, new FabricItemSettings().group(CrystalMagic.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("crystalmagic", "ore_umbral_crystal"), ORE_UMBRAL_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "ore_umbral_crystal"), new BlockItem(ORE_UMBRAL_CRYSTAL, new FabricItemSettings().group(CrystalMagic.ITEM_GROUP)));
    }


}

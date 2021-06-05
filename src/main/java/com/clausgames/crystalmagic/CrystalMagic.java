package com.clausgames.crystalmagic;

import com.clausgames.crystalmagic.block.CrystalBlocks;
import com.clausgames.crystalmagic.item.CrystalItems;
import com.clausgames.crystalmagic.world.OreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CrystalMagic implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("crystalmagic", "general"),
            () -> new ItemStack(CrystalItems.CRYSTAL_SHARD));



    @Override
    public void onInitialize() {
        CrystalBlocks.registerBlockItems();
        CrystalItems.registerItems();
        OreGeneration.registerOres();
    }
}

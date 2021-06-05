package com.clausgames.crystalmagic.item;

import com.clausgames.crystalmagic.CrystalMagic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CrystalItems {

    public static final Item CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item AERIAL_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item THERMAL_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item METALLIC_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item AQUEOUS_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item LUMINOUS_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));
    public static final Item UMBRAL_CRYSTAL_SHARD = new Item(new FabricItemSettings().group(CrystalMagic.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "crystal_shard"), CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "aerial_crystal_shard"), AERIAL_CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "thermal_crystal_shard"), THERMAL_CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "metallic_crystal_shard"), METALLIC_CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "aqueous_crystal_shard"), AQUEOUS_CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "luminous_crystal_shard"), LUMINOUS_CRYSTAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier("crystalmagic", "umbral_crystal_shard"), UMBRAL_CRYSTAL_SHARD);
    }
}

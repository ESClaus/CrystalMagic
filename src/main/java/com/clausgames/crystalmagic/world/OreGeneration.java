package com.clausgames.crystalmagic.world;

import com.clausgames.crystalmagic.block.CrystalBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class OreGeneration {

    private static ConfiguredFeature<?, ?> ORE_CRYSTAL_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, CrystalBlocks.ORE_CRYSTAL.getDefaultState(), 6)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 20)))
            .repeat(4);

    private static ConfiguredFeature<?, ?> ORE_CRYSTAL_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, CrystalBlocks.ORE_THERMAL_CRYSTAL.getDefaultState(), 5)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 110)))
            .repeat(8);

    private static ConfiguredFeature<?, ?> ORE_CRYSTAL_END = Feature.ORE
            .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), CrystalBlocks.ORE_UMBRAL_CRYSTAL.getDefaultState(), 4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 128)))
            .repeat(8);

    public static void registerOres() {
        RegistryKey<ConfiguredFeature<?, ?>> oreCrystalOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("crystalmagic", "ore_crystal_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCrystalOverworld.getValue(), ORE_CRYSTAL_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCrystalOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreCrystalNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("crystalmagic", "ore_crystal_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCrystalNether.getValue(), ORE_CRYSTAL_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCrystalNether);

        RegistryKey<ConfiguredFeature<?, ?>> oreCrystalEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("crystalmagic", "ore_crystal_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCrystalEnd.getValue(), ORE_CRYSTAL_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreCrystalEnd);
    }


}

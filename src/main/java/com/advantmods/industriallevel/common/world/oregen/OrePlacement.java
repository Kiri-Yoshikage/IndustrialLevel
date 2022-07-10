/*
package com.advantmods.industriallevel.common.world.oregen;

import com.advantmods.industriallevel.common.IndustrialLevel;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber
public class OrePlacement {
    public static PlacedFeature TITANIUM_ORE;
    public static PlacedFeature DEEPSLATE_TITANIUM_ORE;
    public static PlacedFeature NETHER_TITANIUM_ORE;
    public static PlacedFeature END_TITANIUM_ORE;
    public static PlacedFeature CHLOROPHYTE_ORE;
    public static PlacedFeature DEEPSLATE_CHLOROPHYTE_ORE;
    public static PlacedFeature NETHER_CHLOROPHYTE_ORE;
    public static PlacedFeature END_CHLOROPHYTE_ORE;
    public static PlacedFeature BRONZE_ORE;
    public static PlacedFeature DEEPSLATE_BRONZE_ORE;
    public static PlacedFeature NETHER_BRONZE_ORE;
    public static PlacedFeature END_BRONZE_ORE;
    public static PlacedFeature LEAD_ORE;
    public static PlacedFeature DEEPSLATE_LEAD_ORE;
    public static PlacedFeature NETHER_LEAD_ORE;
    public static PlacedFeature END_LEAD_ORE;
    public static PlacedFeature NICKEL_ORE;
    public static PlacedFeature DEEPSLATE_NICKEL_ORE;
    public static PlacedFeature NETHER_NICKEL_ORE;
    public static PlacedFeature END_NICKEL_ORE;
    public static PlacedFeature OSMIUM_ORE;
    public static PlacedFeature DEEPSLATE_OSMIUM_ORE;
    public static PlacedFeature NETHER_OSMIUM_ORE;
    public static PlacedFeature END_OSMIUM_ORE;
    public static PlacedFeature PLATINUM_ORE;
    public static PlacedFeature DEEPSLATE_PLATINUM_ORE;
    public static PlacedFeature NETHER_PLATINUM_ORE;
    public static PlacedFeature END_PLATINUM_ORE;
    public static PlacedFeature SILVER_ORE;
    public static PlacedFeature DEEPSLATE_SILVER_ORE;
    public static PlacedFeature NETHER_SILVER_ORE;
    public static PlacedFeature END_SILVER_ORE;
    public static PlacedFeature TIN_ORE;
    public static PlacedFeature DEEPSLATE_TIN_ORE;
    public static PlacedFeature NETHER_TIN_ORE;
    public static PlacedFeature END_TIN_ORE;
    public static PlacedFeature URANIUM_ORE;
    public static PlacedFeature DEEPSLATE_URANIUM_ORE;
    public static PlacedFeature NETHER_URANIUM_ORE;
    public static PlacedFeature END_URANIUM_ORE;
    public static PlacedFeature ZINC_ORE;
    public static PlacedFeature DEEPSLATE_ZINC_ORE;
    public static PlacedFeature NETHER_ZINC_ORE;
    public static PlacedFeature END_ZINC_ORE;

    public static void register() {
        TITANIUM_ORE = OreConfigured.TITANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_TITANIUM_ORE = OreConfigured.DEEPSLATE_TITANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_TITANIUM_ORE = OreConfigured.NETHER_TITANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_TITANIUM_ORE = OreConfigured.END_TITANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        CHLOROPHYTE_ORE = OreConfigured.CHLOROPHYTE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_CHLOROPHYTE_ORE = OreConfigured.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_CHLOROPHYTE_ORE = OreConfigured.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_CHLOROPHYTE_ORE = OreConfigured.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        BRONZE_ORE = OreConfigured.BRONZE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_BRONZE_ORE = OreConfigured.DEEPSLATE_BRONZE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_BRONZE_ORE = OreConfigured.DEEPSLATE_BRONZE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_BRONZE_ORE = OreConfigured.DEEPSLATE_BRONZE_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        LEAD_ORE = OreConfigured.LEAD_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_LEAD_ORE = OreConfigured.DEEPSLATE_LEAD_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_LEAD_ORE = OreConfigured.DEEPSLATE_LEAD_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_LEAD_ORE = OreConfigured.DEEPSLATE_LEAD_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        NICKEL_ORE = OreConfigured.NICKEL_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_NICKEL_ORE = OreConfigured.DEEPSLATE_NICKEL_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_NICKEL_ORE = OreConfigured.DEEPSLATE_NICKEL_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_NICKEL_ORE = OreConfigured.DEEPSLATE_NICKEL_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        OSMIUM_ORE = OreConfigured.OSMIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_OSMIUM_ORE = OreConfigured.DEEPSLATE_OSMIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_OSMIUM_ORE = OreConfigured.NETHER_OSMIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_OSMIUM_ORE = OreConfigured.END_OSMIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        PLATINUM_ORE = OreConfigured.PLATINUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_PLATINUM_ORE = OreConfigured.DEEPSLATE_PLATINUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_PLATINUM_ORE = OreConfigured.NETHER_PLATINUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_PLATINUM_ORE = OreConfigured.END_PLATINUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        SILVER_ORE = OreConfigured.SILVER_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_SILVER_ORE = OreConfigured.DEEPSLATE_SILVER_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_SILVER_ORE = OreConfigured.NETHER_SILVER_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_SILVER_ORE = OreConfigured.END_SILVER_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        TIN_ORE = OreConfigured.TIN_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_TIN_ORE = OreConfigured.DEEPSLATE_TIN_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_TIN_ORE = OreConfigured.NETHER_TIN_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_TIN_ORE = OreConfigured.END_TIN_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        URANIUM_ORE = OreConfigured.URANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_URANIUM_ORE = OreConfigured.DEEPSLATE_URANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_URANIUM_ORE = OreConfigured.NETHER_URANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_URANIUM_ORE = OreConfigured.END_URANIUM_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        ZINC_ORE = OreConfigured.ZINC_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(10),
                                VerticalAnchor.absolute(50))));

        DEEPSLATE_ZINC_ORE = OreConfigured.DEEPSLATE_ZINC_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(-50),
                                VerticalAnchor.absolute(-5))));

        NETHER_ZINC_ORE = OreConfigured.NETHER_ZINC_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(5),
                                VerticalAnchor.absolute(100))));

        END_ZINC_ORE = OreConfigured.END_ZINC_ORE
                .placed(orePlacement(6, HeightRangePlacement
                        .uniform(
                                VerticalAnchor.absolute(0),
                                VerticalAnchor.absolute(255))));

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "titanium_ore"), TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_titanium_ore"), NETHER_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "chlorophyte_ore"), CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_chlorophyte_ore"), DEEPSLATE_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_chlorophyte_ore"), NETHER_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_chlorophyte_ore"), END_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "bronze_ore"), BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_bronze_ore"), DEEPSLATE_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_bronze_ore"), NETHER_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_bronze_ore"), END_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "lead_ore"), LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_lead_ore"), NETHER_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_lead_ore"), END_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nickel_ore"), NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_nickel_ore"), DEEPSLATE_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_nickel_ore"), NETHER_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_nickel_ore"), END_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "osmium_ore"), OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_osmium_ore"), DEEPSLATE_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_osmium_ore"), NETHER_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_osmium_ore"), END_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "platinum_ore"), PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_platinum_ore"), DEEPSLATE_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_platinum_ore"), NETHER_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_platinum_ore"), END_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "silver_ore"), SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_silver_ore"), NETHER_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_silver_ore"), END_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "tin_ore"), TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_tin_ore"), DEEPSLATE_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_tin_ore"), NETHER_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_tin_ore"), END_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "uranium_ore"), URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_uranium_ore"), DEEPSLATE_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_uranium_ore"), NETHER_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_uranium_ore"), END_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "zinc_ore"), ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_zinc_ore"), DEEPSLATE_ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_zinc_ore"), NETHER_ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_zinc_ore"), END_ZINC_ORE);
    }

    @SubscribeEvent
    public static void biomeModification(final BiomeLoadingEvent loadingEvent) {
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> TITANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_TITANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_TITANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_TITANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> CHLOROPHYTE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_CHLOROPHYTE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_CHLOROPHYTE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_CHLOROPHYTE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> BRONZE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_BRONZE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_BRONZE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_BRONZE_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> LEAD_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_LEAD_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_LEAD_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_LEAD_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NICKEL_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_NICKEL_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_NICKEL_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_NICKEL_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> OSMIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_OSMIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_OSMIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_OSMIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> PLATINUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_PLATINUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_PLATINUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_PLATINUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> SILVER_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_SILVER_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_SILVER_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_SILVER_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> TIN_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_TIN_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_TIN_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_TIN_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> URANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_URANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_URANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_URANIUM_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ZINC_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_ZINC_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_ZINC_ORE);
            loadingEvent.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_ZINC_ORE);
        }

    private static List<PlacementModifier> orePlace(PlacementModifier placementModifier, PlacementModifier modifier) {
        return List.of(placementModifier, InSquarePlacement.spread(), modifier, BiomeFilter.biome());
    }

    private static List<PlacementModifier> orePlacement(int size, PlacementModifier placementModifier) {
        return orePlace(CountPlacement.of(size), placementModifier);
    }
}
*/

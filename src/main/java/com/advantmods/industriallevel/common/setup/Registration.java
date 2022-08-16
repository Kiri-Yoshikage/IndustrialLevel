package com.advantmods.industriallevel.common.setup;

import com.advantmods.industriallevel.common.IndustrialLevel;
import com.advantmods.industriallevel.common.block.block.*;
import com.advantmods.industriallevel.common.block.ore.*;
import com.advantmods.industriallevel.common.item.armor.*;
import com.advantmods.industriallevel.common.item.gem.Ruby;
import com.advantmods.industriallevel.common.item.ingot.*;
import com.advantmods.industriallevel.common.item.nugget.*;
import com.advantmods.industriallevel.common.item.raw.*;
import com.advantmods.industriallevel.common.item.tool.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, IndustrialLevel.ModId);
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, IndustrialLevel.ModId);

    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEM.register(bus);
        BLOCK.register(bus);

        for (var block : BLOCK.getEntries()) {
            ITEM.register(block.getId().getPath(), ()-> new BlockItem(block.get(), new Item.Properties()
                    .tab(ModSetup.CLASSIC_TAB)));
        }
    }

    // Ores and Blocks
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCK.register("titanium_ore", TitaniumOre::new);
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = BLOCK.register("deepslate_titanium_ore", DeepslateTitaniumOre::new);
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCK.register("titanium_block", TitaniumBlock::new);
    public static final RegistryObject<Block> CHLOROPHYTE_ORE = BLOCK.register("chlorophyte_ore", ChlorophyteOre::new);
    public static final RegistryObject<Block> DEEPSLATE_CHLOROPHYTE_ORE = BLOCK.register("deepslate_chlorophyte_ore", DeepslateChlorophyteOre::new);
    public static final RegistryObject<Block> CHLOROPHYTE_BLOCK = BLOCK.register("chlorophyte_block", ChlorophyteBlock::new);
    public static final RegistryObject<Block> BRONZE_ORE = BLOCK.register("bronze_ore", BronzeOre::new);
    public static final RegistryObject<Block> DEEPSLATE_BRONZE_ORE = BLOCK.register("deepslate_bronze_ore", DeepslateBronzeOre::new);
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCK.register("bronze_block", BronzeBlock::new);
    public static final RegistryObject<Block> TIN_ORE = BLOCK.register("tin_ore", TinOre::new);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCK.register("deepslate_tin_ore", DeepslateTinOre::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCK.register("tin_block", TinBlock::new);
    public static final RegistryObject<Block> ZINC_ORE = BLOCK.register("zinc_ore", ZincOre::new);
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = BLOCK.register("deepslate_zinc_ore", DeepslateZincOre::new);
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCK.register("zinc_block", ZincBlock::new);
    public static final RegistryObject<Block> NICKEL_ORE = BLOCK.register("nickel_ore", NickelOre::new);
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = BLOCK.register("deepslate_nickel_ore", DeepslateNickelOre::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCK.register("nickel_block", NickelBlock::new);
    public static final RegistryObject<Block> LEAD_ORE = BLOCK.register("lead_ore", LeadOre::new);
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCK.register("deepslate_lead_ore", DeepslateLeadOre::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCK.register("lead_block", LeadBlock::new);
    public static final RegistryObject<Block> OSMIUM_ORE = BLOCK.register("osmium_ore", OsmiumOre::new);
    public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = BLOCK.register("deepslate_osmium_ore", DeepslateOsmiumOre::new);
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCK.register("osmium_block", OsmiumBlock::new);
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCK.register("platinum_ore", PlatinumOre::new);
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = BLOCK.register("deepslate_platinum_ore", DeepslatePlatinumOre::new);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCK.register("platinum_block", PlatinumBlock::new);
    public static final RegistryObject<Block> SILVER_ORE = BLOCK.register("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCK.register("deepslate_silver_ore", DeepslateSilverOre::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCK.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> URANIUM_ORE = BLOCK.register("uranium_ore", UraniumOre::new);
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = BLOCK.register("deepslate_uranium_ore", DeepslateUraniumOre::new);
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCK.register("uranium_block", UraniumBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCK.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCK.register("deepslate_ruby_ore", DeepslateRubyOre::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCK.register("ruby_block", RubyBlock::new);

    // Materials
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEM.register("titanium_ingot", TitaniumIngot::new);
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEM.register("titanium_nugget", TitaniumNugget::new);
    public static final RegistryObject<Item> RAW_TITANIUM = ITEM.register("raw_titanium", RawTitanium::new);
    public static final RegistryObject<Item> CHLOROPHYTE_INGOT = ITEM.register("chlorophyte_ingot", ChlorophyteIngot::new);
    public static final RegistryObject<Item> CHLOROPHYTE_NUGGET = ITEM.register("chlorophyte_nugget", ChlorophyteNugget::new);
    public static final RegistryObject<Item> RAW_CHLOROPHYTE = ITEM.register("raw_chlorophyte", RawChlorophyte::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEM.register("bronze_ingot", BronzeIngot::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEM.register("bronze_nugget", BronzeNugget::new);
    public static final RegistryObject<Item> RAW_BRONZE = ITEM.register("raw_bronze", RawBronze::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEM.register("tin_ingot", TinIngot::new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEM.register("tin_nugget", TinNugget::new);
    public static final RegistryObject<Item> RAW_TIN = ITEM.register("raw_tin", RawTin::new);
    public static final RegistryObject<Item> ZINC_INGOT = ITEM.register("zinc_ingot", ZincIngot::new);
    public static final RegistryObject<Item> ZINC_NUGGET = ITEM.register("zinc_nugget", ZincNugget::new);
    public static final RegistryObject<Item> RAW_ZINC = ITEM.register("raw_zinc", RawZinc::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEM.register("nickel_ingot", NickelIngot::new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEM.register("nickel_nugget", NickelNugget::new);
    public static final RegistryObject<Item> RAW_NICKEL = ITEM.register("raw_nickel", RawNickel::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEM.register("lead_ingot", LeadIngot::new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEM.register("lead_nugget", LeadNugget::new);
    public static final RegistryObject<Item> RAW_LEAD = ITEM.register("raw_lead", RawLead::new);
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEM.register("osmium_ingot", OsmiumIngot::new);
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEM.register("osmium_nugget", OsmiumNugget::new);
    public static final RegistryObject<Item> RAW_OSMIUM = ITEM.register("raw_osmium", RawOsmium::new);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEM.register("platinum_ingot", PlatinumIngot::new);
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEM.register("platinum_nugget", PlatinumNugget::new);
    public static final RegistryObject<Item> RAW_PLATINUM = ITEM.register("raw_platinum", RawPlatinum::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEM.register("silver_ingot", SilverIngot::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEM.register("silver_nugget", SilverNugget::new);
    public static final RegistryObject<Item> RAW_SILVER = ITEM.register("raw_silver", RawSilver::new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEM.register("uranium_ingot", UraniumIngot::new);
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEM.register("uranium_nugget", UraniumNugget::new);
    public static final RegistryObject<Item> RAW_URANIUM = ITEM.register("raw_uranium", RawUranium::new);
    public static final RegistryObject<Item> RUBY = ITEM.register("ruby", Ruby::new);

    // Tools
    public static final RegistryObject<Item> BRONZE_AXE = ITEM.register("bronze_axe", BronzeAxe::new);
    public static final RegistryObject<Item> BRONZE_HOE = ITEM.register("bronze_hoe", BronzeHoe::new);
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEM.register("bronze_pickaxe", BronzePickaxe::new);
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEM.register("bronze_shovel", BronzeShovel::new);
    public static final RegistryObject<Item> BRONZE_SWORD = ITEM.register("bronze_sword", BronzeSword::new);
    public static final RegistryObject<Item> CHLOROPHYTE_AXE = ITEM.register("chlorophyte_axe", ChlorophyteAxe::new);
    public static final RegistryObject<Item> CHLOROPHYTE_HOE = ITEM.register("chlorophyte_hoe", ChlorophyteHoe::new);
    public static final RegistryObject<Item> CHLOROPHYTE_PICKAXE = ITEM.register("chlorophyte_pickaxe", ChlorophytePickaxe::new);
    public static final RegistryObject<Item> CHLOROPHYTE_SHOVEL = ITEM.register("chlorophyte_shovel", ChlorophyteShovel::new);
    public static final RegistryObject<Item> CHLOROPHYTE_SWORD = ITEM.register("chlorophyte_sword", ChlorophyteSword::new);
    public static final RegistryObject<Item> NICKEL_AXE = ITEM.register("nickel_axe", NickelAxe::new);
    public static final RegistryObject<Item> NICKEL_HOE = ITEM.register("nickel_hoe", NickelHoe::new);
    public static final RegistryObject<Item> NICKEL_PICKAXE = ITEM.register("nickel_pickaxe", NickelPickaxe::new);
    public static final RegistryObject<Item> NICKEL_SHOVEL = ITEM.register("nickel_shovel", NickelShovel::new);
    public static final RegistryObject<Item> NICKEL_SWORD = ITEM.register("nickel_sword", NickelSword::new);
    public static final RegistryObject<Item> TITANIUM_AXE = ITEM.register("titanium_axe", TitaniumAxe::new);
    public static final RegistryObject<Item> TITANIUM_HOE = ITEM.register("titanium_hoe", TitaniumHoe::new);
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEM.register("titanium_pickaxe", TitaniumPickaxe::new);
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEM.register("titanium_shovel", TitaniumShovel::new);
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEM.register("titanium_sword", TitaniumSword::new);
    public static final RegistryObject<Item> OSMIUM_AXE = ITEM.register("osmium_axe", OsmiumAxe::new);
    public static final RegistryObject<Item> OSMIUM_HOE = ITEM.register("osmium_hoe", OsmiumHoe::new);
    public static final RegistryObject<Item> OSMIUM_PICKAXE = ITEM.register("osmium_pickaxe", OsmiumPickaxe::new);
    public static final RegistryObject<Item> OSMIUM_SHOVEL = ITEM.register("osmium_shovel", OsmiumShovel::new);
    public static final RegistryObject<Item> OSMIUM_SWORD = ITEM.register("osmium_sword", OsmiumSword::new);
    public static final RegistryObject<Item> PLATINUM_AXE = ITEM.register("platinum_axe", PlatinumAxe::new);
    public static final RegistryObject<Item> PLATINUM_HOE = ITEM.register("platinum_hoe", PlatinumHoe::new);
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEM.register("platinum_pickaxe", PlatinumPickaxe::new);
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEM.register("platinum_shovel", PlatinumShovel::new);
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEM.register("platinum_sword", PlatinumSword::new);
    public static final RegistryObject<Item> URANIUM_AXE = ITEM.register("uranium_axe", UraniumAxe::new);
    public static final RegistryObject<Item> URANIUM_HOE = ITEM.register("uranium_hoe", UraniumHoe::new);
    public static final RegistryObject<Item> URANIUM_PICKAXE = ITEM.register("uranium_pickaxe", UraniumPickaxe::new);
    public static final RegistryObject<Item> URANIUM_SHOVEL = ITEM.register("uranium_shovel", UraniumShovel::new);
    public static final RegistryObject<Item> URANIUM_SWORD = ITEM.register("uranium_sword", UraniumSword::new);
    public static final RegistryObject<Item> LEAD_AXE = ITEM.register("lead_axe", LeadAxe::new);
    public static final RegistryObject<Item> LEAD_HOE = ITEM.register("lead_hoe", LeadHoe::new);
    public static final RegistryObject<Item> LEAD_PICKAXE = ITEM.register("lead_pickaxe", LeadPickaxe::new);
    public static final RegistryObject<Item> LEAD_SHOVEL = ITEM.register("lead_shovel", LeadShovel::new);
    public static final RegistryObject<Item> LEAD_SWORD = ITEM.register("lead_sword", LeadSword::new);
    public static final RegistryObject<Item> ZINC_AXE = ITEM.register("zinc_axe", ZincAxe::new);
    public static final RegistryObject<Item> ZINC_HOE = ITEM.register("zinc_hoe", ZincHoe::new);
    public static final RegistryObject<Item> ZINC_PICKAXE = ITEM.register("zinc_pickaxe", ZincPickaxe::new);
    public static final RegistryObject<Item> ZINC_SHOVEL = ITEM.register("zinc_shovel", ZincShovel::new);
    public static final RegistryObject<Item> ZINC_SWORD = ITEM.register("zinc_sword", ZincSword::new);
    public static final RegistryObject<Item> TIN_AXE = ITEM.register("tin_axe", TinAxe::new);
    public static final RegistryObject<Item> TIN_HOE = ITEM.register("tin_hoe", TinHoe::new);
    public static final RegistryObject<Item> TIN_PICKAXE = ITEM.register("tin_pickaxe", TinPickaxe::new);
    public static final RegistryObject<Item> TIN_SHOVEL = ITEM.register("tin_shovel", TinShovel::new);
    public static final RegistryObject<Item> TIN_SWORD = ITEM.register("tin_sword", TinSword::new);
    public static final RegistryObject<Item> SILVER_AXE = ITEM.register("silver_axe", SilverAxe::new);
    public static final RegistryObject<Item> SILVER_HOE = ITEM.register("silver_hoe", SilverHoe::new);
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEM.register("silver_pickaxe", SilverPickaxe::new);
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEM.register("silver_shovel", SilverShovel::new);
    public static final RegistryObject<Item> SILVER_SWORD = ITEM.register("silver_sword", SilverSword::new);
    public static final RegistryObject<Item> RUBY_AXE = ITEM.register("ruby_axe", RubyAxe::new);
    public static final RegistryObject<Item> RUBY_HOE = ITEM.register("ruby_hoe", RubyHoe::new);
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEM.register("ruby_pickaxe", RubyPickaxe::new);
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEM.register("ruby_shovel", RubyShovel::new);
    public static final RegistryObject<Item> RUBY_SWORD = ITEM.register("ruby_sword", RubySword::new);

    // Armors
    public static final RegistryObject<Item> BRONZE_HELMET = ITEM.register("bronze_helmet",
            ()-> new BronzeArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEM.register("bronze_chestplate",
            ()-> new BronzeArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> BRONZE_LEGS = ITEM.register("bronze_leggings",
            ()-> new BronzeArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEM.register("bronze_boots",
            ()-> new BronzeArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> CHLOROPHYTE_HELMET = ITEM.register("chlorophyte_helmet",
            ()-> new ChlorophyteArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> CHLOROPHYTE_CHESTPLATE = ITEM.register("chlorophyte_chestplate",
            ()-> new ChlorophyteArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> CHLOROPHYTE_LEGS = ITEM.register("chlorophyte_leggings",
            ()-> new ChlorophyteArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> CHLOROPHYTE_BOOTS = ITEM.register("chlorophyte_boots",
            ()-> new ChlorophyteArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> NICKEL_HELMET = ITEM.register("nickel_helmet",
            ()-> new NickelArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEM.register("nickel_chestplate",
            ()-> new NickelArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> NICKEL_LEGS = ITEM.register("nickel_leggings",
            ()-> new NickelArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> NICKEL_BOOTS = ITEM.register("nickel_boots",
            ()-> new NickelArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEM.register("titanium_helmet",
            ()-> new TitaniumArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEM.register("titanium_chestplate",
            ()-> new TitaniumArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> TITANIUM_LEGS = ITEM.register("titanium_leggings",
            ()-> new TitaniumArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEM.register("titanium_boots",
            ()-> new TitaniumArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> OSMIUM_HELMET = ITEM.register("osmium_helmet",
            ()-> new OsmiumArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> OSMIUM_CHESTPLATE = ITEM.register("osmium_chestplate",
            ()-> new OsmiumArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> OSMIUM_LEGS = ITEM.register("osmium_leggings",
            ()-> new OsmiumArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> OSMIUM_BOOTS = ITEM.register("osmium_boots",
            ()-> new OsmiumArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEM.register("platinum_helmet",
            ()-> new PlatinumArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEM.register("platinum_chestplate",
            ()-> new PlatinumArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> PLATINUM_LEGS = ITEM.register("platinum_leggings",
            ()-> new PlatinumArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEM.register("platinum_boots",
            ()-> new PlatinumArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> URANIUM_HELMET = ITEM.register("uranium_helmet",
            ()-> new UraniumArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> URANIUM_CHESTPLATE = ITEM.register("uranium_chestplate",
            ()-> new UraniumArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> URANIUM_LEGS = ITEM.register("uranium_leggings",
            ()-> new UraniumArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> URANIUM_BOOTS = ITEM.register("uranium_boots",
            ()-> new UraniumArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> LEAD_HELMET = ITEM.register("lead_helmet",
            ()-> new LeadArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEM.register("lead_chestplate",
            ()-> new LeadArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> LEAD_LEGS = ITEM.register("lead_leggings",
            ()-> new LeadArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> LEAD_BOOTS = ITEM.register("lead_boots",
            ()-> new LeadArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> ZINC_HELMET = ITEM.register("zinc_helmet",
            ()-> new ZincArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ZINC_CHESTPLATE = ITEM.register("zinc_chestplate",
            ()-> new ZincArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ZINC_LEGS = ITEM.register("zinc_leggings",
            ()-> new ZincArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ZINC_BOOTS = ITEM.register("zinc_boots",
            ()-> new ZincArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> TIN_HELMET = ITEM.register("tin_helmet",
            ()-> new TinArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEM.register("tin_chestplate",
            ()-> new TinArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> TIN_LEGS = ITEM.register("tin_leggings",
            ()-> new TinArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> TIN_BOOTS = ITEM.register("tin_boots",
            ()-> new TinArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> SILVER_HELMET = ITEM.register("silver_helmet",
            ()-> new SilverArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEM.register("silver_chestplate",
            ()-> new SilverArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> SILVER_LEGS = ITEM.register("silver_leggings",
            ()-> new SilverArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEM.register("silver_boots",
            ()-> new SilverArmor(EquipmentSlot.FEET));
    public static final RegistryObject<Item> RUBY_HELMET = ITEM.register("ruby_helmet",
            ()-> new RubyArmor(EquipmentSlot.HEAD));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEM.register("ruby_chestplate",
            ()-> new RubyArmor(EquipmentSlot.CHEST));
    public static final RegistryObject<Item> RUBY_LEGS = ITEM.register("ruby_leggings",
            ()-> new RubyArmor(EquipmentSlot.LEGS));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEM.register("ruby_boots",
            ()-> new RubyArmor(EquipmentSlot.FEET));
}
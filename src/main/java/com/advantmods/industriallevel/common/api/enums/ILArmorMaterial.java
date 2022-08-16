package com.advantmods.industriallevel.common.api.enums;

import com.advantmods.industriallevel.common.setup.Registration;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ILArmorMaterial implements ArmorMaterial {

    TITANIUM(
            "titanium",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.TITANIUM_INGOT.get())
    ),
    CHLOROPHYTE(
            "chlorophyte",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.CHLOROPHYTE_INGOT.get())
    ),
    BRONZE(
            "bronze",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.BRONZE_INGOT.get())
    ),
    NICKEL(
            "nickel",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.NICKEL_INGOT.get())
    ),
    LEAD(
            "lead",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.LEAD_INGOT.get())
    ),
    SILVER(
            "silver",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.SILVER_INGOT.get())
    ),
    TIN(
            "tin",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.TIN_INGOT.get())
    ),
    PLATINUM(
            "platinum",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.PLATINUM_INGOT.get())
    ),
    OSMIUM(
            "osmium",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.OSMIUM_INGOT.get())
    ),
    URANIUM(
            "uranium",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.URANIUM_INGOT.get())
    ),
    ZINC(
            "zinc",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.ZINC_INGOT.get())
    ),
    RUBY(
            "ruby",
            65,
            new int[] {
                    12,
                    24,
                    32,
                    12
            },
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0f,
            1f,
            ()-> Ingredient.of(Registration.RUBY.get())
    );

    private static final int[] armorDurability = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairMaterial;

    ILArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return armorDurability[slot.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.damageReductionAmountArray[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    public @NotNull String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
package com.advantmods.industriallevel.common.api.enums;

import com.advantmods.industriallevel.common.setup.Registration;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ILToolMaterial implements Tier {
    BRONZE(
            2,
            2048,
            6.0F,
            5.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.BRONZE_INGOT.get()))
    ),
    CHLOROPHYTE(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.CHLOROPHYTE_INGOT.get()))
    ),
    NICKEL(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.NICKEL_INGOT.get()))
    ),
    TITANIUM(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.TITANIUM_INGOT.get()))
    ),
    OSMIUM(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.OSMIUM_INGOT.get()))
    ),
    PLATINUM(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.PLATINUM_INGOT.get()))
    ),
    URANIUM(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.URANIUM_INGOT.get()))
    ),
    LEAD(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.LEAD_INGOT.get()))
    ),
    ZINC(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.ZINC_INGOT.get()))
    ),
    TIN(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.TIN_INGOT.get()))
    ),
    SILVER(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.SILVER_INGOT.get()))
    ),
    RUBY(
            5,
            8124,
            12.0F,
            16.0F,
            1,
            () -> Ingredient.of(new ItemStack(Registration.RUBY.get()))
    );

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ILToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @NotNull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
package com.advantmods.industriallevel.common.item.armor;

import com.advantmods.industriallevel.common.IndustrialLevel;
import com.advantmods.industriallevel.common.api.enums.ILArmorMaterial;
import com.advantmods.industriallevel.common.setup.ModSetup;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BronzeArmor extends ArmorItem {
    public BronzeArmor(EquipmentSlot pSlot) {
        super(ILArmorMaterial.BRONZE, pSlot, new Properties().tab(ModSetup.CLASSIC_TAB));
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlot slot, String layer) {
        if (slot == EquipmentSlot.LEGS) {
            return IndustrialLevel.ModId + ":textures/armor/bronze/2.png";
        } else {
            return IndustrialLevel.ModId + ":textures/armor/bronze/1.png";
        }
    }
}
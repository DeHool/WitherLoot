package net.fabricmc.wither_loot.item.armor.custom;

import net.fabricmc.wither_loot.init.ConfigInit;
import net.fabricmc.wither_loot.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WitherArmorMaterial implements ArmorMaterial {

    private static WitherArmorMaterial INSTANCE = null;

    public static WitherArmorMaterial getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WitherArmorMaterial();
        }
        return INSTANCE;
    }

    private static final int[] DURABILITY = new int[] {ConfigInit.CONFIG.ARMOR.wither_armor_durability_boots, ConfigInit.CONFIG.ARMOR.wither_armor_durability_leggings, ConfigInit.CONFIG.ARMOR.wither_armor_durability_chest, ConfigInit.CONFIG.ARMOR.wither_armor_durability_helmet};
    private static final int[] PROTECTION = new int[] {ConfigInit.CONFIG.ARMOR.wither_armor_protection_boots, ConfigInit.CONFIG.ARMOR.wither_armor_protection_leggings, ConfigInit.CONFIG.ARMOR.wither_armor_protection_chest, ConfigInit.CONFIG.ARMOR.wither_armor_protection_helmet};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return ConfigInit.CONFIG.ARMOR.wither_armor_enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.WITHER_INGOT_ITEM);
    }

    @Override
    public String getName() {
        return "wither";
    }

    @Override
    public float getToughness() {
        return ConfigInit.CONFIG.ARMOR.wither_armor_toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return ConfigInit.CONFIG.ARMOR.wither_armor_knockback_resistance;
    }
}

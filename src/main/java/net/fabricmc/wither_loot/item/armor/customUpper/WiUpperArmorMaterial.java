package net.fabricmc.wither_loot.item.armor.customUpper;

import net.fabricmc.wither_loot.init.ConfigInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class WiUpperArmorMaterial implements ArmorMaterial {

    private static WiUpperArmorMaterial INSTANCE = null;

    public static WiUpperArmorMaterial getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WiUpperArmorMaterial();
        }
        return INSTANCE;
    }

    private static final int[] DURABILITY = new int[] {ConfigInit.CONFIG.ARMOR.wither_armor_durability_boots, ConfigInit.CONFIG.ARMOR.wither_armor_durability_leggings, ConfigInit.CONFIG.ARMOR.wither_armor_durability_chest, ConfigInit.CONFIG.ARMOR.wither_armor_durability_helmet};
    private static final int[] PROTECTION = new int[] {ConfigInit.CONFIG.ARMOR.wither_armor_protection_boots, ConfigInit.CONFIG.ARMOR.wither_armor_protection_leggings, ConfigInit.CONFIG.ARMOR.wither_armor_protection_chest, ConfigInit.CONFIG.ARMOR.wither_armor_protection_helmet};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}

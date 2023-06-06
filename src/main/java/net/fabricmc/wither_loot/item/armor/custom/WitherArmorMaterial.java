package net.fabricmc.wither_loot.item.armor.custom;

import net.fabricmc.wither_loot.init.ConfigInit;
import net.fabricmc.wither_loot.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public enum WitherArmorMaterial implements ArmorMaterial {
    WITHER_UNCHARGED("wither_uncharged", ConfigInit.CONFIG.ARMOR.wither_armor_durability_multiplier, new int[] { ConfigInit.CONFIG.ARMOR.wither_armor_protection_boots, ConfigInit.CONFIG.ARMOR.wither_armor_protection_leggings, ConfigInit.CONFIG.ARMOR.wither_armor_protection_chest, ConfigInit.CONFIG.ARMOR.wither_armor_protection_helmet }, ConfigInit.CONFIG.ARMOR.wither_armor_enchantability, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            ConfigInit.CONFIG.ARMOR.wither_armor_toughness, ConfigInit.CONFIG.ARMOR.wither_armor_knockback_resistance, ItemInit.WITHER_INGOT_ITEM),
    WITHER_CHARGED("wither_charged", ConfigInit.CONFIG.ARMOR.wither_armor_durability_multiplier, new int[] { ConfigInit.CONFIG.ARMOR.wither_armor_protection_boots, ConfigInit.CONFIG.ARMOR.wither_armor_protection_leggings, ConfigInit.CONFIG.ARMOR.wither_charged_armor_protection_chest, ConfigInit.CONFIG.ARMOR.wither_armor_protection_helmet }, ConfigInit.CONFIG.ARMOR.wither_armor_enchantability, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            ConfigInit.CONFIG.ARMOR.wither_charged_armor_toughness, ConfigInit.CONFIG.ARMOR.wither_armor_knockback_resistance, ItemInit.WITHER_INGOT_ITEM);

    private static final int[] DURABILITY = new int[]{14, 16, 18, 13};
    private final String armorName;
    private final int armorDurabilityMultiplier;
    private final int[] armorProtectionAmount;
    private final int armorEnchantability;
    private final SoundEvent equipSound;
    private final float armorToughness;
    private final float armorKnockbackResistance;
    private final Item repairIngredient;

    WitherArmorMaterial(String armorName, int armorDurabilityMultiplier, int[] armorProtectionAmount, int armorEnchantability, SoundEvent equipSound, float armorToughness, float armorKnockbackResistance, Item repairIngredient) {
        this.armorName = armorName;
        this.armorDurabilityMultiplier = armorDurabilityMultiplier;
        this.armorProtectionAmount = armorProtectionAmount;
        this.armorEnchantability = armorEnchantability;
        this.equipSound = equipSound;
        this.armorToughness = armorToughness;
        this.armorKnockbackResistance = armorKnockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()] * this.armorDurabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return armorProtectionAmount[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.armorEnchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
    }

    @Override
    public String getName() {
        return this.armorName;
    }

    @Override
    public float getToughness() {
        return this.armorToughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.armorKnockbackResistance;
    }
}

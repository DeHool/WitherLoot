package net.fabricmc.wither_loot.init;

import net.fabricmc.wither_loot.WitherMod;
import net.fabricmc.wither_loot.item.WitherDustItem;
import net.fabricmc.wither_loot.item.WitherIngotItem;
import net.fabricmc.wither_loot.item.WitherNuggetItem;
import net.fabricmc.wither_loot.item.WitherUnenrichedIngotItem;
import net.fabricmc.wither_loot.item.armor.custom.WitherArmorItem;
import net.fabricmc.wither_loot.item.armor.WitherArmorMaterial;
import net.fabricmc.wither_loot.item.tool.*;
import net.fabricmc.wither_loot.item.weapon.WitherBowItem;
import net.fabricmc.wither_loot.item.weapon.WitherSwordItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    // Items, etc
    public static final WitherDustItem WITHER_DUST_ITEM =
            new WitherDustItem(new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherNuggetItem WITHER_NUGGET_ITEM =
            new WitherNuggetItem(new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherIngotItem WITHER_INGOT_ITEM =
            new WitherIngotItem(new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherUnenrichedIngotItem WITHER_UNENRICHED_INGOT_ITEM =
            new WitherUnenrichedIngotItem(new Item.Settings().fireproof().group(WitherMod.WiGroup));

    // Armor
    public static final ArmorMaterial WITHER_ARMOR_MATERIAL = WitherArmorMaterial.getInstance();

    public static final Item WITHER_HELMET =
            new WitherArmorItem(WITHER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final Item WITHER_CHESTPLATE =
            new WitherArmorItem(WITHER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final Item WITHER_LEGGINGS =
            new WitherArmorItem(WITHER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final Item WITHER_BOOTS =
            new WitherArmorItem(WITHER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final Item WITHER_CHARGED_CHESTPLATE =
            new WitherArmorItem(WITHER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(WitherMod.WiGroup));

    // Tools
    public static final WitherPickaxeItem WITHER_PICKAXE_ITEM =
            new WitherPickaxeItem(WitherToolMaterial.getInstance(), 1, -2.8F,
                    new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherAxeItem WITHER_AXE_ITEM =
            new WitherAxeItem(WitherToolMaterial.getInstance(), 5, -3F, new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherHoeItem WITHER_HOE_ITEM =
            new WitherHoeItem(WitherToolMaterial.getInstance(), -4, -2F,
                    new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherShovelItem WITHER_SHOVEL_ITEM =
            new WitherShovelItem(WitherToolMaterial.getInstance(), 1.5F, -3F,
                    new Item.Settings().fireproof().group(WitherMod.WiGroup));

    // Weapons
    public static final WitherSwordItem WITHER_SWORD_ITEM =
            new WitherSwordItem(WitherToolMaterial.getInstance(), 3, -2.4F,
                    new Item.Settings().fireproof().group(WitherMod.WiGroup));
    public static final WitherBowItem WITHER_BOW_ITEM =
            new WitherBowItem(new Item.Settings().fireproof().group(WitherMod.WiGroup).maxDamage(WitherToolMaterial.getInstance().getDurability()));

    public static void itemInit(){
        // Items
        Registry.register(Registry.ITEM, WitherMod.ID("wither_dust"), WITHER_DUST_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_nugget"), WITHER_NUGGET_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_unenriched_ingot"), WITHER_UNENRICHED_INGOT_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_ingot"), WITHER_INGOT_ITEM);
        // Armor
        Registry.register(Registry.ITEM, WitherMod.ID("wither_helmet"), WITHER_HELMET);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_chestplate"), WITHER_CHESTPLATE);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_leggings"), WITHER_LEGGINGS);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_boots"), WITHER_BOOTS);
        Registry.register(Registry.ITEM, WitherMod.ID("charged_wither_chestplate"), WITHER_CHARGED_CHESTPLATE);
        // Tools
        Registry.register(Registry.ITEM, WitherMod.ID("wither_pickaxe"), WITHER_PICKAXE_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_shovel"), WITHER_SHOVEL_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_axe"), WITHER_AXE_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_hoe"), WITHER_HOE_ITEM);
        // Weapons
        Registry.register(Registry.ITEM, WitherMod.ID("wither_sword"), WITHER_SWORD_ITEM);
        Registry.register(Registry.ITEM, WitherMod.ID("wither_bow"), WITHER_BOW_ITEM);
    }
}

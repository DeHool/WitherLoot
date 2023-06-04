package net.fabricmc.wither_loot.item.tool;

import net.fabricmc.wither_loot.init.ConfigInit;
import net.fabricmc.wither_loot.init.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WitherToolMaterial implements ToolMaterial {

    private static WitherToolMaterial INSTANCE = null;

    public static WitherToolMaterial getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WitherToolMaterial();
        }
        return INSTANCE;
    }

    public int getDurability() {
        return ConfigInit.CONFIG.TOOL.wither_tool_durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return ConfigInit.CONFIG.TOOL.wither_tool_mining_speed;
    }

    @Override
    public float getAttackDamage() {
        return ConfigInit.CONFIG.TOOL.wither_tool_attack_damage;
    }

    @Override
    public int getMiningLevel() {
        return ConfigInit.CONFIG.TOOL.wither_tool_mining_level;
    }

    @Override
    public int getEnchantability() {
        return ConfigInit.CONFIG.TOOL.wither_tool_enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.WITHER_INGOT_ITEM);
    }
}

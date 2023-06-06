package net.fabricmc.wither_loot.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "witherloot")
@Config.Gui.Background("minecraft:textures/block/soul_sand.png")
public class WitherLootConfig implements ConfigData {

    @ConfigEntry.Category("armor")
    @ConfigEntry.Gui.TransitiveObject
    public Armor ARMOR = new Armor();

    public static class Armor {

        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_durability_multiplier = 50;
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_protection_helmet = 7;
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_protection_chest = 10;
        @ConfigEntry.Gui.RequiresRestart
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        public int wither_charged_armor_protection_chest = 15;
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_protection_leggings = 9;
        @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_protection_boots = 7;
        @ConfigEntry.Gui.RequiresRestart
        public float wither_armor_toughness = 3.0F;
        @ConfigEntry.Gui.RequiresRestart
        public float wither_charged_armor_toughness = 5.0F;
        @ConfigEntry.Gui.RequiresRestart
        public float wither_armor_knockback_resistance = 0.1F;
        @ConfigEntry.Gui.RequiresRestart
        public int wither_armor_enchantability = 15;
    }

    @ConfigEntry.Category("tool")
    @ConfigEntry.Gui.TransitiveObject
    public Tool TOOL = new Tool();

    public static class Tool {
        @ConfigEntry.Gui.RequiresRestart
        public int wither_tool_durability = 2560;
        @ConfigEntry.Gui.RequiresRestart
        public float wither_tool_mining_speed = 13;
        @ConfigEntry.Gui.RequiresRestart
        public int wither_tool_mining_level = 5;
        @ConfigEntry.Gui.RequiresRestart
        public float wither_tool_attack_damage = 7.0F;
        @ConfigEntry.Gui.RequiresRestart
        public int wither_tool_enchantability = 20;
    }
}

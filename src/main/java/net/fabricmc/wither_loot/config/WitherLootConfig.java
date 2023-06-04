package net.fabricmc.wither_loot.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "witherloot")
@Config.Gui.Background("minecraft:textures/block/soul_sand.png")
public class WitherLootConfig implements ConfigData {

    @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
    @ConfigEntry.Gui.RequiresRestart
    public int wither_uncharged_armor_protection_helmet = 7;
    @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
    @ConfigEntry.Gui.RequiresRestart
    public int wither_uncharged_armor_protection_chest = 10;
    @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
    @ConfigEntry.Gui.RequiresRestart
    public int wither_uncharged_armor_protection_leggings = 9;
    @ConfigEntry.BoundedDiscrete(min = 0, max = 20)
    @ConfigEntry.Gui.RequiresRestart
    public int wither_uncharged_armor_protection_boots = 7;
    @ConfigEntry.Gui.RequiresRestart
    public float wither_uncharged_armor_toughness = 3.0F;
    @ConfigEntry.Gui.RequiresRestart
    public float wither_uncharged_armor_knockback_resistance = 1.0F;
    @ConfigEntry.Gui.RequiresRestart
    public int wither_uncharged_armor_enchantability = 15;

}

package net.fabricmc.wither_loot.util;

import net.fabricmc.wither_loot.WitherMod;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class WitherToolTip {

    public static final MutableText INFLICTS_WITHER_EFFECT = witherToolTip("inflicts_wither_effect", Formatting.DARK_GRAY);
    public static final MutableText WITHER_ARMOR_SET_BONUS = witherToolTip("wither_armor_set_bonus", Formatting.DARK_GRAY);

    private static MutableText witherToolTip(String witherToolTip, Formatting witherToolTipFormat){
        return Text.translatable("tooltip." + WitherMod.MOD_ID + "." + witherToolTip).formatted(witherToolTipFormat);
    }
}

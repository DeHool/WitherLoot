package net.fabricmc.wither_loot.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WitherChargedStarItem extends Item {

    public WitherChargedStarItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

package net.fabricmc.wither_loot.init;

import net.fabricmc.wither_loot.WitherMod;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagInit {

    public static final TagKey<Item> EXPLOSION_RESIST_ITEM = TagKey.of(Registry.ITEM_KEY, new Identifier(WitherMod.MOD_ID, "explosion_resistant_items"));

    public static void tagInit(){

    }

}

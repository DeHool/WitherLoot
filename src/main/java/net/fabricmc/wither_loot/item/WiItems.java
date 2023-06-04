package net.fabricmc.wither_loot.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.wither_loot.WitherMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class WiItems {

    public static final Item WITHER_DUST =
            registerItem("wither_dust",
                    new Item(new FabricItemSettings().group(WitherMod.WiGroup)));
    public static final Item WITHER_NUGGET =
            registerItem("wither_nugget",
                    new Item(new FabricItemSettings().group(WitherMod.WiGroup)));
    public static final Item WITHER_UNENRICHED_INGOT =
            registerItem("wither_unenriched_ingot",
                    new Item(new FabricItemSettings().group(WitherMod.WiGroup)));
    public static final Item WITHER_INGOT =
            registerItem("wither_ingot",
                    new Item(new FabricItemSettings().group(WitherMod.WiGroup)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(WitherMod.MOD_ID, name), item);
    }

    public static void registerWiItems() {
    }
}
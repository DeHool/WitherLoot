package net.fabricmc.wither.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.wither.WitherMod;
import net.fabricmc.wither.group.WiGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class WiItems {

    public static final Item WITHER_DUST =
            registerItem("wither_dust",
                    new Item(new FabricItemSettings().group(WiGroup.WITHER)));
    public static final Item WITHER_NUGGET =
            registerItem("wither_nugget",
                    new Item(new FabricItemSettings().group(WiGroup.WITHER)));
    public static final Item WITHER_LOX_INGOT =
            registerItem("wither_unenriched_ingot",
                    new Item(new FabricItemSettings().group(WiGroup.WITHER)));
    public static final Item WITHER_INGOT =
            registerItem("wither_ingot",
                    new Item(new FabricItemSettings().group(WiGroup.WITHER)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(WitherMod.MOD_ID, name), item);
    }

    public static void registerWiItems() {
    }
}
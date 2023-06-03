package net.fabricmc.wither.group;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.wither.WitherMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class WiGroup {
    public static final ItemGroup WITHER = FabricItemGroupBuilder.build(
            new Identifier(WitherMod.MOD_ID, "wither"), () -> new ItemStack(Items.WITHER_ROSE));

    public static void registerGroup(){
    }
}

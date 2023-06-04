package net.fabricmc.wither_loot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.wither_loot.init.ConfigInit;
import net.fabricmc.wither_loot.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class WitherMod implements ModInitializer {

	public static final String MOD_ID = "wither_loot";

	public static Identifier ID(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static final ItemGroup WiGroup = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "witherloot_group"),
			() -> new ItemStack(Items.WITHER_ROSE));

	@Override
	public void onInitialize() {
		ConfigInit.init();
		ItemInit.itemInit();
	}
}

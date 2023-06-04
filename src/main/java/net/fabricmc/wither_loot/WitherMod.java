package net.fabricmc.wither_loot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.wither_loot.item.WiItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitherMod implements ModInitializer {

	public static final String MOD_ID = "wither_loot";
	public static final Logger LOGGER = LoggerFactory.getLogger("wither_loot");

	public static final ItemGroup WiGroup = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "witherloot_group"),
			() -> new ItemStack(Items.WITHER_ROSE));

	@Override
	public void onInitialize() {
		WiItems.registerWiItems();
	}
}

package net.fabricmc.wither_loot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.wither_loot.effect.WUEffect;
import net.fabricmc.wither_loot.init.ConfigInit;
import net.fabricmc.wither_loot.init.ItemInit;
import net.fabricmc.wither_loot.init.TagInit;
import net.fabricmc.wither_loot.item.armor.custom.WitherArmorRender;
import net.fabricmc.wither_loot.item.armor.customUpper.WiUpperRender;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

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
		TagInit.tagInit();
		ConfigInit.init();
		ItemInit.itemInit();
		GeoArmorRenderer.registerArmorRenderer(new WitherArmorRender(),
				ItemInit.WITHER_BOOTS, ItemInit.WITHER_LEGGINGS, ItemInit.WITHER_CHESTPLATE, ItemInit.WITHER_HELMET);
		GeoArmorRenderer.registerArmorRenderer(new WiUpperRender(),
				ItemInit.WITHER_UPPER_CHEST);
		WUEffect.registerEffect();
	}




}

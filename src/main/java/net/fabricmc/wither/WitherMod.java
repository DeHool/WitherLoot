package net.fabricmc.wither;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.wither.item.WiItems;
import net.fabricmc.wither.group.WiGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitherMod implements ModInitializer {

	public static final String MOD_ID = "wither";
	public static final Logger LOGGER = LoggerFactory.getLogger("wither");

	@Override
	public void onInitialize() {
		WiItems.registerWiItems();
		WiGroup.registerGroup();
	}
}

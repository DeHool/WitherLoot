package net.fabricmc.wither_loot;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.wither_loot.init.ModelProviderInit;

public class WitherModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelProviderInit.init();
    }
}

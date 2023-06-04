package net.fabricmc.wither_loot.init;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.wither_loot.config.WitherLootConfig;

public class ConfigInit {
    public static WitherLootConfig CONFIG = new WitherLootConfig();

    public static void init (){
        AutoConfig.register(WitherLootConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(WitherLootConfig.class).getConfig();
    }
}

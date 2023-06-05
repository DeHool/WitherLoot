package net.fabricmc.wither_loot.item.armor.customUpper;

import net.fabricmc.wither_loot.WitherMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WiUpperModel extends AnimatedGeoModel<WiUpperItem> {

    private static final Identifier modelResource = new Identifier(WitherMod.MOD_ID, "geo/wither_upper.geo.json");
    private static final Identifier textureRecource = new Identifier(WitherMod.MOD_ID, "textures/item/wither_upper.png");
    private static final Identifier animationRecource = new Identifier(WitherMod.MOD_ID, "animations/wither_upper.animation.json");


    @Override
    public Identifier getModelResource(WiUpperItem object) {
        return modelResource;
    }

    @Override
    public Identifier getTextureResource(WiUpperItem object) {
        return textureRecource;
    }

    @Override
    public Identifier getAnimationResource(WiUpperItem animatable) {
        return animationRecource;
    }
}

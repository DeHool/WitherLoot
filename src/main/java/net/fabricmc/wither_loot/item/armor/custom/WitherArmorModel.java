package net.fabricmc.wither_loot.item.armor.custom;

import net.fabricmc.wither_loot.WitherMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WitherArmorModel extends AnimatedGeoModel<WitherArmorItem> {
    private static final Identifier modelResource = new Identifier(WitherMod.MOD_ID, "geo/wither_armor.geo.json");
    private static final Identifier textureResource = new Identifier(WitherMod.MOD_ID, "textures/item/wither_armor.png");
    private static final Identifier animationResource = new Identifier(WitherMod.MOD_ID, "animations/animation.wither_model.json");


    @Override
    public Identifier getModelResource(WitherArmorItem object) {
        return modelResource;
    }

    @Override
    public Identifier getTextureResource(WitherArmorItem object) {
        return textureResource;
    }

    @Override
    public Identifier getAnimationResource(WitherArmorItem animatable) {
        return animationResource;
    }
}

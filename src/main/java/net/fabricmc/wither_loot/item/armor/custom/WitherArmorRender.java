package net.fabricmc.wither_loot.item.armor.custom;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WitherArmorRender extends GeoArmorRenderer<WitherArmorItem> {
    public WitherArmorRender(){
        super(new WitherArmorModel());
    }
}

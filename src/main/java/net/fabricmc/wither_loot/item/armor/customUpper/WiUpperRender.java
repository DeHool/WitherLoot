package net.fabricmc.wither_loot.item.armor.customUpper;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WiUpperRender extends GeoArmorRenderer<WiUpperItem> {
    public WiUpperRender() {
        super(new WiUpperModel());
    }
}

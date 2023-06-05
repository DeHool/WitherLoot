package net.fabricmc.wither_loot.mixin;

import net.fabricmc.wither_loot.init.TagInit;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public class WitherItemMixin {

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void itemDamageMixin(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir){
        if ((Object)this instanceof ItemEntity){
            if (((ItemEntity) (Object) this).getStack().isIn(TagInit.EXPLOSION_RESIST_ITEM) && source.isExplosive()){
                cir.setReturnValue(false);
            }
        }
    }
}

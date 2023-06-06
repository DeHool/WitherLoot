package net.fabricmc.wither_loot.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class WitherMixin extends Entity {

    public WitherMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    private LivingEntity get(){
        return (LivingEntity) (Object) this;
    }

    @Shadow
    public abstract double getAttributeValue(EntityAttribute attribute);
    @Inject(method = "getMaxHealth", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getAttributeValue(Lnet/minecraft/entity/attribute/EntityAttribute;)D"), cancellable = true)
    public void getMaxHeathMixin(CallbackInfoReturnable<Float> cir) {
        if (get().getType().equals(EntityType.WITHER)) {
            cir.setReturnValue((float) (getAttributeValue(EntityAttributes.GENERIC_MAX_HEALTH) + 500F));
        }
    }
}


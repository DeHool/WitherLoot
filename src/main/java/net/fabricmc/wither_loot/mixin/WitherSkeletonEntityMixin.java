package net.fabricmc.wither_loot.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WitherSkeletonEntity.class)
public abstract class WitherSkeletonEntityMixin extends AbstractSkeletonEntity {


    protected WitherSkeletonEntityMixin(EntityType<? extends AbstractSkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tryAttack", at = @At("HEAD"), cancellable = true)
    private void pacifyWitherSkeleton(Entity target, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(false);
    }
}
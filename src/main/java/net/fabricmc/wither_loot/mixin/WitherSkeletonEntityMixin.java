package net.fabricmc.wither_loot.mixin;

import net.fabricmc.wither_loot.item.armor.custom.WitherArmorItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

    @Inject(method = "tryAttack", at = @At("HEAD"))
    public void pacifyWitherSkeletons(Entity target, CallbackInfoReturnable<Boolean> cir) {
        WitherSkeletonEntity witherSkeleton = (WitherSkeletonEntity) (Object) this;
        if (target == null)
            return;

        if (target instanceof PlayerEntity) {
            if (witherSkeleton.getAttacker() == target)
                return;

            for (ItemStack stack : target.getArmorItems()) {
                Item item = stack.getItem();
                if (item instanceof WitherArmorItem) {
                    witherSkeleton.setTarget(null);

                }
            }
        }
    }
}

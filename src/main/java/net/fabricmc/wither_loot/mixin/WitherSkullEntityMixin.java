package net.fabricmc.wither_loot.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ExplosiveProjectileEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkullEntity.class)
public class WitherSkullEntityMixin extends ExplosiveProjectileEntity {

    private final net.minecraft.entity.projectile.WitherSkullEntity WitherSkullEntity;

    protected WitherSkullEntityMixin(EntityType<? extends ExplosiveProjectileEntity> entityType, World world, net.minecraft.entity.projectile.WitherSkullEntity witherSkullEntity) {
        super(entityType, world);
        WitherSkullEntity = witherSkullEntity;
    }

    @Inject(method = "onCollision", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;createExplosion(Lnet/minecraft/entity/Entity;DDDFZLnet/minecraft/world/explosion/Explosion$DestructionType;)Lnet/minecraft/world/explosion/Explosion;"))
    public void explosionStrengthIncrease(HitResult hitResult, CallbackInfo ci){
        Explosion.DestructionType destructionType = this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING) ? Explosion.DestructionType.DESTROY : Explosion.DestructionType.NONE;
        this.world.createExplosion(this, this.getX(), this.getY(), this.getZ(), 2.0f, true, destructionType);
        this.discard();
    }

    @Inject(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    public void hitDamageIncrease(EntityHitResult entityHitResult, CallbackInfo ci) {
        boolean bl;
        super.onEntityHit(entityHitResult);
        if (this.world.isClient) {
            return;
        }
        Entity entity = entityHitResult.getEntity();
        Entity entity2 = this.getOwner();
        if (entity2 instanceof LivingEntity livingEntity) {
            bl = entity.damage(DamageSource.witherSkull(WitherSkullEntity, livingEntity), 12.0f);
            if (bl) {
                if (entity.isAlive()) {
                    this.applyDamageEffects(livingEntity, entity);
                } else {
                    livingEntity.heal(2.5f);
                }
            }
        }
    }
}

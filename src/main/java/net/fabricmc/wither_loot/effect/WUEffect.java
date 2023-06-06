package net.fabricmc.wither_loot.effect;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class WUEffect extends StatusEffect {

    public WUEffect(){
        super(StatusEffectCategory.BENEFICIAL, 0x98D984);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier){
        if (entity instanceof PlayerEntity){
            entity.getMaxHealth();
        }
    }
    public static void registerEffect(){
        StatusEffect WITHER_EFFECT = new WUEffect();
    }
}

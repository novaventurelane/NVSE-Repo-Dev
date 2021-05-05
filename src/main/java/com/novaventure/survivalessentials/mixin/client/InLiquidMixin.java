package com.novaventure.survivalessentials.mixin.client;

import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.tag.Tag;
import net.minecraft.util.Nameable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class InLiquidMixin implements Nameable, CommandOutput {
    @Shadow protected Object2DoubleMap<Tag<Fluid>> fluidHeight;
    public Object RottingFluid;

    @Shadow public abstract Entity getVehicle();
    @Shadow protected boolean firstUpdate;
    @Shadow public abstract boolean damage(DamageSource source, float amount);

    /**
     * Checks if the player is in your Liquid.
     */
    private boolean isInLiquid() {
        // This if statement is removable if you want to damage the entity if they're in a boat.
        if (this.getVehicle() instanceof BoatEntity) {
            return false;
        } else {
            return !this.firstUpdate && this.fluidHeight.getDouble(RottingFluid) > 0.0D;
        }
    }

    /**
     * Damages the player.
     */
    private void damageInLiquid() {
        this.damage(DamageSource.WITHER, 4.0F);
    }

    /**
     * Checks if the player is in your liquid each tick.
     */
    @Inject(method = "baseTick", at = @At("HEAD"))
    private void baseTick(CallbackInfo ci) {
        if (isInLiquid()) {
            this.damageInLiquid();
        }
    }
}
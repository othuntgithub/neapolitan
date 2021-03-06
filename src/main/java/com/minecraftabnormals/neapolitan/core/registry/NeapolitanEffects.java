package com.minecraftabnormals.neapolitan.core.registry;

import com.minecraftabnormals.abnormals_core.common.potion.AbnormalsEffect;
import com.minecraftabnormals.neapolitan.common.potion.SlippingEffect;
import com.minecraftabnormals.neapolitan.common.potion.SugarRushEffect;
import com.minecraftabnormals.neapolitan.core.Neapolitan;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NeapolitanEffects {
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Neapolitan.MOD_ID);

    public static final RegistryObject<Effect> SUGAR_RUSH       = EFFECTS.register("sugar_rush", () -> new SugarRushEffect().addAttributesModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", (double) 0F, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<Effect> VANILLA_SCENT    = EFFECTS.register("vanilla_scent", () -> new AbnormalsEffect(EffectType.BENEFICIAL, 15913066));
    public static final RegistryObject<Effect> AGILITY			= EFFECTS.register("agility", () -> new AbnormalsEffect(EffectType.NEUTRAL, 0xA06951));
    public static final RegistryObject<Effect> SLIPPING			= EFFECTS.register("slipping", SlippingEffect::new);
}

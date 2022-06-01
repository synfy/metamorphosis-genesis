package net.metamorphosis.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

import net.metamorphosis.command.RerollCommand;
import net.metamorphosis.common.registry.*;

public class Metamorphosis implements ModInitializer{
    public static final String MOD_ID = "metamorphosis";

    @Override
    public void onInitialize() {
        ModScaleTypes.init();
        ModPowers.init();
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            RerollCommand.register(dispatcher);
        });
        
    }

}
package com.els.katana_mod;

import com.els.katana_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Entrypoint implements ModInitializer{

    public static final String MOD_ID = "katana_mod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
package com.elsyt.katana_mod;

import com.elsyt.katana_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Entrypoint implements ModInitializer{

    public static final String MOD_ID = "katana_mod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
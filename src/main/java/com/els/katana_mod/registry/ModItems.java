package com.elsyt.katana_mod.registry;


import com.elsyt.katana_mod.Entrypoint;
import com.elsyt.katana_mod.Katana;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final ToolItem KATANA = new SwordItem(Katana.INSTANCE, -1, -2.4F, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Entrypoint.MOD_ID, "katana"), KATANA);
    }
}

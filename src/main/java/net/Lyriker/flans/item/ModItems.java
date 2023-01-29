package net.Lyriker.flans.item;

import net.Lyriker.flans.Flans_Reloaded;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Flans_Reloaded.MOD_ID);

    public static final RegistryObject<Item>   Clay_Sand_mixture = ITEMS.register("clay_sand_mixture",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.flans_tab)));
    public static final RegistryObject<Item>  Fiberglass = ITEMS.register("fiberglass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.flans_tab)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

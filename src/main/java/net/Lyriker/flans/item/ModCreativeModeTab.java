package net.Lyriker.flans.item;

import net.Lyriker.flans.Flans_Reloaded;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab
{
    public static final CreativeModeTab flans_tab = new CreativeModeTab("flanstab")
    {
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.Clay_Sand_mixture.get());
        }
    };
}

package net.semmur.archery.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.semmur.archery.ArcheryRpgExpansionMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryRpgExpansionMod.MOD_ID);

    public static final DeferredItem<Item> EXP_SHARD = ITEMS.register("exp_shard",
            ()-> new Item(new  Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package chaotic.corigins.item;

import chaotic.corigins.COrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MOON_ICON = registerItem("moon_icon",
            new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(COrigins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        COrigins.LOGGER.debug("Registering Mod Items for" + COrigins.MOD_ID);
    }
}

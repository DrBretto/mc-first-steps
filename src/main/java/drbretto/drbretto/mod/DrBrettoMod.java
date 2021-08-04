package drbretto.drbretto.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DrBrettoMod implements ModInitializer {
	
	public static final Item FIRST_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("drbretto", "first_item"), FIRST_ITEM);

	}
}
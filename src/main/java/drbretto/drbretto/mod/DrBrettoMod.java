package drbretto.drbretto.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DrBrettoMod implements ModInitializer {
	
	public static final Item FIRST_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DRIED_MUD_BALL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MudFoodComponents.DRIED_MUD_BALL));

	public static final Block MUD_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.HONEY).breakByTool(FabricToolTags.SHOVELS));

	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("drbretto", "first_item"), FIRST_ITEM);
	Registry.register(Registry.BLOCK, new Identifier("drbretto", "mud_block"), MUD_BLOCK);
	Registry.register(Registry.ITEM, new Identifier("drbretto", "mud_block"), new BlockItem(MUD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	Registry.register(Registry.ITEM, new Identifier("drbretto", "dried_mud_ball"), DRIED_MUD_BALL);


	}
}

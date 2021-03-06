package choonster.testmod3.init;

import choonster.testmod3.TestMod3;
import choonster.testmod3.datafix.BlockFlatteningDefinitions;
import choonster.testmod3.datafix.ItemFlatteningDefinitions;
import net.minecraft.util.datafix.FixTypes;
import net.minecraftforge.common.util.ModFixs;
import net.minecraftforge.fml.common.FMLCommonHandler;

/**
 * Registers this mod's data fixers.
 *
 * @author Choonster
 */
public class ModDataFixers {
	/**
	 * The current data version.
	 */
	private static final int DATA_VERSION = 103;

	/**
	 * Register this mod's data fixers.
	 */
	public static void registerDataFixers() {
		final ModFixs modFixs = FMLCommonHandler.instance().getDataFixer().init(TestMod3.MODID, DATA_VERSION);

		modFixs.registerFix(FixTypes.CHUNK, BlockFlatteningDefinitions.createBlockFlattening());
		modFixs.registerFix(FixTypes.ITEM_INSTANCE, ItemFlatteningDefinitions.createItemFlattening());
	}
}

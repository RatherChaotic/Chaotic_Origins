package chaotic.corigins;

import chaotic.corigins.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class COrigins implements ModInitializer {

	public static final String MOD_ID = "corigins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final DefaultParticleType LUNAR_PARTICLE = FabricParticleTypes.simple();
	public static final DefaultParticleType LUNAR_PARTICLE2 = FabricParticleTypes.simple();
	public static final DefaultParticleType LUNAR_PARTICLE3 = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {
		ModItems.registerModItems();


		Registry.register(Registry.PARTICLE_TYPE, new Identifier("corigins","lunar_particle"), LUNAR_PARTICLE);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier("corigins","lunar_particle2"), LUNAR_PARTICLE2);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier("corigins","lunar_particle3"), LUNAR_PARTICLE3);

	}
}

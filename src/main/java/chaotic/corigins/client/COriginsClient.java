package chaotic.corigins.client;

import chaotic.corigins.COrigins;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class COriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("corigins", "particle/lunar_particle"));
        }));
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("corigins", "particle/lunar_particle2"));
        }));
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("corigins", "particle/lunar_particle3"));
        }));
        ParticleFactoryRegistry.getInstance().register(COrigins.LUNAR_PARTICLE, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(COrigins.LUNAR_PARTICLE2, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(COrigins.LUNAR_PARTICLE3, FlameParticle.Factory::new);
    }
}

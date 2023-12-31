package dev.keii.keiicore.events;

import dev.keii.keiicore.KeiiCore;
import dev.keii.keiicore.PlayerChunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplode implements Listener {
    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event)
    {
        if(!KeiiCore.config.Claims)
        {
            return;
        }

        event.blockList().removeIf(b -> !PlayerChunk.getExplosionPolicy(b.getChunk()));
    }
}

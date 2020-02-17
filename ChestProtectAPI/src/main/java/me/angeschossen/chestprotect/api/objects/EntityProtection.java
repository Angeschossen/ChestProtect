package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.Nullable;

public interface EntityProtection extends Protection {

    ChunkCoordinate getChunkCoordinate();

    @Nullable
    Location getLocation();

    EntityType getType();
}

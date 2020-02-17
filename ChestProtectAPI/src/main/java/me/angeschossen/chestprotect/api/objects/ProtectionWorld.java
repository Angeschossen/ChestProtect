package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.UUID;

public interface ProtectionWorld {


    EntityProtection getEntity(UUID uuid);

    boolean hasEntity(UUID uuid);

    EntityProtection getEntity(Location location);

    /**
     * Get name of world
     * @return
     */
    String getName();

    /**
     * Get world
     * @return World
     */
    World getWorld();

    /**
     * Get an chunk with protections in it
     * @param chunkX X identifier of chunk
     * @param chunkZ Z identifier of chunk
     * @return Chunk with protections in it or null if not loaded or not exist
     */
    ProtectionChunk getProtectionChunk(int chunkX, int chunkZ);

    /**
     * Get protection
     * @param location Location
     * @return BlockProtection
     */
    BlockProtection getProtection(Location location);

    /**
     * Get protection
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return BlockProtection
     */
    BlockProtection getProtection(int x, int y, int z);

    void save(boolean unload);
}

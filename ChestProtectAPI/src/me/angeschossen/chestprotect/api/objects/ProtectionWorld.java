package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Collection;

public interface ProtectionWorld {


    /**
     * Get name of world
     * @return
     */
    String getName();

    /**
     * Unload all protections in an chunk
     * @param x Chunk x identifier
     * @param z Chunk z identifier
     */
    void unloadProtectionChunk(int x, int z);

    /**
     * Unload an protection
     * @param location Location
     */
    void unloadProtection(Location location);

    /**
     * Load all protections in an chunk
     * @param protectionChunk ProtectionChunk
     */
    void loadProtectionChunk(ProtectionChunk protectionChunk);

    /**
     * Load protection
     * @param protection Protection to load
     */
    void loadProtection(Protection protection);

    /**
     * Add an protection
     * @param location Protection
     * @param ownerUUID UUID of owner
     */
    void addProtection(Location location, String ownerUUID);

    /**
     * Get world
     * @return World
     */
    World getWorld();

    /**
     * Get all loaded chunks with protections in it
     * @return Loaded chunks with protections in it
     */
    Collection<ProtectionChunk> getProtectionChunks();

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
     * @return Protection
     */
    Protection getProtection(Location location);

    /**
     * Get protection
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return Protection
     */
    Protection getProtection(int x, int y, int z);
}

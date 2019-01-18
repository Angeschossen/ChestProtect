package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Collection;

public interface ProtectionWorld {


    String getName();

    void unloadProtectionChunk(int x, int z);

    void unloadProtection(Location location);

    void loadProtectionChunk(ProtectionChunk protectionChunk);

    void loadProtection(Protection protection, int chunkX, int chunkZ);

    void addProtection(Location location, String ownerUUID);

    void loadProtection(Location location, Protection protection);

    World getWorld();

    Collection<ProtectionChunk> getProtectionChunks();

    ProtectionChunk getProtectionChunk(int chunkX, int chunkZ);

    Protection getProtection(Location location);

    Protection getProtection(int x, int y, int z);
}

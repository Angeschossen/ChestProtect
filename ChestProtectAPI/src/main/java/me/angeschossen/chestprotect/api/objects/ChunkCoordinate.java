package me.angeschossen.chestprotect.api.objects;

import org.bukkit.World;

public interface ChunkCoordinate {
    String getWorldName();

    int getX();

    int getZ();

    World getWorld();

    boolean equals(String worldName, int x, int z);
}

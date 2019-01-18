package me.angeschossen.chestprotect.api.addons;

import me.angeschossen.chestprotect.api.objects.ProtectPlayer;
import me.angeschossen.chestprotect.api.objects.Protection;
import me.angeschossen.chestprotect.api.objects.ProtectionChunk;
import me.angeschossen.chestprotect.api.objects.ProtectionWorld;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;


public interface ChestProtectAddons {


    /**
     * Get cached landPlayer
     *
     * @param UUID UUID string of player
     * @return LandPlayer or null, if not cached
     */
    ProtectPlayer getProtectPlayer(String UUID);

    /**
     * Get landPlayer. Even he's offline
     *
     * @param UUID UUID string of player
     * @return LandPlayer
     * @since 2.5.7
     */
    ProtectPlayer getProtectPlayerHard(String UUID);

    /**
     * Get cached landChunk
     *
     * @param chunk Chunk
     * @return LandChunk or null, if not cached
     * @since 2.5.7
     */
    ProtectionChunk getProtectionChunk(Chunk chunk);

    /**
     * Get landChunk. Even it's not cached.
     *
     * @param worldName Name of world.
     * @param chunkX    X identifier
     * @param chunkZ    Z identifier
     * @return LandChunk or null, if not data exists on harddrive.
     */
    ProtectionChunk getProtectionChunkHard(String worldName, int chunkX, int chunkZ);

    /**
     * Get land.
     *
     * @param location Location of protection
     * @return Protection or null, if not loaded
     */
    Protection getProtection(Location location);

    /**
     * Get land.
     *
     * @param worldName Name of world, where land is located
     * @param x X block
     * @param y Y block
     * @param z Z block
     * @return Protection or null, if not exists.
     */
    Protection getProtectionHard(String worldName, int x, int y, int z);

    /**
     * Get landWorld.
     *
     * @param worldName Name of world.
     * @return LandWorld or null, if it's not an landWorld.
     */
    ProtectionWorld getProtectionWorld(String worldName);

    /**
     * Get's plugin wich hooks ChestProtect.
     *
     * @return Plugin
     */
    Plugin getPlugin();

    /**
     * Disables the APIHook
     */
    void disable(String hookKey);

    /**
     * Initialize hook
     *
     * @return Hook key, wich you should store
     * somewhere
     */
    String initialize();

    /**
     * Check if hook is enabled.
     *
     * @return Status
     */
    boolean isEnabled();

    /**
     * Checks if you can access the hook
     * with your key.
     *
     * @param hookKey Key of hook
     * @return Access status
     */
    boolean getAccess(String hookKey);

    /**
     * If public is true, other developers can access
     * your LandsAPIHook.
     *
     * @return
     */
    boolean isPublic();
}

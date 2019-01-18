package me.angeschossen.chestprotect.api.objects;


import java.util.Collection;

public interface ProtectionChunk {

    /**
     * Get protectionWorld of chunk
     *
     * @return ProtectionWorld
     */
    ProtectionWorld getProtectionWorld();

    /**
     * Get x identifier of chunk
     *
     * @return Identifier
     */
    int getX();

    /**
     * Get z identifier of chunk
     *
     * @return Identier
     */
    int getZ();

    /**
     * Get protection
     *
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     * @return Protection or null, if none found.
     */
    Protection getProtection(int x, int y, int z);

    /**
     * Load an protection to chunk
     *
     * @param protection Protection
     */
    void loadProtection(Protection protection);

    /**
     * Unload an protection from chunk
     *
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     */
    void unloadProtection(int x, int y, int z);

    /**
     * Get all protection in this chunk
     *
     * @return Protections in this chunk
     */
    Collection<Protection> getProtections();

    /**
     * Unload all protection in this chunk
     */
    void unload();

    /**
     * Load all protection in this chunk
     */
    void load();

    /**
     * Check if chunk has any protections in it
     *
     * @return Boolean
     */
    boolean isEmpty();

    /**
     * Save all protection in this chunk
     */
    void save();
}

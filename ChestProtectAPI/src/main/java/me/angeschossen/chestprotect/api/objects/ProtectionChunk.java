package me.angeschossen.chestprotect.api.objects;


public interface ProtectionChunk {

    void delete();

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
     * @return BlockProtection or null, if none found.
     */
    BlockProtection getProtection(int x, int y, int z);

    /**
     * Check if chunk has any protections in it
     *
     * @return Boolean
     */
    boolean isEmpty();
}

package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;


public interface ProtectPlayer {

    /**
     * Get player
     * @return Player
     */
    Player getPlayer();

    /**
     * Get UUID
     * @return UUID
     */
    String getPlayerUUID();

    /**
     * Get protections amount
     * @return Protections amount
     */
    int getSize();

    /**
     * Add protection
     * @param location Location
     * @param material Material
     */
    void addProtection(Location location, Material material);

    /**
     * Remove protection
     * @param location Location
     */
    void removeProtection(Location location);

    /**
     * Remove protection
     * @param worldName Name of world
     * @param x X block coordinate
     * @param y Y block coordinate
     * @param z Z block coordinate
     */
    void removeProtection(String worldName, int x, int y, int z);
}

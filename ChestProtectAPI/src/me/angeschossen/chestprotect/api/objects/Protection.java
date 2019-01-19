package me.angeschossen.chestprotect.api.objects;


import me.angeschossen.chestprotect.api.enums.ProtectAction;
import me.angeschossen.chestprotect.api.enums.ProtectRole;
import org.bukkit.Location;
import org.bukkit.Material;

import java.util.Collection;

public interface Protection {

    /**
     * Check that player can do action
     * @param playerUUID UUID of player
     * @param action Action
     * @return Boolean can action
     */
    boolean canAction(String playerUUID, ProtectAction action);

    /**
     * Get members of an role
     * @param protectRole Role
     * @return Collection with members of role
     */
    Collection<String> getRoleMembers(ProtectRole protectRole);

    /**
     * Get chunk the protection is in
     * @return ProtectionChunk
     */
    ProtectionChunk getProtectionChunk();

    /**
     * Get material of protection
     * @return Material
     */
    Material getType();

    /**
     * Get UUID of owner
     * @return UUID
     */
    String getOwnerUUID();

    /**
     * Get x coordinate
     * @return X coordinate
     */
    int getX();

    /**
     * Get y coordinate
     * @return Y coordinate
     */
    int getY();

    /**
     * Get z coordinate
     * @return Z coordinate
     */
    int getZ();

    /**
     * Get location of protection
     * @return Location
     */
    Location getLocation();

    /**
     * Trust an player
     * @param playerUUID UUID of player
     */
    void trustPlayer(String playerUUID);

    /**
     * Get role of player
     * @param playerUUID UUID of player
     * @return Role
     */
    ProtectRole getRole(String playerUUID);

    /**
     * Untrust player
     * @param playerUUID UUID of player
     */
    void untrustPlayer(String playerUUID);

    /**
     * Get all trusted players
     * @return All trusted players
     */
    Collection<String> getTrustedPlayers();

    /**
     * Set an role for player
     * @param memberUUID UUID of player
     * @param protectRole Role to set
     */
    void setRole(String memberUUID, ProtectRole protectRole);

    /**
     * Check is player trusted
     * @param playerUUID UUID of player
     * @return Boolean
     */
    boolean isTrusted(String playerUUID);

    /**
     * Load protection
     */
    void load();

    /**
     * Unload protection
     */
    void unload();
}

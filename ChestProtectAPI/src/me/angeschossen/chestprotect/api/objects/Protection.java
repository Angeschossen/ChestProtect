package me.angeschossen.chestprotect.api.objects;


import me.angeschossen.chestprotect.api.enums.ProtectAction;
import me.angeschossen.chestprotect.api.enums.ProtectRole;
import org.bukkit.Location;
import org.bukkit.Material;

import java.util.Collection;

public interface Protection {

    boolean canAction(String playerUUID, ProtectAction action);

    Collection<String> getRoleMembers(ProtectRole protectRole);

    ProtectionChunk getProtectionChunk();

    Material getType();

    String getOwnerUUID();

    int getX();

    int getY();

    int getZ();

    Location getLocation();

    void trustPlayer(String playerUUID);

    ProtectRole getRole(String playerUUID);

    void untrustPlayer(String playerUUID);

    Collection<String> getTrustedPlayers();

    void setRole(String memberUUID, ProtectRole protectRole);

    boolean isTrusted(String playerUUID);

    void load();

    void unload();
}

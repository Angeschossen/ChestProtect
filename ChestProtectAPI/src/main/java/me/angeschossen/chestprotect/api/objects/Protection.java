package me.angeschossen.chestprotect.api.objects;

import me.angeschossen.chestprotect.api.enums.ProtectAction;
import me.angeschossen.chestprotect.api.enums.ProtectRole;
import me.angeschossen.chestprotect.api.enums.Type;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;

public interface Protection {

    boolean canAction(UUID playerUUID, ProtectAction action);

    Collection<UUID> getRoleMembers(ProtectRole protectRole);

    int getX();

    int getY();

    int getZ();

    UUID getOwnerUUID();

    void trustPlayer(UUID playerUUID);

    ProtectRole getRole(UUID playerUUID);

    void untrustPlayer(UUID playerUUID);

    Collection<UUID> getTrustedPlayers();

    void setRole(UUID memberUUID, ProtectRole protectRole);

    boolean isTrusted(UUID playerUUID);

    Collection<String> getActiveSettings();

    boolean load(boolean initial);

    void unload();

    Type type();

    void delete(boolean save, Player player);

    void save(boolean force);

    boolean getSetting(String iD);

    boolean toggleSetting(String iD);
}

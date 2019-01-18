package me.angeschossen.chestprotect.api.addons;


import me.angeschossen.chestprotect.api.objects.ProtectPlayer;
import me.angeschossen.chestprotect.api.objects.Protection;
import me.angeschossen.chestprotect.api.objects.ProtectionChunk;
import me.angeschossen.chestprotect.api.objects.ProtectionWorld;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;


public class ChestProtectAddon implements ChestProtectAddons {


    public ChestProtectAddon(Plugin plugin, boolean isPublic) {
    }


    @Override
    public ProtectPlayer getProtectPlayer(String UUID) {
        return null;
    }

    @Override
    public ProtectPlayer getProtectPlayerHard(String UUID) {
        return null;
    }

    @Override
    public ProtectionChunk getProtectionChunk(Chunk chunk) {
        return null;
    }

    @Override
    public ProtectionChunk getProtectionChunkHard(String worldName, int chunkX, int chunkZ) {
        return null;
    }

    @Override
    public Protection getProtection(Location location) {
        return null;
    }

    @Override
    public Protection getProtectionHard(String worldName, int x, int y, int z) {
        return null;
    }

    @Override
    public ProtectionWorld getProtectionWorld(String worldName) {
        return null;
    }

    @Override
    public Plugin getPlugin() {
        return null;
    }

    @Override
    public void disable(String hookKey) {
    }

    @Override
    public String initialize() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean getAccess(String hookKey) {
        return false;
    }

    @Override
    public boolean isPublic() {
        return false;
    }
}

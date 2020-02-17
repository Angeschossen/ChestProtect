package me.angeschossen.chestprotect.api.addons;


import org.bukkit.plugin.Plugin;

public class ChestProtectAddonExample {

    private final ChestProtectAddon chestProtectAddon;
    private final String key;

    private ChestProtectAddonExample(Plugin yourPlugin) {

        /*
        Initialize ChestProtectAddon
        Sets isPulic to false, if you want
        to prevent that other developers can
        access your addon.
         */
        chestProtectAddon = new ChestProtectAddon(yourPlugin, false);

        /*
        Initialize the addon.
        You need to key to disable your chestProtectAddon, if you ever want to.
         */
        key = chestProtectAddon.initialize();
    }

    /**
     * Check if an chunk is claimed.
     *
     * @param worldName Name of world
     * @param x X block
     * @param y Y block
     * @param z Z block
     * @return true, if claimed
     */
    public boolean isProtected(String worldName, int x, int y, int z) {
        return chestProtectAddon.getProtectionHard(worldName, x, y, z) != null;
    }

    /**
     * Disable your landsAddon.
     * For example, if plugin disables.
     */
    public void disableChestProtectAddon() {

        /*
        Disable chestProtectAddon if you want.
        You need the received key.
         */
        chestProtectAddon.disable(key);
    }
}

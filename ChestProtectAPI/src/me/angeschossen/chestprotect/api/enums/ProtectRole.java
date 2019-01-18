package me.angeschossen.chestprotect.api.enums;

import org.bukkit.ChatColor;

public enum ProtectRole {
    OWNER("owner", 4), ADMIN("admin", 3), MEMBER("member", 2), VISITOR("visitor", 1);

    private int weight;
    private String iD;
    private String alias;
    public String aliasNoColor;

    ProtectRole(String iD, int weight) {
        this.weight = weight;
        this.iD = iD;
    }

    public int getWeight() {
        return weight;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static ProtectRole getByAlias(String alias) {
        alias = ChatColor.stripColor(alias);
        for (ProtectRole protectRole : ProtectRole.values()) {
            if (ChatColor.stripColor(protectRole.getAlias()).equalsIgnoreCase(alias))
                return protectRole;
        }

        throw new IllegalArgumentException("No enum with alias '" + alias + "' found.");
    }

    public String getID() {
        return iD;
    }
}

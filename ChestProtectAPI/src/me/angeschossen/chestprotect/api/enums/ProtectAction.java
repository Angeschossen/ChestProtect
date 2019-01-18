package me.angeschossen.chestprotect.api.enums;


public enum ProtectAction {
    PLAYER_TRUST("player_trust"),
    PLAYER_UNTRUST("player_untrust");


    private String iD;

    ProtectAction(String iD) {
        this.iD = iD;
    }


    public static ProtectAction getByID(String iD) {
        for (ProtectAction action : values()) {
            if (action.iD.equals(iD))
                return action;
        }

        throw new IllegalArgumentException("No ProtectAction with iD '" + iD + "' found.");
    }

    @Override
    public String toString() {
        return iD;
    }
}

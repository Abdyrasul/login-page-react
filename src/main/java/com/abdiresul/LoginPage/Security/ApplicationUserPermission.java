package com.abdiresul.LoginPage.Security;

public enum ApplicationUserPermission {
    PERSONNEL_READ("personnel:read"),
    PERSONNEL_WRITE("personnel:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
    public String getPermission() {
        return permission;
    }

}

package com.example.educonnectoauth.model;

import com.example.educonnectoauth.security.config.NoUserScopeException;

import java.util.Arrays;

public enum Scopes {
    ADMIN("ROLE_ADMIN"), USER("ROLE_USER"), SUPERUSER("ROLE_SUPERUSER");

    private String scopeValue;

    private Scopes(String scopeValue) {
        this.scopeValue = scopeValue;
    }

    public String getScopeValue() {
        return this.scopeValue;
    }

    public Scopes findScope(String scopeValue) {
        return Arrays.stream(Scopes.values()).filter(s -> s.getScopeValue().equalsIgnoreCase(scopeValue)).findFirst().orElseThrow(() -> new NoUserScopeException("no scope found!"));
    }

}

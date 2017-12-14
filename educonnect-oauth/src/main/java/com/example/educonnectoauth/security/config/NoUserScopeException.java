package com.example.educonnectoauth.security.config;

public class NoUserScopeException extends RuntimeException {

    public NoUserScopeException(String msg, Throwable t) {
        super(msg, t);
    }

    public NoUserScopeException(String msg) {
        super(msg);
    }
}

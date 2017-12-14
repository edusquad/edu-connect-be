package com.example.educonnectoauth.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class UserScope implements GrantedAuthority {

    private Scopes scope;

    @Override
    public String getAuthority() {
        return this.scope.getScopeValue();
    }
}

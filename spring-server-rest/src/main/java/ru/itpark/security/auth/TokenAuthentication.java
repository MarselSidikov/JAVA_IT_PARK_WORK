package ru.itpark.security.auth;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import ru.itpark.security.details.UserDetailsServiceImpl;

public class TokenAuthentication extends AbstractAuthenticationToken {

    // информация о токене, который мы выдали пользователю
    private String token;

    public TokenAuthentication(String token) {
        super(UserDetailsServiceImpl.createGrantedAuthorities());
        this.token = token;
    }

    @Override
    public Object getCredentials() {
        return this.getAuthorities();
    }

    @Override
    public Object getPrincipal() {
        return token;
    }
}

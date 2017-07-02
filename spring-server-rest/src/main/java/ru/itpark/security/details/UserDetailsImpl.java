package ru.itpark.security.details;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

// прослойка между логикой всей системы и логикой безопасности
// объекты данного класса содержат информацию об аутентификационных
// данных конкретного пользователя
public class UserDetailsImpl implements UserDetails {
    private String login;
    private String hashPassword;
    private List<GrantedAuthority> authorities;

    public UserDetailsImpl(String login, String hashPassword, List<GrantedAuthority> authorities) {
        this.login = login;
        this.hashPassword = hashPassword;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return hashPassword;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

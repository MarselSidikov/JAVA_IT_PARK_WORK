package ru.itpark.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.itpark.security.auth.TokenAuthentication;

// занимается непосредственной
// аутентификацией
public class TokenAuthenticationProvider implements AuthenticationProvider{

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // получив данные об аутентификации, преобразуем их в токен-аутентификацию
        TokenAuthentication tokenAuthentication = (TokenAuthentication)authentication;
        // получаем непосредственно токен
        String token = (String)tokenAuthentication.getPrincipal();
        // загружаем данные по безопасности для этого токена
        UserDetails userDetails = userDetailsService.loadUserByUsername(token);
        if (userDetails == null) {
            throw new IllegalArgumentException("User not found");
        }

        tokenAuthentication.setDetails(userDetails);
        return authentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // проверка, пришла ли к нам на вход Токен-аутентификация
        return authentication.equals(TokenAuthentication.class);
    }
}

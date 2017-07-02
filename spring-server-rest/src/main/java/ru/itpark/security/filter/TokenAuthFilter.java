package ru.itpark.security.filter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.filter.GenericFilterBean;
import ru.itpark.security.auth.TokenAuthentication;

import javax.security.sasl.AuthenticationException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// фильтр как бин - компонент спринга
// принимает на себя все запросы
// и решает что с ними делать
public class TokenAuthFilter extends GenericFilterBean {

    private static final String AUTH_TOKEN = "Auth-Token";

    // соединяет все провайдеры аутентификации
    private AuthenticationManager manager;

    public TokenAuthFilter(AuthenticationManager manager) {
        this.manager = manager;
    }

    // FilterChain - цепочка фильтром
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // перехватили запрос и преобразовали его в Http-запрос
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String headerValue = request.getHeader(AUTH_TOKEN);
        // если метод не требует проверки безопасности
        if (isNotRequiringProtection(request)) {
            // пропускаем его дальше
            filterChain.doFilter(servletRequest, servletResponse);
        } else if (headerValue == null || headerValue.equals("")) {
            throw new IllegalArgumentException("Token not found");
        } else {
            manager.authenticate(new TokenAuthentication(headerValue));
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    private boolean isNotRequiringProtection(HttpServletRequest request) {
        String requestUri = request.getRequestURI();
        String requestMethod = request.getMethod();
        return requestUri.equals("/users") && requestMethod.equals("POST") ||
                requestUri.equals("/login") && requestMethod.equals("POST");
    }
}

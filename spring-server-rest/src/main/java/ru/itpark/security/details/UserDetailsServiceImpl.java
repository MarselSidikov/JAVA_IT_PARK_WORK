package ru.itpark.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;

import java.util.ArrayList;
import java.util.List;

// класс, который обеспечивает доступ
// к данным авторизации
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersDao usersDao;

    // загружает авторизационные данные пользователя по его username
    @Override
    public UserDetails loadUserByUsername(String token) throws UsernameNotFoundException {
        // проверяем, есть ли вообще такой токен в системе
        if (usersDao.isExistToken(token)) {
            User user = usersDao.findByToken(token);
            List<GrantedAuthority> authorities = createGrantedAuthorities();
            return new UserDetailsImpl(user.getLogin(), user.getPasswordHash(), authorities);
        }
        return null;
    }

    public static List<GrantedAuthority> createGrantedAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        return authorities;
    }
}

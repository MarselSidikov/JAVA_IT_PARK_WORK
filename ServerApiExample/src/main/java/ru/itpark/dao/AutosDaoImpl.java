package ru.itpark.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.models.Auto;
import ru.itpark.models.User;

import java.util.List;

@Component
public class AutosDaoImpl implements AutosDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int saveForUser(int userId, Auto auto) {
        auto.setOwnerId(userId);
        Session session = getSession();
        session.beginTransaction();
        int generatedId = (Integer)session.save("auto", auto);
        session.getTransaction().commit();
        return generatedId;
    }

    @Override
    public int save(Auto model) {
        return 0;
    }

    @Override
    public Auto find(int id) {
        return null;
    }

    @Override
    public void update(Auto model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Auto> findAll() {
        return null;
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
}

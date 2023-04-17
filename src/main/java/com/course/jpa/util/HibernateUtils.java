package com.course.jpa.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Singleton Pattern
 */
public class HibernateUtils {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

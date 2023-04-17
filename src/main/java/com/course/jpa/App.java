package com.course.jpa;

import com.course.jpa.util.HibernateUtils;
import com.course.jpa.util.JPAUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        testHibernate();
        testJpaSetup();
    }

    public static void testHibernate(){
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        // TODO Operations
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public static void testJpaSetup(){
        EntityManagerFactory entityManagerFactory = JPAUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        // TODO Operations
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }

}

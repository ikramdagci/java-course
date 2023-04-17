package com.course.jpa.driver;

import com.course.jpa.entity.Department;
import com.course.jpa.entity.Employee;
import com.course.jpa.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DriverHibernateSetup {


    public static void main(String[] args) {
//            testInsertDepartment();
//            testReadDepartment();
        testInsertEmployee();
    }

    private static void testReadDepartment() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Department department = (Department)session.get(Department.class, 3);
        System.out.println(department.getId());
        System.out.println(department.getName());


        transaction.commit();
        session.close();
        sessionFactory.close();

    }

    public static void testInsertDepartment(){
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Department department = new Department();
        department.setName("Finance");

        session.persist(department);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public static void testInsertEmployee(){
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setAge(35);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setSalary(1500.0);
        employee.setTckn("13213213546");

        session.persist(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

}

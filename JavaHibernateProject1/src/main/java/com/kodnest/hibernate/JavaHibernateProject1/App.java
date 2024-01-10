package com.kodnest.hibernate.JavaHibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// could not execute statement at org.hibernate.internal.ExceptionConverterImpl.
//if this exception occurs, its because your dependencies are not compatible with each other.


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Student st=new Student(11,"amit",78);
        session.save(st);
        tr.commit();
        System.out.println("student object created");
    }
}

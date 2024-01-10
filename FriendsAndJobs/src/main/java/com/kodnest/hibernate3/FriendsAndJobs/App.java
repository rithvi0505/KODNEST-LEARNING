package com.kodnest.hibernate3.FriendsAndJobs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        
        Jobs j1=new Jobs();
        Jobs j2=new Jobs();
        Jobs j3=new Jobs();
        Jobs j4=new Jobs();
      
        
        Friends f1=new Friends(11,"Emu",21,j1);
        Friends f2=new Friends(12,"Neel",22,j2);
        Friends f3=new Friends(13,"Raj",23,j3);
        Friends f4=new Friends(14,"Mrin",22,j4);
        
        j1.setId(1234);
        j1.setCompany("uber");
        j1.setSalary(44000);
        j1.setF(f1);
        
        j2.setId(1235);
        j2.setCompany("RedChillies");
        j2.setSalary(68000);
        j2.setF(f2);
        
        j3.setId(1236);
        j3.setCompany("Pixar");
        j3.setSalary(140000);
        j3.setF(f3);
        
        j4.setId(1237);
        j4.setCompany("Zepto");
        j4.setSalary(72000);
        j4.setF(f4);
        
        
        
        session.save(f1);
        session.save(f2);
        session.save(f3);
        session.save(f4);
        session.save(j1);
        session.save(j2);
        session.save(j3);
        session.save(j4);
        
        tr.commit();
        System.out.println("Objects saved");
        
    }
}

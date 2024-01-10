package com.kodnest.hibernate6.StudentAndLaptops.StudentAndLaptops;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        
        
        Student s1=new Student();
        s1.setStudentId(1);
        s1.setStudentName("Jolly");
        s1.setStudentBranch("Design");
      
        
        
        Laptop l1=new Laptop();
        l1.setLaptopId(111);
        l1.setLaptopBrand("Apple");
        l1.setLaptopCost(160000);
        l1.setStudent(s1);
        
        Laptop l2=new Laptop();
        l2.setLaptopId(222);
        l2.setLaptopBrand("HP");
        l2.setLaptopCost(65000);
        l2.setStudent(s1);
        
        Laptop l3=new Laptop();
        l3.setLaptopId(333);
        l3.setLaptopBrand("Asus");
        l3.setLaptopCost(120000);
        l3.setStudent(s1);
        
        List<Laptop> list=new ArrayList();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        
        s1.setLaptop(list);
        
        session.save(s1);
        session.save(l1);
        session.save(l2);
        session.save(l3);
        
        tr.commit();
        System.out.println("objects are saved");
        
        
    }
}

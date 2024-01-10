package com.kodnest.hibernate5.CarsAndFriends.CarsAndFriends;

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
        Cars c1=new Cars();
        Cars c2=new Cars();
        Cars c3=new Cars();
       
        
        Friend f1=new Friend(1,"Moinul",12000,c1);
        Friend f2=new Friend(2,"Migam",240000,c2);
        Friend f3=new Friend(3,"Mrinmoy",320000,c3);
        
       c1.setCarId(1);
       c1.setCarBrand("Tesla");
       c1.setCost(15000000);
       c1.setF(f1);
       
       c2.setCarId(2);
       c2.setCarBrand("Maruti");
       c2.setCost(400000);
       c2.setF(f2);
       
       c3.setCarId(3);
       c3.setCarBrand("NA");
       c3.setCost(0);
       c3.setF(f3);
       
       session.save(c1);
       session.save(c2);
       session.save(c3);
       
       session.save(f1);
       session.save(f2);
       session.save(f3);
       
      tr.commit();
      System.out.println("Objects are saved");
        
        
    }
}

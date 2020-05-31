package com.tech.hiber;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Laptop.class);
        ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf=cfg.buildSessionFactory(sr);
        Session session=sf.openSession();
        session.beginTransaction();
        
        session.getTransaction().commit();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //Laptop laptop=(Laptop) session.get(Laptop.class, 4); creates actual object
        //Laptop laptop=(Laptop) session.load(Laptop.class, 4);	creates proxy object
        
        
        
        //caching hibernate 2nd level cache using query
//        Query q1=session.createQuery("from Alien where aid=2");
//        q1.setCacheable(true);
//        alien =(Alien)q1.uniqueResult();
//        System.out.println(alien);
//        
//        session.getTransaction().commit();
//        session.close();
//        Session session1=sf.openSession();
//        session1.beginTransaction();
//        Query q2=session1.createQuery("from Alien where aid=2"); 
//        q2.setCacheable(true);
//        alien =(Alien)q2.uniqueResult();
//        // tx.commit();
//         System.out.println(alien);
//         session1.getTransaction().commit();
//         session1.close();
        
        
        //Eager and LAZY fetching technique
//        
//        Alien a1=(Alien) session.get(Alien.class, 3);
//        
//        System.out.println(a1.getAname());
//        Collection<Laptop> laps=a1.getLaptop();
//        
//        for(Laptop l:laps) {
//        	System.out.println(l);
//        }
      
        //Hibernate Caching(1 level by default and 2nd level by ehcache configuration)
        
      // alien=(Alien)session.get(Alien.class,3); 
       // tx.commit();
//        System.out.println(alien);
//        
//        session.getTransaction().commit();
//        session.close();
//        Session session1=sf.openSession();
//        session1.beginTransaction();
//        alien=(Alien)session1.get(Alien.class,3); 
//        // tx.commit();
//         System.out.println(alien);
//         session1.getTransaction().commit();
//         session1.close();
    }
}

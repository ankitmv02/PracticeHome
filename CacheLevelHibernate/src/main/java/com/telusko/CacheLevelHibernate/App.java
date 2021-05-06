package com.telusko.CacheLevelHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp=new Employee();
    	emp.setEid(10);
    	emp.setEname("Sachin");
    	emp.setEaddr("Mumbai");
    	
//    	StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
//    	MetadataSources mds=new MetadataSources(registry);
//    	Metadata md=mds.getMetadataBuilder().build();
//    	SessionFactory sf=md.getSessionFactoryBuilder().build();
//    	
//    	Session session=sf.openSession();
//    	session.save(emp);
//    	session.beginTransaction().commit();
    	Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(emp);
    	tx.commit();
    }
}

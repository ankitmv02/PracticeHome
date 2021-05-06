package com.telusko.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop=new Laptop();
    	
    	Student s=new Student();
    	
    	Configuration con=new Configuration().configure()
    	.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf= con.buildSessionFactory();
        
        Session	session=sf.openSession();
        session.beginTransaction();
        
        session.save(laptop);
        session.save(s);
        
        session.getTransaction().commit();
    }
}

package com.telusko.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop=new Laptop();
    	laptop.setLid(11);
    	laptop.setLname("SonyVaio");
    	
    	Student s=new Student();
    	s.setRollno(101);
    	s.setName("Ankit");
    	s.setAddr("Pusad");
    	s.setLaptop(laptop);
    	
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

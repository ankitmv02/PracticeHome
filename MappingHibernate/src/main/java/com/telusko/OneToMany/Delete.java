package com.telusko.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete 
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
        
        laptop=(Laptop)session.get(Laptop.class, 4646);
        s=(Student)session.get(Student.class, 46);
       
        session.delete(laptop);
        session.delete(s);
        session.getTransaction().commit();
    }
}

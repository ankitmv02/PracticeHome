package com.telusko.MavenHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FetchData 
{
    public static void main( String[] args )
    {
        //This is for fetching Data
    	Employee emp=new Employee();
           
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory sf= con.buildSessionFactory();
        
        Session	session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        emp=(Employee)session.get(Employee.class, 48);
        
        tx.commit();
        
        System.out.println(emp);
    }
}

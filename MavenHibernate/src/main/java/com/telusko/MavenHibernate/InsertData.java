package com.telusko.MavenHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class InsertData 
{
    public static void main( String[] args )
    {
        
    	EmployeeName en=new EmployeeName();
    	en.setFname("Sumit");
    	en.setMname("Prakash");
    	en.setLname("Singre");
    	
    	Employee emp=new Employee();
        emp.setEid(101);
        emp.setEname(en);
        emp.setEaddr("Amravati");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory sf= con.buildSessionFactory();
        
        Session	session=sf.openSession();
        Transaction tx=session.beginTransaction();

        session.save(emp);
        tx.commit();
    }
}

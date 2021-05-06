package onetomany;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Department department=new Department();
		department.setD_id(1);
		department.setD_name("CSE");
		//department.setSemp(semp);		//iske liye apan neeche kaa karte
		
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setName("Ankit");
		e1.setDesignation("Software Engineer");
		e1.setDepartment(department);
		
		Employee e2=new Employee();
		e2.setEmpid(102);
		e2.setName("Palash");
		e2.setDesignation("Software Developer");
		e2.setDepartment(department);
		
		department.getSemp().add(e1);
		department.getSemp().add(e2);
		
		session.save(department);
		session.beginTransaction().commit();
		
	}
}

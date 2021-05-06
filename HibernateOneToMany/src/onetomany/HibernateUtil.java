package onetomany;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil 
{
	private static SessionFactory sessionf;
	private static StandardServiceRegistry registry;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionf==null)
		{
			Map<String, Object> settings =new HashMap<>();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hibotm");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL, "True");
			settings.put(Environment.FORMAT_SQL,"True");
			
			registry = new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds= new MetadataSources(registry);
			//addAnnotated 2 times for adding two class tables
			mds.addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
			Metadata md=mds.getMetadataBuilder().build();
			sessionf = md.getSessionFactoryBuilder().build();
		}
		return sessionf;
	}
}

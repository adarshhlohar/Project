package com.mavenproject;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/ecart");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "update");
                settings.put(Environment.ENABLE_LAZY_LOAD_NO_TRANS,"true");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Student.class);
				System.out.println("Creating Hibernate Configuration...");
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				
				System.out.println("Service resistry : " + serviceRegistry);
				System.out.println("sessioFactory : " + sessionFactory);
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				System.out.println("sessioFactory : " + sessionFactory);
				
				return sessionFactory;

			}
		catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Creating Hibernate Configuration...below if ");
		System.out.println(sessionFactory);
		return sessionFactory;	
	}

	public static Session getSession(){
		return getSessionFactory().openSession();
		}

}
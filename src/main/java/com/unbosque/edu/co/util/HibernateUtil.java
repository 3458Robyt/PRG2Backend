package com.unbosque.edu.co.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.unbosque.edu.co.entity.Auditory;
import com.unbosque.edu.co.entity.User;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Configuration ac = new Configuration();
				ac.addAnnotatedClass(User.class);
				ac.addAnnotatedClass(Auditory.class);
				sessionFactory = ac.configure().buildSessionFactory();

			} catch (Throwable ex) {
				// Log the exception.
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
			return sessionFactory;
		} else {
			return sessionFactory;
		}

	}

}
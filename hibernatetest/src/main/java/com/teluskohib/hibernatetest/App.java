package com.teluskohib.hibernatetest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	// to add data into database
    	AlienName aname = new AlienName();
    	aname.setFirstName("Amol");
    	aname.setMiddleName("Balu");
    	aname.setLastName("Mendhe");
    	Aliens a = new Aliens();
    	a.setAid(102);
    	a.setAcolor("Green");
    	a.setAname(aname);
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Aliens.class);
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	// to preserve acid properties of db
    	Transaction tx = session.beginTransaction();
    	session.save(a);
    	tx.commit();
    	*/
    	
    	/*
    	// to retrieve data from
    	Aliens a = null;
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Aliens.class);
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	// retrieve data with id 102
    	a = session.get(Aliens.class, 102);
    	System.out.println(a);
    	*/
    	
    	/*
    	// Table Relationships
    	// save tables with relationships
    	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("Dell");
    	Student s = new Student();
    	s.setName("Akshay");
    	s.setMarks(100);
    	s.setRollno(1);
    	s.getLaptop().add(laptop);
    	laptop.getStudent().add(s);
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(s);
    	session.save(laptop);
    	tx.commit();
    	
    	// retrieve tables with relationships
    	Student s1 = session.get(Student.class, 1);
    	System.out.println(s1);
    	List<Laptop> laptops = s1.getLaptop();
    	laptops.forEach( i -> System.out.println(i));
    	*/
    	
    	// Hibernate Query Language
    	Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	// HQL -> Select * from Book Where price > 50
    	Query q = session.createQuery(" FROM Book Where bookPrice > 50 ");
    	List<Book> books= q.list();
    	books.forEach(i -> System.out.println(i));
    }
}

package com.javatpoint;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test {
public static void main(String[] args) {
	
	 Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setId(1001);
	e1.setFirstName("madhu");
	e1.setLastName("mathi");
	
	Employee e2=new Employee();
	e2.setId(1002);
	e2.setFirstName("mathi");
	e2.setLastName("madhu");
	
	session.persist(e1);
	session.persist(e2);
	
	t.commit();
	session.close();
	System.out.println("successfully saved");
}
}

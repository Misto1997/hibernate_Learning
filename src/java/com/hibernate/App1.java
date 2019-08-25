/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import com.hibernate.entity.Laptop;
import com.hibernate.entity.Student;
import com.hibernate.entity.Users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author rahul
 */
public class App1 {
    
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        
        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory factory=cfg.buildSessionFactory(reg);
        
        Session session=factory.getCurrentSession();  
       
        try
        {
            /* adding relationship values to tables*/
//            Laptop laptop=new Laptop();
//            laptop.setLid(103);
//            laptop.setLname("Dell");
//            
//            Student stud=new Student();
//            stud.setRoll(3);
//            stud.setMarks(50);
//            stud.setName("Rahul");
//            stud.setLaptop(laptop); //setting laptop object values to stud object
//            stud.getLap().add(laptop);   //setting list of laptop objects to stud object
//            
//            session.beginTransaction();
//            session.save(laptop);
//            session.save(stud);
//            session.getTransaction().commit();
            
            /*Lazy type fetching relationship values*/
//            session.beginTransaction();
//            Student stud=(Student)session.get(Student.class,1);
//            System.out.println(stud);
//            List<Laptop> lap=stud.getLap();
//            for(Laptop l:lap)
//                System.out.println(l);
//            session.getTransaction().commit();
            
            /*Eager type fetching realtionship values  with fetch=FetchType.EAGER in Student class*/
//            session.beginTransaction();
//            Student stud=(Student)session.get(Student.class,1);
//            System.out.println(stud);
//            session.getTransaction().commit();
            
            
        }
        finally
        {
            session.close();  //closing session
            factory.close();   //closing Session factory
        }
        }
}

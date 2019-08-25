/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import com.hibernate.entity.Embeddable_class;
import com.hibernate.entity.Users;
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

//main program to add or retrieve data from database
public class App {
    
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class);//configure your jdbc
        
        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();//creating object of registry
        SessionFactory factory=cfg.buildSessionFactory(reg);
        
        Session session=factory.getCurrentSession();  //Creating Sesion object to connect to database
        /* to add value in DB */
//       try
//       {
//            Embeddable_class name=new Embeddable_class();//embeddable class object used inside User class object
//            name.setFname("jai");
//            name.setLname("kumar");
//            
//            //creating object of entity class type
//            Users user=new Users("a", "b",name); // creating entity to add in db
//            //starting transaction
//            session.beginTransaction();
//            //performing transaction
//            session.save(user);  //creating transaction to save values in db
//            //commiting transaction
//            session.getTransaction().commit();
//            System.out.println("added");
            
//        }

  /*to retreive, update, delete value in DB*/
//        try
//        {
//            Users user=new Users();   //creating entity to get values from DB
//            
//            session.beginTransaction();
//            
//            user=(Users) session.get(Users.class, 1);  //creating trasaction to retrieve values from DB
//           // user.setUsername("Rahul");   //using setter to update username
//           session.delete(user);   //using session.delete method to delete a record in table
//            session.getTransaction().commit();
//            System.out.println(user);  //printing values
//            
//        }
        
        

   /*Use of HQL*/
        try
        {
            session.beginTransaction();
            
            /*select all data from table */

//            List<Users> users= session.createQuery("from users").list(); // creating List to get details from table 
//            for (Users temp : users) {
//                System.out.println(temp);
//            }
            
            /*select perticular column from table*/
//            List<String> names=session.createQuery("select username from users").list();
//            for(String n:names)
//                System.out.println(n);

            /*update perticular data with condition*/
//            session.createQuery("update users set password='34567' where first_name='god'").executeUpdate(); // to update table and can be used to delete record
           

            
            /*to get unique result*/
//            Users ob=(Users)session.createQuery("from users where first_name='god'").uniqueResult();
//            System.out.println(ob);

            /*use SQL query inside HQL*/
//            List<Users> users=session.createSQLQuery("select * from users").addEntity(Users.class).list();// addEntity to type cast object into User type else it will print objects only
//            for(Users ob:users)
//                System.out.println(ob);


            
                        session.getTransaction().commit();
        }
        finally
        {
         session.close();  //closing session
         factory.close();   //closing Session factory
        }
                                                 
    }
}

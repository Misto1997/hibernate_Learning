package com.hibernate.entity;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul
 */
//creating entity class to map our class object to database columns
import javax.persistence.*;
@Entity (name="users")  //Entity name refered to our app.java file and named it same as table name but we can give another name too(used to mapping for HQL) here name=tablename
@Table (name="users")
public class Users {
    @Id
    @Column (name="user_id")
    private int userId;
    
    @Column (name="username")
    private String username;
     
    @Column (name="password")
    private String password;
     
    private  Embeddable_class name;
      

    public Users() {  //default constructor
    }
    
    
    public Users(String username,String password,Embeddable_class name)  //Constructor for all objects excepts userid because its autoincrementing object in our db
    {
     
      this.username=username;
      this.password=password;
      this.name=name;
    }
    
    //creating getter and setters

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Embeddable_class getName() {
        return name;
    }

    public void setName(Embeddable_class name) {
        this.name = name;
    }

    

    

    @Override
    public String toString() {  //toString to print values of object easily without any hassle
        return "Users[userId= "+userId+",username= "+username+",password= "+password+",name= "+name+"]";
    }
    
    
}

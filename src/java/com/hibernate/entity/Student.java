/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.entity;

import java.util.*;
import javax.persistence.*;
import javax.persistence.FetchType;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 *
 * @author rahul
 */
@Entity
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  // both are used for second level cache
public class Student {
    
    @Id
    private int roll;
    private String name;
    private int marks;
    
    @OneToOne  //annotation to define relationship and it will create new column to student table
    private Laptop laptop;//creating object of Laptop class
    
    @OneToMany(fetch=FetchType.EAGER) //annotation to define relationship and it will create new tabel
    // Add Eager type if you are using single query to get values
    private List<Laptop> lap=new ArrayList<>();   //creating list of object of laptop class

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<Laptop> getLap() {
        return lap;
    }

    public void setLap(List<Laptop> lap) {
        this.lap = lap;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name=" + name + ", marks=" + marks + '}';
    }
    
    
}

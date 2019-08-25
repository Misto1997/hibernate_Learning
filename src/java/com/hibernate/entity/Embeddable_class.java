/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author rahul
 */
@Embeddable// Using annotation to define that this class variables is being used inside another class
public class Embeddable_class {
    
    @Column (name="first_name")
    private String fname;
    @Column (name="last_name")
    private String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Embeddable_class{" + "fname=" + fname + ", lname=" + lname + '}';
    }
    
    
}

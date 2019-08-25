/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.entity;

import javax.persistence.*;

/**
 *
 * @author rahul
 */
@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;
    
    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getLid() {
        return lid;
    }

    public String getLname() {
        return lname;
    }
    
    
    @Override
    public String toString() {
        return "Laptop{" + "lid=" + lid + ", lname=" + lname + '}';
    }

    
}

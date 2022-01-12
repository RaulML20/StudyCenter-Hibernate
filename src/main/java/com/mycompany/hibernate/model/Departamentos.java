package com.mycompany.hibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departamentos")
public class Departamentos implements Serializable{
    
    @Id
    private int numD;
    @Column(name = "dname")
    private String dname;
    
    public Departamentos(int numD, String dname) {
        super();
        this.numD = numD;
        this.dname = dname;
    }
    
    public Departamentos() {
        super();
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Departamentos{" + "numD=" + numD + ", dname=" + dname + '}';
    }
}

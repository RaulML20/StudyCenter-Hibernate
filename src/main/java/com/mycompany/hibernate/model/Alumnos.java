package com.mycompany.hibernate.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alumnos")
public class Alumnos implements Serializable{
    
    @Id
    private int idA;
    @Column(name = "aname")
    private String aname;
    @Column(name = "apellidosA")
    private String apellidosA;
    @Column(name = "fechaN")
    private Date fechaN;
    
    public Alumnos() {
        super();
    }
    
    public Alumnos(int idA, String aname, String apellidosA, Date fechaN){
        super();
        this.idA = idA;
        this.aname = aname;
        this.apellidosA = apellidosA;
        this.fechaN = fechaN;
    }
    
    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApellidosA() {
        return apellidosA;
    }

    public void setApellidosA(String apellidosA) {
        this.apellidosA = apellidosA;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "idA=" + idA + ", aname=" + aname + ", apellidosA=" + apellidosA + ", fechaN=" + fechaN + '}';
    }
}




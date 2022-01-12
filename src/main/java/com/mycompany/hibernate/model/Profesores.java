package com.mycompany.hibernate.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profesores")
public class Profesores implements Serializable{
    @Id
    private int idP;
    @Column(name = "pname")
    private String pname;
    @Column(name = "apellidosP")
    private String apellidosP;
    @Column(name = "fechaN")
    private Date fechaN;
    @Column(name = "numD")
    private int numD;
    
    public Profesores(int idP, String pname, String apellidosP, Date fechaN, int numD){
        this.idP = idP;
        this.pname = pname;
        this.apellidosP = apellidosP;
        this.fechaN = fechaN;
        this.numD = numD;
    }
    
    public Profesores(){}

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }
    
    
    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Profesores{" + "idP=" + idP + ", pname=" + pname + ", apellidosP=" + apellidosP + ", fechaN=" + fechaN + '}';
    }
}

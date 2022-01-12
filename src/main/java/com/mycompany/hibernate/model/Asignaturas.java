package com.mycompany.hibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Asignaturas")
public class Asignaturas implements Serializable{
    
    @Id
    private int codA;
    @Column(name = "idP")
    private int idP;
    @Column(name = "asname")
    private String asname;

    public Asignaturas(int codA, String asname, int idP) {
        super();
        this.codA = codA;
        this.idP = idP;
        this.asname = asname;
    }

    public Asignaturas() {
        super();
    }

    public int getCodA() {
        return codA;
    }

    public void setCodA(int codA) {
        this.codA = codA;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getAsname() {
        return asname;
    }

    public void setAsname(String asname) {
        this.asname = asname;
    }

    @Override
    public String toString() {
        return "Asignaturas{" + "codA=" + codA + ", idP=" + idP + ", asname=" + asname + '}';
    }
}

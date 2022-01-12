package com.mycompany.hibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tienen")
public class Tienen implements Serializable{
    @Id
    private int idA;
    @Id
    private int idP;
    @Id
    private int codA;

    public Tienen(int idA, int idP, int codA) {
        super();
        this.idA = idA;
        this.idP = idP;
        this.codA = codA;
    }

    public Tienen() {
        super();
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public int getCodA() {
        return codA;
    }

    public void setCodA(int codA) {
        this.codA = codA;
    }
}

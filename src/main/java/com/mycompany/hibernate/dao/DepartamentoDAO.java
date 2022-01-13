/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Asignaturas;
import com.mycompany.hibernate.model.Departamentos;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class DepartamentoDAO implements DaoInterface<Departamentos> {

    public void persist(Departamentos entity, Session session) {
        session.persist(entity);
    }

    public void update(Departamentos entity, Session session) {
        session.update(entity);
    }

    public List<Departamentos> findById(String dname, Session session) {
        Query q = session.createQuery("FROM Departamentos WHERE dname = :dname")
        .setParameter("dname", dname);       
        List<Departamentos> listaDep = q.getResultList();

        return listaDep;
    }

    public void delete(String dname, Session session) {
        Query q = session.createQuery("DELETE Departamentos WHERE dname=:dname")
        .setParameter("dname", dname); 
        int numObj = q.executeUpdate();
        System.out.println(numObj + " objetos borrados.");
        //session.delete(dname);
    }
    
    public void delete(Departamentos entity , Session session) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Departamentos> findAll(Session session) {
        return (List<Departamentos>) session.createQuery("from departamentos").list();
    }

    public void deleteAll(Session sesion) {
        List<Departamentos> lista = findAll(sesion);
        for (Departamentos dept : lista) {
            delete(dept, sesion);
        }
    }

    @Override
    public Departamentos findById(int id, Session session) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

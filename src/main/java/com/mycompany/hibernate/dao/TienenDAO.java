/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Tienen;
import java.util.List;
import org.hibernate.Session;

public class TienenDAO implements DaoInterface<Tienen> {

    public void persist(Tienen entity, Session session) {
        session.persist(entity);
    }

    public void update(Tienen entity, Session session) {
        session.update(entity);
    }

    public Tienen findById(int idA, int idP, int codA, Session session) {
        return (Tienen) session.get(Tienen.class, idA);
    }

    public void delete(Tienen entity, Session session) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Tienen> findAll(Session session) {
        return (List<Tienen>) session.createQuery("from Tienen").list();
    }

    public void deleteAll(Session sesion) {
        List<Tienen> lista = findAll(sesion);
        for (Tienen ti : lista) {
            delete(ti, sesion);
        }
    }

    @Override
    public Tienen findById(int id, Session session) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

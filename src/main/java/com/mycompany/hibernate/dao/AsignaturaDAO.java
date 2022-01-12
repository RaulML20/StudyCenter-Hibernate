/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Asignaturas;
import java.util.List;
import org.hibernate.Session;

public class AsignaturaDAO implements DaoInterface<Asignaturas> {

    public void persist(Asignaturas entity, Session session) {
        session.persist(entity);
    }

    @Override
    public void update(Asignaturas entity, Session session) {
        session.update(entity);
    }

    public Asignaturas findById(String asname, Session session) {
        return (Asignaturas) session.get(Asignaturas.class, asname);
    }

    public void delete(Asignaturas entity, Session session) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Asignaturas> findAll(Session session) {
        return (List<Asignaturas>) session.createQuery("from asignaturas").list();
    }

    public void deleteAll(Session sesion) {
        List<Asignaturas> lista = findAll(sesion);
        for (Asignaturas asi : lista) {
            delete(asi, sesion);
        }
    }

    @Override
    public Asignaturas findById(int id, Session session) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

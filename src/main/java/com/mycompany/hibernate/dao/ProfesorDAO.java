/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Profesores;
import java.util.List;
import org.hibernate.Session;

public class ProfesorDAO implements DaoInterface<Profesores> {

    public void persist(Profesores entity, Session session) {
        session.persist(entity);
    }

    public void update(Profesores entity, Session session) {
        session.update(entity);
    }

    public Profesores findById(int idP, Session session) {
        return (Profesores) session.get(Profesores.class, idP);
    }

    public void delete(Profesores entity, Session session) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Profesores> findAll(Session session) {
        return (List<Profesores>) session.createQuery("from profesores").list();
    }

    public void deleteAll(Session sesion) {
        List<Profesores> lista = findAll(sesion);
        for (Profesores pro : lista) {
            delete(pro, sesion);
        }
    }
}

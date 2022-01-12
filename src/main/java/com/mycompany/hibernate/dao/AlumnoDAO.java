/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Alumnos;
import java.util.List;
import org.hibernate.Session;

public class AlumnoDAO implements DaoInterface<Alumnos> {

    public void persist(Alumnos entity, Session session) {
        session.persist(entity);
    }

    public void update(Alumnos entity, Session session) {
        session.update(entity);
    }

    public Alumnos findById(int idA, Session session) {
        return (Alumnos) session.get(Alumnos.class, idA);
    }

    public void delete(Alumnos entity, Session session) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Alumnos> findAll(Session session) {
        return (List<Alumnos>) session.createQuery("from Alumnos").list();
    }

    public void deleteAll(Session sesion) {
        List<Alumnos> lista = findAll(sesion);
        for (Alumnos ali : lista) {
            delete(ali, sesion);
        }
    }
}

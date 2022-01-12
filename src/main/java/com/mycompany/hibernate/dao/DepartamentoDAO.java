/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Departamentos;
import java.util.List;
import org.hibernate.Session;

public class DepartamentoDAO implements DaoInterface<Departamentos> {

    public void persist(Departamentos entity, Session session) {
        session.persist(entity);
    }

    public void update(Departamentos entity, Session session) {
        session.update(entity);
    }

    public Departamentos findById(int codD, Session session) {
        return (Departamentos) session.get(Departamentos.class, codD);
    }

    public void delete(Departamentos entity, Session session) {
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
}

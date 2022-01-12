package com.mycompany.hibernate.session;

import com.mycompany.hibernate.dao.AlumnoDAO;
import com.mycompany.hibernate.dao.AsignaturaDAO;
import com.mycompany.hibernate.dao.DaoFactory;
import com.mycompany.hibernate.dao.DepartamentoDAO;
import com.mycompany.hibernate.dao.ProfesorDAO;
import com.mycompany.hibernate.model.Alumnos;
import com.mycompany.hibernate.model.Asignaturas;
import com.mycompany.hibernate.model.Departamentos;
import com.mycompany.hibernate.model.Profesores;

import java.util.List;

public class Service {
    
    private DepartamentoDAO deptDao;
    private AsignaturaDAO asiDao;
    private AlumnoDAO aluDao;
    private ProfesorDAO proDao;
    private static SesionFactory sesionFactory;

    public Service() {
        deptDao = new DaoFactory().getDeptDao();
        aluDao = new DaoFactory().getAluDao();
        asiDao = new DaoFactory().getAsiDao();
        proDao = new DaoFactory().getProDao();
        sesionFactory = SesionFactory.getSesionFactory();
    }
    
    /*
       PERSIST
    */
    public void persist(Departamentos entity) {
        sesionFactory.openCurrentSessionwithTransaction();
        deptDao.persist(entity, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    public void persist(Alumnos entity) {
        sesionFactory.openCurrentSessionwithTransaction();
        aluDao.persist(entity, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    public void persist(Asignaturas entity) {
        sesionFactory.openCurrentSessionwithTransaction();
        asiDao.persist(entity, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    public void persist(Profesores entity) {
        sesionFactory.openCurrentSessionwithTransaction();
        proDao.persist(entity, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    /*
        UPDATE
    */
    public void update(Departamentos entity) {
            sesionFactory.openCurrentSessionwithTransaction();
            deptDao.update(entity, sesionFactory.getCurrentSession());
            sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    //Actualizar departamentos
    public void update(Asignaturas entity) {
            sesionFactory.openCurrentSessionwithTransaction();
            asiDao.update(entity, sesionFactory.getCurrentSession());
            sesionFactory.closeCurrentSessionwithTransaction();
    }
    /*
        Find by ID
    */
    public Departamentos findById(int id) {
        sesionFactory.openCurrentSession();
        Departamentos dept = deptDao.findById(id, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return dept;
    }
    
    public Asignaturas findByIdAsi(String asname) {
        sesionFactory.openCurrentSession();
        Asignaturas asi = asiDao.findById(asname, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return asi;
    }

    
    //DELETE
    public void delete(int codD) {
            sesionFactory.openCurrentSessionwithTransaction();
            Departamentos dept = deptDao.findById(codD, sesionFactory.getCurrentSession());
            deptDao.delete(dept, sesionFactory.getCurrentSession());
            sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    //Borrar un departamento
    public void deleteDept(Departamentos entity) {
            sesionFactory.openCurrentSessionwithTransaction();
            deptDao.delete(entity, sesionFactory.getCurrentSession());
            sesionFactory.closeCurrentSessionwithTransaction();
    }

    //Find ALL
    public List<Departamentos> findAll() {
        sesionFactory.openCurrentSession();
        List<Departamentos> dept = deptDao.findAll(sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return dept;
    }
    //Find All de familiares
    public List<Alumnos> findAllAlu() {
        sesionFactory.openCurrentSession();
        List<Alumnos> fam = aluDao.findAll(sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return fam;
    }
    
    //Delete ALL
    public void deleteAll() {
        sesionFactory.openCurrentSessionwithTransaction();
        deptDao.deleteAll(sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSessionwithTransaction();
    }
}

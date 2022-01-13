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
    
    //CONSULTA HQL
    public List<Departamentos> findById(String dname) {
        sesionFactory.openCurrentSession();
        List<Departamentos> dept = deptDao.findById(dname, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return dept;
    }
    
    //CONSULTA HQL
    public List<Asignaturas> findByIdAsi(String asname) {
        sesionFactory.openCurrentSession();
        List<Asignaturas> asi = asiDao.findById(asname, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return asi;
    }
    
    //SQL NATIVO
    public List<Object[]> findByIdPro(String pname) {
        sesionFactory.openCurrentSession();
        List<Object[]> asi = asiDao.findByIdPro(pname, sesionFactory.getCurrentSession());
        sesionFactory.closeCurrentSession();
        return asi;
    }
    
    //DELETE
    
    //Borrar un departamento
    //CONSULTA HQL
    public void deleteDept(Departamentos entity) {
            sesionFactory.openCurrentSessionwithTransaction();
            deptDao.delete(entity, sesionFactory.getCurrentSession());
            sesionFactory.closeCurrentSessionwithTransaction();
    }
    
    public void deleteDept(String dname) {
            sesionFactory.openCurrentSessionwithTransaction();
            deptDao.delete(dname, sesionFactory.getCurrentSession());
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

package com.mycompany.hibernate.dao;

public class DaoFactory {

    public DaoFactory() {
        super();
    }

    public DepartamentoDAO getDeptDao() {
        return new DepartamentoDAO();
    }
    
    public AlumnoDAO getAluDao() {
        return new AlumnoDAO();
    }
    
    public AsignaturaDAO getAsiDao() {
        return new AsignaturaDAO();
    }
    
    public ProfesorDAO getProDao() {
        return new ProfesorDAO();
    }
    
    public TienenDAO getTienenDao() {
        return new TienenDAO();
    }
}

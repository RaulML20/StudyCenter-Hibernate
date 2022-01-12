package com.mycompany.hibernate.resources;

import com.mycompany.hibernate.model.Alumnos;
import com.mycompany.hibernate.model.Asignaturas;
import com.mycompany.hibernate.model.Departamentos;
import com.mycompany.hibernate.session.Service;
import com.mycompany.hibernate.model.Profesores;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws ParseException {
           
        Scanner teclado = new Scanner(System.in);
        Vista vista = new Vista();
        Service Service = new Service();
        int opcion = vista.menu();
        
        switch(opcion){
            case 1:
                Departamentos dept = new Departamentos(80, "PRUEBA");
                Service.persist(dept);
                System.exit(0);
            break;
            case 2:
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd"); 
                Date date = formato.parse("1981-09-28");
                Alumnos emp = new Alumnos(9999, "JESUS", "PEREZ", date);
                Service.persist(emp);
                System.exit(0);
            break;
            case 3:
                SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-mm-dd"); 
                Date date2 = formato2.parse("1981-09-28");
                Profesores pro = new Profesores(16, "RAUL", "MEIZOSO", date2, 1006);
                Service.persist(pro);
                System.exit(0);
            break;
            case 4:
                Asignaturas asi = new Asignaturas();
                System.out.println("Introduce el nombre de la asignatura");
                String asname = teclado.nextLine();
                asi = Service.findByIdAsi(asname);
                System.out.println("Nombre: "+asi.getAsname()+", Código: "+asi.getCodA()+", ID del profesor: "+asi.getIdP());
                System.exit(0);
            break;
            case 5:
                List alu2 = new ArrayList();
                alu2 = Service.findAllAlu();
                
                for(int i = 0; i < alu2.size(); i++){
                    System.out.println(alu2.get(i));
                }
            break;
            case 6:
                System.out.println("Introduce el id del departamento");
                int id = teclado.nextInt();
                Departamentos dept2 = Service.findById(id);
                Service.deleteDept(dept2);
                System.out.println("Departamentoe eliminado");
            break;
        }
    }
}

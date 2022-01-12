/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.resources;

import java.util.Scanner;

/**
 *
 * @author raul.meizosolopez
 */
public class Vista {
    Scanner teclado = new Scanner(System.in);
    private int opcion;
   
    public int menu(){
        System.out.println("1) Introducir un departamento");
        System.out.println("2) Introducir un alumno");
        System.out.println("3) Introducir un profesor");
        System.out.println("4) Mostrar asignatura por el nombre");
        System.out.println("5) Mostrar todos los alumnos");
        System.out.println("6) Eliminar departamento por el nombre");
        opcion = teclado.nextInt();
        return opcion;
    }
}

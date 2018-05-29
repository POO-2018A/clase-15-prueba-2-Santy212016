/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author ESFOT
 */
public class Prueba {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
              
        System.out.print("Lista de estudiantes: ");
        
        Estudiante[] estudiantes = new Estudiante[5];
        
        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("Datos del estudiante " + (i+1));
            scan.nextLine();
            
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scan.nextLine();
            
            System.out.print("Edad: ");
            String edad = scan.nextLine();
            System.out.print("Materias: ");
            String materias = scan.nextLine();
        
            
            estudiantes[i] = new Estudiante(nombre, apellido, edad,materias);
            
            
            String[] Materias = new String[2];
            
            scan.nextLine();
            
            for(int j = 0; j < Materias.length; j++){
                System.out.print("Nombre de materia " + (j + 1) + ": ");
                Materias[j] = scan.nextLine();
            }
            
            estudiantes[i].setMaterias(materias);
            
            System.out.println("");
            System.out.println("");
        
        }
        
        System.out.println("############# INFORMACIÓN DE ESTUDIANTES #############");
        
        for(int i = 0; i< estudiantes.length; i++){
            System.out.println("Estudiante " + (i+1) + ":");
            
            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido()+""+ estudiantes[i].getEdad() );
                      
            System.out.println("--- MATERIAS");
            
            String[] me = estudiantes[i].getMaterias();
            for(int j = 0; j<me.length; j++) {
                System.out.println((j+1) + ". " + me[j]);
            }
            
            System.out.println("");
            System.out.println("");
        }
    }
}
        
        
 
    

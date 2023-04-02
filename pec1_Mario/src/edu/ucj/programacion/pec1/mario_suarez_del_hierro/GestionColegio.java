package edu.ucj.programacion.pec1.mario_suarez_del_hierro;

import java.util.Scanner;

public class GestionColegio {

	public static void main(String[] args) {
		
		// Pido el número de alumnos y almaceno cada alumno en un array
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Cuántos alumnos hay? ");
	    int numAlumnos = scanner.nextInt();
	    Alumno[] alumnos = new Alumno[numAlumnos];
	    
	    // Inicializo las variables
	    String nombreAlumno = "";
	    String apellidoAlumno = "";
	    String dni = "";
	    
	    // Creo los alumnos y los almaceno
	    for (int i = 0; i < numAlumnos; i++) {
	    	scanner = new Scanner(System.in);
			System.out.print("Nombre del alumno: ");
		    nombreAlumno = scanner.nextLine();
		    
		    scanner = new Scanner(System.in);
			System.out.print("Apellido del alumno: ");
		    apellidoAlumno = scanner.nextLine();
			
		    scanner = new Scanner(System.in);
			System.out.print("DNI del alumno: ");
		    dni = scanner.nextLine();   
		    
		    alumnos[i] = new Alumno(nombreAlumno, apellidoAlumno, dni);
		}
			
	    scanner.close();
	    
	    // Creo las aulas y las plantas en las que se encuentran. En este caso, como el enunciado no especifica
	    // cuantas aulas y plantas tiene que haber, he creado 9 aulas repartidas en 3 plantas 
		Aula[] aulas = new Aula[] {new Aula(1, 1), new Aula(2, 1), new Aula(3, 1), new Aula(1, 2), new Aula(2, 2), 
				new Aula(3, 2), new Aula(1, 3), new Aula(2, 3), new Aula(3, 3)};
		
		// Creo un objeto de tipo Colegio con nombre, dirección, número de aulas del colegio y número de alumnos
		Colegio colegio = new Colegio("NombreColegio", "DirecciónColegio", aulas, numAlumnos);
		
		// Asigno los alumnos a las aulas
		UtilsColegio util = new UtilsColegio(colegio);
		util.asignarAlumnos(alumnos);
	}
}
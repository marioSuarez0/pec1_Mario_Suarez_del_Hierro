package edu.ucj.programacion.pec1.mario_suarez_del_hierro;

public class Colegio {
	
	// Variables de instancia
	private String nombreColegio;
	private String direccion;
	private Aula[] aulas;
	private int numeroAlumnos;
	
	// Constructores
	public Colegio(String nombreColegio, String direccion, Aula[] aulas, int numeroAlumnos) {
		super();
		this.nombreColegio = nombreColegio;
		this.direccion = direccion;
		this.aulas = aulas;
		this.numeroAlumnos = numeroAlumnos;
	}

	// Getters y seters
	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}
	
	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	// Método para recorrer las aulas y cuando se hayan recorrido todos los asientos se devuelva 
	// el nombre, apellidos y DNI del alumno o alumnos, además de el asiento asignado a cada uno
	// y el aula en el que se encuentra el asiento
	
	public Object[] asignarAsiento(Alumno alumno) {
		for (Aula aula : aulas) {
			int asiento = aula.asignarAlumno(alumno);
			if (asiento != -1) {
				return new Object[] {alumno, aula, asiento};
			}
		}
		return null;
	}
}

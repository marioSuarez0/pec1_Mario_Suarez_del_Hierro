package edu.ucj.programacion.pec1.mario_suarez_del_hierro;

public class Aula {

	// Variables de instancia
	// El indice del array donde guardo el alumno, determina el número de asiento 
	// que le corresponde
	private int numero;
	private int planta;
	private Alumno[] asientos;
	
	//Constructores
	public Aula(int numero, int planta) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = new Alumno[3];
	}

	// Getters y setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	// Método para recorrer los asientos y en el momento en el que haya uno libre, se le asigne un alumno
	public int asignarAlumno(Alumno alumno) {
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] == null) {
				asientos[i] = alumno;
				return i;
			}
		}
		return -1;
	}
}

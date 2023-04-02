package edu.ucj.programacion.pec1.mario_suarez_del_hierro;

public class UtilsColegio {

	public Colegio colegio;

	public UtilsColegio(Colegio colegio) {
		super();
		this.colegio = colegio;
	}

	// Asigno cada alumno a un aula y saco el resultado por pantalla,
	// en caso de que no haya asientos libres, saco una advertencia
	
	public void asignarAlumnos(Alumno[] alumnos) {
		for (Alumno alumno : alumnos) {
			
			Object[] info = this.colegio.asignarAsiento(alumno);
			
			if (info != null) {
				Aula aula = (Aula) info[1];
				System.out.println("El alumno: " + ((Alumno) info[0]).getNombreAlumno() + " "
						+ ((Alumno) info[0]).getApellidoAlumno() + " con DNI:" + ((Alumno) info[0]).getDni() + 
						" se le ha asignado el asiento " + (info [2]) +
						" del aula " + aula.getNumero() + " de la planta " + aula.getPlanta());
			}else {
				System.out.println("No quedan asientos libres para el alumno " + alumno.getNombreAlumno());
			}
		}
	}
}

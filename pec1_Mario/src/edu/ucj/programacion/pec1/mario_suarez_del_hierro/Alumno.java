package edu.ucj.programacion.pec1.mario_suarez_del_hierro;

public class Alumno {
	
	// Variables de instancia
	private String nombreAlumno;
	private String apellidoAlumno;
	private String dni;
	
	// Constructores
	public Alumno(String nombreAlumno, String apellidoAlumno, String dni) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.dni = dni;
	}

	// Getters y setters
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}

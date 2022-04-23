package ej5;

public class Estudiante extends Persona {

	private int calificacion;
	private int asistencia;

	public Estudiante() {
		super();
		this.calificacion = generarCalificacion();
		this.asistencia = generarAistencia();

	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;

	}

	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}

	@Override
	public String toString() {
		return "El Estudiante " + nom + " tiene " + edad + " años y su nota es " + calificacion;
	}

	// asignamos una calificacion
	public int generarCalificacion() {
		int calificacionAleatoria = (int) (Math.random() * 10);
		return this.calificacion = calificacionAleatoria;

	}

	// asignamos una asistencia
	public int generarAistencia() {
		int asistenciaAleatoria = (int) (Math.random() * 15);
		return this.asistencia = asistenciaAleatoria;

	}

}

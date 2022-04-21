package ej5;

public class Estudiante extends Persona{
	
	
	private int calificacion;

	public Estudiante(String nom, int edad, String sexe, int calificacion) {
		super(nom, edad, sexe);
		this.calificacion = calificacion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [calificacion=" + calificacion + "]";
	}

	
	
	
	
	

}

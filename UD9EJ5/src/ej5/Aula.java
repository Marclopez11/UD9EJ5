package ej5;

public class Aula {

	private Profesor profesor;
	private Estudiante estudiante;
	private boolean profesordispo;
	private int idnum;
	private int numestudiantes;
	
	
	public enum Clase{
		matematicas,filosofia,fisica
		}


	public Aula(Profesor profesor, Estudiante estudiante, boolean profesordispo, int idnum, int numestudiantes) {
		super();
		this.profesor = profesor;
		this.estudiante = estudiante;
		this.profesordispo = profesordispo;
		this.idnum = idnum;
		this.numestudiantes = numestudiantes;
	}
	
	
	
	
	
	
	
	
}

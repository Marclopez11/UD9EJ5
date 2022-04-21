package ej5;

import java.util.Arrays;

public class Profesor extends Persona{
	
	 private String[] materias = { "Matemáticas", "Filosofía", "Física" };

	public Profesor(String nom, int edad, String sexe, String[] materias) {
		super(nom, edad, sexe);
		this.materias = materias;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return "Profesor [materias=" + Arrays.toString(materias) + "]";
	}




	 




}

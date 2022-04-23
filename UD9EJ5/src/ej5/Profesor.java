package ej5;

import java.util.Arrays;

public class Profesor extends Persona {

	private final String[] materias = { "Matemáticas", "Filosofía", "Física" };
	private String tipomateria;
	private int asistencia;

	public Profesor() {
		super();
		this.tipomateria = assignarMateria();
		this.asistencia = generarAistencia();

	}

	public String getTipomateria() {
		return tipomateria;
	}

	public void setTipomateria(String tipoateria) {
		this.tipomateria = tipoateria;
	}

	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}

	@Override
	public String toString() {
		return "Profesor " + nom + " tiene " + edad + " imparte la assignatura " + tipomateria;
	}

	// asignamos una materia random que imparte el profe
	public String assignarMateria() {
		int materiaAleatoria = (int) (Math.random() * 3);
		return this.tipomateria = materias[materiaAleatoria];

	}

	// asignamos una asistencia
	public int generarAistencia() {
		int asistenciaAleatoria = (int) (Math.random() * 10);
		return this.asistencia = asistenciaAleatoria;

	}

}

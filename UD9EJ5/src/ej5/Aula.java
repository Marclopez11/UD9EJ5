package ej5;

public class Aula {

	private Profesor profesor;
	private Estudiante estudiante;
	static Estudiante estudiantes[] = new Estudiante[5];
	private boolean profesordispo;
	private int idnum;
	private int numestudiantes;
	private int cantidadAlumnos;

	public enum Clase {
		matematicas, filosofia, fisica
	}

	public Aula(Profesor profesor, Estudiante estudiante, boolean profesordispo, int idnum, int numestudiantes) {
		super();
		this.profesor = profesor;
		this.estudiante = estudiante;
		this.profesordispo = profesordispo;
		this.idnum = idnum;
		this.numestudiantes = numestudiantes;
	}

	public void mostrarClase(Estudiante[] e, Profesor profesor) {

		// no mostraremos el aula si el profe no asiste
		if (asistenciaProfe(profesor)) {
			// no mostraremos el aula si la mirad de alumnos no asiste
			if (asistenciaMitadClase(e)) {
				System.out.println("La AULA");
				// mostrar profesor

				System.out.println(profesor);

				// mostrar alumnos
				for (int i = 0; i < e.length; i++) {
					System.out.println(e[i]);
				}

			} else {
				System.out.println("No se puede hacer clase los Alumnos no han faltado la mitad");

			}
		} else {
			System.out.println("No se puede dar clase el profesor no ha asistido");

		}

	}

	public boolean asistenciaProfe(Profesor profe) {

		// controlar asistencia del profe si es por debajo del 3 es que no a asistido
		if (profe.generarAistencia() >= 3) {
			return true;

		}
		return false;

	}

	// controlar la asistencia, si la mitad de alumnos han asistido a clase
	public boolean asistenciaMitadClase(Estudiante[] e) {
		int controlAsistencia = numestudiantes / 2;
		int alumnos = 0;

		// controlar asistencia
		for (int i = 0; i < e.length; i++) {

			if (e[i].getAsistencia() >= 5) {
				controlAsistencia++;
			}
			alumnos++;
		}

		if ((controlAsistencia > numestudiantes)) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "Aula [profesor=" + profesor + ", estudiante=" + estudiante + ", profesordispo=" + profesordispo
				+ ", idnum=" + idnum + ", numestudiantes=" + numestudiantes + "]";
	}

	// entregas de notas

	// comprobamos las notas si son superiores o igual a 5
	public boolean comprobarnotas(Estudiante e) {
		boolean aprobado = false;

		if (e.getCalificacion() >= 5) {
			aprobado = true;
		}

		return aprobado;

	}

}

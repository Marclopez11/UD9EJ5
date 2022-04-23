package ej5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante e[] = new Estudiante[10];

		// crear profesor
		Profesor profesor = new Profesor();

		// Crear Estudiantes

		for (int i = 0; i < e.length; i++) {
			e[i] = new Estudiante();
		}

		// creamos el aula
		Aula aula = new Aula(profesor, e[1], true, 5, e.length);
		// comprobamos la asistencia de la clase
		aula.asistenciaMitadClase(e);
		// mostramos la clase si el profesor ha asistido y si los alumnos estan la mitad
		aula.mostrarClase(e, profesor);
		// Mostrar los que estan aprobados

		// Si no asiste el profe no se muestra el aula ni las notas
		if (profesor.getAsistencia() >= 3) {
			// si no asisten los alumnos no se muesta las notas
			if (aula.asistenciaMitadClase(e)) {
				System.out.println("");
				System.out.println("ALumnos aprobados");
				System.out.println("");
				for (int i = 0; i < e.length; i++) {
					if (aula.comprobarnotas(e[i])) {
						System.out.println(e[i].getNom() + " esta aprobado con un " + e[i].getCalificacion());
					} else {
						System.out.println(e[i].getNom() + " no esta aprobado con un " + e[i].getCalificacion());

					}
				}
			}

		}

	}

}

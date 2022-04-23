package ej5;

import java.util.Random;

public class Persona {

	protected String nom;
	protected int edad;
	protected String sexe;
	static String arrayNombresHombre[] = new String[10];
	static String arrayNombresMujer[] = new String[10];
	private final String[] sexo = { "Mujer", "Hombre" };
	int edmx = 70;
	int edmin = 7;

	public Persona() {
		super();
		this.nom = generarNombre();
		this.edad = generarEdad(edmin, edmx);
		this.sexe = generarSexo();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	// metodo nombre
	private String generarNombre() {

		Random r = new Random();
		if (r.nextBoolean()) {
			rellenarArrayHombres();
			r = new Random();
			return arrayNombresHombre[r.nextInt(arrayNombresHombre.length)];

		} else {
			rellenarArrayMujeres();
			r = new Random();
			return arrayNombresMujer[r.nextInt(arrayNombresMujer.length)];
		}

	}

	// metodo int
	private int generarEdad(int min, int max) {
		Random r = new Random();
		return r.nextInt(max + 1 - min) + min;
	}

	// asignamos una sexo
	public String generarSexo() {
		int materiaAleatoria = (int) (Math.random() * 2);
		return this.sexe = sexo[materiaAleatoria];

	}

	// metodos para rellenar los array
	private void rellenarArrayHombres() {

		arrayNombresHombre[0] = "Guts";
		arrayNombresHombre[1] = "Walter";
		arrayNombresHombre[2] = "Leboswki";
		arrayNombresHombre[3] = "Gustabo";
		arrayNombresHombre[4] = "Horacio";
		arrayNombresHombre[5] = "Cid";
		arrayNombresHombre[6] = "Barbados";
		arrayNombresHombre[7] = "McCoolface";
		arrayNombresHombre[8] = "Echo";
		arrayNombresHombre[9] = "Hunter";

	}

	private void rellenarArrayMujeres() {

		arrayNombresMujer[0] = "Cristina";
		arrayNombresMujer[1] = "Theresia";
		arrayNombresMujer[2] = "Claudia";
		arrayNombresMujer[3] = "Paula";
		arrayNombresMujer[4] = "Andrea";
		arrayNombresMujer[5] = "Ellie";
		arrayNombresMujer[6] = "Sara";
		arrayNombresMujer[7] = "Veronica";
		arrayNombresMujer[8] = "Julia";
		arrayNombresMujer[9] = "Ana";

	}

}

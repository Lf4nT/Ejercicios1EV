package Octubre;

import java.util.Scanner;

/*Calculadora de Ponderaciones de trabajos*/

public class OCT_0210_5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float examenmates;
		float examenfisica;
		float examenquimica;
		float ejerciciosmates;
		float ejerciciosfisica;
		float ejerciciosquimica;
		double notamates;
		double notafisica;
		double notaquimica;
		System.out.println("Introduce la nota de Matematicas: ");
		examenmates = teclado.nextFloat(); // data entrance
		System.out.println("Introduce la nota de F�sica: ");
		examenfisica = teclado.nextFloat();
		System.out.println("Introduce la nota de Qu�mica: ");
		examenquimica = teclado.nextFloat();
		System.out.println("Numero de trabajos hechos de Matematicas (sobre 3): ");
		ejerciciosmates = teclado.nextFloat();
		notamates = (ejerciciosmates) / 3; // simplified calculations
		System.out.println("Numero de trabajos hechos de F�sica (sobre 2): ");
		ejerciciosfisica = teclado.nextFloat();
		notafisica = (ejerciciosfisica);
		System.out.println("Numero de trabajos hechos de Qu�mica (sobre 3): ");
		ejerciciosquimica = teclado.nextFloat();
		notaquimica = (ejerciciosquimica) / 2;
		System.out.println("Tu nota de Matematicas es: " + (examenmates * 0.9 + notamates)); // final calculations
		System.out.println("Tu nota de F�sica es: " + (examenfisica * 0.8 + notafisica));
		System.out.println("Tu nota de Qu�mica es: " + (examenquimica * 0.85 + notaquimica));
		teclado.close();
	}
}
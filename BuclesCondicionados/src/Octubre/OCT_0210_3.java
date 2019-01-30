package Octubre;

import java.util.Scanner;

/*Ponderacion de notas*/

public class OCT_0210_3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float parcial1;
		float parcial2;
		float parcial3;
		float parciales;
		float global;
		float trabajo;
		float nota;

		System.out.println("Introduce la nota del parcial 1: ");
		parcial1 = teclado.nextFloat();
		System.out.println("Introduce la nota del parcial 2: ");
		parcial2 = teclado.nextFloat();
		System.out.println("Introduce la nota del parcial 3: ");
		parcial3 = teclado.nextFloat();
		System.out.println("Introduce la nota del global: ");
		global = teclado.nextFloat();
		System.out.println("Introduce la nota del trabajo: ");
		trabajo = teclado.nextFloat();
		parciales = (parcial1 + parcial2 + parcial3) / 3;
		nota = (float) ((parciales * 0.55) + (global * 0.3) + (trabajo * 0.15));
		System.out.println("Tu nota de evaluación es: " + nota);
		teclado.close();
	}
}
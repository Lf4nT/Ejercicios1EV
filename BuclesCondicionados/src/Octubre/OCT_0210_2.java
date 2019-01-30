package Octubre;

import java.util.Scanner;

/*Calculo sueldo a comisiones*/

public class OCT_0210_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		float ventas;
		float comision;
		double total;
		System.out.println("Introduce el sueldo base: ");
		sueldo = teclado.nextFloat();
		System.out.println("Introduce el número de ventas mensuales: ");
		ventas = teclado.nextFloat();
		System.out.println("Introduce la comisión: ");
		comision = teclado.nextFloat();
		total = sueldo + (ventas * (sueldo * (comision / 100)));
		System.out.println("Tu sueldo final es de " + total + " euros");
		teclado.close();
	}
}
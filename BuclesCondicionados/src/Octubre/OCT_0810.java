package Octubre;

import java.util.Scanner;

/*Calculadora de IVA*/

@SuppressWarnings("unused")
public class OCT_0810 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float precio;
		float factor;
		float iva;
		float pvp;

		System.out.println("Introduce el Precio del Producto: ");
		precio = teclado.nextFloat();
		System.out.println("El Precio introducido es: " + precio + " euros");
		System.out.println("Introduce el Factor de IVA: ");
		factor = teclado.nextFloat();
		iva = precio * (factor / 100);
		System.out.print("El IVA aplicado es: ");
		System.out.println(iva + " euros");
		pvp = precio + iva;
		System.out.print("El Precio de Venta al Publico es: ");
		System.out.println((precio + iva) + " euros");
		teclado.close();
	}
}

package Octubre;

import java.util.Scanner;

/*Presupuesto departamentos Hospital*/

public class OCT_0210_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float presupuesto;
		System.out.println("Introduce el presupuesto base: ");
		presupuesto = teclado.nextFloat();
		System.out.println("El presupuesto de Ginecolog�a es: " + (int) presupuesto * 0.4 + " euros");
		System.out.println("El presupuesto de Traumatolog�a es: " + (int) presupuesto * 0.3 + " euros");
		System.out.println("El presupuesto de Pediatr�a es: " + (int) presupuesto * 0.3 + " euros");
		teclado.close();
	}
}
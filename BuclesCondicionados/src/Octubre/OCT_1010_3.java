package Octubre;

import java.util.Random;

/*�N1 es Mayor que N2?*/

public class OCT_1010_3 {
	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero1 = r.nextInt(10);
		int numero2 = r.nextInt(10);
		System.out.println("N�mero 1: " + numero1);
		System.out.println("N�mero 2: " + numero2);
		if (numero1 > numero2) {
			System.out.println("El n�mero 1 es mayor.");
		} else if (numero1 < numero2) {
			System.out.println("El n�mero 2 es mayor.");
		} else {
			System.out.println("�Son iguales!");
		}
	}
}
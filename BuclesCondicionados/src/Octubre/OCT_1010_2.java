package Octubre;

import java.util.Random;

/*Calculadora de divisiones*/

public class OCT_1010_2 {
	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int n = r.nextInt(1000) + 1;
		int m = r.nextInt(10) + 1;
		double l = (double) n / (double) m;
		System.out.println("Los Números Son " + n + " y " + m);
		if (n % m == 0) {
			System.out.println(n + " Es Divisible Entre " + m);
		} else
			System.out.println(n + " No Es Divisible Entre " + m);
		System.out.println("La Solución a La Division Es " + l);
	}
}

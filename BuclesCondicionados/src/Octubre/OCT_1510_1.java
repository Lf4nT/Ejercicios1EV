package Octubre;

import java.util.Scanner;

/*N1 es divisible entre N2*/

public class OCT_1510_1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int m;
		System.out.println("Introduce el primer numero :");
		n = teclado.nextInt();
		System.out.println("Introduce el segundo numero :");
		m = teclado.nextInt();
		double l = (double) n / (double) m;
		System.out.println("Los Números Son " + n + " y " + m);
		if (n % m == 0) {
			System.out.println(n + " Es Divisible Entre " + m);
		} else
			System.out.println(n + " No Es Divisible Entre " + m);
		System.out.println("La Solución a La Division Es " + l);
		teclado.close();
	}
}
package Octubre;

import java.util.Scanner;

/*Cruz Asteriscos*/

public class OCT_1710_1 {
	static int obtenerFC(String fc) {
		Scanner ky = new Scanner(System.in);
		int x;
		do {
			System.out.println("Numero de " + fc + ": ");
			x = ky.nextInt();
			if (x < 3 || x % 2 == 0)
				System.out.println("Numero de " + fc + " incorrecto, introduzca otro");
		} while (x < 3 || x % 2 == 0);
		return x;
	}

	public static void main(String[] args) {
		int n = obtenerFC("filas");
		int m = obtenerFC("columnas");
		for (int i = 0; i < n; i++) {
			if (i == n / 2) {
				for (int j = 0; j < m; j++)
					System.out.print("*");
			} else {
				for (int j = 0; j < m; j++) {
					if (j == m / 2) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
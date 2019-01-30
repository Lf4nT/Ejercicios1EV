package Octubre;

import java.util.Scanner;

/*Calculadora de Potencias de 3*/

public class OCT_2510 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int impar = -1;
		int n;
		System.out.println("Introduce la cifra que quieres elevar: ");
		n = teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			impar = impar + 2;
			int suma = impar;
			System.out.print(i + "^3 = ");
			for (int j = 2; j <= i; j++) {
				System.out.print(impar + ((j != 1) ? " + " : ""));
				impar = impar + 2;
				suma = suma + impar;
			}
			System.out.println(" = " + suma);
		}
		teclado.close();
	}
}

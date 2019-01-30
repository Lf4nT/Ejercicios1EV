package Octubre;

import java.util.Scanner;

/*Comprobador de triangulos*/

public class OCT_2310_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a;
		float b;
		float c;
		System.out.println("Introduce la longitud de los lados del triangulo");
		a = teclado.nextFloat();
		b = teclado.nextFloat();
		c = teclado.nextFloat();
		if ((a < b + c) && (b < c + a) && (c < b + a)) {
			System.out.println("Es un triangulo");
		} else
			System.out.println("No es un triangulo");
		if ((a == b && b == c)) {
			System.out.println("El triangulo es Equilatero");
		} else {
			if ((a == b) || (b == c) || (c == a)) {

				System.out.println("El triangulo es Isosceles");
			} else {
				System.out.println("Es Escaleno");
			}
		}
		teclado.close();
	}
}

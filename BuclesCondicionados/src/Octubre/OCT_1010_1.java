package Octubre;

import java.util.Random;

/*Numero Aleatorio par o impar*/

public class OCT_1010_1 {
	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero1 = r.nextInt(1000);
		System.out.println(numero1);
		if (numero1 % 2 == 0) {
			System.out.println("Es par");
		} else
			System.out.println("es impar");
	}
}
package Octubre;
import java.util.Scanner;

/*Calculadora de potencias n^n*/

public class OCT_1510_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n;
		n = teclado.nextFloat();
		System.out.println((n * n));
		teclado.close();
	}
}
package Octubre;
import java.util.Scanner;

/*Operaciones Locas*/

public class OCT_1710_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("inserte un numero");
		n = teclado.nextInt();
		do {
			if (n % 2 == 0) {
				System.out.println(n = n / 2);
			} else
				System.out.println(n = (n * 3) + 1);
		} while (n > 1);
		teclado.close();
	}
}

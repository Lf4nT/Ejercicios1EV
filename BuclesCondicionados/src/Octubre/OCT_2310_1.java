package Octubre;

/*Piramide de Numeros*/

public class OCT_2310_1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int n = 1 % 10;
			int espacios = 10 - i;
			int digitos = i + i - 1;
			for (int a = 0; a < espacios; a++)
				System.out.print(" ");
			for (int b = 0; b < digitos; b++) {
				if (b >= digitos / 2) {
					System.out.print(n-- % 10);
				} else if (b <= digitos / 2) {
					System.out.print(n++ % 10);
				}
			}
			System.out.println();
		}
	}
}
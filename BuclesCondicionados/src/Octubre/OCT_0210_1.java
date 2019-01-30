package Octubre;

import java.util.Scanner;

/*Calculo incremento capital Banco*/

public class OCT_0210_1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float capital;
		float aumento;
		float meses;
		float total;
		System.out.println("Introduce el Capital Invertido: ");
		capital = teclado.nextFloat();
		System.out.println("El valor invertido es de " + capital + " euros");
		System.out.println("Introduce Razón de Crecimiento: ");
		aumento = teclado.nextFloat();
		System.out.println("Introduce el Número de Meses Que El Dinero Va a Estar Invertido:");
		meses = teclado.nextFloat();
		total = capital + ((capital * (aumento / 100) * meses));
		System.out.println("Al cabo de " + (int) meses + " meses el valor de tu capital sera " + total + " euros");
		teclado.close();
	}
}
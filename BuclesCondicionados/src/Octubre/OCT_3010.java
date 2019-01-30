package Octubre;

/*Juegos Con Asteriscos*/

public class OCT_3010 {
	static void asdf(int f) {
		int asteriscos = 2;
		int espacios;
		int total = (int) Math.pow(2, f) / 2;
		for (int i = 0; i < f; i++) {
			espacios = total - asteriscos / 2;
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < asteriscos; j++) {
				System.out.print("*");
			}
			asteriscos += asteriscos;
			System.out.println();
		}
	}

	static void mosaico(int f, int c) {
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

	static void tablero(int c, int f, int l) {
		int ctxt = c * l;
		int ftxt = f * l;
		for (int i = 0; i < ftxt; i++) {
			for (int j = 0; j < ctxt; j++) {
				int ctab = j / l;
				int ftab = i / l;
				if ((ftab % 2 == 0 && ctab % 2 != 0) || (ftab % 2 != 0 && ctab % 2 == 0)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		asdf(6);
		mosaico(8, 8);
		tablero(4, 3, 4);
	}

}

package bidimensionalesboletin3;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para recoger la tabla bidimensional.
		int num[][] = new int[3][6];

		// Aplicamos los valores a la tabla.
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		System.out.println(Arrays.deepToString(num));
	}

}

package funcionesbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	// Creamos un nuevo Random.
	static Random rand = new Random();

	public static void main(String[] args) {

		// Creamos una tabla de 6 filas y 10 columnas.
		int tabla[][] = new int[6][10];

		// Variable para recoger los valores de la tabla.
		int valores;

		for (int filas = 0; filas < tabla.length; filas++) {

			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {

				// Le aplicamos numeros aleatorios a los valores.
				valores = rand.nextInt(0, 1001);

				// Aplicamos los valores a la tabla.
				tabla[filas][columnas] = valores;

			}

		}

		System.out.println(Arrays.toString(picos(tabla)));

	}

	static int[] picos(int tabla[][]) {

		int tablaMinMax[] = new int[2];

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < tabla.length; i++) {

			for (int valores : tabla[i]) {

				if (valores < min) {

					min = valores;

				}

				if (valores > max) {

					max = valores;

				}

			}

		}

		tablaMinMax[0] = min;
		tablaMinMax[1] = max;

		return tablaMinMax;
	}

}

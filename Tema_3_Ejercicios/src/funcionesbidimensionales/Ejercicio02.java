package funcionesbidimensionales;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {

		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println(Arrays.deepToString(tabla));

		System.out.println(Arrays.deepToString(giraTabla(tabla)));

	}

	static int[][] giraTabla(int tabla[][]) {

		int[][] traspuesta = new int[4][4];

		for (int columnas = 0; columnas < tabla[0].length; columnas++) {

			for (int filas = 0; filas < tabla.length; filas++) {

				traspuesta[columnas][filas] = tabla[filas][columnas];

			}

		}

		return traspuesta;

	}

}

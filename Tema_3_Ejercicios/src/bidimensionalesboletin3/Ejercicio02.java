package bidimensionalesboletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para recoger la tabla del usuario.
		int tabla[][] = new int[5][6];

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos las notas al usaurio.
		for (int filas = 1; filas < tabla.length; filas++) {

			System.out.println("Nota " + filas);

			for (int columnas = 1; columnas < tabla.length; columnas++) {

				System.out.println();

			}

		}

		// Bucle para las columnas.
		for (int filas = 0; filas < tabla.length; filas++) {

			System.out.println("Alumno " + (filas + 1) + "\t");

		}

	}

}

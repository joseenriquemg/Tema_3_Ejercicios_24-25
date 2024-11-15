package bidimensionalesboletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para recoger la tabla del usuario.
		double tabla[][] = new double[4][5];

		// Creamos una variable para recoger el valor minimo.
		double min;

		// Creamos una variable para recoger el valor maximo.
		double max;

		// Creamos una variable para la media.
		double media = 0;

		// Variable para sumar las notas.
		double suma = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un primer bucle for para solicitar los datos.
		for (int filas = 0; filas < tabla.length; filas++) {

			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {

				System.out.println(
						"Introduzca la nota del Alumno " + (filas + 1) + " en la asignatura " + (columnas + 1));

				tabla[filas][columnas] = sc.nextInt();

			}

		}

		System.out.print("               ");
		System.out.print("Asignatura 1   ");
		System.out.print("Asignatura 2   ");
		System.out.print("Asignatura 3   ");
		System.out.print("Asignatura 4   ");
		System.out.print("Asignatura 5   ");

		for (int filas = 0; filas < tabla.length; filas++) {

			suma = 0;
			min = 0;
			max = 0;

			max = Integer.MAX_VALUE;
			min = Integer.MIN_VALUE;

			System.out.println();

			System.out.print("Alumno " + (filas + 1));

			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {

				System.out.print("            " + tabla[filas][columnas]);

				suma += tabla[filas][columnas];

				if (tabla[filas][columnas] > min) {

					min = tabla[filas][columnas];

				}

				if (tabla[filas][columnas] < max) {

					max = tabla[filas][columnas];

				}

			}

			System.out.print("       Maximo: " + min + "   Minimo: " + max + "    Media: " + media);

			media = suma / 5;

		}

	}

}

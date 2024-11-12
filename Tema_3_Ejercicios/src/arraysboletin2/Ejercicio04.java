package arraysboletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable para recoger las puntuciones.
		int puntuaciones = 0;

		// Tabla donde guardaremoslos datos.
		int tabla[] = new int[8];

		// Tbla ordenada descendentemente.
		int tablaDescendente[] = new int[8];

		// Variable booleana para lanzar el try catch.
		boolean error = false;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle para solicitar las puntuaciones de todos los usuario.
		for (int i = 0; i < tabla.length; i++) {

			do {

				// Cambiamos el error a false.
				error = false;

				try {

					// Solicitamos al usario las puntuaciones.
					System.out.println("Introduzca las puntuaciones del jugador " + (i + 1) + " (1000 - 2800):");

					// Leemos del teclado.
					puntuaciones = sc.nextInt();

				} catch (InputMismatchException e) {

					// Lanzamos mensaje de error.
					System.out.println("Su puntuacion no es correcta.");

					// Cambiamos nuestra variable booleana.
					error = true;

				}

				// Condicion para limpiar el Scanner.
				if (error) {

					// Limpiamos el Scanner.
					sc.next();

				}

			} while (error || puntuaciones < 1000 || puntuaciones > 2800);

			// Aplicamos los valores a la tabla.
			tabla[i] = puntuaciones;

		}

		// Ofrecemos la tabla desordenada.
		System.out.println("Tabla desordenada:");
		System.out.println(Arrays.toString(tabla));

		// Ordenamos la tabla ascencentemente.
		Arrays.sort(tabla);

		// Bucle para ordenarlo de manera descendente.
		for (int i = tabla.length - 1; i >= 0; i--) {

			// Ofrecemos la tabla al usuario.
			tablaDescendente[i] = tabla[(tabla.length - 1) - i];

		}

		// Ofrecemos la tabla ordenada.
		System.out.println("Tabla ordenada:");
		System.out.println(Arrays.toString(tablaDescendente));
	}

}

package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable para recoger los numeros del usuario.
		int numeros = 0;

		// Variable para recoger la tabla.
		int tabla[] = new int[8];

		// Creamos una variable para cubrir las excepciones.
		boolean error = false;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle para solicitar los numeros al usuario.
		for (int i = 0; i < tabla.length; i++) {

			do {

				// Cambiamos el error a false.
				error = false;

				try {

					// Solicitamos los numeros al usaurio.
					System.out.println("Introduzca valores a la tabla:");

					// Leemos del teclado.
					numeros = sc.nextInt();

				} catch (InputMismatchException e) {

					// Lanzamos mensaje de error.
					System.out.println("Debe introducir un entero.");

					// Cambiamos nuestra variable booleana.
					error = true;
				}

				// Condicion para limpiar el Scanner.
				if (error) {

					// Limpiamos el Scanner.
					sc.next();

				}

			} while (error);
			// Aplicamos los valores a la tabla.
			tabla[i] = numeros;

		}

		// Bucle para recoger la tabla
		for (int valores : tabla) {

			// Condiciones para saber si un numero es par o impar.
			if (valores % 2 == 0) {

				System.out.println(valores + " --> par");

			} else {

				System.out.println(valores + " --> impar");

			}

		}

		// Cerramos el Scanner.
		sc.close();

	}

}

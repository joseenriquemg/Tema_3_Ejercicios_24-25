package arraysboletin1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable para recoger los numeros del usuario.
		int numeros = 0;

		// Variable para recoger la tabla.
		int tabla[] = new int[10];

		// Variable para recoger la suma.
		int suma = 0;

		// Variable para recoger el maximo.
		int maximo = Integer.MIN_VALUE;

		// Variable para recoger el minimo.
		int minimo = Integer.MAX_VALUE;

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

			// Vamos sumando los numeros.
			suma += numeros;

			if (numeros > maximo) {

				maximo = numeros;

			}

			if (numeros < minimo) {

				minimo = numeros;

			}

		}

		// Bucle para recorrer la tabla desde el final al principio.
		for (int i = 0; i < tabla.length; i++) {

			// Ofrecemos la tabla al usuario.
			System.out.print(tabla[i] + " ");

		}

		// Espacio en blanco.
		System.out.println();

		// Ofrecemos elresultado de la suma.
		System.out.println("La suma de sus valores resulta: " + suma);
		System.out.println("El valor maximo es: " + maximo);
		System.out.println("El valor minimo es: " + minimo);

		// Cerramos el Scanner.
		sc.close();

	}

}

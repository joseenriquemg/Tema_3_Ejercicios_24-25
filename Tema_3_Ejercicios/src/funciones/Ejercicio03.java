package funciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	// Creamos un nuevo Scanner.
	static Scanner sc = new Scanner(System.in);

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int longitud = leeNumeroPositivo("la longitud");

		int fin = leeNumeroPositivo("el fin");

		int tabla[] = rellenaPares(longitud, fin);

		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));

		sc.close();

	}

	/**
	 * 
	 * @param dato
	 * @return
	 */
	static int leeNumeroPositivo(String dato) {

		int numero = -1;

		do {

			try {

				System.out.println("Introduzca " + dato);

				numero = sc.nextInt();

			} catch (InputMismatchException e) {

				System.err.println("Debe introducir un entero.");

			} finally {

				sc.nextLine();

			}

		} while (numero < 0);

		return numero;

	}

	/**
	 * Metodo para rellenar la tabla con numeros pares.
	 * 
	 * @param longitud Parametro que indica la longitud de la tabla
	 * @param fin      Parametro que indica el valor maximo posible de la tabla.
	 * @return Devuelve la tabla de numeros pares y ordenada.
	 */
	static int[] rellenaPares(int longitud, int fin) {

		// Variable para recoger los numeros pares.
		int pares = 0;

		// Variable para aumentar el contador por cda valor de la tabla.
		int contador = 0;

		// Creamos una tabla para meter los valores.
		int tabla[] = new int[longitud];

		// Creamos un nuevo random.
		Random rand = new Random();

		// Bucle para añadir solo los numeros pares a la tabla.
		while (contador < tabla.length) {

			// Generamos los numeros aleatorios.
			pares = rand.nextInt(2, fin);

			// Condicion para introducir solo los numeros pares.
			if (pares % 2 == 0) {

				// Aplicamos los valores a la tabla.
				tabla[contador] = pares;

				// Aumentamos el contador.
				contador++;

			}

		}

		// Devolvemos la tabla.
		return tabla;

	}

}

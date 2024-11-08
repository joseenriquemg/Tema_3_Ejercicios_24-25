package arrays;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable booleana para recoger errores.
		boolean esCorrecto = true;

		// Variable para recoger el numero.
		int numero;
		
		// Creamso la tabla.
		int tabla[] = new int[100];

		// Creamos un nuevo Random.
		Random rand = new Random();
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {

			// Cambiamos el error a false.
			esCorrecto = false;

			try {

				System.out.println("Introduzca el numero que desea buscar (1-10):");

				numero = sc.nextInt();

				assert (numero >= 1 && numero < 11) : "Introduzca el numero que desea buscar (1-10):";

			} catch (InputMismatchException e) {

				// Mensaje de error.
				System.out.println("Ese no es un valor entero.");

				// Cambiamos el error a true para que vuelva a entrar.
				esCorrecto = true;

			} catch (AssertionError e) {

				System.out.println(e.getLocalizedMessage());

				// Cambiamos el error a true para que vuelva a entrar.
				esCorrecto = true;

			}

			// Condicion para limpiar el Scanner.
			if (esCorrecto) {

				// Limpiamos el Scanner.
				sc.next();

			}

		} while (esCorrecto);

	}

}

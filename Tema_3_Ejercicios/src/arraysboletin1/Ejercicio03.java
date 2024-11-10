package arraysboletin1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable para recoger los numeros del usuario.
		int numeros = 0;

		// Variable para recoger la tabla.
		int tabla[] = new int[10];

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

		// Bucle para recorrer la tabla desde el final al principio.
		for (int i = tabla.length; i > 0; i--) {

			// Ofrecemos la tabla al usuario.
			System.out.print(i + " ");

		}

		// Cerramos el Scanner.
		sc.close();

	}

}

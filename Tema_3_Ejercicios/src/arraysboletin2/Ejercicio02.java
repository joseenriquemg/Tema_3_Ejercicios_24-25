package arraysboletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para almacenar los valores del usuario.
		int valores[] = new int[20];

		// Variable booleana para excluir los errores de datos en el codigo.
		boolean error = true;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle para solicitar los numeros al usuario.
		for (int i = 0; i < 20; i++) {

			do {

				// Cambiamos el error a false.
				error = false;

				try {

					// Solicitamos los numeros al usaurio.
					System.out.println("Introduzca el valor " + (i + 1) + " a la tabla:");

					// Leemos del teclado.
					valores[i] = sc.nextInt();

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
		}

		// Creamos las dos tablas: los 10 primeros y los 10 últimos.
		int[] primerArray = Arrays.copyOfRange(valores, 0, 10);
		int[] segundoArray = Arrays.copyOfRange(valores, 10, 20);

		// Imprimimos ambas tablas.
		System.out.println(Arrays.toString(primerArray));
		System.out.println(Arrays.toString(segundoArray));

		// Comparamos ambas tabla y ofrecemos el resultado.
		if (Arrays.equals(primerArray, segundoArray)) {
			System.out.println("Las dos tablas son iguales.");
		} else {
			System.out.println("Las dos tablas son distintas.");
		}

		// Cerramos el Scanner.
		sc.close();

	}

}

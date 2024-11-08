package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Tabla para recoger las 12 temperaturas.
		int tabla[] = new int[12];

		// Variable que solicitaremos al usaurio.
		int temperatura = 0;

		// Variable para poner los valores en la tabla.
		int contadorMeses = 0;

		// Variable para recoger los meses.
		String meses;

		// Variable booleana para recoger errores.
		boolean esCorrecto = true;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle para preguntar los meses.
		for (int i = 0; i < tabla.length; i++) {
			do {

				// Cambiamos el error a false.
				esCorrecto = false;

				try {

					System.out.print("Introduzca la temperatura media del mes " + (i + 1) + ": ");

					temperatura = sc.nextInt();

				} catch (InputMismatchException e) {

					// Mensaje de error.
					System.out.print("  Esa temperatra no es posible.");

					// Cambiamos el error a true para que vuelva a entrar.
					esCorrecto = true;

				}

				// Condicion para limpiar el Scanner.
				if (esCorrecto) {

					// Limpiamos el Scanner.
					sc.next();

				}

			} while (esCorrecto);

			tabla[i] = temperatura;
		}

		for (int valores : tabla) {

			contadorMeses++;

			meses = switch (contadorMeses) {

			case 1 -> {
				yield "Enero       |";
			}
			case 2 -> {
				yield "Febrero     |";
			}
			case 3 -> {
				yield "Marzo       |";
			}
			case 4 -> {
				yield "Abril       |";
			}
			case 5 -> {
				yield "Mayo        |";
			}
			case 6 -> {
				yield "Junio       |";
			}
			case 7 -> {
				yield "Julio       |";
			}
			case 8 -> {
				yield "Agosto      |";
			}
			case 9 -> {
				yield "Septiembre  |";
			}
			case 10 -> {
				yield "Octubre     |";
			}
			case 11 -> {
				yield "Noviembre   |";
			}
			case 12 -> {
				yield "Diciembre   |";
			}
			default -> {
				yield "Imposible";
			}

			};

			System.out.print(meses);

			for (int i = 0; i < valores; i++) {

				System.out.print("*");

			}

			System.out.println();

		}

		// Cerramos el Scanner.
		sc.close();

	}

}

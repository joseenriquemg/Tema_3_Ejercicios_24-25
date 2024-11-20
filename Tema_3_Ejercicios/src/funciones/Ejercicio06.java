package funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] tabla;

		int longitud = 0;

		int grupos = 0;

		do {

			try {

				System.out.println("¿De que tamaño deseas que sea tu Arrays?");

				longitud = sc.nextInt();

				assert (longitud > 0) : "La longitud debe ser mayor que 0";

			} catch (InputMismatchException e) {

				System.err.println("Debe introducir un entero.");

			} catch (AssertionError e) {

				System.err.println(e.getLocalizedMessage());

			} finally {

				sc.nextLine();

			}

		} while (longitud <= 0);

		do {

			try {

				System.out.println("¿De que tamaño desea hacer las agrupaciones?");

				grupos = sc.nextInt();

				assert (grupos < longitud) : "Las agrupaciones tienen que ser mayor o igual a la longitud";

			} catch (InputMismatchException e) {

				System.err.println("Debe introducir un entero.");

			} catch (AssertionError e) {

				System.err.println(e.getLocalizedMessage());

			} finally {

				sc.nextLine();

			}

		} while (grupos > longitud);

		sc.close();

	}
}

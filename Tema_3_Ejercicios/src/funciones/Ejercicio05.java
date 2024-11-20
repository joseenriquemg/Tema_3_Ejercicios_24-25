package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una tabla con valores predeterminados
		int tabla[] = { 1, 2, 3, 4, 5, 4, 7, 8, 9, 10 };

		// Varible para recoger el numero a busacr.
		int valor = 0;

		System.out.println("¿Que valor deseas busca en la tabla?");

		valor = sc.nextInt();
		
		int tablaFinal[] = buscarTodos(tabla, valor);

		System.out.println(Arrays.toString(tablaFinal));

	}

	static int[] buscarTodos(int tabla[], int valor) {

		int posicion = 0;

		int longitudBuscados = 0;

		int buscados[];

		for (int numero : tabla) {

			if (numero == valor) {

				longitudBuscados++;

			}

		}

		buscados = new int[longitudBuscados];

		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] == valor) {

				buscados[posicion] = i;

				posicion++;

			}

		}

		return buscados;

	}

}

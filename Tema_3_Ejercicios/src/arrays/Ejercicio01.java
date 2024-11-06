package arrays;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable que recogera la tabla de longitud 10.
		int tabla[] = new int[10];

		// Variable para recoger los valores aleatorios de la tabla.
		int valores;

		// Creamos un nuevo Ramdon.
		Random rand = new Random();

		// Bucle para recorrer la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Aplicamos valores aleatorios del 1 al 100 incluido.
			valores = rand.nextInt(1, 101);

			// Aplicamos esos valores a la tabla.
			tabla[i] = valores;

			// Imprimimos el resultado al usuario.
			System.out.print(tabla[i] + " ");

		}

	}

}

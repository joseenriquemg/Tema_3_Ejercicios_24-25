package arraysboletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos la tabla.
		int tabla[] = new int[30];

		// Variable para los valores de la tabla.
		int valores = 0;

		// Creamos un nuevo Random.
		Random rand = new Random();

		// Bucle para recorrer la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Definimos los valores de la tabla.
			valores = rand.nextInt(0, 10);

			// Aplicamos los valores a la tabla.
			tabla[i] = valores;

		}

		// Ofrecemos la tabla desordenada.
		System.out.println("Tabla desordenada:");
		System.out.println(Arrays.toString(tabla));

		// Ordenamos la tabla.
		Arrays.sort(tabla);

		// Ofrecemos la tabla ordenada.
		System.out.println("Tabla ordenada:");
		System.out.println(Arrays.toString(tabla));

	}

}

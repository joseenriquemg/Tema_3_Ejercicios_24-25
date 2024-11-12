package arraysboletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable que recoge la tabla arrays ganadora
		int[] ganadora = { 7, 19, 22, 33, 40, 45 };
		// Variable para recoger la serie del jugador
		int[] apuesta = new int[6];

		int numero;
		
		int i = 0;
		// Variable para recoger el número de aciertos
		int aciertos = 0;

		Random rand = new Random();

		// Generación de números de la apuesta sin repetir
		while (i < apuesta.length) {
			numero = rand.nextInt(1, 50);

			// Busqueda secuencial dentro del array para evitar números repetidos
			int indice = 0;
			while (indice < i && apuesta[indice] != numero) {
				indice++;
			}

			if (indice == i) { // Si el número no existe en el array
				apuesta[i] = numero;
				i++;
			}
		}

		System.out.print("Boleto premiado: ");

		Arrays.sort(ganadora);
		System.out.println(Arrays.toString(ganadora));

		// Ordenar y mostrar la apuesta
		System.out.print("Su apuesta: ");

		Arrays.sort(apuesta);
		System.out.println(Arrays.toString(apuesta));

		// Contar aciertos
		for (int valor : apuesta) {
			if (Arrays.binarySearch(ganadora, valor) >= 0) {
				aciertos++;
			}
		}

		System.out.println("Tienes " + aciertos + " aciertos.");
	}
}

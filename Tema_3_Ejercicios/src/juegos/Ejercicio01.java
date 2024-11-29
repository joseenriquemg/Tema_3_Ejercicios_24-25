package juegos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int filas = 0;

		int columnas = 0;

		int valor = 0;

		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		System.out.println("Introduzca las filas que deseas que tenga tu tabla:");

		filas = sc.nextInt();

		System.out.println("Introduzca las columnas que deseas que tenga tu tabla:");

		columnas = sc.nextInt();

		int tabla[][] = new int[filas][columnas];

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {

				tabla[i][j] = rand.nextInt(0, 101);

			}

		}

		System.out.println("¿Que valor deseas buscar?");

		valor = sc.nextInt();

		System.out.println(buscaNumero(tabla, valor));

		sc.close();

	}

	static boolean buscaNumero(int tablaAleatoria[][], int valor) {

		boolean encontrado = false;

		for (int i = 0; i < tablaAleatoria.length; i++) {

			for (int j = 0; j < tablaAleatoria[0].length; j++) {

				if (valor == tablaAleatoria[i][j]) {

					encontrado = true;

				}

			}

		}

		return encontrado;
	}

}

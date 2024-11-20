package funciones;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una tabla con valores predeterminados
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Varible para recoger el numero a busacr.
		int clave = 0;
		
		System.out.println("¿Que valor deseas busca en la tabla?");
		
		clave = sc.nextInt();
		
		if (buscar(tabla,clave) > 0) {
			
			System.out.println("Su numero esta en la posicion " + buscar(tabla,clave));
			
		} else {
			
			System.out.println("Su valor no esta en la tabla.");
			
		}
		
		
		
	}
	
	/**
	 * 
	 * @param tabla
	 * @param clave
	 * @return
	 */
	static int buscar(int tabla[], int clave) {
		
		int posicion = -1;
		
		int contador = 0;
		
		while (posicion < 0 && contador < tabla.length) {
			
			if (tabla[contador] == clave) {
				
				posicion = contador;
				
			} 
				
			contador ++;
	
			
		}
		
		return posicion;
		
	}

}

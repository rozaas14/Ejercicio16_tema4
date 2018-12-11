/*
* Ejercicio16
*
* v1
*
* 08/11/2018
*
* Alejandro Rozas
*/

// Declara, crea e inicializa un array
// bidimensional de números reales (mediante
// literales), mostrando luego sus valores

public class Ejercicio16 {
	public static void main(String[] args) {

		double[][] tabla = { { 1.0, 2.0, 3.0, 4.0 }, { 5.0, 6.0, 7.0, 8.0 }, { 9.0, 10.0, 11.0, 12.0 },
				{ 13.0, 14.0, 15.0, 16.0 } }; // Array bidimensional con nUmeros reales
												// Ya introducidos

		// Este for pasara valor a valor todos los valores de el Array
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				System.out.print(tabla[fila][columna] + "\t"); // Imprimira cada valor del array si se cumplen las
																// condiciones

			}
			System.out.println("");
		}
	}
}

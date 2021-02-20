package array_continuo;

import java.util.Scanner;

public class ArrayContinuo {
	
	Integer[][] array;
	int filas, columnas, celdas, contador = 0, minimo_fila = 1, minimo_columna = 0, j = 0, i = 0;
	Scanner entrada = new Scanner(System.in);
	
	public void IngresoDatos() {		
		System.out.print("Ingrese el número de filas: ");
		filas = entrada.nextInt();
		System.out.print("Ingrese el número de columnas: ");
		columnas = entrada.nextInt();
		array = new Integer [filas][columnas];
		celdas = filas * columnas;
	}
		
	public void LogicaEjercicio() {
		while (contador < celdas) {
			for (; i < columnas; i +=1, contador += 1) {				
				array [j][i] = contador;
			}		
			columnas -= 1;
			i -= 1;
			j += 1;
			if (contador == celdas) break;
			for (; j < filas; j += 1, contador += 1) {
				array [j][i] = contador;				
			}	
			filas -= 1;
			i -= 1;
			j -= 1;
			if (contador == celdas) break;
			for (; i >= minimo_columna; i -= 1, contador += 1) {
				array [j][i] = contador;
			}
			minimo_columna += 1;
			i += 1;
			j -= 1;
			if (contador == celdas) break;
			for (; j >= minimo_fila; j -= 1, contador += 1) {
				array [j][i] = contador;
			}
			minimo_fila += 1;
			i += 1;
			j += 1;				
		}
	}
	
	public void ImprimirArray() {
		for (Integer[] jj : array) {
			for (int ii : jj) {
				System.out.print("[" + ii + "]");
			}
			System.out.println("");
		}
	}
}

package logica;

public class ArrayContinuo {
	
	public static void main(String args[]) {		
		
		int contador = 10;
		int filas = 7, columnas = 9;
		int array[][] = new int [filas][columnas];
		int minimo_fila = 1, minimo_columna = 0;
		int j = 0, i = 0;
		int celdas = filas * columnas;
		
		while (contador < celdas + 10) {
			while (i < columnas) {				
				array [j][i] = contador;
				i += 1;
				contador +=1;
			}		
			columnas -= 1;
			i -= 1;
			j += 1;
			if (contador == celdas + 10) {
				break;
			}
			while (j < filas) {
				array [j][i] = contador;
				j += 1;
				contador += 1;
			}	
			filas -= 1;
			i -= 1;
			j -= 1;
			if (contador == celdas + 10) {
				break;
			}
			while (i >= minimo_columna) {
				array [j][i] = contador;
				i -= 1;
				contador += 1; 
			}
			minimo_columna += 1;
			i += 1;
			j -= 1;
			while (j >= minimo_fila) {
				array [j][i] = contador;
				j -= 1;
				contador += 1; 
			}
			minimo_fila += 1;
			i += 1;
			j += 1;	
			if (contador == celdas +10) {
				break;
			}
		}		
		for (int k = 0; k < 7; k += 1 ) {
			for (int l = 0; l < 9; l += 1) {
				System.out.print("[" + array[k][l] + "]");
			}
			System.out.println("");
		}
	}
}

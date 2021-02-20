package sudoku;

public class Logica {

	private int[][] sudoku;
	
	public void GenerarDashboard() {
		int[][] sudoku = new int[9][9];
		int numero = 0;		
		for (int j = 0; j < 9; j += 1) {
			for (int i = 0; i < 9; i += 1) {
				numero = (int) Math.random() * 10;
				sudoku[j][i] = numero;
			}
		}
	}
	
	public void ValidarFila() {
		int[] temp = new int[9];
		for (int[] j : sudoku) {
			for (int i = 0; i < 9; i += 1) {
				if (i == 0) {
					temp[i] = j[i] + 1;
				}
				else {
					for (int ii = 0; ii < 9; ii += 1) {
						if (j[i] != temp[ii]) {
							temp[i] = j[i] + 1;;
						} else {
							break;
						}
					}
				}
			}
		}
	}
	
	public void ValidarColumna() {
		int[] temp = new int[9];
		for (int i = 0; i < 9; i += 1) {
			for (int j = 0; j < 9; j += 1) {
				if (j == 0) {
					temp[j] = sudoku[j][i] + 1; 
				} else {
					for (int ii = 0; ii < 9; ii += 1) {
						if (sudoku[j][i] != temp[ii]) {
							temp[i] = sudoku[j][i] + 1; 
						 } else {
							 break;
						 }
					}
				}
			}
		}
	}
	
	public void ValidarPorGrupo() {
		int[] temp = new int [9];
		int longitud_grupo = 0;
		for (int j = 0; j < (longitud_grupo += 3); j += 1) {
			for (int i = 0; i < (longitud_grupo += 3); i += 1) {
				if (i == 0) {
					temp[i] = sudoku[j][i] + 1;
				} else {
					for (int ii = 0; ii < 9; ii += 1) {
						if (sudoku[j][i] != temp[ii]) {
							temp[i] = sudoku[j][i] + 1;
						} else {
							break;
						}
					}
				}
			}
		}
	}
	
	public void ImprimirSudoku() {
		for (int[] j : sudoku) {
			for (int i : j) {
				System.out.print("[" + i + "]");
			}
			System.out.println();
		}
	}	
}

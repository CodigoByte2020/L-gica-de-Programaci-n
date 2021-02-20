package sudoku;

public class Main {

	public static void main(String[] args) {
		Logica objeto = new Logica();
		objeto.GenerarDashboard();
		objeto.ValidarFila();
		objeto.ValidarColumna();
		objeto.ImprimirSudoku();
	}
}

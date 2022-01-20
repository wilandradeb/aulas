package williams;

import javax.swing.JOptionPane;

public class Exercício5 {
	
	public static void main(String[] args) {
		
		double sM = 788;
		double sFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
		double resultado = sFuncionario / sM;
		JOptionPane.showMessageDialog(null, "O funcionário ganha " + resultado + " salários mínimos");
	}

}

package williams;

import javax.swing.JOptionPane;

public class Exerc�cio5 {
	
	public static void main(String[] args) {
		
		double sM = 788;
		double sFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio"));
		double resultado = sFuncionario / sM;
		JOptionPane.showMessageDialog(null, "O funcion�rio ganha " + resultado + " sal�rios m�nimos");
	}

}

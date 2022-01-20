package williams;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
		double reajuste = saldo * 0.01;
		double saldoReajustado = saldo + reajuste;
		JOptionPane.showMessageDialog(null, saldoReajustado);
		
	}

}

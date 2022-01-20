package williams;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		
//		for (int i = 1; i <= 10; i++) {
//			JOptionPane.showMessageDialog(null, num * i);	
//		}
		int i = 1;
		while (i <= 10) {
			JOptionPane.showMessageDialog(null, num * i) ;
			i = i + 1;
		}
	
		
	}
}
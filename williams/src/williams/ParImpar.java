package williams;

import javax.swing.JOptionPane;

public class ParImpar {
	
	public static void main(String[] args) {
		
		int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Numero Inteiro"));
		int i = numeroInteiro % 2;
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "Par");
		} else {
			JOptionPane.showMessageDialog(null, "Impar");
		}
	}

}

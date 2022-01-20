package williams;

import javax.swing.JOptionPane;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		int j = i - 1;
		int l = i + 1;
		JOptionPane.showMessageDialog(null, j + " e " + l);
		
	}

}

package williams;

import javax.swing.JOptionPane;

public class Algoritmos {
	
	public static void main(String[] args) {
		
		int a = 69;//Integer.parseInt(JOptionPane.showInputDialog("Inteiro A"));
		int b = 52;//Integer.parseInt(JOptionPane.showInputDialog("Inteiro B"));
		int c = 33;//Integer.parseInt(JOptionPane.showInputDialog("Inteiro C"));
		int maior = 0;
		if (a > b && a > c) {
				maior = a;				
			}
		if (b > c) {
			if (b > a) {
				maior = b;
			}
		}
		if (c > a) {
			if (c > b) {
				maior = c;
			}
		}
		JOptionPane.showMessageDialog(null, maior);
		
	}

}

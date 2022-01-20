package williams;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("Lado A"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Lado B"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Lado C"));
		if (a == b && a == c) {
			JOptionPane.showMessageDialog(null, "Equilátero");
		}
		if (a == b && a != c) {
			JOptionPane.showMessageDialog(null, "Isósceles");
		}
		if (a != b && a == c) {
			JOptionPane.showMessageDialog(null, "Isósceles");			
		}
		if (a != b && b == c) {
			JOptionPane.showMessageDialog(null, "Isósceles");
		}
		if (a != b && a != c && b != c) {
			JOptionPane.showMessageDialog(null, "Escaleno");
		}
	}
}

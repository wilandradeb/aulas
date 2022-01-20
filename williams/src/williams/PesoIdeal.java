package williams;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		
		double h = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		String sexo = JOptionPane.showInputDialog("Sexo");
		double pesoIdeal = 0.0;
		if ("h".equalsIgnoreCase(sexo)) {
			pesoIdeal = (72.7 * h) - 58;
		} else {
			pesoIdeal = (62.1 * h) - 44.7;
		}
		System.out.println(pesoIdeal);
	}

}

package williams;

import javax.swing.JOptionPane;

public class Salario {
	
	public static void main(String[] args) {
	
	/*i) Valor da hora trabalhada: R$5,20;*/
	/*ii) Quando o número de horas excederem a 44h/semana, as horas excedentes valem cada uma R$8,40*/
	
	double matricula = Double.parseDouble(JOptionPane.showInputDialog("Matrícula"));
	
	if (matricula > 0) {
		
		double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas"));
		double horaNormal = 0.0;
		if (horasTrabalhadas <= 44) {
			horaNormal = horasTrabalhadas * 5.20;
			JOptionPane.showMessageDialog(null, horaNormal);
		} else if (horasTrabalhadas > 44) {
			horaNormal = 44 * 5.20;
				double horaExtra = (horasTrabalhadas - 44) * 8.40;
				JOptionPane.showMessageDialog(null, horaNormal + horaExtra);
			}	
		}
		
		
	}
}

	
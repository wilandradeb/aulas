package williams;

import javax.swing.JOptionPane;

public class Temperatura {
	
	public static void main(String[] args) {
	
	double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua temperatura"));
	double farenheit = temperatura * 1.8 + 32;
	double kelvin = temperatura + 273.15;
	double reaumur = temperatura * 0.8;
	double rankine = temperatura * 1.8 + 32 + 459.67;
	JOptionPane.showMessageDialog(null,"Farenheit: "+farenheit+" Kelvin: "+kelvin+ " Reaumur: "+reaumur+ " Rankine: "+rankine);
		
	}		
		
}

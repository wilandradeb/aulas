package williams;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int anos = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		int meses = anos * 30;
		int dias = anos * 365;
		JOptionPane.showMessageDialog(null, anos + " anos\n" + meses + " meses\n" + dias + " dias");
		
	}
	
	

}

package williams;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[6];
		array[0] = Integer.parseInt(JOptionPane.showInputDialog("Primeiro n�mero"));
		array[1] = Integer.parseInt(JOptionPane.showInputDialog("Segundo n�mero"));
		array[2] = Integer.parseInt(JOptionPane.showInputDialog("Terceiro n�mero"));
		array[3] = Integer.parseInt(JOptionPane.showInputDialog("Quarto n�mero"));
		array[4] = Integer.parseInt(JOptionPane.showInputDialog("Quinto n�mero"));
		array[5] = Integer.parseInt(JOptionPane.showInputDialog("Sexto n�mero"));
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = 1;		
				
			} else {
				array[i] = -1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}

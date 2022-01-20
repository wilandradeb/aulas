package williams;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[6];
		array[0] = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		array[1] = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));
		array[2] = Integer.parseInt(JOptionPane.showInputDialog("Terceiro número"));
		array[3] = Integer.parseInt(JOptionPane.showInputDialog("Quarto número"));
		array[4] = Integer.parseInt(JOptionPane.showInputDialog("Quinto número"));
		array[5] = Integer.parseInt(JOptionPane.showInputDialog("Sexto número"));
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

package williams;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		int[] array = new int[15];
		double multiplicacaoPar = 1;
		double somaImpar = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if (array[i] % 2 == 0) {
				multiplicacaoPar *= array[i];
			} else {
				somaImpar += array[i];
			}
		}
		JOptionPane.showMessageDialog(null, multiplicacaoPar);
		JOptionPane.showMessageDialog(null, somaImpar);

	}

}

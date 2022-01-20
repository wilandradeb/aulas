package williams;

import javax.swing.JOptionPane;

public class Exercicio36 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			System.out.print(array[i] +"\t");
		}
		menor = array[0];
		maior = array[0];
		for (int i = 0; i < array.length; i++) {
			if (menor <= array[i]) {
				menor = array[i];
			}
			if (maior >= array[i]) {
				maior = array[i];
			}
		}
		System.out.println("\n Maior:" + maior + "\n Menor:" + menor);

	}

}

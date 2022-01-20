package williams;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio34 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		int maior = 0;
		int menor = 0;
		int x = 0;
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			if (x > 0) {
				if (lista.isEmpty()) {
					lista.add(x);
				}

				for (int i = 0; i < lista.size(); i++) {
					if (x <= lista.get(i)) {
						menor = x;
					}
					if (x >= lista.get(i)) {
						maior = x;
					}
				}
				if (!lista.contains(x)) {
					lista.add(x);
				}

			}
		} while (x > 0);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));

		}
		System.out.println("\n Maior:" + maior + "\n Menor:" + menor);

	}

}

package williams;

import javax.swing.JOptionPane;

public class Exercicio39 {

	public static void main(String[] args) {

		String x;
		String r = "S";
		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			if (num % 2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
			if (num > 0) {
				System.out.println("positivo");
			} else {
				System.out.println("negativo");
			}
			x = JOptionPane.showInputDialog("Deseja encerrar o programa?");
		} while (!x.equalsIgnoreCase(r));
	}
}
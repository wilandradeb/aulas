package williams;

import javax.swing.JOptionPane;

public class CalculadoraVariaveis {

	public static void main(String[] args) {
		double variavel1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1"));
		double variavel2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2"));
		int operacao = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha a operação: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisao"));
		switch (operacao) {
		case 1:
			double soma = variavel1 + variavel2;
			System.out.println(soma);
			break;
		case 2:
			double subtracao = variavel1 - variavel2;
			System.out.println(subtracao);
			break;
		case 3:
			double multiplicacao = variavel1 * variavel2;
			System.out.println(multiplicacao);
			break;
		case 4:
			double divisao = variavel1 / variavel2;
			System.out.println(divisao);
			break;

		}

//		if (operacao == 1) {
//			double soma = variavel1 + variavel2;
//			System.out.println(soma);
//
//		}
//		if (operacao == 2) {
//			double subtracao = variavel1 - variavel2;
//			System.out.println(subtracao);
//		}
//		if (operacao == 3) {
//			double multiplicacao = variavel1 * variavel2;
//			System.out.println(multiplicacao);
//		}
//		if (operacao == 4) {
//			double divisao = variavel1 / variavel2;
//			System.out.println(divisao);
//		}
	}

}

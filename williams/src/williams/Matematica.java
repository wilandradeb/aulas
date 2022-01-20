package williams;

import javax.swing.JOptionPane;

public class Matematica {

	public static void main(String[] args) {

		boolean rodar = true;

		while (rodar) {
			String nome = JOptionPane.showInputDialog("Informe o nome");
			double bim1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
			double bim2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
			double bim3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
			double bim4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
			double media = (bim1 + bim2 + bim3 + bim4) / 4;
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve como media a nota " + media);
			String positivo = JOptionPane.showInputDialog(null, "Deseja calcular a media de outro aluno?");
			if ("sim".equalsIgnoreCase(positivo)) {
				rodar = true;
			} else {
				rodar = false;
			}

		}

	}

}

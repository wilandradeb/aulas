package agenda;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		int i = (Integer.parseInt(JOptionPane.showInputDialog("Quantos contatos deseja inserir?")));
		for (int j = 0; j < i; j++) {
			Contato c = new Contato(JOptionPane.showInputDialog("Nome"),JOptionPane.showInputDialog("N�mero"));
			//c.setNome(JOptionPane.showInputDialog("Nome"));
			//c.setNumero(JOptionPane.showInputDialog("N�mero"));
			JOptionPane.showMessageDialog(null, c.getNome() + "\n" + c.getNumero());

		}

	}

}

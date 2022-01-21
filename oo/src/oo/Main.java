package oo;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
				
		for (int i = 0; i < 3; i++) {
			Pessoa p = new PessoaFisica();
			p.setNome(JOptionPane.showInputDialog("Digite Nome"));
			//p.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento")));
			p.setEmail(JOptionPane.showInputDialog("Digite Email"));
			//p.setEndereco(JOptionPane.showInputDialog("Digite Endereço"));
			JOptionPane.showMessageDialog(null, p.getNome() + "\n" + p.getEmail());
		}
			
	}
}

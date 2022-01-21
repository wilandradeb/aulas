package aluno;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Aluno p = new Aluno();
		p.setNome(JOptionPane.showInputDialog("Nome Aluno"));
		p.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota")));
		if (p.getNota() > 6) {
			p.setConceito("Aprovado");
		} else if (p.getNota() < 6 && p.getNota() > 4) {
			p.setConceito("Recuperação");
		} else if (p.getNota() < 4) {
			p.setConceito("Reprovado");
		}
		JOptionPane.showMessageDialog(null, "Aluno: " + p.getNome() + "\nNota: " + p.getNota() + "\nConceito: " + p.getConceito());
	}

}

//O conceito do Aluno X, com nota X.X é "X"
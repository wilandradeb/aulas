package williams;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double ipi = Double.parseDouble(JOptionPane.showInputDialog("IPI atualizado"));
		double cod1 =  Double.parseDouble(JOptionPane.showInputDialog("C�digo 1"));
		double valorUnit = Double.parseDouble(JOptionPane.showInputDialog("Valor Unit�rio"));
		double quant = Double.parseDouble(JOptionPane.showInputDialog("Quantidade"));
		double cod2 =  Double.parseDouble(JOptionPane.showInputDialog("C�digo 2"));
		double valorUnit2 = Double.parseDouble(JOptionPane.showInputDialog("Valor Unit�rio 2"));
		double quant2 = Double.parseDouble(JOptionPane.showInputDialog("Quantidade 2"));
		double precoFinal = (valorUnit * quant + valorUnit2 * quant2) * (ipi / 100 + 1);
		JOptionPane.showMessageDialog(null,"C�digo Produto 1: " + cod1 + "\nValor Unit�rio: " + valorUnit + "\nQuantidade: " + quant + "\nC�digo Produto 2: " + cod2 + "\nValor Unit�rio 2: " + valorUnit2 + "\nQuantidade 2: " + quant2 + "\nValor Total: R$ " + precoFinal);
		
	}

}

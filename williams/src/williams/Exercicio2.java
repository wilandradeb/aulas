package williams;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int a = 8;
		int b = 9;
		int c = 7;
		int media = (a + b + c) / 3;
		JOptionPane.showMessageDialog(null, media);
		int d = 4;
		int e = 5;
		int f = 6;
		int media2 = (d + e + f) / 3;
		JOptionPane.showMessageDialog(null, media2);
		int somaDasMedias = media + media2; 
		JOptionPane.showMessageDialog(null, somaDasMedias);
		int mediaDasMedias = (media + media2) / 2;
		JOptionPane.showMessageDialog(null, mediaDasMedias);
		
	
	}

}

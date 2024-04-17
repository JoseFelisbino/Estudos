package terca_06_04;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		
		String palavras [][] = new String [2] [2];
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println("");
			for (int j = 0; j < palavras.length; j++) {
				palavras[i][j] = JOptionPane.showInputDialog("Informe a " + (j + 1) + "palavra");
				System.out.print(palavras[i][j]+"\t");

			}
			
		}
		

	}

}

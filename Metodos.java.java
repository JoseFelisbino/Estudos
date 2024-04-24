package Procedimentos_fubcoes;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int idade[] = new int[5];
		String nome[] = new String[5];
		String sexo[] = new String[5];

	}

	private static void menu() {
			String m = "1 - Cadastrar \n" + "2 - Buscar por nome\n" + "3 - Média das idades dos homens\n\n"
					+ "4 - Média\r\n" + "	 * das idades das mulheres"
					+ "5 - Quantidade de mulheres com menos de 18 anos 6" + "6 - Sair";
			
	}
	private static void cadastro (int idade[] ,String nome[], String sexo[]) {
		nome[5]= JOptionPane.showInputDialog(null, "Informe o nome da  pessoa: ");
		idade[5] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));

		
	}
	
	
}
	


	

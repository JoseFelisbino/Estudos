package metodos;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class recursividade {

	public static void main(String[] args) {

		String nome[] = new String[3];
		int idade[] = new int[3];
		String sexo[] = new String[3];
		double nota[][] = new double[3][3];
		int count = 0;
		int op = 0;

		do {
			op = mostrarMenu();
			if (op == 1)
				cadastra(nome, idade, sexo, nota, count++);
			if (op == 2)
				mediaAlunos(count,nota);

		} while (op != 8);

	}

	private static int mostrarMenu() {
		String m = "1 - Cadastrar\n" + "2 - Calcular a média de todos os alunos\n"
				+ "3 - Exibir alunos e se estão aprovados, reprovados ou em recuperação\n"
				+ "4 - Percentual de mulheres e homens reprovados\n" + "5 - Média das idades da turma\n"
				+ "6 - Listar alunos por sexo\n" + "7 - Listar alunos por idade\n\n" + "8 - sair";

		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}

	private static String lerNome() {
		String nome = JOptionPane.showInputDialog("Nome");
		return nome;
	}

	private static String lerSexo() {
		String sexo = JOptionPane.showInputDialog("Sexo");
		return sexo;
	}

	private static int lerIdade() {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("idade entre 17 e 99"));
		if (idade > 17 && idade <= 99) {
			return idade;
		} else {
			return lerIdade();

		}

	}

	private static void lerNota(int count,double nota[][]) {
		
		
		for (int i = 0; i < 3; i++) {
			nota [count][i] = Double.parseDouble(JOptionPane.showInputDialog("nota de 0 a 10"));
			
		}
		
		
	}

	private static void cadastra(String[] nome, int[] idade, String[] sexo, double[][] nota, int count) {
		if (count < 3) {
			nome[count] = lerNome();
			idade[count] = lerIdade();
			sexo[count] = lerSexo();
			 lerNota(count,nota);
		} else {
			msg("Memória cheia");
		}
	}
	
	private static void mediaAlunos (int count,double[] []nota) {
		double somaNota =0;
		double mediaNota =0;
		for (int i = 0; i < count; i++) {
			somaNota += nota[count][i];
		}
		mediaNota += somaNota / count;

		
		
	}

	private static void msg(String string) {
		// TODO Auto-generated method stub

	}

}

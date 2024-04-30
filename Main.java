import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String nome[] = new String[3];
		int idade[] = new int[3];
		String sexo[] = new String[3];
		int count = 0;

		int op = 0;

		do {
			op = menu();
			if (op == 1)
				cadastro(nome, idade, sexo, count);
			if (op == 2)
				BuscarNome(nome, idade, sexo, count);
			if (op == 3)
				System.out.println(idade[mediaIdadeHomens(nome, idade, sexo, count)]);
			if (op == 4)
				System.out.println(idade[mediaIdadeMulheres(nome, idade, sexo, count)]);
			if (op == 5)
				System.out.println(idade[mulheresmenos(nome, idade, sexo, count)]);
		} while (op != 6);

	}

	private static int menu() {
		String m = "1 - Cadastrar\n" + "2 - Buscar por nome\n" + "3 - Média das idade dos homes\n"
				+ " 4 - Média das idade das mulheres\n" + " 5 - Quantidade de mulheres com menos de 18 anos\n"
				+ " 6 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));

	}

	private static void cadastro(String[] nome, int[] idade, String[] sexo, int count) {
		if (count < nome.length) {
			nome[count] = JOptionPane.showInputDialog("Informe o nome:");
			sexo[count] = JOptionPane.showInputDialog("Informe o sexo (F/M):");
			idade[count] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			count++;
		} else {
			JOptionPane.showMessageDialog(null, "Memória cheia");
		}

	}

	private static void BuscarNome(String[] nome, int[] idade, String[] sexo, int count) {
		String nomeBuscar = JOptionPane.showInputDialog("Informe o nome:");
		String resultados ="";
		for (int i = 0; i < count; i++) {
			if (nome[i].equalsIgnoreCase(nomeBuscar)) {
				resultados += idade[i] + "-" + nome[i] + "\n";

			}

		}
		JOptionPane.showMessageDialog(null,resultados );
		

	}

	private static int mediaIdadeHomens(String[] nome, int[] idade, String[] sexo, int count) {
		int mediaIdadeHomens = 0;
		for (int i = 0; i < count; i++) {
			if (sexo[i].equalsIgnoreCase("m")) {
				mediaIdadeHomens = idade[i] / count;

			}

		}
		return mediaIdadeHomens;

	}

	private static int mediaIdadeMulheres(String[] nome, int[] idade, String[] sexo, int count) {
		int mediaIdadeMulheres = 0;
		for (int i = 0; i < count; i++) {
			if (sexo[i].equalsIgnoreCase("f")) {
				mediaIdadeMulheres = idade[i] / count;

			}
		}
		return mediaIdadeMulheres;


	}

	private static int mulheresmenos(String[] nome, int[] idade, String[] sexo, int count) {
		int mulheresAdultas = 0;
		for (int i = 0; i < count; i++) {
			if (sexo[i].equalsIgnoreCase("f") && idade[i] < 18) {
				mulheresAdultas = idade[i];

			}
		}
		return mulheresAdultas;


	}


}

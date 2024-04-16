package terca_06_04;

public class Exercicio2 {

	public static void main(String[] args) {

		double matriz [] [] = new double [5] [4];
		
		for (int i = 1; i < 5;i++ ) {
			
			System.out.println("");
			for (int j=0; j < 3;j++) {
			 matriz[i][j] = i * (j/2.0);
				System.out.print(matriz[i][j]+"\t");
				
			}
		}
		
		
	}

}

import java.util.Scanner;

public class Vetores {
	
	public static final int TAMANHO=10;

	public static void main(String[] args) {
		
		double vetor[] = new double[TAMANHO];
		double total=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + "º aluno");
			vetor[i]= leitor.nextDouble();
			total+= vetor[i];
		}
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("O aluno " + (i+1) + " consumiu R$" + vetor[i]);
		}

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		
		

	}

}

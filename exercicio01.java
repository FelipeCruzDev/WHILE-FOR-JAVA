package repeticoes;
import java.util.Scanner;
public class exercicio01 {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("QUANTOS ALUNOS Á NA SALA: ");
	int Alunos = input.nextInt();
	int cont = 1;
	double soma = 0;
	double media = 0;
	while (cont <= Alunos){
		 System.out.println("Diga a nota: ");
		 float nota = input.nextFloat();
		 soma = soma+nota;
		 cont++;
	}
	media = soma/Alunos;
	System.out.println("A media da sala é:"+media);
}
}

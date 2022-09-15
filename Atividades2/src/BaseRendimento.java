package br.com.atividade2;
import java.util.Scanner;

public class BaseRendimento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor inicial:");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite o taxa de juros:");
		double txJuros = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o rendimento:");
		int numMeses = ler.nextInt();
		
		Rendimento r1 = new Rendimento (vrInicial,txJuros,numMeses); //cria e istancia o objeto
		r1.calcularRendimento();
		
	}

}

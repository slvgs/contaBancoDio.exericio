package exercicios;

import java.util.Scanner;

public class ContaBanco {
	
	public static void main (String []args) {
		
		
		Scanner question = new Scanner(System.in);
		System.out.println("Para criar uma conta no banco preciso do seu nome: ");
			String name = question.next();
		
		System.out.println("Digite o número da sua conta: ");
			int conta = question.nextInt();
		
		System.out.println("Digite o número da sua agencia com hifen: ");
			String agencia = question.next();
		
		
		System.out.println("Digite seu saldo: ");
			Float saldo = question.nextFloat();
	
		System.out.printf("Ola %s, bem vindo ao banco sua conta e %d, sua agencia e %s e seu saldo disponivel no valor de %.2f reais ", name, conta, agencia, saldo );
		
		
		question.close();
	
		
		
		
		
	}
	
	
	
		
	
	

}

package JavaS;

import java.util.Scanner;

public class lacoscondicionaiswitch {
//	Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora 
//	simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler
//	o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o
//	resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1
//	a 4, mostre a mensagem Operação Inválida!

	public static void main (String[] args){
	int resposta = 0;
	float n1 = 0.0f,n2 = 0.0f, resultado = 0.0f;
Scanner leia = new Scanner(System.in);

System.out.println("Digite o valor de n1: ");
n1 = leia.nextInt();
System.out.println("Digite o valor de n2: ");
n2 = leia.nextInt();

System.out.println("\n\tCalculadora:");
System.out.println("\n1- Soma");
System.out.println("\n2- Subtração");
System.out.println("\n3- Multiplicação");
System.out.println("\n4- Divisão");
System.out.println("\nDigite sua opção: ");
resposta = leia.nextInt();

switch(resposta) {
case 1:
	resultado = n1 + n2;
	System.out.println("\nA soma de n1 "+n1+ " e " +n2+ " é igual a: "+resultado);
	break;
case 2:
	resultado = n1 - n2;
	System.out.println("\nA subtração de n1 "+n1+ " e " +n2+ " é igual a: "+resultado);
	break;
case 3:
	resultado = n1 * n2;
	System.out.println("\nA multiplicação de n1 "+n1+" e " +n2+ " é igual a: "+resultado);
	break;
case 4:
	resultado = n1 / n2;
	System.out.println("\nA Divisão de n1 "+n1+" e " +n2+ " é igual a :"+resultado);
	break;
default:
	System.out.println("\nOpção inválida!!!");
} 
leia.close();

}

}
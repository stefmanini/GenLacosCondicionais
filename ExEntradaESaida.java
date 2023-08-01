package JavaS;

import java.util.Scanner;

public class ExEntradaESaida {
	public static void main (String[] args){
float salário = 0.0f, abono = 0.0f, NovoSalário = 0.0f;
Scanner leia = new Scanner(System.in);
System.out.println("Digite o valor de salário: ");
salário = leia.nextInt();
System.out.println("Digite o valor de abono: ");
abono = leia.nextInt();
NovoSalário = salário + abono;
System.out.println("O novo salário é: " +NovoSalário); 
leia.close();
} 
} 
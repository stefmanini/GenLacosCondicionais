package JavaS;

import java.util.Scanner;

public class lacoscondicionaisif {
	
public static void main (String[] args){
		
		int a = 0, b = 0, c = 0, soma = 0;
	
		
		Scanner leia = new Scanner(System.in);
		
		
				System.out.println("Digite o valor de a:");
				a = leia.nextInt();
				System.out.println("Digite o valor de b:");
				b = leia.nextInt();
				System.out.println("Digite o valor de c:");
				c = leia.nextInt();
				
				soma = a + b;
				if (soma>c) {
					 System.out.println("A soma de a + b é maior que c");
					
				} else if (soma == c ) {
	            	  System.out.println("A soma de a + b é igual a c");
						
               } else {
						 System.out.println("A soma de a + b é menor que c");
							
				}
		leia.close();														
	}
}
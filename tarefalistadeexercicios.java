package listadeexercicios;

import java.util.Scanner;

public class tarefalistadeexercicios {



	public static void main (String[]args) {
		
		
		int num1 = 0;
		int num2 = 0;
		int	num3 = 0;
		
		
		Scanner leia = new Scanner (System.in);

		System.out.println(" Informe 1� n�mero: ");
		num1 = leia.nextInt();
		
		
		System.out.println(" Informe o 3� n�mero: ");
		num3 = leia.nextInt();

		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println(" O maior n�mero � : " + num1);
		}
						
		
		if(num2 > num1 && num2 > num3) {
				
			System.out.println(" O maior n�mero � : " + num2);
			
		}
		
		if(num3 > num1 && num3 > num2) {
			
			System.out.println(" O maior n�mero � : " + num3);
				
		System.out.println(" Informe o 2� n�mero: ");
		num2 = leia.nextInt();

		}
		
		

	}

}

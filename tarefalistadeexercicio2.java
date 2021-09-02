package listadeexercicios;

import java.util.Scanner;

public class tarefalistadeexercicio2 {



	public static void main (String[]args) {
		
		
		double numero = 0.0;
		
		
		
		Scanner leia = new Scanner (System.in);

		System.out.println(" Informe o número: " );
		numero = leia.nextDouble();
		
		
		if(numero % 2 == 0) {		
		
		numero = Math.sqrt(numero);  //Math.sqrt serve para extrair à raiz quadrada.
		
		System.out.println(" Seu número é par e à raiz é: " + numero);
		
		}

		
		if(numero % 2 == 1) {
			
		numero = Math.pow(numero, 2); //Math.pow para elevar um número.
		
		System.out.println(" Seu número é impar e à potência é: " + numero);
		
		
		
		}
		
		leia.close();
		
		
	}


}

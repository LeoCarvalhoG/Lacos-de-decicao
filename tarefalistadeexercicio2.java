package listadeexercicios;

import java.util.Scanner;

public class tarefalistadeexercicio2 {



	public static void main (String[]args) {
		
		
		double numero = 0.0;
		
		
		
		Scanner leia = new Scanner (System.in);

		System.out.println(" Informe o n�mero: " );
		numero = leia.nextDouble();
		
		
		if(numero % 2 == 0) {		
		
		numero = Math.sqrt(numero);  //Math.sqrt serve para extrair � raiz quadrada.
		
		System.out.println(" Seu n�mero � par e � raiz �: " + numero);
		
		}

		
		if(numero % 2 == 1) {
			
		numero = Math.pow(numero, 2); //Math.pow para elevar um n�mero.
		
		System.out.println(" Seu n�mero � impar e � pot�ncia �: " + numero);
		
		
		
		}
		
		leia.close();
		
		
	}


}

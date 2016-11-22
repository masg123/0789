package dia09112016;

import java.util.Scanner;

public class Exercicio_1 {


	
	public Exercicio_1(){
	
	exercicio_3 ();
	
		// TODO Auto-generated constructor stub
		/* 
		 * Insira dois numeros
		 * Descubra a média dos dois numeros 
		*/
		int n1;
		int n2;
		int soma;
		
		System.out.println("Introduza o primeiro número");
		n1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o segundo número");
		n2 = (new Scanner(System.in)).nextInt();
		
		soma = n1 + n2;
		
		System.out.println("O resultado é: "+ soma);	
	}

	/*
	 * 
	 */
	public void exercicio_2()
	/*
	*
	*/
	
	{ 
int[] paraSubtrair = {3, 6};
		
		// recorrendo a um ciclo for, some os valores do array para Subtrair
		int subtrair = 0;
		
		for (int i=0; i < paraSubtrair.length; i++)
			subtrair = subtrair * paraSubtrair[i];
		
		
		// mostre no ecrã a subtração obtida
		
		
	}
	public void exercicio_3()
	{
		
				//Exercício 3

			
				//Pedir as 2 numeros
				// os 2 numeros fazem a media
				// Se o resultado for menor que 10 o utilizador informa que o resultado é menor que 10 se for maior que 10 informa o contrario
				
				int  [][] notas = new int[2] [1];
				
				System.out.println ("Introduza o primeiro numero  ");
				notas[0][0] = (new Scanner(System.in)).nextInt();
				
				System.out.println ("Introduza o segundo numero:   ");
				notas[1] [0]= (new Scanner(System.in)).nextInt();
				
				 
				int medianota =( notas[0][0]+ notas[1][0])/2;
				
					
						
					if (medianota >=10)
							{
								System.out.println ("A media dos 3 numeros é "+ medianota +" maior que 10");
							}
							else 
							{
								System.out.println ("A media dos 3 numeros é  "+ medianota +"que é menor que 10");
							}
	}
}
	





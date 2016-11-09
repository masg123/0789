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
		System.out.println(subtarir);
		
	}
	public void exercicio_3()
	{
		int somar = 0;
		
		int [] miguel = {1, 1};
		int [] Alfredo = {3, 0};
		
		int [][] notas  = new int [3][2];
		
		
		notas [0][0] = miguel[0];
		notas [0][0] = Alfredo[0];
		
		
		for (int i=0; i < somar; i++)
		
		
		System.out.println(  notas  );
	}

		
		
		

	
	
	
}




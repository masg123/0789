package dia09112016;

public class TreinoArrays {

	public TreinoArrays() {
		// TODO Auto-generated constructor stub

		
		// N. golos num jogo:
		// Porto-Benfica
		// tipo de variável; [] array; nome de variável; iniciaçao
		// tamanho de variável
		int[] golos = new int[2];
		
		//atribuir variáveis ao array
		golos[0] = 1;
		// Não válido, pois o array é de inteiros
		// golos[0] = "1";
		golos[1] = 1;
		
		// Instanciação com inicialização de variáveis
		int [] portoBenfica = {1, 1};
		int [] sportingArouca = {3, 0};
		int [] maritimoBraga = {1, 0};
		
		int[][] jogosGrandes = new int [2][3];
		jogosGrandes [0][0] = portoBenfica[0];
		jogosGrandes [1][0] = portoBenfica[1];
		jogosGrandes [0][1] = sportingArouca[0];
		jogosGrandes [1][1] = sportingArouca[1];
		jogosGrandes [0][2] = maritimoBraga [0];
		jogosGrandes [1][2] = maritimoBraga[1];
		
		System.out.println(jogosGrandes[0][0]);
	}

}

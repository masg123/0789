package dia09112016;

public class TreinoArrays {

	public TreinoArrays() {
		// TODO Auto-generated constructor stub

		
		// N. golos num jogo:
		// Porto-Benfica
		// tipo de vari�vel; [] array; nome de vari�vel; inicia�ao
		// tamanho de vari�vel
		int[] golos = new int[2];
		
		//atribuir vari�veis ao array
		golos[0] = 1;
		// N�o v�lido, pois o array � de inteiros
		// golos[0] = "1";
		golos[1] = 1;
		
		// Instancia��o com inicializa��o de vari�veis
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

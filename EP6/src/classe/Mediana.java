/**
 * 
 */
package classe;

/**
 * @author alan_
 *
 */
public class Mediana {

	static Integer[] lista = { 50, 35, 70, 10, 35, 15, 5, 40, 60, 65 };

	public static void main(String[] args) {
		calcularMediana(lista);
	}

	private static void calcularMediana(Integer[] lista) {
		int i = 0;
		int numMenor = 0;
		int numMaior = 0;
		
		int menorNum = lista[0];
		int maiorNum = lista[0];

		if (lista.length == 1) {
			System.out.println("A valor da mediana da lista informada e de: " + lista[0]);
			System.exit(0);
		} else if (lista.length == 2) {
			System.out.println("A valor da mediana da lista informada e de: " + (lista[0] + lista[1]) / 2);
			System.exit(0);
		} else {
			while (lista.length > i) {
				
				if (menorNum < lista[i]) {
					numMenor = i;
					menorNum = lista[i];
				}
				
				if (maiorNum > lista[i]) {
					numMaior = i;
					maiorNum = lista[i];
				}
				if (lista.length == i) {
					lista[numMenor] = 0;
					lista[numMaior] = 0;
				}
				i++;
				if(i == 10){
					System.out.println("Funfou!!!");
				}
				
				Integer arrayParcialS[] = new Integer[lista.length-2];
				if (lista[i] != null) {
					arrayParcialS[i] = lista[i];
					lista = new Integer[lista.length-2];
					lista[i] = arrayParcialS[i];
				}
			}
			lista[numMenor] = null;
			lista[numMaior] = null;
			
			for (int j = 0; j < lista.length; j++) {
				System.out.println(lista[j]);
			}
		}

		//calcularMediana(lista);
	}
}
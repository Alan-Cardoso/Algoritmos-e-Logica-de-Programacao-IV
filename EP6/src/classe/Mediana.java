/**
 * 
 */
package classe;

import java.util.ArrayList;

/**
 * @author alan_
 *
 */
public class Mediana {

	public class No {
		Integer numero;
		No no;

		public No(int numAdicionado) {
			numero = numAdicionado;
		}
	}

	static ArrayList<No> lista = new ArrayList<No>();

	public static void main(String[] args) {
		preencheArrayList(lista);
		calcularMediana(lista);
	}

	@SuppressWarnings("null")
	private static void preencheArrayList(ArrayList<No> lista) {

		lista.add(0, new No(50));
		lista.add(1, new No(35));
		lista.add(2, new No(70));
		lista.add(3, new No(10));
		lista.add(4, new No(35));
		lista.add(5, new No(15));
		lista.add(6, new No(5));
		lista.add(7, new No(40));
		lista.add(8, new No(60));
		lista.add(9, new No(55));

	}

	private static void calcularMediana(ArrayList<No> lista) {
		Integer maiorNum = null;
		Integer menorNum = null;
		Integer i = 0;
		Integer indiceMenor = 0;
		Integer indiceMaior = 0;

		if (lista.size() == 1) {
			System.out.println("A valor da mediana da lista informada e de: "
					+ lista.get(0).numero);
			System.exit(0);
		}
		if (lista.size() == 2) {
			System.out.println("A valor da mediana da lista informada e de: "
					+ (lista.get(0).numero + lista.get(1).numero) / 2);
			System.exit(0);
		}
		while (i < lista.size()) {
			if (lista.get(i).numero < menorNum) {
				menorNum = lista.get(i).numero;
				indiceMenor = i;
			}
			if (lista.get(i).numero > maiorNum) {
				maiorNum = lista.get(i).numero;
				indiceMaior = i;
			}
			i++;
		}
		System.out.println(lista.get(indiceMenor));

		lista.remove(lista.get(indiceMenor));
		lista.remove(lista.get(indiceMaior));

		i = 0;
		indiceMaior = 0;
		indiceMenor = 0;
		calcularMediana(lista);
	}
}
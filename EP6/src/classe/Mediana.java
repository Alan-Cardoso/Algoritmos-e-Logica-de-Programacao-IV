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

	static ArrayList<Integer> numero = new ArrayList<Integer>();

	public static void main(String[] args) {
		preencheArrayList(numero);
		calcularMediana(numero);
	}

	@SuppressWarnings({})
	private static void preencheArrayList(ArrayList<Integer> lista) {
		lista.add(0, 50);
		lista.add(1, 25);
		lista.add(2, 10);
		lista.add(3, 70);
		lista.add(4, 35);
		lista.add(5, 55);
		lista.add(6, 45);
		lista.add(7, 20);
		lista.add(8, 40);
		lista.add(9, 15);
	}

	private static void calcularMediana(ArrayList<Integer> lista) {
		int maiorNum = 0, menorNum = numero.get(0), i = 0;
		boolean menor = false, maior = false;

		if (numero.size() == 1) {
			System.out.println("A valor da mediana da lista informada e de: " + numero.get(0));
			System.exit(0);
		}
		if (numero.size() == 2) {
			System.out.println("A valor da mediana da lista informada e de: " +(numero.get(0) + numero.get(1)) / 2);
			System.exit(0);
		}
		while(i < numero.size()){
			if (numero.get(i) <= menorNum) {
				menorNum = numero.get(i);
			}
			if (numero.get(i) >= maiorNum) {
				maiorNum = numero.get(i);
			}
			i++;
		}
		numero.remove(menor);
		numero.remove(maior);
			calcularMediana(numero);
	}
}
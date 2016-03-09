package classe;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author alan_
 *
 */
public class NivelDeHormonio {

	static FileReader fileReaderCoor, fileReaderLogHorm;
	static BufferedReader bufferedReaderCoor, bufferedReaderLogHorm;
	static String[] coordenadas = new String[1000];
	static String[][] logHorm = new String[100_000][100];
	int cont = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LeArquivo();
		carregaDadosCoorArray();
		carregaDadosLogHormArray();
		comparandoArrays();
	}

	public static void LeArquivo() {
		try {
			fileReaderCoor = new FileReader("coor.txt");
			bufferedReaderCoor = new BufferedReader(fileReaderCoor);

			fileReaderLogHorm = new FileReader("logHorm1.txt");
			bufferedReaderLogHorm = new BufferedReader(fileReaderLogHorm);

		} catch (FileNotFoundException e) {

		}
	}

	public static void carregaDadosCoorArray() {
		String frase;
		try {
			while ((frase = bufferedReaderCoor.readLine()) != null) {
				coordenadas = frase.split(" ");
				bufferedReaderCoor.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void carregaDadosLogHormArray() {

		String frase;
		String[] dados;
		int[] QuantLinhas = new int[100000];
		int cont = 0;

		try {
			while ((frase = bufferedReaderLogHorm.readLine()) != null) {

				dados = frase.split(" ");
				QuantLinhas[cont] = dados.length;

				for (int i = 0; i < dados.length; i++) {
					logHorm[cont][i] = dados[i];
				}
			}
			cont++;
			bufferedReaderLogHorm.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void comparandoArrays() {
		int[] coor = {};
		int[] arrayFinal = {};
		int cont = 0;
		int i = 0;
		
		while (coordenadas[0] != null) {
			coor[0] = Integer.parseInt(coordenadas[i]);

			if (Integer.parseInt(logHorm[coor[cont]][++cont]) >= 0) {
				arrayFinal[i] = Integer.parseInt(logHorm[coor[cont]][++cont]);
			} else {
				arrayFinal[i] = -1;
			}
			cont =+ 2;
			i++;
		}
		for (int j = 0; j < arrayFinal.length; j++) {
			System.out.print(arrayFinal[j]);
		}
	}
}
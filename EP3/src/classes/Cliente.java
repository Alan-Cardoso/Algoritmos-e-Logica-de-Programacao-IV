/**
 * 
 */
package classes;

import java.util.Scanner;

/**
 * @author alan_
 *
 */
public class Cliente {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		testClienteComum();
		testClienteEspecial();
	}

	public static void testClienteComum() {
		ClienteComum cc = new ClienteComum();

		System.out.println("Digite o nome de um cliente Comum:");
		try {
			cc.Cadastro();
		} catch (IllegalArgumentException ex) {
			System.out
					.println("Ouve uma falha no cadastro. Digite um nome válido \n");
			testClienteComum();
		}
	}

	public static void testClienteEspecial() {
		ClienteEspecial ce = new ClienteEspecial();

		System.out.println("Digite o nome de um cliente expecial:");
		try {
			ce.Cadastro();
		} catch (IllegalArgumentException ex) {
			System.out
					.println("Ouve uma falha no cadastro. Digite um nome válido \n");
			testClienteEspecial();
		}
	}
}

class ClienteComum extends Cliente {

	public void Cadastro() throws IllegalArgumentException {
		String clienteParcial = sc.next();
		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha")
				|| Integer.parseInt(clienteParcial) >= 0) {
			throw new IllegalArgumentException();
		} else {

			System.out.println("\nCliente cadastrado com sucesso!!!\n");
		}
	}
}

class ClienteEspecial extends Cliente {

	public void Cadastro() throws IllegalArgumentException {
		String clienteParcial = sc.next();

		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha")
				|| Integer.parseInt(clienteParcial) >= 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println("\nCliente cadastrado com sucesso!!!\n");
		}
	}
}
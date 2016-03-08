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

	Scanner sc = new Scanner(System.in);
	String[] clienteComum = new String[10];
	String[] clienteEspecial = new String[10];
	
	public static void main(String[] args) {
		testClienteComum();
		testClienteEspecial();
	}

	public static void testClienteComum() {
		ClienteComum cc = new ClienteComum();
		System.out.println("Digite o nome de um cliente Comum:");
		try {
			cc.Cadastro("Falha");
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
		}
	}

	public static void testClienteEspecial() {
		ClienteEspecial ce = new ClienteEspecial();
		System.out.println("Digite o nome de um cliente expecial:");
		try {
			ce.Cadastro("Falha");
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
		}
	}
}

class ClienteComum extends Cliente {

	public void Cadastro(String clienteParcial) throws IllegalArgumentException {
		clienteParcial = sc.next();
		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha") ) {
			new IllegalArgumentException();
		} else {
			clienteComum[0] = clienteParcial;
		}
	}
}

class ClienteEspecial extends Cliente {
	
	@SuppressWarnings("unused")
	public void Cadastro(String clienteParcial) throws IllegalArgumentException{
		clienteParcial = sc.next();
		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha") ) {
			new IllegalArgumentException();
		} else {
			clienteEspecial[0] = clienteParcial;
		}
	}
}
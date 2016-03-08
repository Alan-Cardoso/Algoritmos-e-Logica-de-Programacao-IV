/**
 * 
 */
package classes;

import static org.junit.Assert.fail;

import java.util.Scanner;

import org.junit.Test;

/**
 * @author alan_
 *
 */
public class Cliente {

	Scanner sc = new Scanner(System.in);
	String[] clienteComum = {};
	String[] clienteEspecial = {};
	
	public static void main(String[] args) {
		testClienteComum();
		testClienteEspecial();
	}

	public static void testClienteComum() {
		ClienteComum cc = new ClienteComum();
		try {
			cc.Cadastro("Falha");
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
		}
	}

	public static void testClienteEspecial() {
		ClienteEspecial ce = new ClienteEspecial();
		try {
			ce.Cadastro("Falha");
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
		}
	}
}

class ClienteComum extends Cliente  throws IllegalArgumentException ex{

	@SuppressWarnings("unused")
	public void Cadastro(String clienteParcial) {
		System.out.println("Digite o nome de um cliente Comum:");
		clienteParcial = sc.next();
		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha") ) {
			IllegalArgumentException ex;
		} else {
			clienteComum[0] = clienteParcial;
		}
	}
}

class ClienteEspecial extends Cliente throws IllegalArgumentException ex{
	
	@SuppressWarnings("unused")
	public void Cadastro(String clienteParcial) {
		System.out.println("Digite o nome de um cliente Comum:");
		clienteParcial = sc.next();
		if (clienteParcial.equals("Falha") || clienteParcial.equals("falha") ) {
			IllegalArgumentException ex;
		} else {
			clienteEspecial[0] = clienteParcial;
		}
	}
}
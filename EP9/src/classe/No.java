/**
 * 
 */
package classe;

/**
 * @author AlanCardoso
 *
 */
public class No {

	static No raiz;
	private static Integer valor;
	private static No esquerdo;
	private static No direito;

	public No(Integer valor) {
		setValor(valor);

	}

	/**
	 * Metodo para adicionar valores ordenados em uma arvore
	 * 
	 * @param no
	 * @param valor
	 */
	@SuppressWarnings({ "static-access", "unused" })
	private static void addNo(No no, Integer valor) {

		if (no == null) {
			no = new No(valor);
		} else {
			if (valor < no.getValor()) {
				if (no.getEsquerdo() != null) {
					addNo(no.getEsquerdo(), valor);
				} else {
					no.setEsquerdo(new No(valor));
				}
			} else if (valor > no.getValor()) {
				if (no.getDireito() != null) {
					addNo(no.getDireito(), valor);
				} else {
					no.setDireito(new No(valor));
				}
			}
		}
	}

	public static No getRaiz() {
		return raiz;
	}

	public static void setRaiz(No raiz) {
		No.raiz = raiz;
	}

	public static Integer getValor() {
		return valor;
	}

	public static void setValor(Integer valor) {
		No.valor = valor;
	}

	public static No getEsquerdo() {
		return esquerdo;
	}

	public static void setEsquerdo(No esquerdo) {
		No.esquerdo = esquerdo;
	}

	public static No getDireito() {
		return direito;
	}

	public static void setDireito(No direito) {
		No.direito = direito;
	}
}
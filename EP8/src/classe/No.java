package classe;

/**
 * @author AlanCardoso
 * EP8
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
	 * Metodopara imprimir arvore em ordem
	 * 
	 * @param No
	 */
	@SuppressWarnings("static-access")
	public static void emOrdem(No No) {
		if (No != null) {
			emOrdem(No.getEsquerdo());
			System.out.print(No.getValor() + " ");
			emOrdem(No.getDireito());
		}
	}

	/**
	 * Metodo que busca um valor na arvore
	 * 
	 * @param No
	 * @param valor
	 * @return
	 */
	@SuppressWarnings("static-access")
	public String busca(No no, Integer valor) {
		if (valor == null || valor == no.getValor()) {
			return "O valor"+ no.getValor()+" foi encontrado na arvore";
		}
		if(valor < no.getValor()) {
			return busca(no.esquerdo, valor);
		} else {
			return busca(no.direito, valor);
		}
	}

	/**
	 * Metodo que retoena o valor minimo da arvore
	 * 
	 * @param No
	 * @return
	 */
	@SuppressWarnings({ "static-access" })
	private Integer minimo(No no, Integer minimo) {
		if (No.getValor() == null) {
			return minimo;
		}
		if (No.getValor() < minimo) {
			minimo =  no.getValor();
		}
		return minimo(No.getEsquerdo(), minimo);
	}
	
	/**
	 * Metodo que retoena o valor maxímo da arvore
	 * 
	 * @param No
	 * @param maximo
	 * @return
	 */
	@SuppressWarnings({ "unused", "static-access" })
	private Integer Maximo(No no, Integer maximo) {
		if (No.getValor() == null) {
			return maximo;
		}
		if (No.getValor() > maximo) {
			maximo =  no.getValor();
		}
		return minimo(No.getDireito(), maximo);
	}

	/**
	 * Métodos Gether and Seters nos atributos de Nó.
	 * 
	 * @return
	 */
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

	public static No getDireito() {
		return direito;
	}

	public static void setDireito(No direito) {
		No.direito = direito;
	}

	public static No getEsquerdo() {
		return esquerdo;
	}

	public static void setEsquerdo(No esquerdo) {
		No.esquerdo = esquerdo;
	}
}
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
	public Object busca(No No, Integer valor) {// NÂO TERMINADO
		if (No.getValor() == null) {
			return "O valor " + valor + " não esta presente na arvore";
		} else {
			if (valor == No.getValor()) {
				return "O valor " + valor + " esta presente na arvore";
			} else {

				if (valor > No.getValor()) {
					if (No.getDireito() == null) {
						return null;
					}
					return No.getDireito().busca(No, valor);
				} else {
					if (No.getEsquerdo() == null) {
						return null;
					}
					return No.getEsquerdo().busca(No, valor);
				}
			}
		}
	}

	/**
	 * Metodo que retoena o valor minimo da arvore
	 * 
	 * @param No
	 * @return
	 */
	@SuppressWarnings({ "unused", "static-access" })
	private Integer minimo(No No, Integer min) {// NÂO TERMINADO
		if (No.getValor() != null) {
			return min;
		}
		if (No.getValor() < min) {
			return No.getValor();
		}
		return minimo(No.getEsquerdo(), min);
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
/**
 * 
 */
package classe;

/**
 * @author AlanCardoso
 * EP9
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
	 * Método cria uma raiz com valor null.
	 * 
	 */
	@SuppressWarnings("static-access")
	public static void criaArvore(No no) {
		no.valor = null;
	}

	/**
	 * Metodo para adicionar valores ordenados em uma arvore
	 * 
	 * @param no
	 * @param valor
	 */
	@SuppressWarnings({ "static-access", "unused" })
	private static void addArvore(No no, Integer valor) {

		if (no.valor == null) {
			no = new No(valor);
		} else {
			if (valor < no.getValor()) {
				no = no.getEsquerdo();
				if (no.getValor() != null) {
					addArvore(no.getEsquerdo(), valor);
				} else {
					no.setEsquerdo(new No(valor));
				}
			} 
			if (valor > no.getValor()) {
				no = no.getDireito();
				if (no.getValor() != null) {
					addArvore(no.getDireito(), valor);
				} else {
					no.setDireito(new No(valor));
				}
			}
		}
	}
	/**
	 * Método para percorrer a Árvore em ordem.
	 * 
	 * @return 
	 */
	@SuppressWarnings("static-access")
	public void percorreArvore(No no) {
		 if( no != null ) { 
             System.out.println(no.valor);
		 }
		 percorreArvore( no.getEsquerdo());    
         percorreArvore ( no.getDireito() ); 
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
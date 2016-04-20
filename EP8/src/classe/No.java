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

	public static void main(String[] args) {
		addNo(raiz, 50);
		addNo(raiz, 25);
	}

	/**
	 * Metodo para adicionar valores ordenados em uma arvore
	 * 
	 * @param no
	 * @param valor
	 */
	private static void addNo(No no, Integer valor) {
		/*
		 * Verifica se o valor da raiz da arvore é null. Se a raiz for null será
		 * adicionado um novo No, passando o novo valor a ser inserido
		 */
		if (no == null) {
			no = new No(valor);
		} else {
			/*
			 * Aqui vai ser verificado se o novo valor a ser inserido, é menor
			 * que o valor da raiz.
			 */
			if (valor < No.getValor()) {
				/*
				 * Se o novo valor a ser inserido for menor que a raiz. Vai
				 * verificar se o lado direito da raiz é diferente null.
				 */
				if (No.getEsquerdo() != null) {
					/*
					 * Se o lado direito da raiz é diferente null. Vai ser
					 * inserido o novo valor a esse lado
					 */
					addNo(No.getEsquerdo(), valor);
				} else {
					/*
					 * Se o lado direito da raiz é null. Vai ser inserido o novo
					 * No com esse novo valor a esse lado
					 */
					No.setEsquerdo(new No(valor));
				}
				/*
				 * Se a raiz não for null. Vai ser verificado se o novo valor a
				 * ser inserido, é maior que o valor da raiz.
				 */
			} else if (valor > No.getValor()) {
				/*
				 * Se o novo valor a ser inserido for maior que a raiz. Vai
				 * verificar se o lado direito da raiz é diferente null.
				 */
				if (No.getDireito() != null) {
					/*
					 * Se o lado direito da raiz é diferente null. Vai ser
					 * inserido o novo valor a esse lado
					 */
					addNo(No.getDireito(), valor);
				} else {
					/*
					 * Se o lado direito da raiz é null. Vai ser inserido o novo
					 * No com esse novo valor a esse lado
					 */
					No.setDireito(new No(valor));
				}
			}
		}
	}

	/**
	 * Metodopara imprimir arvore em ordem
	 * 
	 * @param no
	 */
	public static void emOrdem(No no) {
		if (no != null) {
			emOrdem(No.getEsquerdo());
			System.out.print(No.getValor() + " ");
			emOrdem(No.getDireito());
		}
	}

	/**
	 * Metodo que busca um valor na arvore
	 * 
	 * @param no
	 * @param valor
	 * @return
	 */
	public Object busca(No no, Integer valor) {// NÂO TERMINADO
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
					return No.getDireito().busca(no, valor);
				} else {
					if (No.getEsquerdo() == null) {
						return null;
					}
					return No.getEsquerdo().busca(no, valor);
				}
			}
		}
	}
	
	/**
	 * Metodo que retoena o valor minimo da arvore
	 * 
	 * @param no
	 * @return
	 */
	@SuppressWarnings("unused")
	private No minimo(No no) {// NÂO TERMINADO
        if (no != null) {  
            while (No.getEsquerdo() != null) {  
                no = No.getEsquerdo();  
            }  
        }  
        return no;  
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
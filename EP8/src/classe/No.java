package classe;

import java.util.Arrays;


/**
 * @author AlanCardoso
 *
 */
public class No {

	static No raiz;
	static Integer valor;
	static No esquerdo;
	static No direito;

	public No(Integer valor) {
		this.valor = valor;
		No esquerdo;
		No direito;
	}
	
	/**
	 * Metodo para adicionar valores ordenados em uma arvore
	 * 
	 * @param no
	 * @param valor
	 */
	private static void addNo(No no, Integer valor) {
		/* Verifica se o valor da raiz da arvore é null.
		 * Se a raiz for null será adicionado um novo No,
		 * passando o novo valor a ser inserido
		 */
		if(no == null){
			no = new No(valor);
		}else{
			 /* Se a raiz não for null.
			 * Vai ser verificado se o novo valor a ser inserido,
			 * é maior que o valor da raiz.
			 */
			if (valor > no.valor) {
				 /* Se o novo valor a ser inserido for maior que a raiz.
				 * Vai verificar se o lado direito da raiz é diferente null.
				 */
				if (no.direito != null) {
					/*Se o lado direito da raiz é diferente null.
					 * Vai ser inserido o novo valor a esse lado
					 */
					addNo(no.direito, valor);
				} else {
					/*Se o lado direito da raiz é null.
					 * Vai ser inserido o novo No com esse novo valor a esse lado
					 */
					no.direito = new No(valor);
				}
			}
			/* Aqui vai ser verificado se o novo valor a ser inserido,
			 * é menor que o valor da raiz.
			 */
			if (valor < no.valor) {
				 /* Se o novo valor a ser inserido for menor que a raiz.
				 * Vai verificar se o lado direito da raiz é diferente null.
				 */
				if (no.esquerdo!= null) {
					/*Se o lado direito da raiz é diferente null.
					 * Vai ser inserido o novo valor a esse lado
					 */
					addNo(no.esquerdo, valor);
				} else {
					/*Se o lado direito da raiz é null.
					 * Vai ser inserido o novo No com esse novo valor a esse lado
					 */
					no.esquerdo = new No(valor);
				}
			}
		}
	}
	
	public static void emOrdem(No no) {
		if(no != null){
			emOrdem(no.esquerdo);
			System.out.print(no.valor + " ");
			emOrdem(no.direito);
			}
		}

	private static void busca(No no) {
		/**
		 * if x is nill or x is chave[raiz]
			then return raiz
        if x < chave[raiz]
			then return search(esquerda[raiz], x)
                        else return seach(direita[raiz], x)

		 */
		
		if (no == null || no == no.valor) {
			
		} else {

		}
	}
}
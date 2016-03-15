package classes;

/**
 * @author alan_
 *
 */
public class ModeloPadrao {

	public int tempoMaxCuzumento;
	public int potencuaMaxia;

	public int descongelar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int cozinhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int timer(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int fazerPipoca(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int fazerCha(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int grelhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}
}

abstract class NovasFuncoesEconomico extends ModeloPadrao {

	public int pesarCarne(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public abstract int pesarPeixe(String palavra);

	public int pesarAve(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}
}

interface NovasFuncoesPotente {

	public int superDescongelante(String palavra);

	public int superTostado(String palavra);
}

class ModeloEconomico extends NovasFuncoesEconomico {

	public int tempoMaxCuzumento;
	public int potencuaMaxia;

	@Override
	public int descongelar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int cozinhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int timer(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int fazerPipoca(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int fazerCha(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int grelhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int cozimentoBaixo(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int pesarPeixe(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}
}

class ModeloPotente extends ModeloPadrao implements NovasFuncoesPotente {

	public int tempoMaxCuzumento;
	public int potencuaMaxia;

	@Override
	public int descongelar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int cozinhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int timer(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int fazerPipoca(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int fazerCha(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int grelhar(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public int cozimentoAlto(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int superDescongelante(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	@Override
	public int superTostado(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}
}
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

	public abstract int pesarCarne(String palavra);

	public int pesarPeixe(String palavra) {

		palavra = "1";
		return Integer.parseInt(palavra);
	}

	public abstract int pesarAve(String palavra);
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

	@Override
	public int pesarCarne(String palavra) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pesarAve(String palavra) {
		// TODO Auto-generated method stub
		return 0;
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
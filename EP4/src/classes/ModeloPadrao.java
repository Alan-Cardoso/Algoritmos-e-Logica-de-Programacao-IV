package classes;

/**
 * @author alan_
 *
 */
public class ModeloPadrao { // Fazer método main

	public int tempoMaxCuzumento;
	public int potencuaMaxia;
	
	public void descongelar() {

	}

	public void cozinhar() {

	}

	public void timer() {

	}

	public void fazerPipoca() {

	}

	public void fazerCha() {

	}

	public void grelhar() {

	}

	/**
	 * @return the tempoMaxCuzumento
	 */
	public int getTempoMaxCuzumento() {
		return tempoMaxCuzumento;
	}

	/**
	 * @param tempoMaxCuzumento the tempoMaxCuzumento to set
	 */
	public void setTempoMaxCuzumento(int tempoMaxCuzumento) {
		this.tempoMaxCuzumento = tempoMaxCuzumento;
	}

	/**
	 * @return the potencuaMaxia
	 */
	public int getPotencuaMaxia() {
		return potencuaMaxia;
	}

	/**
	 * @param potencuaMaxia the potencuaMaxia to set
	 */
	public void setPotencuaMaxia(int potencuaMaxia) {
		this.potencuaMaxia = potencuaMaxia;
	}
}

class ModeloEconomico extends ModeloPadrao {

	private int tempoMaxCuzumento;
	private int potencuaMaxia;
	
	@Override
	public void descongelar() {
		// TODO Auto-generated method stub
		super.descongelar();
	}

	@Override
	public void cozinhar() {
		// TODO Auto-generated method stub
		super.cozinhar();
	}

	@Override
	public void timer() {
		// TODO Auto-generated method stub
		super.timer();
	}

	@Override
	public void fazerPipoca() {
		// TODO Auto-generated method stub
		super.fazerPipoca();
	}

	@Override
	public void fazerCha() {
		// TODO Auto-generated method stub
		super.fazerCha();
	}

	@Override
	public void grelhar() {
		// TODO Auto-generated method stub
		super.grelhar();
	}

	public void cozimentoBaixo() {

	}
	
	/**
	 * @return the tempoMaxCuzumento
	 */
	public int getTempoMaxCuzumento() {
		return tempoMaxCuzumento;
	}

	/**
	 * @param tempoMaxCuzumento the tempoMaxCuzumento to set
	 */
	public void setTempoMaxCuzumento(int tempoMaxCuzumento) {
		this.tempoMaxCuzumento = tempoMaxCuzumento;
	}
	

	/**
	 * @return the potencuaMaxia
	 */
	public int getPotencuaMaxia() {
		return potencuaMaxia;
	}
	

	/**
	 * @param potencuaMaxia the potencuaMaxia to set
	 */
	public void setPotencuaMaxia(int potencuaMaxia) {
		this.potencuaMaxia = potencuaMaxia;
	}
}

class ModeloPotente extends ModeloPadrao {

	private int tempoMaxCuzumento;
	private int potencuaMaxia;
	
	@Override
	public void descongelar() {
		// TODO Auto-generated method stub
		super.descongelar();
	}

	@Override
	public void cozinhar() {
		// TODO Auto-generated method stub
		super.cozinhar();
	}

	@Override
	public void timer() {
		// TODO Auto-generated method stub
		super.timer();
	}

	@Override
	public void fazerPipoca() {
		// TODO Auto-generated method stub
		super.fazerPipoca();
	}

	@Override
	public void fazerCha() {
		// TODO Auto-generated method stub
		super.fazerCha();
	}

	@Override
	public void grelhar() {
		// TODO Auto-generated method stub
		super.grelhar();
	}

	public void cozimentoAlto() {

	}

	/**
	 * @return the tempoMaxCuzumento
	 */
	public int getTempoMaxCuzumento() {
		return tempoMaxCuzumento;
	}

	/**
	 * @param tempoMaxCuzumento the tempoMaxCuzumento to set
	 */
	public void setTempoMaxCuzumento(int tempoMaxCuzumento) {
		this.tempoMaxCuzumento = tempoMaxCuzumento;
	}

	/**
	 * @return the potencuaMaxia
	 */
	public int getPotencuaMaxia() {
		return potencuaMaxia;
	}

	/**
	 * @param potencuaMaxia the potencuaMaxia to set
	 */
	public void setPotencuaMaxia(int potencuaMaxia) {
		this.potencuaMaxia = potencuaMaxia;
	}
}
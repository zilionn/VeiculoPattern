package model;

public final class VeiculoPasseio extends Veiculo{
	
	private int qtndPassageiros;

	public VeiculoPasseio() {
		super();
	}

	public int getQtndPassageiros() {
		return qtndPassageiros;
	}

	public final void setQtndPassageiros(int qtndPassageiros) {
		this.qtndPassageiros = qtndPassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		float velocidade = velocMax * 1000;
		return velocidade;
	}
	
	
}

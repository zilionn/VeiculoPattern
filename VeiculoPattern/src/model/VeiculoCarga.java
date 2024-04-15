package model;

public final class VeiculoCarga extends Veiculo {
	
	private int cargaMax;
	private int tara;

	public VeiculoCarga() {
		super();
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velocMax) {
		float velocidade = velocMax * 100000;
		return velocidade;
	}

	
}

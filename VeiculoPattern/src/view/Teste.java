package view;

import model.Motor;
import model.VeiculoCarga;
import model.VeiculoPasseio;

public class Teste {

	public static void main(String[] args) {
		Motor motor = new Motor();
		motor.setPotencia(150);
		motor.setQtdPist(100);
		
		VeiculoPasseio veicP = new VeiculoPasseio();
		veicP.setCor("branco");
		veicP.setMarca("volks");
		veicP.setModelo("fox");
		veicP.setMotor(motor);
		veicP.setPlaca("GAGA123");
		veicP.setQtdRodas(4);
		veicP.setVelocMax(120);
		veicP.setQtndPassageiros(5);
		
		VeiculoCarga veicC = new VeiculoCarga();
		veicC.setCargaMax(50000);
		veicC.setCor("preto");
		veicC.setMarca("Mercedez");
		veicC.setModelo("?");
		veicC.setMotor(motor);
		veicC.setPlaca("123gaga");
		veicC.setQtdRodas(6);
		veicC.setTara(3000);
		veicC.setVelocMax(180);
		
		float velocMaxP = veicP.calcVel(veicP.getVelocMax());
		float veloMaxC = veicC.calcVel(veicC.getVelocMax());
		
		System.out.println("O veículo de passeio " + veicP.getModelo() + " tem uma velocidade máxima de: " + velocMaxP + "m/h");
		System.out.println("O veículo de carga " + veicC.getMarca() + " tem uma velocidade máxima de: " + veloMaxC + "cm/h");

	}

}

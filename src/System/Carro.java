package System;

public class Carro extends Vehicle {

	
	public Carro(String placa) {
		super(placa);
	}

	@Override
	public long Cobrar(Vehicle moto) {
	
		return 1100000*moto.getTiempo();
	}
}

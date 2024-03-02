package System;


public class Moto extends Vehicle {

	public Moto(String placa) {
		super(placa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public long Cobrar(Vehicle moto) {
	
		return 50000*moto.getTiempo();
	}
}

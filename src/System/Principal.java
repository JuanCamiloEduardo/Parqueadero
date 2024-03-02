package System;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static  Map<String, Vehicle> listVehicle = new HashMap<String, Vehicle>();
	
	/*public static void main(String args[]) {
		String placa = "";
		String tipo = "as";
		Map<String, Vehicle> listVehicle = new HashMap<String, Vehicle>();
		while (true) {
			String text = "1-Para agregar un vehiculo: \n"
					+ "2-Para consultar precio de un vehiculo: \n"
					+ "3-Para terminar parqueadero: \n";
			String valor=CSVcrud.getUserInput(text);
			if (valor.equals("1")) {
				placa = CSVcrud.getUserInput("Escriba la placa del vehiculo: ");
				tipo = CSVcrud.getUserInput("Tipo vehiculo escriba M(Moto) o C(Carro): ");
				if(tipo.equals("M")) {
				
					Moto moto = new Moto(placa);
					listVehicle.put(placa, moto);
					
				}
				if (tipo.equals("C")){
					
					Carro carro= new Carro(placa);
					listVehicle.put(placa,carro);
				}
			}
			if (valor.equals("2")) {
				
			    for (String key : listVehicle.keySet()) {
			        System.out.println("Placa: "+key + " Tiempo: " + listVehicle.get(key).getTiempo()+" Estado: "+listVehicle.get(key).getEstado()+" Hora Inicial: "+listVehicle.get(key).getHorainicial()+" Vehiculo: "+listVehicle.get(key).getClass().getSimpleName());
			      }
				
				
				
				
			}
			if (valor.equals("3")) {
				placa = CSVcrud.getUserInput("Escriba la placa del vehiculo: ");
				
			}
			
		}
	}*/
	
	public static void Entrada(String placa,String tipo) {
		
		if(tipo.equals("Moto")) {
			
			Moto moto = new Moto(placa);
			listVehicle.put(placa, moto);
			
		}
		if (tipo.equals("Carro")){
			
			Carro carro= new Carro(placa);
			listVehicle.put(placa,carro);
		}
		
		
		System.out.println(Arrays.asList(listVehicle));
	}
	
	
	
	public static long Salida(String placa) {
		Vehicle valor= listVehicle.get(placa);
		listVehicle.remove(placa);
		
		return  valor.Cobrar(valor);
		
	}
	

	
	
	
	
}

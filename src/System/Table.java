package System;

public class Table {
	
	public static final String[] COLUMNAMES = {"Placa","Hora_inicial","Vehiculo"};
	
	public static String[][] changeArray(){
	
	Vehicle save =null;
	int size = Principal.listVehicle.size();
	String[][] listTable = new String[size][3]; 
	int i= 0;
	for(String valor :Principal.listVehicle.keySet()) {
		save= Principal.listVehicle.get(valor);
		
		String[] info = {save.getPlaca(),
				save.getHorainicial().toString(),
				save.getClass().getSimpleName()};
		listTable[i]=info;
		i++;
	}
	return listTable;
	
	}
}

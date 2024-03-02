package System;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Vehicle {

	
	private String placa;
	
	private LocalDateTime horaInicial;
	
	private LocalDateTime horaFinal;
	
	private long tiempo;
	
	private String estado;
	
	
	public Vehicle(String placa) {
		this.placa = placa;
		this.horaInicial = LocalDateTime.now();
		this.horaFinal = null;
		this.tiempo = 0;
		this.estado = "Parqueadero";
	}
	

	public void Guardar(Vehicle guardar) {
		
		try {
			CSVcrud.generateDocument(guardar,estado,placa,horaInicial,tiempo,horaFinal);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Teminar(Vehicle vehicle) {
			vehicle.setEstado("Terminado");
			vehicle.setHoraFinal(LocalDateTime.now());
			/*
			 * Se debe terminar esta funcion, de manera que guarde en un documento los terminados y 
			 * deje solo en el mapa a los parqueados
			 * 
			 */
			
	}

	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public LocalDateTime getHorainicial() {
		return horaInicial;
	}

	public void setHorainicial(LocalDateTime horainicial) {
		horaInicial = horainicial;
	}

	public LocalDateTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalDateTime horaFinal) {
		horaFinal = horaFinal;
	}

	public long getTiempo() {
		if (estado.equals("Terminado"))
		{
			return tiempo;
		}
		else {
		long tiempo = ChronoUnit.MINUTES.between(horaInicial,LocalDateTime.now());
		return tiempo;
		}
		
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		estado = estado;
	}


	public long Cobrar(Vehicle vehiculo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

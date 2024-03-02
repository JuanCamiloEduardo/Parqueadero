package System;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

public  class CSVcrud {
	
	public static void generateDocument(Vehicle tipo,String estado,String placa, LocalDateTime horaInicial, long tiempo, LocalDateTime horaFinal) throws IOException {
		FileWriter archivo =null ;
		PrintWriter escritor =null ;
		String vehiculo = tipo.getClass().getSimpleName();
		

		try {
			archivo = new FileWriter("C:\\Users\\Usuario\\eclipse-workspace\\Parqueadero\\src\\System\\Archivo.csv");
			escritor = new PrintWriter(archivo);
			
			
			escritor.println(placa+";"+vehiculo+";"+estado+";"+";"+horaInicial+";"+tiempo+";"+horaFinal);

			
		}catch(Exception e){
			
		}
		finally {
			archivo.close();
		}
		
		
		
	}
	
	public static String getUserInput(String prompt) { 
		String inputLine = null; System.out.print(prompt + "");
			try { 
				
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			
			inputLine = is.readLine(); if (inputLine.length() == 0 )
			return null;
			
			} 
			catch (IOException e) 
			{ 
				System.out.println("IOException: " + e);
			} 
			
			return inputLine;
			}
	
	/*
	 * 	public static void generateDocument(String ...datos ) throws IOException {
		FileWriter archivo =null ;
		PrintWriter escritor =null ;
		int numero =1;
		try {
			archivo = new FileWriter("C:\\Users\\Usuario\\eclipse-workspace\\Parqueadero\\src\\System\\Archivo.csv");
			escritor = new PrintWriter(archivo);
			escritor.println(numero);
			for (String dato: datos) {
				escritor.print(";"+dato);
				numero++;
			}
			
		}catch(Exception e){
			
		}
		finally {
			archivo.close();
		}
	} 
	 */

}

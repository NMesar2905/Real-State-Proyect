package com.real.state;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;

public class CVSExporter {

	public void exportToCSV(List<Inmueble> inmuebles, String filePath) {
		
		try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){
		
		String[] header = {"Código Inmueble", "Habitaciones", "Baños", "Estrato", "Barrio Común", "Precio", "Antiguedad", "Área Construida",
				"Área Privada", "Valor Administración", "Parqueaderos"};
		writer.writeNext(header);
		
		for (Inmueble inmueble : inmuebles) {
			String[] data = {
				inmueble.getCodigoInmueble(),
				inmueble.getHabitaciones(),
				inmueble.getBanos(),
				inmueble.getEstrato(),
				inmueble.getBarrioComun(),
				inmueble.getPrecio(),
				inmueble.getAntiguedad(),
				inmueble.getAreaConstruida(),
				inmueble.getAreaPrivada(),
				inmueble.getValorAdministracion(),
				inmueble.getParqueaderos()
			};
			writer.writeNext(data);
		}

		System.out.println("Archivo CSV creado con Éxito");
		
		}catch(IOException e) {
			System.out.println("Ocurrió un error al crear el archivo CSV: " + e.getMessage());
		}
	}
	
}

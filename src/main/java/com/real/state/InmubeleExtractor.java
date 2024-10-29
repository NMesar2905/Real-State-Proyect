package com.real.state;

import java.util.ArrayList;
import java.util.List;

public class InmubeleExtractor {

	private List<Inmueble> inmuebles = new ArrayList<Inmueble>();
	
	public void addInmueble(String codigoInmueble, String habitaciones, String banos, String estrato, String barrioComun,
			String precio, String antiguedad, String areaConstruida, String areaPrivada, String valorAdministracion,
			String parqueaderos) {
		Inmueble inmueble = new Inmueble(codigoInmueble, habitaciones, banos, estrato, barrioComun, precio, antiguedad, areaConstruida, areaPrivada, valorAdministracion, parqueaderos);
		inmuebles.add(inmueble);
	}
	
	public void addInmueble(Inmueble inmueble) {
		inmuebles.add(inmueble);
	}
	
	public List<Inmueble> getInmuebles(){
		return inmuebles;
	}
	
}

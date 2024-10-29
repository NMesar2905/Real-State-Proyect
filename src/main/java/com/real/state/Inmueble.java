package com.real.state;

public class Inmueble {
	private String habitaciones;
	private String banos;
	private String estrato;
	private String codigoInmueble;
	private String barrioComun;
	private String precio;
	private String antiguedad;
	private String areaConstruida;
	private String areaPrivada;
	private String valorAdministracion;
	private String parqueaderos;

	public Inmueble(String codigoInmueble, String habitaciones, String banos, String estrato, String barrioComun,
			String precio, String antiguedad, String areaConstruida, String areaPrivada, String valorAdministracion,
			String parqueaderos) {
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.estrato = estrato;
		this.codigoInmueble = codigoInmueble;
		this.barrioComun = barrioComun;
		this.precio = precio;
		this.antiguedad = antiguedad;
		this.areaConstruida = areaConstruida;
		this.areaPrivada = areaPrivada;
		this.valorAdministracion = valorAdministracion;
		this.parqueaderos = parqueaderos;
	}

	public String getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(String habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getBanos() {
		return banos;
	}

	public void setBanos(String banos) {
		this.banos = banos;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getCodigoInmueble() {
		return codigoInmueble;
	}

	public void setCodigoInmueble(String codigoInmueble) {
		this.codigoInmueble = codigoInmueble;
	}

	public String getBarrioComun() {
		return barrioComun;
	}

	public void setBarrioComun(String barrioComun) {
		this.barrioComun = barrioComun;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(String areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public String getAreaPrivada() {
		return areaPrivada;
	}

	public void setAreaPrivada(String areaPrivada) {
		this.areaPrivada = areaPrivada;
	}

	public String getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(String valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public String getParqueaderos() {
		return parqueaderos;
	}

	public void setParqueaderos(String parqueaderos) {
		this.parqueaderos = parqueaderos;
	}

}

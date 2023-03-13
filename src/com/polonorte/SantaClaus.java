package com.polonorte;

import java.time.LocalDate;
import java.time.Month;

/**
 * Clase SantaClaus.
 * Describe a un santa claus y la creó Baltasar.
 *@version Se considera que es la versión 1.2 del programa.
 * @author alumno*/
//Esta clase describe a un santa claus y la creó Baltasar. Se considera que es la versión 1.2 del programa
public class SantaClaus {

	/**
	 * Los kilos de peso de SantaClaus
	 * @author alumno */
		private int kilosPeso;

	/**
	 * Si está trabajando ya o no
	 * @author alumno*/
		private boolean trabajando;

	private String caracterActual;

	public SantaClaus() {
		this.trabajando = false;
		this.caracterActual = Utils.CARACTER_AMIGABLE;
	}

	/**
	 * Genera un saludo de Santa Claus según el carácter que se le pase por parámetro
	 *@since Se introduce desde la versión 1.1
	 *@param caracter El carácter que tiene Santa Claus y del que se generará un saludo
	 *@return saludo de Santa Claus según el carácter
	 * */
	// (Este método se ha introducido desde la versión 1.1)
	public String generarSaludoSegunCaracter(String caracter) {

		String saludo;
		switch (caracter) {
		case Utils.CARACTER_AMIGABLE:
			saludo = "hohoho, ¡feliz navidad pequeños y adorables niños!";
			break;
		case Utils.CARACTER_CABREADO:
			saludo = "¡todos los años pidiendo juguetes! ¡Me tenéis harto!";
			break;
		case Utils.CARACTER_FURIOSO:
			saludo = "ODIO LA NAVIDAAAAADD!! DEJAD DE ESCRIBIRME!";
			break;
		default:
			saludo = "hoho? otra vez?";

		}
		return saludo;
	}
/**
 * Este métdo es para comprobar si SantaClaus está trabajando o no con la fecha que se ha pasado.
 * @since 1.2
 * @param fecha que trabaja SantaClaus
 * @return true en la fecha que se ha pasado, si está trabajando; false en la fecha que se ha pasado, y no está trabajando. 
 * @throws DatosInvalidosException lanza excepción cuando la fecha que se ha pasado es nulo.
 */
	// (Este método se ha introducido desde la versión 1.2)
	// Incluir con javadoc que se lanza la DatosInvalidosException (mirar ->
	// https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#@exception)
	public boolean comprobarTrabajo(LocalDate fecha) throws DatosInvalidosException {

		if (fecha == null) {
			throw new DatosInvalidosException("La fecha no puede ser nula");
		}

		if (fecha.getMonth().equals(Month.DECEMBER) && fecha.getDayOfMonth() == 25) {
			this.trabajando = true;
		} else {
			this.trabajando = false;
		}

		return this.trabajando;
	}
/**
 * Este método devuelve un saludo
 * @deprecated NO USAR, mejor usar {@link #generarSaludoSegunCaracter(String)
 * @since 0.5
 * @return saludo de Santa Claus
 */
	// Este metodo está desde la versión 0.5. se tiene que considerar obsoleto, y
	// referenciar al metodo
	// generarSaludoSegunCaracter
	public String saludar() {
		return "hohoho";
	}

	/**
	 * @return the kilosPeso
	 */
	public int getKilosPeso() {
		return kilosPeso;
	}

	/**
	 * @param kilosPeso the kilosPeso to set
	 */
	public void setKilosPeso(int kilosPeso) {
		this.kilosPeso = kilosPeso;
	}
	
	/**
	 * @return the trabajando
	 */
	public boolean isTrabajando() {
		return trabajando;
	}
	
	/**
	 * @param trabajando the trabajando to set
	 */
	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}
	
	/**
	 * @return the caracterActual
	 */
	public String getCaracterActual() {
		return caracterActual;
	}
	
	/**
	 * @param caracterActual the caracterActual to set
	 */
	public void setCaracterActual(String caracterActual) {
		this.caracterActual = caracterActual;
	}

	
	

}

package com.polonorte;

/**
 * <h1> Clase Reno</h1>
 * Representa un reno de los de Papá Noel

 * @author oscar
 *@version 1.0
 */
public class Reno {

    private String nombre;
    private int velocidad;

    private int numCuernos;
    private int numCollares;
    
    private String apodo;
   
    //Esto es un comentario de prueba
    
    public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

/**
 * 
 * @param direccion - La direccion en la que vuela el reno
 * @return El chillido que emite el reno al volar
 */
	public String volar(String direccion){
        System.out.println("Reno.volar");

        return "mmmmmiiiiii chus chus peeeeerrrr";
    }

	
    /**
     * Este método hace correr al reno
     * 
     * @deprecated NO USAR MÄS mejor usar el metodo volar
     * @param direccion La direccion en la que recorren los renos
     */
    public void correr(String direccion){
        //TODO terminar
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	public int getNumCollares() {
		return numCollares;
	}

	public void setNumCollares(int numCollares) {
		this.numCollares = numCollares;
	}

    

}

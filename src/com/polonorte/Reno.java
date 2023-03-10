package com.polonorte;

/**
 * clase Reno
 * @author alumno
 * @version 1.1
 */
public class Reno {

    private String nombre;
    private int velocidad;

    private String pedígrí;
    
    private int numCuernos;
    private int numCollares;
   
    //Esto es un comentario de prueba
    
    /**
     * Este metodo hace volar al reno
     * @param direccion - La direccion en la que vuela el reno
     * @return El chillido que emite el chopper al curar
     */
    public String volar(String direccion){
        System.out.println("Reno.volar");

        return "mmmmmiiiiii chus chus peeeeerrrr";
    }

    
    //er canelita surmano
    
    /**
     * Este metodo lo hace correr
     * @deprecated	No usarlo, mejor usa volar miloko
     * @param direccion
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

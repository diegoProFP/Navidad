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
    
    private String apodo;
   
    //Esto es un comentario de prueba
    
<<<<<<< HEAD
    /**
     * Este metodo hace volar al reno
     * @param direccion - La direccion en la que vuela el reno
     * @return El chillido que emite el chopper al curar
     */
    public String volar(String direccion){
=======
    public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public String volar(String direccion){
>>>>>>> refs/heads/main
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

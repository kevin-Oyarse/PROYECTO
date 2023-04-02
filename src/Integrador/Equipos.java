package Integrador;

public class Equipos {
    // las variables nombre y descripcion
	private String nombre;
	private String detalles;
	
	// un constructor para los equipos, toma un nombre y una descripcion.
	public Equipos(String unNombre, String unaDescripcion) 
	{
		nombre = unNombre;
		detalles = unaDescripcion;
	}
	
	//Getters
	public String nombre() 
	{
		return nombre;
	}
}

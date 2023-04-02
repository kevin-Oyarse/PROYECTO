package Integrador;

public class Equipos {
    // las variables nombre y descripcion
	private String nombre;
	private String descripcion;
	
	// un constructor para los equipos, toma un nombre y una descripcion.
	public Equipos(String unNombre, String unaDescripcion) 
	{
		nombre = unNombre;
		descripcion = unaDescripcion;
	}
	
	//Getters
	public String nombre() 
	{
		return nombre;
	}
}

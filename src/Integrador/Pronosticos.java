package Integrador;

public class Pronosticos {
    // variables partido, equipo y un resultado del enumerado.
	private Partido partido;
	private Equipos equipo;
	private ResultadoFinal resultado;
	
	// un constructor para el pronostico
	public Pronosticos(Partido unPartido, Equipos unEquipo, ResultadoFinal unResultado) 
	{
		partido = unPartido;
		equipo = unEquipo;
		resultado = unResultado;
	}
	
	// un metodo para los puntos.
	// si el resultado del partido para el equipo pronosticado, es igual al resultado que pronosticó, entonces retorna 1
	// sino retorna 0
	public int puntos() 
	{
		if(partido.resultado(equipo) == resultado) 
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	// Getters
	
	public Partido partido() 
	{
		return partido;
	}
	
	public Equipos equipo() 
	{
		return equipo;
	}
	
	public ResultadoFinal resultado() 
	{
		return resultado;
	}
}

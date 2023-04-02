package Integrador;

public class Partidos {
// Variables para los equipos y los goles respectivos
private Equipos equipo1;
private Equipos equipo2;
private int golesEquipo1;
private int golesEquipo2;

// un constructor para los partidos. Toma 2 equipos y los respectivos goles.
public Partidos(Equipos unEquipo, Equipos otroEquipo, int unosGoles, int otrosGoles) 
{
    equipo1 = unEquipo;
    equipo2 = otroEquipo;
    golesEquipo1 = unosGoles;
    golesEquipo2 = otrosGoles;
}

// un metodo que retorna un resultado. pasandole un equipo.
public ResultadoFinal resultado(Equipos unEquipo) 
{	
    if(unEquipo.nombre().equals(equipo1.nombre())) 
    {
        if(golesEquipo1 > golesEquipo2) 
        {
            return ResultadoFinal.GANADOR;
        }
        else if(golesEquipo2 > golesEquipo1) 
        {
            return ResultadoFinal.PERDEDOR;
        }
        else 
        {
            return ResultadoFinal.EMPATE;
        }
    }
    else 
    {
        if(golesEquipo1 > golesEquipo2) 
        {
            return ResultadoFinal.PERDEDOR;
        }
        else if(golesEquipo2 > golesEquipo1) 
        {
            return ResultadoFinal.GANADOR;
        }
        else 
        {
            return ResultadoFinal.EMPATE;
        }
    }
}

// Getters:
public Equipos equipo1() 
{
    return equipo1;
}

public Equipos equipo2() 
{
    return equipo2;
}

public int golesEquipo1() 
{
    return golesEquipo1;
}

public int golesEquipo2() 
{
    return golesEquipo2;
}
}

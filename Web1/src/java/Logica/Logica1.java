/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author guzma
 */
public class Logica1 {
    public String chat(String texto)
    {
        String devolver="";
        if ("Hola".equals(texto) || "Que hizo".equals(texto) || "Oe".equals(texto) || "Que tal".equals(texto) || "Holi".equals(texto) )
        {
            devolver = "Hola Princesa";
        }
        else
        {
          if ("¿Quieres ir por un helado?".equals(texto) || "¿Quieres ir al cine?".equals(texto) || "¿Quieres ir al museo?".equals(texto) || "¿Quieres ir al parque?".equals(texto) || "¿Quieres salir a caminar?".equals(texto)) 
           {
             devolver = "Si claro, me encantaria";
           }
          else
          {
             if ("¿Te gusta la pizza?".equals(texto) || texto.equals("¿Te gusta la hambuerguesa?") || texto.equals("¿Te gusta el sancocho?") || texto.equals("¿Te gusta la changua?") || texto.equals("¿Te gusta el calentado?")) 
             {
                devolver = "Claro que si, es mi comida favorita";
             }
             else
             {
                 if ("¿Te gustan las peliculas de terror?".equals(texto) || "¿Te gustan las peliculas de comedia?".equals(texto) || "¿Te gustan las peliculas de romance?".equals(texto) || "¿Te gustan las peliculas de suspenso?".equals(texto) || "¿Te gustan las peliculas de accion?".equals(texto))
                    {
                        devolver = "Si, es mi genero preferido";
                    }
                 else
                 {
                     if ("¿Conoces el muro de berlin?".equals(texto) || "¿Conoces Sao Paulo?".equals(texto) || "¿Conoces la Universidad de Cundinamarca?".equals(texto) || "¿Conoces New York?".equals(texto) || "¿Conoces Bojaca?".equals(texto)) 
                        {
                            devolver = "La verdad  no, pero si he querido ir a visitar";
                        }
                        else
                        {
                            devolver = "Vas muy rapido, lo siento.";
                        }
                 }
             }
          }
        }
          
       
        return(devolver);
    }
    
    
}

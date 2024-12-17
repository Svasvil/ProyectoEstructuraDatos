/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author sebastian
 */
public class Partida {
       //Creamos los atributos para la partida
    private int idJugador; 
    private String nombreUsuario;
    private int puntos;

    //Creamos el constructor con todos los atributos de la partida 
    public Partida(int idJugador, String nombreUsuario, int puntos) {
        this.idJugador = idJugador;
        this.nombreUsuario = nombreUsuario;
        this.puntos = puntos;
    }

    //Creamos los métodos getters y setters  
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "\n" + "ID del jugador:" + idJugador + ", Usuario: " + nombreUsuario + ", Puntos obtenidos: " + puntos;
    }
    
    
}

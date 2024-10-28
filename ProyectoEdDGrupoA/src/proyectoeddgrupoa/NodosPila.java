/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class NodosPila {
     private DatosJugador jugador; //Creamos los atributos
    private NodosPila siguiente; //Creamos los atributos  
    public NodosPila() {
        this.siguiente = null; //Creamos un constructor vacío 
    }
    public NodosPila(DatosJugador  jugador, NodosPila siguiente) { //Creamos un constructor 
        this.jugador = jugador;
        this.siguiente = siguiente;
    }
    //Creamos los métodos getters y setters  
    public DatosJugador  getJugador() { 
        return jugador;
    }
    public void setJugador(DatosJugador  jugador) {
        this.jugador = jugador;
    }
    public NodosPila getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodosPila siguiente) {
        this.siguiente = siguiente;
    }

    }
    



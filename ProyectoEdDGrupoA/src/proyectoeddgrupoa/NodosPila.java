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
    private DatosJugador jugador;  // Información del jugador
    private NodosPila siguiente;   // Nodo siguiente

    // Constructor vacío
    public NodosPila() {
        this.siguiente = null;
    }

    // Constructor con parámetros
    public NodosPila(DatosJugador jugador, NodosPila siguiente) {
        this.jugador = jugador;
        this.siguiente = siguiente;
    }

    // Getters y setters
    public DatosJugador getJugador() {
        return jugador;
    }

    public void setJugador(DatosJugador jugador) {
        this.jugador = jugador;
    }

    public NodosPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosPila siguiente) {
        this.siguiente = siguiente;
    }
}
    



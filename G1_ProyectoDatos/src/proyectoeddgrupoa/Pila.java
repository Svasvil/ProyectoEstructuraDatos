/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class Pila {
    private NodosPila cima;  // Creamos el atributo

    public Pila() {
        this.cima = null;
    }

    public NodosPila getCima() {
        return cima;
    }

    public void setCima(NodosPila cima) {
        this.cima = cima;
    }

    // Método para agregar un jugador
    public void AgregarJugador(String id, String nombre, int puntuacion) {
        NodosPila jugador = new NodosPila();
        jugador.setJugador(new DatosJugador(id, nombre, puntuacion));
        if (this.cima == null) {
            this.cima = jugador;
        } else {
            jugador.setSiguiente(this.cima);
            this.cima = jugador;  // Actualizamos la cima
        }
    }

    // Método para quitar un jugador
    public void QuitarJugador() {
        if (this.cima != null) {
            NodosPila jugadorEliminado = this.cima;
            this.cima = this.cima.getSiguiente();  // Actualizamos la cima
            jugadorEliminado.setSiguiente(null);  // Quitamos el nodo eliminado
        }
    }

    // Método para mostrar jugadores
    public void MostrarJugadores() {
        String z = "";
        if (this.cima != null) {
            NodosPila aux = this.cima;
            while (aux != null) {
                z += "ID: " + aux.getJugador().getID() + ", Nombre: " + aux.getJugador().getNombre() + ", Puntuacion: " + aux.getJugador().getPuntuacion() + "\n";
                aux = aux.getSiguiente();
            }
        }
        System.out.println(z);
    }

    // Método para transferir jugadores de la pila al ranking
    public void transferirJugadoresARanking(ListaDobleEnlazada ranking) {
        NodosPila aux = this.cima;
        
        // Transferir jugadores de la pila al ranking
        while (aux != null) {
            ranking.agregarJugador(aux.getJugador()); // Agregar jugador al ranking
            aux = aux.getSiguiente(); // Avanzar al siguiente jugador en la pila
        }
    }
}



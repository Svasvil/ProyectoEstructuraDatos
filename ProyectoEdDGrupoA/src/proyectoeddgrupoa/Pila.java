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
     private NodosPila cima; //Creamos el atributo 

    public Pila() { //Creamos el constructor vacío 
        this.cima = null;
    }

    public NodosPila getCima() {
        return cima;
    }

    public void setCima(NodosPila cima) {
        this.cima = cima;
    }
    
    
    //Creamos el método para agregar el jugador 
    public void AgregarJugador(String id, String nombre) {
        NodosPila jugador = new NodosPila(); //Creamos un nuevo nodo para el jugador 
        jugador.setJugador(new DatosJugador(id, nombre));
        if (this.cima == null) { //Si la pila está vacía el nuevo jugador es la cima 
            this.cima = jugador;
        } else {
            jugador.setSiguiente(this.cima);
            this.cima = jugador; //Actualizamos la cima 
        }
    }
    //Creamos el metodo de quitar jugador 
    public void QuitarJugador() {
        if (this.cima != null) { //Verificamos que la pila no esté  vacía 
            NodosPila jugadorEliminado = this.cima;
            this.cima = this.cima.getSiguiente(); //Actualizamos la cima a el siguiente jugador 
            jugadorEliminado.setSiguiente(null); //Quitamos el nodo eliminado 
        }
    }
    //Creamos el metodo de mostrar jugadores 
    public void MostrarJugadores() {
        String z = ""; //Iniciamos una cadena para mostrar los jugadores 

        if (this.cima != null) {
            NodosPila aux = this.cima; //Usamos un nodo auxiliar para recorrer la pila 
            while (aux != null) {
                z += "ID: " + aux.getJugador().getID() + ", Nombre: " + aux.getJugador().getNombre() + "\n"; //Agregamos los atributos del jugador 
                aux = aux.getSiguiente();
            }
        }
        System.out.println(z); //Mostramos la información completa 
    } 
}


package jugadores;
public class NodosPila {
    
    private Jugador_Datos jugador; //Creamos los atributos
    private NodosPila siguiente; //Creamos los atributos  
    public NodosPila() {
        this.siguiente = null; //Creamos un constructor vacío 
    }
    public NodosPila(Jugador_Datos jugador, NodosPila siguiente) { //Creamos un constructor 
        this.jugador = jugador;
        this.siguiente = siguiente;
    }
    //Creamos los métodos getters y setters  
    public Jugador_Datos getJugador() { 
        return jugador;
    }
    public void setJugador(Jugador_Datos jugador) {
        this.jugador = jugador;
    }
    public NodosPila getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodosPila siguiente) {
        this.siguiente = siguiente;
    }
}

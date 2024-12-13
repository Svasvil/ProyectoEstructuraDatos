public class NodoLDE {
    private DatosJugador jugador;
    private NodoLDE anterior;
    private NodoLDE siguiente;

    // Constructor vacío
    public NodoLDE() {
        this.jugador = null;
        this.anterior = null;
        this.siguiente = null;
    }

    // Constructor con parámetros
    public NodoLDE(DatosJugador jugador) {
        this.jugador = jugador;
        this.anterior = null;
        this.siguiente = null;
    }

    // Getters y setters
    public DatosJugador getJugador() {
        return jugador;
    }

    public void setJugador(DatosJugador jugador) {
        this.jugador = jugador;
    }

    public NodoLDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDE anterior) {
        this.anterior = anterior;
    }

    public NodoLDE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDE siguiente) {
        this.siguiente = siguiente;
    }
}

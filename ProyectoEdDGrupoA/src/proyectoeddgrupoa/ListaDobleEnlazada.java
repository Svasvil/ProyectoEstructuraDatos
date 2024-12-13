public class ListaDobleEnlazada {
    private NodoLDE cabeza;
    private NodoLDE cola;

    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarJugador(DatosJugador jugador) {
        NodoLDE nuevoNodo = new NodoLDE(jugador);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            NodoLDE actual = cabeza;
            
            // Recorremos la lista hasta encontrar el lugar adecuado
            while (actual != null && actual.getJugador().getPuntuacion() > jugador.getPuntuacion()) {
                actual = actual.getSiguiente();
            }
            
            if (actual == null) { 
                cola.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(cola);
                cola = nuevoNodo;
            } else if (actual == cabeza) { 
                nuevoNodo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevoNodo);
                cabeza = nuevoNodo;
            } else { 
                NodoLDE anterior = actual.getAnterior();
                anterior.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(anterior);
                nuevoNodo.setSiguiente(actual);
                actual.setAnterior(nuevoNodo);
            }
        }
    }

    public void eliminarJugador(String id) {
        NodoLDE actual = cabeza;
        
        while (actual != null && !actual.getJugador().getID().equals(id)) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            if (actual == cabeza) {
                cabeza = actual.getSiguiente();
                if (cabeza != null) {
                    cabeza.setAnterior(null);
                }
            } else if (actual == cola) {
                cola = actual.getAnterior();
                if (cola != null) {
                    cola.setSiguiente(null);
                }
            } else {
                NodoLDE anterior = actual.getAnterior();
                NodoLDE siguiente = actual.getSiguiente();
                anterior.setSiguiente(siguiente);
                if (siguiente != null) {
                    siguiente.setAnterior(anterior);
                }
            }
        }
    }

    public void mostrarRanking() {
        NodoLDE actual = cabeza;
        while (actual != null) {
            System.out.println("ID: " + actual.getJugador().getID() + ", Nombre: " + actual.getJugador().getNombre() + ", Puntuación: " + actual.getJugador().getPuntuacion());
            actual = actual.getSiguiente();
        }
    }
}

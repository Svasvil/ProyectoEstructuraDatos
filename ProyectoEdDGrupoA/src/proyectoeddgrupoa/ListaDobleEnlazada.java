public class ListaDobleEnlazada {
    private NodoLDE cabeza;  // Cabeza de la lista
    private NodoLDE cola;    // Cola de la lista

    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para agregar un jugador en el ranking, manteniendo el orden por puntuación
    public void agregarJugador(DatosJugador jugador) {
        NodoLDE nuevoNodo = new NodoLDE(jugador);
        
        // Si la lista está vacía, simplemente agregamos el nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            NodoLDE actual = cabeza;
            
            // Recorremos la lista hasta encontrar el lugar adecuado
            while (actual != null && actual.getJugador().getPuntuacion() > jugador.getPuntuacion()) {
                actual = actual.getSiguiente();
            }
            
            if (actual == null) { // Si llegamos al final de la lista
                cola.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(cola);
                cola = nuevoNodo;
            } else if (actual == cabeza) { // Si el jugador tiene la mayor puntuación
                nuevoNodo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevoNodo);
                cabeza = nuevoNodo;
            } else { // Insertar en el medio
                NodoLDE anterior = actual.getAnterior();
                anterior.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(anterior);
                nuevoNodo.setSiguiente(actual);
                actual.setAnterior(nuevoNodo);
            }
        }
    }

    // Método para eliminar un jugador del ranking
    public void eliminarJugador(String id) {
        NodoLDE actual = cabeza;
        
        // Buscamos el jugador por ID
        while (actual != null && !actual.getJugador().getID().equals(id)) {
            actual = actual.getSiguiente();
        }

        // Si encontramos el jugador, lo eliminamos
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

    // Método para mostrar el ranking
    public void mostrarRanking() {
        NodoLDE actual = cabeza;
        while (actual != null) {
            System.out.println("ID: " + actual.getJugador().getID() + ", Nombre: " + actual.getJugador().getNombre() + ", Puntuación: " + actual.getJugador().getPuntuacion());
            actual = actual.getSiguiente();
        }
    }
}

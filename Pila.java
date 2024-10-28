package jugadores;
public class Pila {

    private NodosPila cima; //Creamos el atributo 

    public Pila() { //Creamos el constructor vacio 
        this.cima = null;
    }
    //Creamos el metodo para agregar el jugador 
    public void AgregarJugador(String id, String nombre) {
        NodosPila jugador = new NodosPila(); 
        jugador.setJugador(new Jugador_Datos(id, nombre));
        if (this.cima == null) {
            this.cima = jugador;
        } else {
            jugador.setSiguiente(this.cima);
            this.cima = jugador;
        }
    }
    //Creamos el metodo de quitar jugador 
    public void QuitarJugador() {
        if (this.cima != null) {
            NodosPila jugadorEliminado = this.cima;
            this.cima = this.cima.getSiguiente();
            jugadorEliminado.setSiguiente(null);
        }
    }
    //Creamos el metodo de mostrar jugadores 
    public void MostrarJugadores() {
        String z = "";

        if (this.cima != null) {
            NodosPila aux = this.cima;
            while (aux != null) {
                z += "ID: " + aux.getJugador().getID() + ", Nombre: " + aux.getJugador().getNombre() + "\n";
                aux = aux.getSiguiente();
            }
        }
        System.out.println(z);
    }
}


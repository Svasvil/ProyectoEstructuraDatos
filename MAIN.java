package jugadores;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

public class MAIN {

    public static void main(String[] args) {

        Pila Jugadores = new Pila(); //Creamos el objeto  en la clase 
        Jugadores.AgregarJugador(" Jugador  1", "   1");  // Agregamos los jugadores 
        Jugadores.AgregarJugador("Jugador   2", "   2 ");// Agregamos los jugadores 
        Jugadores.AgregarJugador("Jugador   3", "   3 ");// Agregamos los jugadores 
        Jugadores.AgregarJugador("Jugador   4", "   4 ");// Agregamos los jugadores 
        Jugadores.AgregarJugador("Jugador   5", "   5 ");// Agregamos los jugadores 
        Jugadores.MostrarJugadores(); //Imprimimos los jugadores 

        System.out.println("\n"); 
        System.out.println("se eliminara al jugador 5 ");
        System.out.println("Eliminando el jugador 5 "); 
        Jugadores.QuitarJugador(); //Eliminamos al jugador 
        Jugadores.MostrarJugadores(); //Mostramos los jugadors 

        Cola cola = new Cola();
        
        cola.encolarPartida("Partida 1");
        cola.encolarPartida("Partida 2");
        cola.encolarPartida("Partida 3");
        cola.encolarPartida("Partida 4");
        cola.encolarPartida("Partida 5");
        
        System.out.println("Partida en curso");
        NodoCola partidaEnComienzo = cola.partidaEnProgreso();
        System.out.print(partidaEnComienzo.toString());
    }

}

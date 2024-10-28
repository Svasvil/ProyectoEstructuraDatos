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
    }

}

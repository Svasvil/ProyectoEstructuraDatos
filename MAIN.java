package jugadores;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

public class MAIN {

    public static void main(String[] args) {
        
        //Pila
        Pila Jugadores = new Pila(); //Creamos el objeto  en la clase Pila 
        //Agregamos jugadores a la pila 
        Jugadores.AgregarJugador("Jugador   1", "   1 "); 
        Jugadores.AgregarJugador("Jugador   2", "   2 ");
        Jugadores.AgregarJugador("Jugador   3", "   3 "); 
        Jugadores.AgregarJugador("Jugador   4", "   4 "); 
        Jugadores.AgregarJugador("Jugador   5", "   5 "); 
        Jugadores.MostrarJugadores(); //Imprimimos los jugadores 

        System.out.println("\n"); 
        System.out.println("se eliminara al jugador 5 ");
        System.out.println("Eliminando el jugador 5 "); 
        Jugadores.QuitarJugador(); //Eliminamos al jugador 
        Jugadores.MostrarJugadores(); //Mostramos los jugadores 
        
        //Cola 
        Cola cola = new Cola(); //Creamos el objeto en la clase Cola 
        //Agregamos partidas a la cola
        cola.encolarPartida("Partida 1");
        cola.encolarPartida("Partida 2"); 
        cola.encolarPartida("Partida 3"); 
        cola.encolarPartida("Partida 4"); 
        cola.encolarPartida("Partida 5");  
        
        System.out.println("Partida en curso");
        NodoCola partidaEnComienzo = cola.partidaEnProgreso(); //Obtenemos la partida que está en progreso 
        System.out.print(partidaEnComienzo.toString()); //Mostramos la partida en curso 
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class ProyectoEdDGrupoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamiento, utilizacion y llamado de métodos de Pila
        Pila jugadores = new Pila(); //Creamos el objeto en la clase Pila 
        //Agregamos jugadores a la pila 
        jugadores.AgregarJugador("Jugador 1", " 1 "); 
        jugadores.AgregarJugador("Jugador 2", " 2 ");
        jugadores.AgregarJugador("Jugador 3", " 3 "); 
        jugadores.AgregarJugador("Jugador 4", " 4 "); 
        jugadores.AgregarJugador("Jugador 5", " 5 "); 
        jugadores.MostrarJugadores(); //Imprimimos los jugadores 

        System.out.println("A continuacion se eliminara el ultimo jugador ingresado: ");
        System.out.println("Eliminando al jugador " + jugadores.getCima().getJugador().getNombre()); 
        jugadores.QuitarJugador(); //Eliminamos al jugador 
        System.out.println("");
        System.out.println("Mostrando los jugadores restantes:");
        jugadores.MostrarJugadores(); //Mostramos los jugadores 
        
        //Instanciamiento, utilizacion y llamado de métodos de Cola 
        Cola cola = new Cola(); //Creamos el objeto en la clase Cola 
        //Agregamos partidas a la cola
        cola.encolarPartida("Partida 1");
        cola.encolarPartida("Partida 2"); 
        cola.encolarPartida("Partida 3"); 
        cola.encolarPartida("Partida 4"); 
        cola.encolarPartida("Partida 5");  

        
        System.out.println("Partida en curso");
        NodosCola partidaEnComienzo = cola.partidaEnProgreso(); //Obtenemos la partida que está en progreso 
        System.out.println(partidaEnComienzo.toString()); //Mostramos la partida en curso 

        //Mostramos las partidas que aún se encuentran en lista de espera mediante el método para imprimir la cola
        System.out.println("");
        System.out.println("Partidas restantes en espera:");
        cola.imprimirCola();
    }
}


package proyectoeddgrupoa;

public class ProyectoEdDGrupoA {

    public static void main(String[] args) {
        //Instanciamiento, utilizacion y llamado de métodos de Pila
        Pila jugadores = new Pila(); //Creamos el objeto en la clase Pila 

        //Agregamos jugadores a la pila 
        jugadores.AgregarJugador("svasquez", " 1 ");
        jugadores.AgregarJugador("jgodinez ", " 2 ");
        jugadores.AgregarJugador("sorozco ", " 3 ");
        jugadores.AgregarJugador("ahidalgo ", " 4 ");
         jugadores.AgregarJugador("Jugador Eliminado ", " 5");
    
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

        EstructuraListaSimple listaSimple = new EstructuraListaSimple();
        listaSimple.AgregarJugador(new Jugadores(1, "sorozco", "Equipo1"));
        listaSimple.AgregarJugador(new Jugadores(2, "jgodinez ", "Equipo2"));
        listaSimple.AgregarJugador(new Jugadores(3, "ahidalgo ", "Equipo3"));
         listaSimple.AgregarJugador(new Jugadores(4, "svasquez ", "Equipo4"));

        listaSimple.MostrarJugadores();

        ListaEC partidas = new ListaEC();
        //Agregamos los datos a las partidas 
        partidas.insertarP(new Partida(1, "sorozco", 45));
        partidas.insertarP(new Partida(2, "jgodinez", 42));
        partidas.insertarP(new Partida(3, "ahidalgo", 50));
        partidas.insertarP(new Partida(4, "svasquez", 48));

        //Mostramos los puntos obtenidos de cada jugador en la partida  
        System.out.print("Puntos obtenidos en la partida, ordenados de manera ascendente: ");
        System.out.println(partidas.toString());

    }
}

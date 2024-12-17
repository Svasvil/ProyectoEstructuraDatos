package proyectoeddgrupoa;

public class ProyectoEdDGrupoA {

    public static void main(String[] args) {
        //Instanciamiento, utilizacion y llamado de métodos de Pila
        Pila jugadores = new Pila(); //Creamos el objeto en la clase Pila
        ListaDobleEnlazada ranking = new ListaDobleEnlazada();

        //Agregamos jugadores a la pila 
        System.out.println(" ! Bienvenido al torneo de videojuegos ! \n"
                + "Ellos seran los jugadores:\n");

        jugadores.AgregarJugador("1", "svasquez", 0);
        jugadores.AgregarJugador("2", "jgodinez ", 0);
        jugadores.AgregarJugador("3", "sorozco ", 0);
        jugadores.AgregarJugador("4", "ahidalgo ", 0);
        jugadores.AgregarJugador("5", "mvinicio", 0);

        jugadores.MostrarJugadores(); //Imprimimos los jugadores 

        System.out.println("Jugador 5 eliminado : ");
        System.out.println("Eliminando al jugador " + jugadores.getCima().getJugador().getNombre());
        jugadores.QuitarJugador(); //Eliminamos al jugador 
        System.out.println("");
        System.out.println("Mostrando los jugadores restantes:");
        jugadores.MostrarJugadores(); //Mostramos los jugadores 

        jugadores.transferirJugadoresARanking(ranking);

        System.out.println("\nRanking de jugadores:");
        ranking.mostrarRanking();

        //Instanciamiento, utilizacion y llamado de métodos de Cola 
        Cola cola = new Cola(); //Creamos el objeto en la clase Cola 
        //Agregamos partidas a la cola
        cola.encolarPartida("Partida 1");
        cola.encolarPartida("Partida 2");
        cola.encolarPartida("Partida 3");
        cola.encolarPartida("Partida 4");
        cola.encolarPartida("Partida 5");

        System.out.println("\nPartida en curso");
        NodosCola partidaEnComienzo = cola.partidaEnProgreso(); //Obtenemos la partida que está en progreso 
        System.out.println(partidaEnComienzo.toString()); //Mostramos la partida en curso 

        //Mostramos las partidas que aún se encuentran en lista de espera mediante el método para imprimir la cola
        System.out.println("");
        System.out.println("Siguientes partidas");
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

        System.out.println("Partida  terminada ");

        //Mostramos los puntos obtenidos de cada jugador en la partida  
        System.out.print("Puntos obtenidos en la partida");
        System.out.println(partidas.toString());
        
        EstructuraArbol Arb1 = new EstructuraArbol();
        Arb1.inserta(45);
        Arb1.inserta(42);
        Arb1.inserta(50);
        Arb1.inserta(48);
        //mostramos el total de puntos durante la partida 
        System.out.println("\nRecuento de puntos ");
        System.out.println("En la partida se hicieron "+Arb1.totalpts()+"Puntos ");
    }
}

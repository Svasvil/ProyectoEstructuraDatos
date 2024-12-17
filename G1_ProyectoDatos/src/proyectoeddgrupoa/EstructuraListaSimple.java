package proyectoeddgrupoa;

import java.security.cert.CRLReason;

public class EstructuraListaSimple {

    public NodoListaSimple primerLugar;

    public void AgregarJugador(Jugadores jugador1) {
        if (this.primerLugar == null) {
            NodoListaSimple nodo1 = new NodoListaSimple(new DatoListaSimple(jugador1));
            this.primerLugar = nodo1;
        } else {
            NodoListaSimple nodo2 = new NodoListaSimple(new DatoListaSimple(jugador1));
            NodoListaSimple aux = this.primerLugar;
            while (aux.getSiguienteNodo() != null && aux.getSiguienteNodo().getDatoPrueba1().getJugador1().getID() < jugador1.getID()) {
                aux = aux.getSiguienteNodo();
            }
            nodo2.setSiguienteNodo(aux.getSiguienteNodo());
            aux.setSiguienteNodo(nodo2);
        }
    }

    public void EliminarJugador(Jugadores jugador2) {
        NodoListaSimple auxiliar = primerLugar;
        NodoListaSimple anterior = null;
        while (auxiliar != null) {
            if (auxiliar.getDatoPrueba1().getJugador1().getID() == jugador2.getID()) {
                if (auxiliar == primerLugar) {
                    primerLugar = primerLugar.getSiguienteNodo();
                    auxiliar.setSiguienteNodo(null);
                    break;
                } else {
                    anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                    auxiliar.setSiguienteNodo(null);
                    break;
                }
            } else {
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguienteNodo();

            }
        }

    }

    public void MostrarJugadores() {
        if (primerLugar == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoListaSimple aux = primerLugar;
        StringBuilder lista = new StringBuilder("Lista de jugadores:\n");

        while (aux != null) {
            lista.append(aux.getDatoPrueba1().getJugador1().toString()).append("\n");
            aux = aux.getSiguienteNodo();
        }
        System.out.println(lista.toString());
    }
}

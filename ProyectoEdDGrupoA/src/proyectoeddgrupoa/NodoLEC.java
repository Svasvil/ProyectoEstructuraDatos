/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author sebastian
 */
public class NodoLEC {
    //Creamos los atributos para el nodo lista enlazada circular 

    private Partida dato; //Almacena los objetos de tipo partida 
    private NodoLEC siguienteNodo;

    //Creamos el constructor con el dato
    public NodoLEC(Partida dato) {
        this.dato = dato;
    }

    //Creamos los métodos getters y setters 
    public Partida getDato() {
        return dato;
    }

    public void setDato(Partida dato) {
        this.dato = dato;
    }

    public NodoLEC getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLEC siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    @Override
    public String toString() {
        return "NodoLEC: " + "dato: " + dato.toString();
    }

}

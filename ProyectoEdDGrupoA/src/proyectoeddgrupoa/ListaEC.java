/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author sebastian
 */
public class ListaEC {

    //Creamos los atributos 
    private NodoLEC cabeza;
    private NodoLEC ultimo;

    public void insertarP(Partida elemento) {
        //Para validar la posicion de insercion 
        NodoLEC nuevoNodo = new NodoLEC(elemento);
        if (this.cabeza == null) { //Si cabeza esta vacia 
            this.cabeza = nuevoNodo;
            this.ultimo = nuevoNodo;
            //El ultimo debe apuntar al primero 
            this.ultimo.setSiguienteNodo(this.cabeza);
        } else { //Si la cabeza NO esta vacia 
            if (elemento.getPuntos() < this.cabeza.getDato().getPuntos()) {
                nuevoNodo.setSiguienteNodo(this.cabeza); //Si el numero es menor a la cabeza, debemos insertarlo al inicio
                this.cabeza = nuevoNodo;
                this.ultimo.setSiguienteNodo(this.cabeza);
            } else if (elemento.getPuntos() > this.ultimo.getDato().getPuntos()) {
                //Caso donde es mayor que el ultimo, se debe insertar al final
                this.ultimo.setSiguienteNodo(nuevoNodo);
                this.ultimo = nuevoNodo;
                this.ultimo.setSiguienteNodo(this.cabeza);
            } else {
                NodoLEC aux = this.cabeza; //Insertamos en el medio xq no es el ultimo ni el primero 
                //Si el ID del dato del nuevoNodo es mayor que el siguiente 
                while (aux.getSiguienteNodo().getDato().getPuntos() < elemento.getPuntos()) { //Por lo que recorrer la lista hasta encontrar el lugar
                    aux = aux.getSiguienteNodo();
                }
                //Enlazamos el nuevo nodo con el nodo que sigue despues del actual 
                nuevoNodo.setSiguienteNodo(aux.getSiguienteNodo());
                aux.setSiguienteNodo(nuevoNodo);
            }
        }
    }

    @Override
    public String toString() {
        //Verificamos si la lista tiene al menos un nodo
        if (this.cabeza != null) {
            NodoLEC aux = cabeza; //Copiamos la cabeza para iniciar lectura
            String cadena = "";

            // Recorre la lista circular
            do {
                //Agregamos el dato del nodo actual a la cadena
                cadena += aux.getDato().toString();
                aux = aux.getSiguienteNodo();
            } while (aux != cabeza);

            //Retornamos la cadena
            return cadena;
        }
        //Por si no hay nada que imprimir
        return "Lista enlazada circular vacia";
    }

}



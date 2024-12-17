/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class Cola {
    private NodosCola frente;
    private NodosCola finalCola;

    public NodosCola getFrente() {
        return frente;
    }

    public void setFrente(NodosCola frente) {
        this.frente = frente;
    }

    public NodosCola getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(NodosCola finalCola) {
        this.finalCola = finalCola;
    }
    
    public void encolarPartida(String partida){
        NodosCola nuevoNodo = new NodosCola(partida);
        if(this.frente == null){
            this.frente = nuevoNodo;
            this.finalCola = nuevoNodo;
        }else{
            this.finalCola.setAtras(nuevoNodo);
            this.setFinalCola(nuevoNodo);
        }
    }
    public NodosCola partidaEnProgreso(){
        NodosCola actual = this.frente;
        this.frente = actual.getAtras();
        actual.setAtras(null);
        return actual;
    }
    
    public void imprimirCola() {
        NodosCola actual = this.frente;
        while (actual != null) {
            System.out.println(actual.getPartida() + " ");
            actual = actual.getAtras();
        }
        System.out.println();
    }
}


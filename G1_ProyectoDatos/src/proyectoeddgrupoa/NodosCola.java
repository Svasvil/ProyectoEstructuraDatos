/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class NodosCola {
    private String partida;
    private NodosCola atras;

    public NodosCola(String partida) {
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public NodosCola getAtras() {
        return atras;
    }

    public void setAtras(NodosCola atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return partida;
    }
}


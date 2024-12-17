/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeddgrupoa;

/**
 *
 * @author Andy
 */
public class DatosJugador {
    private String ID;
    private String nombre;
    private int puntuacion;

    public DatosJugador(String ID, String nombre, int puntuacion) {
        this.ID = ID;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    // Getters y setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
}


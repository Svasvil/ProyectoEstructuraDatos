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
    private String Nombre; //Creamos los atributos
    private String  ID; //Creamos los atributos

    public DatosJugador(String dato) { //Creamos el constructor vacío 
        this.ID = ""; 
        this.Nombre = "";
       }

    public DatosJugador(String Nombre, String ID) {   //Creamos el constructor 
        this.Nombre = Nombre;
        this.ID = ID;
    }
    //Creamos los métodos getters y setters  
    public String getID() {
        return ID;
    }
 
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }   

    @Override
    public String toString() {
        return Nombre;
    }
    
}


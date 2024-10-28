package jugadores;
public class Jugador_Datos {
    private String Nombre; //Creamos los atributos
    private String  ID; //Creamos los atributos

    public Jugador_Datos(String dato) { //Creamos el constructor Vacio 
        this.ID = ""; 
        this.Nombre = "";
       }

    public Jugador_Datos(String Nombre, String ID) {   //Creamos el constructor 
        this.Nombre = Nombre;
        this.ID = ID;
    }
 //Creamos los setters y getters 
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
}

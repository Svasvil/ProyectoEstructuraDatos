
package proyectoeddgrupoa;
public class Jugadores {
    private int ID;
    private String NombreUsuario;
    private String equipo;

    public Jugadores(int ID, String NombreUsuario, String equipo) {
        this.ID = ID;
        this.NombreUsuario = NombreUsuario;
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "ID=" + ID + ", NombreUsuario=" + NombreUsuario + ", equipo=" + equipo + '}';
    }
    
            
            
    
}

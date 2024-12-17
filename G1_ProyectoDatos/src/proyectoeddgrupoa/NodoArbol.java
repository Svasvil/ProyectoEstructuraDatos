
package proyectoeddgrupoa;
public class NodoArbol {
 private int id;
    private NodoArbol IZQ;
    private NodoArbol DER;

    public NodoArbol(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoArbol getIZQ() {
        return IZQ;
    }

    public void setIZQ(NodoArbol IZQ) {
        this.IZQ = IZQ;
    }

    public NodoArbol getDER() {
        return DER;
    }

    public void setDER(NodoArbol DER) {
        this.DER = DER;
    }

    
}
    
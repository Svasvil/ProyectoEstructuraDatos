
package proyectoeddgrupoa;


public class NodoListaSimple {
    private NodoListaSimple siguienteNodo;
    
        public NodoListaSimple(DatoListaSimple dato ){
            this.datoPrueba1= dato;
     
        }
        private DatoListaSimple datoPrueba1;

    public NodoListaSimple getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoListaSimple siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public DatoListaSimple getDatoPrueba1() {
        return datoPrueba1;
    }

    public void setDatoPrueba1(DatoListaSimple datoPrueba1) {
        this.datoPrueba1 = datoPrueba1;
    }
        
}

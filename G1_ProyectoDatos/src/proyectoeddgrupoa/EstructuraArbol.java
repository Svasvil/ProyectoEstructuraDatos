package proyectoeddgrupoa;

public class EstructuraArbol {

    NodoArbol raiz;

    public void inserta(int num) {
        if (raiz == null) {
            raiz = new NodoArbol(num);
        } else {
            insertaRecursivo(raiz, num);
        }
    }

    public void insertaRecursivo(NodoArbol nodo, int x) {
              if (x <= nodo.getId()) {
            
            if (nodo.getIZQ() == null) {
                nodo.setIZQ(new NodoArbol(x));
            } else {
                insertaRecursivo(nodo.getIZQ(), x);
            }
        } else {
            if (nodo.getDER() == null) {

                nodo.setDER(new NodoArbol(x));
            } else {

                insertaRecursivo(nodo.getDER(), x);
            }
        }
    }

    public void inorden() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
        } else {

            inordenRecursivo(raiz);
        }
    }

    public void inordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {

            inordenRecursivo(nodo.getIZQ());

            System.out.println(nodo.getId());

            inordenRecursivo(nodo.getDER());
        }
    }

    public void preorden() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
        } else {

            preordenRecursivo(raiz);
        }
    }

    public void preordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
           
            System.out.println(nodo.getId());
            
            preordenRecursivo(nodo.getIZQ());
           
            preordenRecursivo(nodo.getDER());
        }
    }

    public void postorden() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
        } else {

            postordenRecursivo(raiz);
        }
    }

    public void postordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {

            postordenRecursivo(nodo.getIZQ());

            postordenRecursivo(nodo.getDER());
            System.out.println(nodo.getId());
        }
    }
    
        public int totalpts(){
            return puntajeTotal(raiz);
        }
    
    public int puntajeTotal(NodoArbol nodo ){
        if (nodo == null){
        return 0;
        } else{
        return nodo.getId()+puntajeTotal(nodo.getIZQ())+puntajeTotal(nodo.getDER());
        }
    }

}

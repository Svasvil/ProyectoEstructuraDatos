package jugadores;

public class Cola {
    private NodoCola frente;
    private NodoCola finalCola;

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(NodoCola finalCola) {
        this.finalCola = finalCola;
    }
    
    public void encolarPartida(String partida){
        NodoCola nuevoNodo = new NodoCola(partida);
        if(this.frente == null){
            this.frente = nuevoNodo;
            this.finalCola = nuevoNodo;
        }else{
            this.finalCola.setAtras(nuevoNodo);
            this.setFinalCola(nuevoNodo);
        }
    }
    public NodoCola partidaEnProgreso(){
        NodoCola actual = this.frente;
        this.frente = actual.getAtras();
        actual.setAtras(null);
        return actual;
    }
}

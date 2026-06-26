public class Contador {
    private int valor = 0;

    public synchronized void incrementar(){
        int copia = valor;
        Thread.yield();
        valor = copia + 1;
    }

    public int getValor(){
        return valor;
    }
}

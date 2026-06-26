public class ExCorrida{
    public static void main(String[] args) throws InterruptedException{
        Contador c = new Contador();
        int nThreads = 4, repeticoes = 1000;
        Thread[] threads = new Thread[nThreads];

        for(int i = 0; i < nThreads; i++){
            threads[i] = new Thread(()-> {
                for (int j = 0; j < repeticoes; j++) c.incrementar();
            });
        }

        for(Thread t : threads) t.start();
        for(Thread t : threads) t.join();

        System.out.println("Esperando " + (nThreads * repeticoes));
        System.out.println("Obtido: " + c.getValor());
    }
}
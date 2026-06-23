public class Monitor implements Runnable {
    @Override
    public void run() {
        int ciclo = 1; 

        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Monitorando recurso... (ciclo " + ciclo + ")");
        }

        try{
            Thread.sleep(1200);
        } catch (InterruptedException e){
            System.out.println("Recebi pedido de parada. Saindo com segurança.");
            return;
        }

        ciclo++;
    }
}

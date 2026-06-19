public class Tarefa implements Runnable {
    @Override
    public void run(){
        System.out.println(" [run] executando em: " + Thread.currentThread().getName());
    }
}

import Tarefa.java;      
public class Ex2StartRun {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();

        System.out.println(">> Chamando run() direto:");
        new Thread(t).run();
        System.out.println(" Thread que executou: " + Thread.currentThread(). getName());

        System.out.println(">> Chamando start() direto:");
        new Thread(t, "trabalhador").start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
        System.out.println("Thread interrompida: " + e.getMessage());
        }    

    }    
}


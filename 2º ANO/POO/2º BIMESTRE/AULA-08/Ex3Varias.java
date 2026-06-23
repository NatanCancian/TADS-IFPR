public class Ex3Varias{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Cozinheiro2("Ana"));
        Thread t2 = new Thread(new Cozinheiro2("Bruno"));
        Thread t3 = new Thread(new Cozinheiro2("Japa"));

        t1.start();
        t2.start();
        t3.start();
        
        try{
        
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("[main] Todos os cozinheiros terminaram. Serviço Fechado");
    }
}
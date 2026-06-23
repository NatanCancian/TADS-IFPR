public class Ex4Interrupt {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Monitor(), "monitor");
        t.start();

        Thread.sleep(1200);

        t.interrupt();
    
        t.join();

        System.out.println("[main] Monitor encerrado pela Thread principal");
    }
}

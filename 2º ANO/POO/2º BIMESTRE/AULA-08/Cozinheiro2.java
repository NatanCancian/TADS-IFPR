public class Cozinheiro2 implements Runnable{
    private String nome;

    public Cozinheiro2(String nome){
        this.nome = nome;
    }
    
    @Override
    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println(nome + " -> prato " + i);
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                
            }
        }
    }
    
}

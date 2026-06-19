public class Cozinheiro implements Runnable{
    private String nome;

    public Cozinheiro(String nome){
        this.nome = nome;
  }
  @Override
  public void run(){
    for( int i=1; i <= 3; i++){
        System.out.println(nome + " preparou o prato " + i);
    }
  }

}

import utils.IO;
public class EX7 {
    public static void main(String[] args) {
        int inicio = 0;
        int fim = 0;
        int contagem = 0;
        IO.imprimir("Digite o valor que deseja iniciar a contagem");
        inicio = IO.lerValorInt();
        IO.imprimir("Digite o valor que deseja finalizar a contagem");
        fim = IO.lerValorInt();
        if(inicio < fim){
            contagem = IO.somarIntervaloPar(inicio, fim);
            IO.imprimeInt(contagem);
        }else{
            contagem = IO.somarIntervaloInversoPar(inicio, fim);
            IO.imprimeInt(contagem);
        }    
  }
}
 

            


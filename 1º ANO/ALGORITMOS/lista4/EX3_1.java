import utils.IO;
public class EX3_1 {
    public static void main(String[] args) {

        //Sequência crescente 
        int inicio = 0; int fim = 0; int contagem = 0;
        IO.imprimir("Digite um valor");
        inicio = IO.lerValorInt();
        if(fim < inicio){
            contagem = IO.contarIntervalo(fim, inicio);
            IO.imprimeInt(contagem);
        }else{
            contagem = IO.contarIntervalo(inicio, fim);
            IO.imprimeInt(contagem);
        }       
    }
}

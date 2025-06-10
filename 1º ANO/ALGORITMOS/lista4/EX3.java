import utils.IO;
public class EX3 {
    public static void main(String[] args) {
        //Sequência decrescente

        int inicio = 0; int fim = 0; int contagem = 0;
        IO.imprimir("Digite um valor");
        fim = IO.lerValorInt();
        if(fim > inicio){
            contagem = IO.contarIntervaloInverso(fim, inicio);
            IO.imprimeInt(contagem);
        }else{
            contagem = IO.contarIntervalo(fim, inicio);
            IO.imprimeInt(contagem);
        }       
    }
}

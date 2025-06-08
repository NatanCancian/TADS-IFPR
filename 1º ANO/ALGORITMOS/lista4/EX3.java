public class EX3 {
    public static void main(String[] args) {
        //Sequência decrescente

        int inicio = 0; int fim = 0; int contagem = 0;
        metodoLista.imprimir("Digite um valor");
        fim = metodoLista.lerValorInt();
        if(fim > inicio){
            contagem = metodoLista.contarIntervaloInverso(fim, inicio);
            metodoLista.imprimeInt(contagem);
        }else{
            contagem = metodoLista.contarIntervalo(fim, inicio);
            metodoLista.imprimeInt(contagem);
        }       
    }
}

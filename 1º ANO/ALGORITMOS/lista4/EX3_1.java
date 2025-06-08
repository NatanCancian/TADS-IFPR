public class EX3_1 {
    public static void main(String[] args) {

        //Sequência crescente 
        int inicio = 0; int fim = 0; int contagem = 0;
        metodoLista.imprimir("Digite um valor");
        inicio = metodoLista.lerValorInt();
        if(fim < inicio){
            contagem = metodoLista.contarIntervalo(fim, inicio);
            metodoLista.imprimeInt(contagem);
        }else{
            contagem = metodoLista.contarIntervalo(inicio, fim);
            metodoLista.imprimeInt(contagem);
        }       
    }
}

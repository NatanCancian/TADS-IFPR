public class EX6 {
    public static void main(String[] args) {
        int inicio = 0; int fim = 0; int contagem = 0;
        metodoLista.imprimir("Digite o valor que deseja iniciar a contagem");
        inicio = metodoLista.lerValorInt();
        metodoLista.imprimir("Digite o valor que deseja finalizar a contagem");
        fim = metodoLista.lerValorInt();
        if(inicio < fim){
            contagem = metodoLista.somarIntervalo(inicio, fim);
            metodoLista.imprimeInt(contagem);
        }else{
            contagem = metodoLista.somarIntervaloInverso(inicio, fim);
            metodoLista.imprimeInt(contagem);
        }
    }
}   

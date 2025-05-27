public class EX9 {
    public static void main(String[] args) {
        int fim = 0; 
        String saida = null;
        metodoLista.imprimir("Insira a quantidade de números que deseja digitar:");
        fim = metodoLista.lerValorInt();
        saida = metodoLista.calcularNParImpar(fim);
        metodoLista.imprimir(saida); 
    }
}

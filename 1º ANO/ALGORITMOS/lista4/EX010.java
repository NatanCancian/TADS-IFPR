public class EX010 {
    public static void main(String[] args) {
        int fim = 0;
        String saida = null;
        metodoLista.imprimir("Insira a quantidade de números que deseja digitar:");
        fim = metodoLista.lerValorInt();
        saida = metodoLista.calcularNIntervalos(fim);
        metodoLista.imprimir(saida);
    }
}

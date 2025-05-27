public class EX013 {
    public static void main(String[] args) {
        String saida = null; int n = 0;
        metodoLista.imprimir("Insira o número que deseja calcular o fatorial");
        n = metodoLista.lerValorInt();
        saida = "O número fatorial é: " + metodoLista.calcularFatorial(n);
        metodoLista.imprimir(saida);
    }
}

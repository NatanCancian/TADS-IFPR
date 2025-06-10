import utils.IO;
public class EX013 {
    public static void main(String[] args) {
        String saida = null; int n = 0;
        IO.imprimir("Insira o número que deseja calcular o fatorial");
        n = IO.lerValorInt();
        saida = "O número fatorial é: " + IO.calcularFatorial(n);
        IO.imprimir(saida);
    }
}

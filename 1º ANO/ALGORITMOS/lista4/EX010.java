import utils.IO;
public class EX010 {
    public static void main(String[] args) {
        int fim = 0;
        String saida = null;
        IO.imprimir("Insira a quantidade de números que deseja digitar:");
        fim = IO.lerValorInt();
        saida = IO.calcularNIntervalos(fim);
        IO.imprimir(saida);
    }
}

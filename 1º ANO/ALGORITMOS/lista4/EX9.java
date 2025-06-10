import utils.IO;
public class EX9 {
    public static void main(String[] args) {
        int fim = 0; 
        String saida = null;
        IO.imprimir("Insira a quantidade de números que deseja digitar:");
        fim = IO.lerValorInt();
        saida = IO.calcularNParImpar(fim);
        IO.imprimir(saida); 
    }
}

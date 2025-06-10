import utils.IO;
public class EX8 {
    public static void main(String[] args) {
        int fim = 0; 
        String saida = null;
        IO.imprimir("Insira a quantidade de números que deseja digitar:");
        fim = IO.lerValorInt();
        saida = IO.calcularNPositivosNegativos(fim);
        IO.imprimir(saida);
    }   
}

import utils.IO;
public class EX2 {
     public static void main(String[] args) {
        int inicio = 200; int fim = 1; int contagem = 0;
        contagem = IO.contarIntervaloInverso(inicio, fim);
        IO.imprimeInt(contagem);
    }
}

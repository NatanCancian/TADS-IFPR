import utils.IO;
public class EX1 {
        public static void main(String[] args) {
        int inicio = 10; int fim = 200; int contagem = 0;
        contagem = IO.contarIntervalo(inicio, fim);
        IO.imprimeInt(contagem);
    }
}

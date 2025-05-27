import java.util.Scanner;

public class aula01 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    } 

        public static double calcularAlturaPredio(double alturaAndares, int qntAndares){
            double resultado = 0;
            resultado = alturaAndares * qntAndares;
            return resultado;

        }
        public static void main(String[] args) {
        double alturaAndares = 0;
        int qntAndares = 0; 
        double alturaPredio = 0;
        String saida;

        //inicio
        imprimir("Informe a altura dos andares");
        alturaAndares = lerValorReal();
        imprimir("Informe a quantidade dos andares");
        qntAndares = lerValorInteiro();

        //processamento
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "A altura do prédio é: " + alturaPredio;
        imprimir(saida);

    }
}

/*      ASSINATURA DE FUNÇÃO = NOME DE FUNÇÃO,  ENTRADA(TIPO DE DADO), SAÍDA(TIPO DE DADO)
 * 
 */


/**
 *          para passar dados a função vai com parâmetros
 *          para ler dados a função vai sem parâmetros
 */
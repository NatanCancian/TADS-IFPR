import utils.IO;
public class EX01 {

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
        IO.imprimir("Informe a altura dos andares");
        alturaAndares = IO.lerValorDouble();
        IO.imprimir("Informe a quantidade dos andares");
        qntAndares = IO.lerValorInt();

        //processamento
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "A altura do prédio é: " + alturaPredio;
        IO.imprimir(saida);
        
    }
}

/*      ASSINATURA DE FUNÇÃO = NOME DE FUNÇÃO,  ENTRADA(TIPO DE DADO), SAÍDA(TIPO DE DADO)
 * 
 *          para passar dados a função vai com parâmetros
 *          para ler dados a função vai sem parâmetros
 */
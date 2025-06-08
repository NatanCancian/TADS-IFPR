
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
        metodosLista.imprimir("Informe a altura dos andares");
        alturaAndares = metodosLista.lerValorDouble();
        metodosLista.imprimir("Informe a quantidade dos andares");
        qntAndares = metodosLista.lerValorInt();

        //processamento
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "A altura do prédio é: " + alturaPredio;
        metodosLista.imprimir(saida);
        
    }
}

/*      ASSINATURA DE FUNÇÃO = NOME DE FUNÇÃO,  ENTRADA(TIPO DE DADO), SAÍDA(TIPO DE DADO)
 * 
 *          para passar dados a função vai com parâmetros
 *          para ler dados a função vai sem parâmetros
 */

public class EX09 {

    public static double calcularAreaTrapezio(double baseMenor, double baseMaior, double altura) {
        double resultado = 0;
        resultado = (((baseMenor + baseMaior) * altura) / 2);
        return resultado;
    }

    public static void main(String[] args) {
        double baseMenor = 0;
        double baseMaior = 0;
        double altura = 0;
        double areaTrapezio = 0;
        String saida = null;

        metodosLista.imprimir("||||||||||||||||||||||||||||||");
        metodosLista.imprimir("CALCULADORA DE TRAPÉZIO");
        metodosLista.imprimir("||||||||||||||||||||||||||||||");
        metodosLista.imprimir("Informe o valor da base menor:");
        baseMenor = metodosLista.lerValorDouble();
        metodosLista.imprimir("||||||||||||||||||||||||||||||");
        metodosLista.imprimir("Informe o valor da base maior:");
        baseMaior = metodosLista.lerValorDouble();
        metodosLista.imprimir("||||||||||||||||||||||||||||||");
        metodosLista.imprimir("Informe a altura do trapézio");
        altura = metodosLista.lerValorDouble();
        metodosLista.imprimir("||||||||||||||||||||||||||||||");
        areaTrapezio = calcularAreaTrapezio(baseMenor, baseMaior, altura);
        saida = "A área do trapézio é : " + areaTrapezio + "cm";
        metodosLista.imprimir(saida);
    }
}

import utils.IO;
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

        IO.imprimir("||||||||||||||||||||||||||||||");
        IO.imprimir("CALCULADORA DE TRAPÉZIO");
        IO.imprimir("||||||||||||||||||||||||||||||");
        IO.imprimir("Informe o valor da base menor:");
        baseMenor = IO.lerValorDouble();
        IO.imprimir("||||||||||||||||||||||||||||||");
        IO.imprimir("Informe o valor da base maior:");
        baseMaior = IO.lerValorDouble();
        IO.imprimir("||||||||||||||||||||||||||||||");
        IO.imprimir("Informe a altura do trapézio");
        altura = IO.lerValorDouble();
        IO.imprimir("||||||||||||||||||||||||||||||");
        areaTrapezio = calcularAreaTrapezio(baseMenor, baseMaior, altura);
        saida = "A área do trapézio é : " + areaTrapezio + "cm";
        IO.imprimir(saida);
    }
}

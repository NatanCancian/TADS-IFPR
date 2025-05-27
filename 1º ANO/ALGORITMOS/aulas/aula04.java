import java.util.Scanner;

public class aula04 {
    //CONSTANTES
    final static double IMC_LIMITE_ABAIXO = 18.5;
    final static double IMC_LIMITE_IDEAL = 25.0;
    final static double IMC_LIMITE_EXCESSO = 30.0;
    final static double IMC_LIMITE_GRAU_1 = 35.0;
    final static double IMC_LIMITE_GRAU_2 = 40.0;

    final static Scanner LER_TECLADO = new Scanner(System.in);

    // método que recebe um texto e imprime
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = 0;
        valor = LER_TECLADO.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor = 0;
        valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static double calcularIMC(double peso, double altura) {
        double imc = 0;
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public static String classificarIMC(double imc) {
        String imcResultado = null;

        if (imc < IMC_LIMITE_ABAIXO) {
            imcResultado = "Abaixo do peso";
        } else if (imc < IMC_LIMITE_IDEAL) {
            imcResultado = "Peso ideal";
        } else if (imc < IMC_LIMITE_EXCESSO) {
            imcResultado = "Peso em excesso";
        } else if (imc < IMC_LIMITE_GRAU_1) {
            imcResultado = "Obesidade Grau I";
        } else if (imc < IMC_LIMITE_GRAU_2) {
            imcResultado = "Obesidade Grau II (severa)";
        } else {
            imcResultado = "Obesidade Grau III (mórbida)";
        }
        return imcResultado;
    }

    public static void main(String[] args) {

        // VARIÁVEIS
        double altura = 0;
        double peso = 0;
        double imc = 0;

        imprimir("Digite sua altura");
        altura = lerValorReal();

        imprimir("Digite seu peso");
        peso = lerValorReal();

        // PROCESSAMENTO DE DADOS
        imc = calcularIMC(peso, altura);

        // SAÍDA DE DADOS
        String resulString = "IMC é " + imc;
        imprimir(resulString);
        String classificacaoResultado = "Sua classificação é " + classificarIMC(imc);
        imprimir(classificacaoResultado);
    }
}

import utils.IO;
public class EX02 {
    
    public static double calcularDolares(double cotacaoDolar, double quantDolares){
        double valor = 0;
        valor = cotacaoDolar * quantDolares;
        return valor;
    }
    public static void main(String[] args) {
        double cotacaoDolar;
        double quantDolares;
        double quantReais;

        IO.imprimir("Informe a cotação atual do dólar");
        cotacaoDolar = IO.lerValorDouble();
        IO.imprimir("Informe quantos dólares você possui");
        quantDolares = IO.lerValorDouble();
        quantReais = calcularDolares(cotacaoDolar, quantDolares);
        IO.imprimir("Você possui R$ " + quantReais + " reais");

    }
}

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

        metodosLista.imprimir("Informe a cotação atual do dólar");
        cotacaoDolar = metodosLista.lerValorDouble();
        metodosLista.imprimir("Informe quantos dólares você possui");
        quantDolares = metodosLista.lerValorDouble();
        quantReais = calcularDolares(cotacaoDolar, quantDolares);
        metodosLista.imprimir("Você possui R$ " + quantReais + " reais");

    }
}

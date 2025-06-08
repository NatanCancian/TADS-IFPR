package aula;
import java.util.Scanner;

public class aula05ex1 {
     final static Scanner teclado = new Scanner(System.in);

     // Recebe um valor double
     public static double lerValorReal() {
          double valor = 0;
          valor = teclado.nextDouble();
          return valor;
     }

     // Recebe um texto e mostra na tela
     public static void imprimir(String texto) {
          System.out.println(texto);
     }

     public static double calcularDolarReal(double cotacaoDolar, double valorDolares) {
          double valorReais = 0;
          valorReais = cotacaoDolar * valorDolares;
          return valorReais;
     }

     public static void main(String[] args) {
          // Variáveis
          double cotacaoDolar = 0;
          double valorDolares = 0;
          double valorReais = 0;
          String saida = null;
          // Entrada de dados
          imprimir("Informe a cotação do dólar");
          cotacaoDolar = lerValorReal();

          imprimir("Informe a quantidade de dólares");
          valorDolares = lerValorReal();

          valorReais = calcularDolarReal(cotacaoDolar, valorDolares);
          saida = "Você possui " + valorReais + " reais";

          imprimir(saida);
     }
}
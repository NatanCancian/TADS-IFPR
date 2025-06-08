package aula;
import java.util.Scanner;

public class aula05ex3 {
    
    final static Scanner teclado = new Scanner(System.in);

    public static double lerValorReal(){
        double valor = 0;
        valor = teclado.nextDouble();
        return valor;
   }

   //Recebe um texto e mostra na tela
   public static void imprimir(String texto){
    System.out.println(texto);
   }

   public static double calcularMedia(double distancia, double quantCombustivel){
        double media = 0;
        media = distancia / quantCombustivel;
        return media;
   }
    public static void main(String[] args) {
        double distancia = 0; double quantCombustivel = 0; double media = 0; 
        imprimir("Informe a quantidade de combustível gasto:");
        quantCombustivel = lerValorReal();

        imprimir("Informe a distância percorrida:");
        distancia = lerValorReal();

        media = calcularMedia(distancia, quantCombustivel);
        imprimir("Sua média foi de " + media + "KMs/L");

    }
}

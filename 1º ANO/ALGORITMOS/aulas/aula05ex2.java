import java.util.Scanner;

public class aula05ex2 {
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

   public static String classificarTriangulo(double lado1, double lado2, double lado3){
        String tipoTriangulo = null;
        if((lado1 == lado2) && (lado2 == lado3)){
            tipoTriangulo = "Equilátero";
        }else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
            tipoTriangulo = "Escaleno";
        }else{
            tipoTriangulo = "Isóceles";
        }
        return tipoTriangulo;
   }

    public static void main(String[] args) {
        double lado1 = 0; double lado2 = 0; double lado3; String saida = null;
        imprimir("Informe o 1º lado do trinângulo:");
        lado1 = lerValorReal();

        imprimir("Informe o 2º lado do trinângulo:");
        lado2 = lerValorReal();

        imprimir("Informe o 3º lado do trinângulo:");
        lado3 = lerValorReal();

        saida = classificarTriangulo(lado1, lado2, lado3);

        imprimir("Seu triângulo é do tipo " + saida);
    }
}

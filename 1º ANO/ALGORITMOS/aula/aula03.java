package aula;
import java.util.Scanner;

public class aula03 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int numero = 0;
        imprimir("Informe um número:");
        numero = lerValorInteiro();

        if(numero != 0){
            if(numero % 2 == 0){
                imprimir("Número par");
            } else{
                imprimir("Número impar");
            }

            if(numero > 0){
                imprimir("Número positivo");
            }else{
                imprimir("Número negativo");
            } 
            imprimir("Fim de execução");
            } 
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
       /*  int nota = 0;
        imprimir("Escreva uma nota:");
        nota = lerValorInteiro();

        if (nota >= 9) {
            imprimir("Conceito A");
        } else if (nota >= 8) {
            imprimir("Conceito B");
        } else if (nota >= 7) {
            imprimir("Conceito C");
        } else {
            imprimir("Conceito D");
        } */

        /*
         * int nota = 0;
         * 
         * imprimir("Digite uma nota");
         * nota = lerValorInteiro();
         * 
         * if (nota >= 7) {
         * imprimir("Passou");
         * } else {
         * imprimir("Não passou");
         * }
         * 
         * int qntLivros = 0;
         * imprimir("Informe a quantidade de livros:");
         * qntLivros = lerValorInteiro();
         * if(qntLivros < 5){
         * imprimir("Categoria 1");
         * }else if (qntLivros > 10){
         * imprimir("Categoria 3");
         * }else{
         * imprimir("Categoria 2");
         * }
         */
 
        
    }

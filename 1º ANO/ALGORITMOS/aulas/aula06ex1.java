import java.util.Scanner;
public class aula06ex1 {

    final static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro(){
        int valor = 0;
        valor = teclado.nextInt();
        return valor; 
    }

    public static void imprimir(String texto){
        System.out.println(texto);        
    }

    public static int processar(int inicio, int fim){
        int i = 0 ;
        int soma = 0;

        for(i = inicio; i <= fim; i = i + 1){
            soma = soma + i;

        }
        return soma;
    }

    public static void main(String[] args){
        int inicio = 0; int fim = 0; int soma = 0; 

        imprimir("Valor inicial:");
        inicio = lerInteiro();

        imprimir("Valor final:");
        fim = lerInteiro();

        soma = processar(inicio, fim);
        imprimir("Resultado:" + soma);
    }

}

package aula;
import java.util.Scanner;
public class aula06ex2 {

    final static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro(){
        int valor = 0;
        valor = teclado.nextInt();
        return valor; 
    }

    public static void imprimir(String texto){
        System.out.println(texto);        
    }

    public static long processar(){
        int i = 0 ;
        long atual = 1;

        for(i = 1; i <= 64; i = i + 1){
            imprimir("" + atual);
            atual = atual * 2;

        }
        return atual;
    }

    public static void main(String[] args){
        long soma = 0; 
        soma = processar();
        imprimir("" + soma);
    }

}

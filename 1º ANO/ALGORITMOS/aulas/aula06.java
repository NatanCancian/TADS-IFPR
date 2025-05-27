import java.util.Scanner;

public class aula06 {
    final static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro(){
        int valor = 0;
        valor = teclado.nextInt();
        return valor; 

    }

    public static void imprimir(String texto){
        System.out.println(texto);        
    }

    public static void processar(int inicio, int fim){
        int i = 0;
        String texto = null;

        for(i = inicio; i <= fim; i = i + 1){
            texto = "" + i;
            imprimir(texto);
            
        }
    } 

    public static void processarInverso(int inicio, int fim){
        int i = 0;
        String texto = null;

        for(i = inicio; i >= fim; i = i - 1){
            texto = "" + i;
            imprimir(texto);
            
        }
    } 
    public static void main(String[] args) {
        
        int inicio = 0; 
        int fim = 0; 
        
        imprimir("Valor inicial:");
        inicio = lerInteiro();

        imprimir("Valor final:");
        fim = lerInteiro();

        //LÓGICA PARA APLICAR NOS calcularInversoPar

        if(inicio < fim){
            processar(inicio, fim);
        }else{
            processarInverso(inicio, fim);
        }
        
    }
}

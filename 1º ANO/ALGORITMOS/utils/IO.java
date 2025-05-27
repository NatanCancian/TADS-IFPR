package utils;
import java.util.Scanner;
public class IO {
    final static Scanner tecladoScanner = new Scanner(System.in); 
    public static void hello(){
        System.out.println("Hello");
    }

    public static int lerValorInteiro(){
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void imprimirValorInteiro(int valor){
        System.out.println(valor);
    }
    
    public static void processarEntradaSaida(){
        int valor = IO.lerValorInteiro();
        IO.imprimirValorInteiro(valor);
    }
}

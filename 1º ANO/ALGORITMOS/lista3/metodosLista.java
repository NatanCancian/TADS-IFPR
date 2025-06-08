import java.util.Scanner;
public class metodosLista {
    
    public static Scanner entrada = new Scanner(System.in);
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double lerValorDouble() {
        double valor = 0;
        valor = entrada.nextDouble();
        return valor;
    }

    public static int lerValorInt(){
            int valor = 0;
            valor = entrada.nextInt();
            return valor;
        }

    public static float lerValorFloat(){
        float valor = 0;
        valor = entrada.nextFloat();
        return valor;
    }

    public static long lerValorLong(){
        long valor = 0;
        valor = entrada.nextLong();
        return valor;
    }

    public static String lerValorString(){
        String valor = null;
        valor = entrada.nextLine();
        return valor;
    }
    
    public static boolean lerValorBoolean(){
        boolean valor = false;
        valor = entrada.nextBoolean();
        return valor;
    }
    
    public static byte lerValorByte(){
        byte valor = 0;
        valor = entrada.nextByte();
        return valor;
    }

    public static short lerValorShort(){
        short valor = 0;
        valor = entrada.nextShort();
        return valor;
    }

    public static char lerValorChar(){
        char valor = 0;
        valor = entrada.next().charAt(0);
        return valor;
    }
        public static void main(String[] args) {
            
    }
}

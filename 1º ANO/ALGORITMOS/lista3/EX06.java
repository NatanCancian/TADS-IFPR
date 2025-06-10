import utils.IO;
public class EX06 {
    
    public static String calcularParouImpar(int numero){
        String resultado = null;
        if (numero > 0) {
            if(((numero % 2) == 0)) {
                resultado = "PAR";
            }else{
                resultado = "ÍMPAR";
            }
        }else{
            resultado = "O número informado é menor ou igual a 0, refaça a operação e informe um número maior que 0";
        }
        return resultado;
    }
    public static void main(String[] args) {
        int numero = 0; String classNumero = null;
        IO.imprimir("CALCULADORA DE PAR OU ÍMPAR");
        IO.imprimir("||||||||||||||||||||||||||||");
        IO.imprimir("Informe um número:");
        numero = IO.lerValorInt();
        classNumero = calcularParouImpar(numero);
        IO.imprimir("Seu número é " + classNumero);
    }
}

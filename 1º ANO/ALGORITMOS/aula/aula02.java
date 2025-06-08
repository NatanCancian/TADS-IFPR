package aula;
import java.util.Scanner;
public class aula02 {
    
    public static Scanner entrada = new Scanner(System.in);
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = entrada.nextDouble();
        return valor;
    }

    public static double calcularAreaTrapezio(double baseMenor, double baseMaior, double altura){
        double resultado = 0;
        resultado = (((baseMenor + baseMaior) * altura)/2); 
        return resultado;
     }
    
    public static void main(String[] args) {
        double baseMenor = 0;
        double baseMaior = 0;
        double altura = 0;
        double areaTrapezio = 0;
        String saida = null;
      
        
      imprimir("||||||||||||||||||||||||||||||");
      imprimir("CALCULADORA DE TRAPÉZIO");
      imprimir("||||||||||||||||||||||||||||||");
      imprimir("Informe o valor da base menor:");
      baseMenor = lerValorReal();
      imprimir("||||||||||||||||||||||||||||||");
      imprimir("Informe o valor da base maior:");
      baseMaior = lerValorReal();
      imprimir("||||||||||||||||||||||||||||||");
      imprimir("Informe a altura do trapézio");
      altura = lerValorReal();
      imprimir("||||||||||||||||||||||||||||||");
      areaTrapezio = calcularAreaTrapezio(baseMenor, baseMaior,altura);
      saida = "A área do trapézio é : " + areaTrapezio + "cm";
      imprimir(saida);
      
    }
}

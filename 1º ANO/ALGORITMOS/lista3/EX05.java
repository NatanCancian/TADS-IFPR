public class EX05 {
    
    public static String calcularNumeral(double numero){
        String classNumero = null;
        if(numero > 0){
            classNumero = "Positivo";
        } else if(numero != 0){
            classNumero = "Negativo";
        }else{
            classNumero = "Zero";
        }
        return classNumero;
    }

    public static void main(String[] args) {
        double numero = 0; String resposta = null;
        metodosLista.imprimir("Informe um número:");
        numero = metodosLista.lerValorDouble();
        resposta = calcularNumeral(numero);
        metodosLista.imprimir("Seu número é " + resposta);        
    }
}

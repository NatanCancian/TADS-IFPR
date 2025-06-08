public class EX03 {

    public static String classificarTriangulo(double lado1, double lado2, double lado3){
        String resultado = null;
            if(lado1 == lado2 && lado2 == lado3){
                resultado = "Triângulo Equilátero";
            } else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                resultado = "Triângulo Escaleno";
            } else{
                resultado = "Triângulo Isóceles";
            }
            return resultado;
    }
    public static void main(String[] args) {
        double lado1 = 0; double lado2 = 0; double lado3 = 0; String tipoTriangulo = null;     
        metodosLista.imprimir("|||||||||||||||||||||||||||||||||||");
        metodosLista.imprimir("CLASSIFICADOR DE TRIÂNGULOS");
        metodosLista.imprimir("|||||||||||||||||||||||||||||||||||");
        metodosLista.imprimir("Informe o 1º lado do seu triângulo:");
        lado1 = metodosLista.lerValorDouble();     
        metodosLista.imprimir("Informe o 2º lado do seu triângulo:");
        lado2 = metodosLista.lerValorDouble();
        metodosLista.imprimir("Informe o 3º lado do seu triângulo:");
        lado3 = metodosLista.lerValorDouble();
        tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);
        metodosLista.imprimir("O seu triângulo é do tipo " + tipoTriangulo);
        metodosLista.imprimir("|||||||||||||||||||||||||||||||||||");   
    }
}


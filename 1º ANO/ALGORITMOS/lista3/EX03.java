import utils.IO;
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
        IO.imprimir("|||||||||||||||||||||||||||||||||||");
        IO.imprimir("CLASSIFICADOR DE TRIÂNGULOS");
        IO.imprimir("|||||||||||||||||||||||||||||||||||");
        IO.imprimir("Informe o 1º lado do seu triângulo:");
        lado1 = IO.lerValorDouble();     
        IO.imprimir("Informe o 2º lado do seu triângulo:");
        lado2 = IO.lerValorDouble();
        IO.imprimir("Informe o 3º lado do seu triângulo:");
        lado3 = IO.lerValorDouble();
        tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);
        IO.imprimir("O seu triângulo é do tipo " + tipoTriangulo);
        IO.imprimir("|||||||||||||||||||||||||||||||||||");   
    }
}


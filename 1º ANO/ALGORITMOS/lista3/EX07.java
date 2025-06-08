public class EX07 {
    
    public static String calcularMaior(int valor1, int valor2, int valor3){
        String resultado = null;
        if((valor1 > valor2) && (valor1 > valor3)){
            resultado = "O maior valor é o " + valor1;
        }else if((valor2 > valor1) && (valor2 > valor3)){
            resultado = "O maior valor é o " + valor2;
        }else if((valor3 > valor1) && (valor3 > valor2)) {
            resultado = "O maior valor é o " + valor3;
        }else{
            resultado = "ERRO! Todos os valores informados são iguais! Refaça a operação utilizando valores diferentes"; 
        }
        return resultado;
    }
    public static void main(String[] args) {
        String maior = null; int valor1 = 0; int valor2 = 0; int valor3 = 0;
        metodosLista.imprimir("CALCULADORA DE NÚMERO MAIOR");
        metodosLista.imprimir("Informe 3 números para verificar qual deles é o maior");
        metodosLista.imprimir("Informe o 1º número:");
        valor1 = metodosLista.lerValorInt();
        metodosLista.imprimir("Informe o 2º número:");
        valor2 = metodosLista.lerValorInt();
        metodosLista.imprimir("Informe o 3º número:");
        valor3 = metodosLista.lerValorInt();
        maior = calcularMaior(valor1, valor2, valor3);
        metodosLista.imprimir(maior);
    }
}

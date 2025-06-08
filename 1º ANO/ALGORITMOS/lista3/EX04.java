public class EX04 {
    
    public static double calcularConsumo(double distanciaTotal, double quantCombustivel){
        double valor = 0;
        valor = distanciaTotal / quantCombustivel;
        return valor;
    }
    public static void main(String[] args) {
        double mediaConsumo = 0; double distanciaTotal = 0; double quantCombustivel = 0;
        metodosLista.imprimir("Informe a quantidade de KM's percorridos:");
        distanciaTotal = metodosLista.lerValorDouble();
        metodosLista.imprimir("Informe quantos litros de combustível foram gastos:");
        quantCombustivel = metodosLista.lerValorDouble();
        mediaConsumo = calcularConsumo(distanciaTotal, quantCombustivel);
        metodosLista.imprimir("Seu veículo obteve a média de " + mediaConsumo + " KM/L");
    }
}

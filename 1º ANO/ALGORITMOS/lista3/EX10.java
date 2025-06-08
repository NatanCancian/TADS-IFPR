public class EX10 {
    
    public static String calcularEleitor(double idade){
        String eleitor = null;
            if(idade < 16){
                eleitor = "Não eleitor";
            }else if((idade > 17) && (idade < 65)){
                eleitor = "Eleitor obrigatório";
            }else{
                eleitor = "Eleitor Facultativo";
            }
        return eleitor;
    }
    public static void main(String[] args) {
        String sitaucaoEleitor = null; double idade = 0;
        metodosLista.imprimir("Prezado eleitor informe sua idade para consultar sua situação eleitoral");
        idade = metodosLista.lerValorDouble();
        sitaucaoEleitor = calcularEleitor(idade);
        metodosLista.imprimir("Prezado Eleitor você é considerado " + sitaucaoEleitor); 
    }
}

public class EX14 {
    
    public static String calcularAposentadoria(double tempoServico, int idade){
        String classificacao = null;
        if(((idade > 64) || (tempoServico > 29)) || ((idade > 59) && (tempoServico > 24))){
            classificacao = "Pode se aposentar";
        }else{
            classificacao = "Não pode se aposentar";
        }
        return classificacao;
    }

    public static void main(String[] args) {
        double tempoContribuicao = 0; int idade = 0; String classificacao = null;
        metodosLista.imprimir("Informe a idade do trabalhador");
        idade = metodosLista.lerValorInt();
        metodosLista.imprimir("Informe o tempo de contribuição do trabalhador");
        tempoContribuicao = metodosLista.lerValorDouble();
        classificacao = calcularAposentadoria(tempoContribuicao, idade);
        metodosLista.imprimir("O trabalhador " + classificacao); 
    }
}

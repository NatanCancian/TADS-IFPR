import utils.IO;
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
        IO.imprimir("Informe a idade do trabalhador");
        idade = IO.lerValorInt();
        IO.imprimir("Informe o tempo de contribuição do trabalhador");
        tempoContribuicao = IO.lerValorDouble();
        classificacao = calcularAposentadoria(tempoContribuicao, idade);
        IO.imprimir("O trabalhador " + classificacao); 
    }
}

import utils.IO;
public class EX11 {
    
    public static String calcularConceito(double nota1, double nota2, double nota3){
        double mediaFinal = 0; String resultadoFinal = null;
        mediaFinal = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /10);
        if(mediaFinal >= 90){
            resultadoFinal = "Aprovado! Conceito A";
        }else if(mediaFinal >= 75){
            resultadoFinal = "Aprovado! Conceito B";
        }else if(mediaFinal >= 60){
            resultadoFinal = "Aprovado! Conceito C";
        }else if(mediaFinal >= 40){
            resultadoFinal = "Reprovado! Conceito D";
        }else{
            resultadoFinal = "Reprovado! Conceito E";
        }
        return resultadoFinal; 
    }
    public static void main(String[] args) {
        String nomealuno = null; String mediaFinal = null; double nota1 = 0; double nota2 = 0; double nota3 = 0;
        IO.imprimir("Informe o nome do Aluno:");
        nomealuno = IO.lerValorString();
        IO.imprimir("Informe a primeira nota");
        nota1 = IO.lerValorDouble();
        IO.imprimir("Informe a segunda nota");
        nota2 = IO.lerValorDouble();
        IO.imprimir("Informe a terceira nota");
        nota3 = IO.lerValorDouble();
        mediaFinal = calcularConceito(nota1, nota2, nota3);
        IO.imprimir("Aluno: " + nomealuno + " " + mediaFinal);         
    }
}

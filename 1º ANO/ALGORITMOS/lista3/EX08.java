import utils.IO;
public class EX08 {
    
    public static String calcularDiaSemana(int numero){
        String dia = null;
        if(numero == 1 ){
            dia = "Hoje é domingo";
        }else if(numero == 2){
            dia = "Hoje é segunda-Feira";
        }else if(numero == 3){
            dia = "Hoje é terça-Feira";
        }else if(numero == 4){
            dia = "Hoje é quarta-Feira";
        }else if(numero == 5){
            dia = "Hoje é quinta-Feira";
        }else if(numero == 6){
            dia = "Hoje é sexta-Feira";
        }else if(numero == 7){
            dia = "Hoje é sábado";
        }else{
            dia = "ERRO! O dia da semana informado não existe";
        }
        return dia;
    }
    public static void main(String[] args) {
        String dia = null; int numero = 0;
        IO.imprimir("Informe um dia da semana:");
        numero = IO.lerValorInt();
        dia = calcularDiaSemana(numero);
        IO.imprimir(dia);
    }
}

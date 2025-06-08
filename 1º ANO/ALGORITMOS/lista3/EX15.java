public class EX15 {
    
    public static String calcularBissexto(int ano){
        String classificacao = null; int valorMod = 0; int valorMod2 = 0; int valorMod3 = 0;
        valorMod = ano % 400;
        valorMod2 = ano % 100;
        valorMod3 = ano % 4;
        
        if(ano != 0){
            if((valorMod != 0)){
                if((valorMod3 == 0) && (valorMod2 != 0)){
                    classificacao = "é bissexto";
                }else{
                    classificacao = "não é bissexto";
                }
            }else{
                classificacao = "é bissexto";
            }
        }else{
            classificacao = "Informe um ano diferente de 0";
        }
        return classificacao;
    }

    public static void main(String[] args) {
        int ano = 0; String tipoAno = null;
        metodosLista.imprimir("Informe um ano: ");
        ano = metodosLista.lerValorInt();
        tipoAno = calcularBissexto(ano);
        metodosLista.imprimir(ano + " " + tipoAno);
    }
}

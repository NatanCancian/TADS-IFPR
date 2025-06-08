public class EX12 {
    
    public static String calcularCategoria(int idade){
        String categoriaAtleta = null;
        if(idade > 17){
            categoriaAtleta = "Sênior";
        }else if(idade > 13){
            categoriaAtleta = "Juvenil B";
        }else if(idade > 9){
            categoriaAtleta = "Juvenil A";
        }else if(idade > 5){
            categoriaAtleta = "Infantil B";
        }else if(idade > 2){
            categoriaAtleta = "Infantil A";
        }else{
            categoriaAtleta = "Sem categoria";
        }
        return categoriaAtleta;
    }

    public static void main(String[] args) {
        int idade = 0; String categoria = null; 
        metodosLista.imprimir("Informe a idade do atleta");    
        idade = metodosLista.lerValorInt();
        categoria = calcularCategoria(idade);
        metodosLista.imprimir("Atleta com " + idade + " anos," + " categoria " + categoria);
    }
}

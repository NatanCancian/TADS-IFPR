package utils;
import utils.*;
public class Matrizes {
    
    
    public static void imprimirMatrizes(int[][] matriz){
        System.out.print("[");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + ",");  
            }
        }
        IO.imprimir("]");
    }


}

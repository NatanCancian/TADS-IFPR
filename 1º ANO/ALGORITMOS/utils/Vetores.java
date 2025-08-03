package utils;

import java.util.Scanner;

public class Vetores {

    public static int[] obterMaiorEMenor(int[] valores) {
        int[] retorno = new int[2];
        int maior = valores[0];
        int menor = valores[0];

        for (int idx = 0; idx < valores.length; idx++) {
            if (valores[idx] > maior) {
                maior = valores[idx];
            }
            if (valores[idx] < maior) {
                menor = valores[idx];
            }
        }

        retorno[0] = menor;
        retorno[1] = maior;
        return retorno;
    }

    public class vetores {

        public static void imprimirVetor(int[] vetor) {

            System.out.print("[");
            for (int idx = 0; idx < vetor.length; idx++) {
                System.out.print(vetor[idx] + ",");
            }
            System.out.println("]");

        }

        public static void imprimirVetor(double[] vetor) {

            System.out.print("[");
            for (int idx = 0; idx < vetor.length; idx++) {
                System.out.print(vetor[idx] + ",");
            }
            System.out.println("]");

        }

        public static void imprimirVetorSemZeros(int[] vetor) {

            System.out.print("[");
            boolean zero = true;

            for (int idx = 0; idx < vetor.length; idx++) {
                if (vetor[idx] != 0) {
                    if (!zero) {
                        System.out.print(", ");
                    }
                    System.out.print(vetor[idx]);
                    zero = false;
                }
            }
            System.out.println("]");
        }

        public static void imprimirVetorBooleano(boolean[] vetor) {

            System.out.print("[");
            for (int idx = 0; idx < vetor.length; idx++) {
                System.out.print(vetor[idx] + ",");
            }
            System.out.println("]");
        }

        public static int[] novoVetorInt(int tamanho) {
            int[] vetor;

            vetor = new int[tamanho];

            return vetor;
        }

        public static double[] novoVetorDouble(int tamanho) {
            double[] vetor;

            vetor = new double[tamanho];

            return vetor;
        }

        public static int[] lerVetorDeInteiros(int qtde) {
            int[] vetor = new int[qtde];

            for (int idx = 0; idx < qtde; idx++) {
                vetor[idx] = IO.lerValorInt();
            }

            return vetor;
        }

        public static int[] preencherVetordeInteiros(int tamanho) {
            int[] vetor = new int[tamanho];

            for (int idx = 0; idx < tamanho; idx++) {

                vetor[idx] = IO.lerValorInt();
            }
            return vetor;
        }
        
          public static int[] copiarSubvetor(int[] vetor_entrada, int inicio, int fim){
               
          int tamVetorSaida = fim - inicio;
         
          int[] vetorSaida = lerVetorDeInteiros(tamVetorSaida);

          int idxFinal = 0;


          if(inicio > fim || inicio >= vetor_entrada.length || fim <= 0){
            return null;
          }
          
          if(inicio < 0){
            inicio = 0;
          }
          
          if(fim > vetor_entrada.length){
            inicio = 0;
          }     
          
          for (int idx = inicio; idx < fim; idx++){
            vetorSaida[idxFinal] = vetor_entrada[idx];
          }
          return vetorSaida;
        }

        public static int[] removerRepetidos(int[] vetor) {
            int[] vetor_auxiliar = new int[vetor.length];
            boolean repetido;
            int[] vetor_retorno;
            int contador = 0;

            for (int idx = 0; idx < vetor.length; idx++) {
                repetido = false;
                for (int idx2 = 0; idx2 < idx; idx2++) {
                    if (vetor[idx2] == vetor[idx]) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    vetor_auxiliar[contador] = vetor[idx];
                    contador++;
                }
            }

            // Alocação do vetor de retorno
            vetor_retorno = new int[contador];

            for (int idx = 0; idx < contador; idx++) {
                vetor_retorno[idx] = vetor_auxiliar[idx];
            }

            return vetor_retorno;
        }

        public static int[] Atv10(int[] vetor) {
            int entrada = 0;
            boolean repetido = false;
            IO.imprimir("Insira 20 valores inteiros:");
            int[] valor_digitado = new int[20];
            for (int idx = 0; idx < valor_digitado.length; idx++) {
                IO.imprimir("Digite um valor:");
                entrada = IO.lerValorInt();

                if ((entrada < 0) || (entrada > 100)) {
                    IO.imprimir("Valor fora do intervalo, insira o valor novamente");
                    idx--;
                    continue;
                }

                repetido = false;
                for (int idx2 = 0; idx2 < idx; idx2++) {
                    // valor_digitado[idx];
                    if (entrada == valor_digitado[idx2]) {
                        repetido = true;
                        break;
                    }
                }
                if (repetido) {
                    IO.imprimir("Valor já digitado");
                    idx--;
                    continue;
                }

                valor_digitado[idx] = entrada;
            }
            imprimirVetor(valor_digitado);
            return valor_digitado;
        }

        public static void Atv11() {
            int[] vetor = { -1, 1 };
            int valor_escalar = 10;
            int[] novo_vetor = adicionar(vetor, valor_escalar);
            imprimirVetor(novo_vetor);
        }

        public static int[] adicionar(int[] vetor, int valor_escalar) {
            int[] valores_escalados = new int[vetor.length];
            for (int idx = 0; idx < vetor.length; idx++) {
                valores_escalados[idx] = vetor[idx] += valor_escalar;
            }
            return valores_escalados;
        }

        public static void Atv12() {
            IO.imprimir("Informe quantos números deseja ler:");
            int valor_n = IO.lerValorInt();
            contarParesEImpares(valor_n);
        }

        public static void contarParesEImpares(int valor_n) {
            int[] valores_pares = new int[valor_n];
            int quant_pares = 0;
            int[] valores_impares = new int[valor_n];
            int quant_impares = 0;
            for (int idx = 0; idx < valor_n; idx++) {
                IO.imprimir("Informe um valor:");
                int temp = IO.lerValorInt();
                if ((temp % 2) == 0) {
                    valores_pares[quant_pares] = temp;
                    quant_pares++;
                } else {
                    valores_impares[quant_impares] = temp;
                    quant_impares++;
                }
            }

            IO.imprimir("Par: " + quant_pares);
            vetores.imprimirVetorSemZeros(valores_pares);

            IO.imprimir("Ímpar: " + quant_impares);
            vetores.imprimirVetorSemZeros(valores_impares);
        }

        public static void Atv13() {
            int[] va = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] vb = new int[va.length];
            vb = processarCopiaParesEImpares(va);
            vetores.imprimirVetor(vb);
        }

        public static int[] processarCopiaParesEImpares(int[] vetor) {
            int[] vb = new int[vetor.length];
            int contador = 0;

            for (int idx = 0; idx < vetor.length; idx++) {
                if ((vetor[idx] % 2) == 0) {
                    vb[contador] = vetor[idx];
                    contador++;
                }
            }
            for (int idx2 = 0; idx2 < vetor.length; idx2++) {
                if ((vetor[idx2] % 2) != 0) {
                    vb[contador] = vetor[idx2];
                    contador++;
                }
            }

            return vb;
        }

        public static void Atv14() {
            int[] valores = { 5, 9, 2, 4, 7, 7, 1, 0, 15, 0 };
            valores = processarParesInicioImparesFim(valores);
            vetores.imprimirVetor(valores);
        }

        public static int[] processarParesInicioImparesFim(int[] vetor) {
            int[] vetor_auxiliar = new int[vetor.length];
            int contadorPar = 0;
            int contadorImpar = vetor.length - 1;
            for (int idx = 0; idx < vetor.length; idx++) {
                if ((vetor[idx] % 2) == 0) {
                    vetor_auxiliar[contadorPar] = vetor[idx];
                    contadorPar++;
                } else {
                    vetor_auxiliar[contadorImpar] = vetor[idx];
                    contadorImpar--;
                }
            }
            return vetor_auxiliar;
        }

        public static void Atv15() {
            int[] valores = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
            mostrarInteiros(valores);
        }

        public static void mostrarInteiros(int[] vetor) {
            String separador = " ";
            IO.imprimir("Escolha um separador");
            separador = IO.lerValorString();

              if(separador == "\t"){
              separador = "\t";
              }

              if(separador == "\n"){
              separador = "\\n";
              }
            
            for (int idx = 0; idx < vetor.length; idx++) {
                System.out.print(vetor[idx]);
                if (idx < vetor.length - 1) {
                    System.out.print(separador);
                }
            }
        }

        public static void Atv16() {
            int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            valores = filtrarMaiores(valores);
            vetores.imprimirVetorSemZeros(valores);
        }

        public static int[] filtrarMaiores(int[] vetor) {
            int filtro = 0;
            int[] vetor_auxiliar = new int[vetor.length];
            IO.imprimir("Insira um valor para filtrar os maiores termos do array:");
            filtro = IO.lerValorInt();
            for (int idx = 0; idx < vetor.length; idx++) {
                if (vetor[idx] > filtro) {
                    vetor_auxiliar[idx] = vetor[idx];
                }
            }

            return vetor_auxiliar;
        }

        public static void Atv17() {
            int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            valores = filtrarMenores(valores);
            vetores.imprimirVetorSemZeros(valores);
        }

        public static int[] filtrarMenores(int[] vetor) {
            int filtro = 0;
            int[] vetor_auxiliar = new int[vetor.length];
            IO.imprimir("Insira um valor para filtrar os menores termos do array:");
            filtro = IO.lerValorInt();
            for (int idx = 0; idx < vetor.length; idx++) {
                if (vetor[idx] < filtro) {
                    vetor_auxiliar[idx] = vetor[idx];
                }
            }

            return vetor_auxiliar;
        }

        public static void Atv18() {
            boolean[] v = { true, false, true, false };
            boolean[] w = { true, false, true, false };
            boolean[] resultado = aplicarELogico(v, w);
            vetores.imprimirVetorBooleano(resultado);
        }

        public static boolean[] aplicarELogico(boolean[] vetor1, boolean[] vetor2) {
            boolean[] vetor_auxiliar = new boolean[vetor1.length];
            for (int idx = 0; idx < vetor1.length; idx++) {
                if ((vetor1[idx] == true) && (vetor2[idx] == true)) {
                    vetor_auxiliar[idx] = true;
                } else {
                    vetor_auxiliar[idx] = false;
                }
            }
            return vetor_auxiliar;
        }

        public static void Atv19() {
            boolean[] v = { true, false, true, false };
            boolean[] w = { true, false, true, false };
            boolean[] resultado = aplicarOuLogico(v, w);
            vetores.imprimirVetorBooleano(resultado);
        }

        public static boolean[] aplicarOuLogico(boolean[] vetor1, boolean[] vetor2) {
            boolean[] vetor_auxiliar = new boolean[vetor1.length];
            for (int idx = 0; idx < vetor1.length; idx++) {
                if ((vetor1[idx] == false) && (vetor2[idx] == false)) {
                    vetor_auxiliar[idx] = false;
                } else {
                    vetor_auxiliar[idx] = true;
                }
            }
            return vetor_auxiliar;
        }

        public static void Atv20() {
            int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            boolean[] mascara = { true, false, true, false, true, false, false, false, false, true };
            int[] resultado = aplicarMascara(v, mascara);
            vetores.imprimirVetorSemZeros(resultado);
        }

        public static int[] aplicarMascara(int[] valores, boolean[] mascara) {
            int[] vetor_auxiliar = new int[valores.length];

            for (int idx = 0; idx < valores.length; idx++) {
                if (mascara[idx]) {
                    vetor_auxiliar[idx] = valores[idx];
                }
            }

            return vetor_auxiliar;
        }

        public static void Atv21() {
            int[] a = { 1, 1, 1, 1 };
            int[] b = { 2, 2, 2, 2 };
            int[] aeb = uniaoDeConjuntos(a, b);
            vetores.imprimirVetor(aeb);
        }

        public static int[] uniaoDeConjuntos(int[] vetor1, int[] vetor2) {
            
            //Vetor grandão que vai ter os 2 vetores 
            int[] vetor_auxiliar = new int[vetor1.length + vetor2.length];
            boolean repetido;

            for (int idx = 0; idx < vetor1.length; idx++) {
                vetor_auxiliar[idx] = vetor1[idx];
            }

            for (int idx2 = 0; idx2 < vetor2.length; idx2++) {
                vetor_auxiliar[vetor1.length + idx2] = vetor2[idx2];
            }

            // Vetor grandão que vai ser filtrado pra n ter repetidos
            int[] vetor_final = new int[vetor_auxiliar.length];
            int teste = 0;
            int tamanhoVetor = 0;

            for (int idx3 = 0; idx3 < vetor_auxiliar.length; idx3++) {
                teste = vetor_auxiliar[idx3];
                repetido = false;

                for (int idx4 = 0; idx4 < tamanhoVetor; idx4++) {
                    if (vetor_final[idx4] == teste) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    vetor_final[tamanhoVetor] = teste;
                    tamanhoVetor++;
                }

            } // Vetor filtrado pra ser do tamanho da saída
            int[] vetor_saida = new int[tamanhoVetor];
            for (int idx5 = 0; idx5 < tamanhoVetor; idx5++) {
                vetor_saida[idx5] = vetor_final[idx5];
            }

            return vetor_saida;
        }

        public static void Atv22(){
            int[] a = { 1, 2, 3, 4, 5, 6, 7 };
            int[] b = { 6, 7, 8, 9 };
            int[] aeb = intersecaoDeConjuntos(a, b);
            vetores.imprimirVetor(aeb);
    }

        public static int[] intersecaoDeConjuntos(int[] vetor1, int[] vetor2){
            
            int[] vetor_auxiliar = new int[vetor1.length];
            boolean repetidoVetor2;
            int teste = 0;
            int tamanhoVetor = 0;

            for (int idx = 0; idx < vetor1.length; idx++){
                teste = vetor1[idx];
           
            repetidoVetor2 = false; //Verificar se o valor ta no vetor 2
            for (int idx2 = 0; idx2 < vetor2.length; idx2++){
                if(vetor2[idx2] == teste){
                    repetidoVetor2  = true;
                    break;
                }
            }
            
            boolean adicionado = false; //verificar se foi add ao vetor aux
            for (int idx3 = 0; idx3 < tamanhoVetor; idx3++) {
                if(vetor_auxiliar[idx3] == teste){
                    adicionado = true;
                    break;
                }
            }
            //se tiver no vetor 2 n foi add, add ao vetor aux
            if(repetidoVetor2 && !adicionado){
                vetor_auxiliar[tamanhoVetor] = teste;
                tamanhoVetor++;
            }
        }
            //filtra pra sair somente os valores validados
            int[] vetor_final = new int[tamanhoVetor];
            for(int idx4 = 0; idx4 < tamanhoVetor; idx4++){
                vetor_final[idx4] = vetor_auxiliar[idx4];
            }

            return vetor_final;

        }

        public static void Atv23(){
            int[] a = { 1, 2, 3, 4,};
            int[] b = { 6, 7, 8, 9 };
            int[] aeb = diferencaDeConjuntos(a, b);
            vetores.imprimirVetor(aeb);
        }

        public static int[] diferencaDeConjuntos(int[] vetor1, int[] vetor2){
            int[] vetor_auxiliar = new int[vetor1.length + vetor2.length];
            int tamanhoVetor = 0;
            int teste = 0;
            boolean adicionado = false;

            for (int idx = 0; idx < vetor1.length; idx++) {
                teste = vetor1[idx];

                boolean repetidoVetor2 = false;
                for(int idx2 = 0; idx2 < vetor2.length; idx2++){
                    if(vetor2[idx2] == teste){
                        repetidoVetor2 = true;
                        break;
                    }
                }

            for(int idx3 = 0; idx3 < tamanhoVetor; idx3++){
                if(vetor_auxiliar[idx3] == teste){
                    adicionado = true;
                    break;
                }
            }

            if(!repetidoVetor2 && !adicionado){
                vetor_auxiliar[tamanhoVetor] = teste;
                tamanhoVetor++;
            }
        }

        int[] vetor_final = new int[tamanhoVetor];
        for(int idx4 = 0; idx4 < tamanhoVetor; idx4++){
            vetor_final[idx4] = vetor_auxiliar[idx4];
        }
            return vetor_final;
        }

    }

}

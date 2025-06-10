package utils;
import java.util.Scanner;
public class IO{
    public static Scanner entrada = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void imprimeInt(int texto) {
        System.out.println(texto);

    }

    public static void imprimirDouble(double texto) {
        System.out.println(texto);
    }

    public static double lerValorDouble() {
        double valor = 0;
        valor = entrada.nextDouble();
        return valor;
    }

    public static int lerValorInt() {
        int valor = 0;
        valor = entrada.nextInt();
        return valor;
    }

    public static float lerValorFloat() {
        float valor = 0;
        valor = entrada.nextFloat();
        return valor;
    }

    public static long lerValorLong() {
        long valor = 0;
        valor = entrada.nextLong();
        return valor;
    }

    public static String lerValorString() {
        String valor = null;
        valor = entrada.nextLine();
        return valor;
    }

    public static boolean lerValorBoolean() {
        boolean valor = false;
        valor = entrada.nextBoolean();
        return valor;
    }

    public static byte lerValorByte() {
        byte valor = 0;
        valor = entrada.nextByte();
        return valor;
    }

    public static short lerValorShort() {
        short valor = 0;
        valor = entrada.nextShort();
        return valor;
    }

    public static char lerValorChar() {
        char valor = 0;
        valor = entrada.next().charAt(0);
        return valor;
    }

    public static int contarIntervalo(int inicio, int fim) {
        int i = 0;
        for (i = inicio; i < fim;) {
            imprimeInt(i);
            i++;
        }
        return i;
    }

    public static int contarIntervaloPar(int inicio, int fim) {
        int i = 0;
        for (i = inicio; i < fim;) {
            if ((i % 2) == 0) {
                imprimeInt(i);
                i++;
            } else {
                i++;
            }
        }
        return i;
    }

    public static int contarIntervaloInverso(int inicio, int fim) {
        int i = 0;
        for (i = inicio; i > fim;) {
            imprimeInt(i);
            i--;
        }
        return i;
    }

    public static int contarIntervaloInversoPar(int inicio, int fim) {
        int i = 0;
        for (i = inicio; i > fim;) {
            if ((i % 2) == 0) {
                imprimeInt(i);
                i--;
            } else {
                i--;
            }
        }
        return i;
    }

    public static int somarIntervalo(int inicio, int fim) {
        int i = 0;
        int soma = 0;
        for (i = inicio; i <= fim; i++) {
            soma += i;
            imprimeInt(soma);
        }
        return soma;
    }

    public static int somarIntervaloPar(int inicio, int fim) {
        int i = 0;
        int soma = 0;
        for (i = inicio; i <= fim; i++) {
            if ((i % 2) == 0) {
                soma += i;
                imprimeInt(soma);
            } else {
                continue;
            }
        }
        return soma;
    }

    public static int somarIntervaloInverso(int inicio, int fim) {
        int i = 0;
        int soma = 0;
        for (i = inicio; i >= fim; i--) {
            soma += i;
            imprimeInt(soma);
        }
        return soma;
    }

    public static void ex17() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        processarTabuada(numero);
    }

    public static void processarTabuada(int numero) {
        mostrarTabuada(numero);
    }

    public static void mostrarTabuada(int numero) {
        int i = 1;
        int resultado;
        for (i = 1; i <= 20; i++) {
            resultado = numero * i;
            imprimir(numero + " * " + i + " = " + resultado);
        }
    }

    public static int somarIntervaloInversoPar(int inicio, int fim) {
        int i = 0;
        int soma = 0;
        for (i = inicio; i >= fim; i--) {
            if ((i % 2) == 0) {
                soma += i;
                imprimeInt(soma);
            } else {
                continue;
            }
        }
        return soma;
    }

    public static String calcularNPositivosNegativos(int fim) {
        int i = 0;
        int valor = 0;
        int positivos = 0;
        int negativos = 0;
        String resultados = null;
        for (i = 1; i <= fim; i++) {
            imprimir("Digite o " + i + "º valor: ");
            valor = lerValorInt();

            if (valor == 0) {
                continue;
            }
            if (valor > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        resultados = "A quantidade de positivos foi: " + positivos + " A quantidade de negativos foi: " + negativos;
        return resultados;
    }

    public static String calcularMaiorMenor5() {
        int i = 0;
        int maiorValor = 0;
        int menorValor = 0;
        int valorLido = 0;
        String saida = null;
        // int numero = 0;

        for (i = 1; i <= 5; i++) {
            imprimir("Informe um números entre 0 e 1000:");
            valorLido = lerValorInt();

            if ((valorLido > 1000) || (valorLido < 0)) {
                continue;
            }
            if ((valorLido > maiorValor) || (maiorValor == 0)) {
                maiorValor = valorLido;
            }
            if ((valorLido < menorValor) || (menorValor == 0)) {
                menorValor = valorLido;
            }
        }
        saida = "O maior valor é: " + maiorValor + " e o menor valor é: " + menorValor;
        return saida;
    }

    public static String calcularNParImpar(int fim) {
        int i = 0;
        int valor = 0;
        int pares = 0;
        int impares = 0;
        String resultados = null;
        for (i = 1; i <= fim; i++) {
            imprimir("Digite o " + i + "º valor: ");
            valor = lerValorInt();
            if ((valor % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        resultados = "A quantidade de pares foi: " + pares + " A quantidade de ímpares foi: " + impares;
        return resultados;
    }

    public static String calcularNIntervalos(int fim) {
        int i = 0;
        int valor = 0;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        String resultado = null;
        for (i = 1; i <= fim; i++) {
            imprimir("Digite o " + i + "º valor: ");
            valor = lerValorInt();
            if (valor > 50) {
                intervalo1++;
            } else if (valor > 25) {
                intervalo2++;
            } else {
                intervalo3++;
            }
        }
        resultado = "A quantidade de números no 1º intervalo foi: " + intervalo3 + " , no 2º intervalo foi: "
                + intervalo2 + " , e no 3º intervalo foi: " + intervalo1;
        return resultado;
    }

    public static String calcularMultiplo7(int numero) {
        int i = 1;
        String resultado = null;
        int fim = 0;
        for (i = 1; i >= fim; i++) {
            imprimir("Insira um valor entre 1 e 1000");
            numero = lerValorInt();
            if ((numero > 0) && (numero < 1001)) {
                if ((numero % 7) == 0) {
                    imprimir("O número " + numero + " é um múltiplo de 7");
                } else {
                    imprimir("O número " + numero + " não é um múltiplo de 7");
                }
            } else {
                break;
            }
        }
        resultado = "ERRO! Número fora do intervalo permitido";
        return resultado;
    }

    public static int calcularFatorial(int n) {
        int i = 0;
        int soma = 1;
        for (i = 1; i <= n; i++) {
            soma *= i;
            imprimeInt(soma);
        }
        return soma;
    }

    public static int calcularFibonacci(int fim) {
        int i = 1;
        int termo1 = 0;
        int termo2 = 0;
        int termo3 = 0;
        imprimir("Defina o tamanho da sequência de Fibonacci:");
        fim = lerValorInt();
        for (i = 1; i <= fim; i++) {
            if ((termo1 == 0) && (termo2 == 0) && (termo3 == 0)) {
                termo1 = i;
                termo2 = i;
                termo3 = i;
                imprimeInt(termo1);
                i++;
                imprimeInt(termo2);
                i++;
            }
            termo3 = termo1 + termo2;
            imprimeInt(termo3);
            termo1 = termo2;
            termo2 = termo3;
        }
        return termo3;
    }

    public static String calcularEstudantes() {
        int idade = 1;
        int tecnico = 0;
        int superior = 0;
        int intervaloIdade = 0;
        String resultado = null;
        String curso = null;

        while (true) {

            imprimir("Informe a idade do estudante");
            idade = lerValorInt();
            entrada.nextLine();

            if (idade == 0) {
                break;
            }

            if (idade != 0) {
                if ((idade > 17) && (idade < 35)) {
                    intervaloIdade += 1;
                }
            }
            imprimir("Informe a modalidade de ensino do aluno:");
            curso = lerValorString();

            if ((curso.equalsIgnoreCase("Superior")) || (curso.equalsIgnoreCase("S"))) {
                superior += 1;
            }

            if ((curso.equalsIgnoreCase("Técnico")) || (curso.equalsIgnoreCase("T"))) {
                tecnico += 1;
            }
        }
        resultado = "A quantidade de alunos no ensino técnico é: " + tecnico +
                " , a quantidade de alunos no ensino superior é: " + superior +
                ", a quantidade de alunos entre 18 e 35 anos é de: " + intervaloIdade + " alunos";

        return resultado;
    }

    public static String calcularIdade(int idade) {
        int i = 1;
        int idadeMaior = 0;
        int idadeMenor = 0;
        int somaIdade = 0;
        int mediaIdade = 0;
        int fim = 0;
        String resultado = null;
        for (i = 1; i >= fim; i++) {
            imprimir("Insira uma idade");
            idade = lerValorInt();
            somaIdade = somaIdade + idade;
            if ((idade > 0)) {
                if ((idade > idadeMaior)) {
                    idadeMaior = idade;
                }
                if (((idadeMenor == 0))) {
                    idadeMenor = idade;
                }
                if (idade < idadeMenor) {
                    idadeMenor = idade;
                }
            } else {
                break;
            }
        }
        i--;
        mediaIdade = (somaIdade / i);
        resultado = "O número de pessoas é: " + i + ", a idade média do grupo é: " + mediaIdade
                + ", a menor idade é: " + idadeMenor + ", e a maior idade é: " + idadeMaior;
        return resultado;
    }

    public static String calcularEleicao() {
        int cod1 = 0;
        int cod2 = 0;
        String ganhador = null;
        int i = 1;
        int voto = 0;
        int fim = 305;

        for (i = 1; i <= fim; i++) {
            imprimir("Informe seu voto:");
            voto = lerValorInt();
            if (voto == 1) {
                cod1++;
            } else if (voto == 2) {
                cod2++;
            }
        }
        if (cod1 > cod2) {
            ganhador = "Candidato Nº1";
        } else {
            ganhador = "Candidato Nº2";
        }

        imprimir("O vencedor é o " + ganhador + "/n O candidato Nº1 obteve o total de " + cod1 + " votos "
                + "/n O candidato Nº2 obteve o total de " + cod2 + " votos ");

        return ganhador;
    }

    public static double calcularGraos() {
        int i = 0;
        double resultado = 0;
        double total = 0;

        for (i = 1; i <= 64; i++) {
            total = Math.pow(2, i);
            imprimir("Casa " + i + " : " + total + " grãos");
        }

        resultado = total;
        return resultado;
    }

    public static String calcularMassa() {
        int tempo = 60;
        double massa = 0;
        String resposta = null;

        imprimir("Informe a massa do material");
        massa = lerValorDouble();
        imprimir(String.format("%.4f", massa) + " g");
        while (massa >= 0.05) {

            if (massa <= 0.05) {
                break;
            }
            massa = massa / 2;
            imprimir(String.format("%.4f", massa) + " g"); // -> "%.4f ponto flutuante de 4 casas"
            tempo += 60;
        }
        resposta = "O tempo total gasto foi de " + tempo + " segundos";
        imprimir(resposta);
        return resposta;
    }

    public static void EX018_1() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        imprimir("Divisíveis por " + numero);
        processarDivisiveis(numero);

    }

    public static void processarDivisiveis(int numero) {
        mostrarDivisiveis(numero);
    }

    public static void mostrarDivisiveis(int numero) {
        int i = 0;
        for (i = 1; i <= 100; i++) {
            if (((i % numero) == 0)) {
                imprimeInt(i);
            } else {
                continue;
            }
        }
    }

    public static void EX20() {
        processarNumerosDiv11Mod5();
    }

    public static void processarNumerosDiv11Mod5() {
        mostrarNumerosDiv11Mod5();
    }

    public static void mostrarNumerosDiv11Mod5() {
        int i = 0;
        for (i = 500; i <= 2000; i++) {
            if ((i % 11) == 5) {
                imprimeInt(i);
            } else {
                continue;
            }
        }
    }

    public static void EX21() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        imprimir("Divisíveis por " + numero);
        processarDivisioresMenores(numero);
    }

    public static void processarDivisioresMenores(int numero) {
        mostrarDivisoresMenores(numero);
    }

    public static void mostrarDivisoresMenores(int numero) {
        int i = 0;
        for (i = 1; i < numero; i++) {
            if (((numero % i) == 0)) {
                imprimeInt(i);
            } else {
                continue;
            }
        }
    }

    public static void EX22() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        processarSomaeMedia(numero);
    }

    public static void processarSomaeMedia(int numero) {
        mostrarSomaeMedia(numero);
    }

    public static void mostrarSomaeMedia(int numero) {
        int i = 0;
        double soma = 0;
        double media = 0;
        for (i = 1; i <= numero; i++) {
            soma += i;
        }
        media = soma / numero;
        imprimir("Soma: " + soma + " Média: " + media);
    }

    public static void EX23() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        processarNumerosPerfeitos(numero);
    }

    public static void processarNumerosPerfeitos(int numero) {
        mostrarNumerosPerfeitos(numero);
    }

    public static boolean mostrarNumerosPerfeitos(int numero) {
        int i = 0;
        int valor = 0;
        boolean resultado = false;
        for (i = 1; i < numero; i++) {
            if ((numero % i) == 0) {
                valor += i;
            }
        }

        if (valor == numero) {
            imprimir(i + " é um número perfeito!");
            resultado = true;
        } else {
            imprimir(i + " não é um número perfeito!");
            resultado = false;
        }
        return resultado;
    }

    public static void EX24() {
        int numero = 0;
        imprimir("Informe um valor inteiro");
        numero = lerValorInt();
        processarProximosNumerosPerfeitos(numero);
    }

    public static void processarProximosNumerosPerfeitos(int numero) {
        mostrarProximosNumerosPerfeitos(numero);
    }

    public static void mostrarProximosNumerosPerfeitos(int numero) {
        int i = 0;

        for (i = numero; i != 0; i++) {
            if (!mostrarNumerosPerfeitos(i)) {
                continue;
            } else {
                break;
            }
        }
        imprimir("O próximo número perfeito é: " + i);
    }

    public static void EX25() {
        int inicioIntervalo = 0;
        int fimIntervalo = 0;
        imprimir("Informe o início do intervalo");
        inicioIntervalo = lerValorInt();
        imprimir("Informe o fim do intervalo");
        fimIntervalo = lerValorInt();
        processarIntervaloNumerosPerfeitos(inicioIntervalo, fimIntervalo);
    }

    public static void processarIntervaloNumerosPerfeitos(int inicioIntervalo, int fimIntervalo) {
        mostrarIntervaloNumerosPerfeitos(inicioIntervalo, fimIntervalo);
    }

    public static void mostrarIntervaloNumerosPerfeitos(int inicioIntervalo, int fimIntervalo) {
        int i = 0;

        for (i = inicioIntervalo; i <= fimIntervalo; i++) {
            if (mostrarNumerosPerfeitos(i)) {
                imprimeInt(i);
            } else {
                continue;
            }
        }
    }

    public static void EX26() {
        processarCalcularFibonacci();
    }

    public static void processarCalcularFibonacci() {
        calcularFibonacci(0);
    }

    public static void EX27() {
        processarCalcularPrimos();
    }

    public static void processarCalcularPrimos() {
        calcularPrimos();
    }

    public static void calcularPrimos() {
        int i = 0;
        int numero = 0;
        int divisores = 0;
        imprimir("Informe um número");
        numero = lerValorInt();
        for (i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                divisores += i;
            } else {
                continue;
            }
        }
        if (divisores == numero + 1) {
            imprimir("É primo!");
        } else {
            imprimir("Não é primo");
        }
    }

    public static void EX28(){
        processarSomarInversos();
    }

    public static void processarSomarInversos(){
        somarInversos();
    }

    public static void somarInversos(){
        double i = 0;
        int numero = 0;
        double soma = 0;
        imprimir("Informe um número");
        numero = lerValorInt();

        for(i = 1; i <= numero; i++){
            soma += 1.0/i;   
        }
        imprimirDouble(soma);
    }

    public static void EX29(){
        processarPadraoLinhas();
    }
    
    public static void processarPadraoLinhas(){
        desenharPadraoLinhas();
    }

    public static void desenharPadraoLinhas(){
        int i = 0;
        int j = 0;
        int linhas = 0;
        imprimir("Informe um número:");
        linhas = lerValorInt();
        
        for(i = 1; i <= linhas; i++){
           System.out.println();
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
    }
}    
    // TEORIA GERAL DE EUCLIDES PARA NÚMEROS PERFEITOS
    // 2 p−1 ×(2p−1)

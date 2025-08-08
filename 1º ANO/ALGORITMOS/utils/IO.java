package utils;

import java.util.Scanner;

public class IO {
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

    public static void EX28() {
        processarSomarInversos();
    }

    public static void processarSomarInversos() {
        somarInversos();
    }

    public static void somarInversos() {
        double i = 0;
        int numero = 0;
        double soma = 0;
        imprimir("Informe um número");
        numero = lerValorInt();

        for (i = 1; i <= numero; i++) {
            soma += 1.0 / i;
        }
        imprimirDouble(soma);
    }

    public static void EX29() {
        processarPadraoLinhas();
    }

    public static void processarPadraoLinhas() {
        desenharPadraoLinhas();
    }

    public static void desenharPadraoLinhas() {
        int i = 0;
        int j = 0;
        int linhas = 0;
        imprimir("Informe um número:");
        linhas = lerValorInt();

        for (i = 1; i <= linhas; i++) {
            System.out.println();
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void EX01_2() {
        processarAntecessoresSucessores();
    }

    public static void processarAntecessoresSucessores() {
        mostrarAntecessoresSucessores();
    }

    public static void mostrarAntecessoresSucessores() {
        int numero = 0;
        imprimir("Informe um número:");
        numero = lerValorInt();
        imprimir("O antecessor é: " + (numero - 1) + "o valor sucessor é: " + (numero + 1));
    }

    public static void EX02_2() {
        mostrarBoaTarde();
    }

    public static void mostrarBoaTarde() {
        processarBoaTarde();
    }

    public static void processarBoaTarde() {
        String nome = null;
        imprimir("Informe seu nome:");
        nome = lerValorString();
        imprimir("Boa tarde " + nome + " !");
    }

    public static void EX03_2() {
        processarCuboNumero();
    }

    public static void processarCuboNumero() {
        mostrarCuboNumero();
    }

    public static void mostrarCuboNumero() {
        int numero = 0;
        imprimir("Informe um número: ");
        numero = lerValorInt();
        imprimir("O cubo do número é: " + Math.pow(numero, 3));
    }

    public static void EX04_2() {
        processarSegundosPassados();
    }

    public static void processarSegundosPassados() {
        mostrarSegundosPassados();
    }

    public static void mostrarSegundosPassados() {
        int hora_atual = 0;
        int minuto_atual = 0;
        int segundo_atual = 0;
        int total_segundos = 0;
        imprimir("Informe a hora:");
        hora_atual = lerValorInt();
        imprimir("Informe os minutos:");
        minuto_atual = lerValorInt();
        imprimir("Informe os segundos:");
        segundo_atual = lerValorInt();

        total_segundos = (hora_atual * 3600) + (minuto_atual * 60) + (segundo_atual);

        imprimir("Passaram cerca de " + total_segundos + "segundos");
    }

    public static void EX05_2() {
        processarRaizes();
    }

    public static void processarRaizes() {
        mostrarRaizes();
    }

    public static void mostrarRaizes() {
        double numero = 0;
        imprimir("Informe um número:");
        numero = lerValorDouble();
        imprimir("A raiz quadrade desse número é: " + Math.sqrt(numero)
                + " e a raiz cúbica é: " + Math.cbrt(numero));
    }

    public static void EX06_2() {
        processarCustoLocacao();
    }

    public static void processarCustoLocacao() {
        mostrarCustoLocacao();
    }

    public static void mostrarCustoLocacao() {
        double km_rodados = 0;
        int dias_locados = 0;
        double custo = 0;
        imprimir("Informe quantos KMs foram percorridos com o carro locado:");
        km_rodados = lerValorDouble();
        imprimir("Informe quantos dias foram alugados:");
        dias_locados = lerValorInt();
        custo = ((km_rodados * 0.15) + (dias_locados * 60));
        imprimir("O custo total a pagar é: R$ " + custo);
    }

    public static void EX07_2() {
        processarPerimetroAreaRetangulo();
    }

    public static void processarPerimetroAreaRetangulo() {
        mostrarPerimetroAreaRetangulo();
    }

    public static void mostrarPerimetroAreaRetangulo() {
        double base = 0;
        double altura = 0;
        double perimetro = 0;
        double area = 0;
        imprimir("Informe a base do retângulo:");
        base = lerValorDouble();
        imprimir("Informe a altura do retângulo:");
        altura = lerValorDouble();
        perimetro = (2 * (base + altura));
        area = base * altura;
        imprimir("O perímetro do retângulo é: " + perimetro + " , e a área do retângulo é: " + area);
    }

    public static void EX08_2() {
        processarRaioCirculo();
    }

    public static void processarRaioCirculo() {
        mostrarRaioCirculo();
    }

    public static void mostrarRaioCirculo() {
        double perimetro = 0;
        double raio = 0;
        double area = 0;

        imprimir("Informe um o raio da circunferência:");
        raio = lerValorDouble();
        perimetro = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        imprimir("O perímetro da circunferência é: " + perimetro + " , a área da circuferência é: " + area);
    }

    public static void EX10_2() {
        processarDescontoMercadoria();
    }

    public static void processarDescontoMercadoria() {
        mostrarDescontoMercadoria();
    }

    public static void mostrarDescontoMercadoria() {
        double preco = 0;
        double desconto = 0;
        double percentual = 0;
        imprimir("Informe o preço da mercadoria:");
        preco = lerValorDouble();
        imprimir("Informe o percentual(%) de desconto (de 0 a 100): ");
        desconto = lerValorDouble();
        if ((desconto >= 0) && (desconto < 101)) {
            desconto = desconto / 100;
            percentual = preco * desconto;
            preco = preco - percentual;
            imprimir("A porcentagem desconto é: " + percentual + "% , " + "e o preço a pagar é: " + preco);
        } else {
            imprimir("Desconto fora do percentual permitido!");
        }
    }

    public static void EX11_2() {
        processarAumento();
    }

    public static void processarAumento() {
        mostrarAumento();
    }

    public static void mostrarAumento() {
        double valor_salario = 0;
        double porcentagem = 0;
        double aumento = 0;
        imprimir("Informe o valor do salário:");
        valor_salario = lerValorDouble();
        imprimir("Informe a porcentagem(%) de aumento:");
        porcentagem = lerValorDouble();
        porcentagem = porcentagem / 100;
        aumento = valor_salario * porcentagem;
        valor_salario += aumento;
        imprimir("Valor de aumento:" + aumento + ", novo salário: " + valor_salario);
    }

    public static void EX12_2() {
        processarBoleto();
    }

    public static void processarBoleto() {
        mostrarBoleto();
    }

    public static void mostrarBoleto() {
        double juros = 0;
        double valor = 0;
        int atraso = 0;
        double valor_total = 0;
        imprimir("Informe o valor do boleto: ");
        valor = lerValorDouble();
        imprimir("Informe o percentual de juros cobrado:");
        juros = lerValorDouble();
        imprimir("Informe o número de dias em atraso:");
        atraso = lerValorInt();
        valor_total = valor + valor * (juros / 100) * atraso;
        imprimir("O valor total a ser pago é: " + valor_total);
    }

    public static void EX13_2() {
        processarEleicao();
    }

    public static void processarEleicao() {
        mostrarEleicao();
    }

    public static void mostrarEleicao() {
        double votos_c1 = 0;
        double votos_c2 = 0;
        double votos_c3 = 0;
        double votos_brancos = 0;
        double votos_nulos = 0;
        double total_eleitores = 0;
        imprimir("Informe a quantidade de votos do Candidato 1:");
        votos_c1 = lerValorInt();
        imprimir("Informe a quantidade de votos do Candidato 2:");
        votos_c2 = lerValorInt();
        imprimir("Informe a quantidade de votos do Candidato 3:");
        votos_c3 = lerValorInt();
        imprimir("Informe a quantidade de votos Brancos:");
        votos_brancos = lerValorInt();
        imprimir("Informe a quantidade de votos Nulos:");
        votos_nulos = lerValorInt();
        total_eleitores = votos_c1 + votos_c2 + votos_c3 + votos_brancos + votos_nulos;
        imprimir("Total de eleitores: " + total_eleitores);
        votos_c1 = (votos_c1 / total_eleitores) * 100;
        votos_c2 = (votos_c2 / total_eleitores) * 100;
        votos_c3 = (votos_c3 / total_eleitores) * 100;
        votos_brancos = (votos_brancos / total_eleitores) * 100;
        votos_nulos = (votos_nulos / total_eleitores) * 100;
        imprimir("Votos Candidato 1: " + votos_c1 + " %");
        imprimir("Votos Candidato 2: " + votos_c2 + " %");
        imprimir("Votos Candidato 3: " + votos_c3 + " %");
        imprimir("Votos Brancos: " + votos_brancos + " %");
        imprimir("Votos Nulos: " + votos_nulos + " %");
    }

    public static void EX14_2() {
        processarCustoCarro();
    }

    public static void processarCustoCarro() {
        mostrarCustoCarro();
    }

    public static void mostrarCustoCarro() {
        double custo = 0;
        imprimir("Informe o custo do carro:");
        custo = lerValorDouble();
        imprimir("O custo do carro é: " + (custo + (custo * 0.28) + (custo * 0.45)));
    }

    public static void EX15_2() {
        processarComissaoVendas();
    }

    public static void processarComissaoVendas() {
        mostrarComissaoVendas();
    }

    public static void mostrarComissaoVendas() {
        double valor_vendas = 0;
        double salario = 0;
        double valor_final = 0;
        imprimir("Informe o salário do vendedor:");
        salario = lerValorDouble();
        imprimir("Informe o valor total das vendas do vendedor:");
        valor_vendas = lerValorDouble();
        valor_final = salario + (valor_vendas * 0.05);
        imprimir("O salário do vendedor é: R$ " + valor_final);
    }

    public static void EX32_2() {
        processarEquacao2oGrau();
    }

    public static void processarEquacao2oGrau() {
        mostrarEquacao2oGrau();
    }

    public static void mostrarEquacao2oGrau() {
        double y = 0;
        double x = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        imprimir("Informe o valor de a:");
        a = lerValorDouble();
        imprimir("Informe o valor de b:");
        b = lerValorDouble();
        imprimir("Informe o valor de c:");
        c = lerValorDouble();
        imprimir("Informe o valor de x:");
        x = lerValorDouble();
        y = a * Math.pow(x, 2) + b * x + c;
        imprimir("O valor de y é: " + y);
    }

    public static void EX33_2() {
        processarBhaskara();
    }

    public static void processarBhaskara() {
        mostrarBhaskara();
    }

    public static void mostrarBhaskara() {
        double b = 0;
        double a = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        imprimir("Informe o valor de a:");
        a = lerValorDouble();
        imprimir("Informe o valor de b:");
        b = lerValorDouble();
        imprimir("Informe o valor de c:");
        c = lerValorDouble();
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        imprimir("Raiz positiva: " + x1 + " Raiz negativa: " + x2);
    }

    public static void EX34_2() {
        processarDistanciaEntrePontos();
    }

    public static void processarDistanciaEntrePontos() {
        mostrarDistanciaEntrePontos();
    }

    public static void mostrarDistanciaEntrePontos() {
        double d = 0;
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        imprimir("Informe o valor de x2:");
        x2 = lerValorDouble();
        imprimir("Informe o valor de x1:");
        x1 = lerValorDouble();
        imprimir("Informe o valor y2:");
        y2 = lerValorDouble();
        imprimir("Informe o valor de y1:");
        y1 = lerValorDouble();
        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        imprimir("A distância entre os 2 pontos é: " + d);
    }

    public static void EX35_2() {
        processarGrausParaRadianos();
    }

    public static void processarGrausParaRadianos() {
        mostrarGrausParaRadianos();
    }

    public static void mostrarGrausParaRadianos() {
        double graus = 0;
        double radianos = 0;
        imprimir("Insira o valor em graus ° :");
        graus = lerValorDouble();
        radianos = graus * (Math.PI / 180);
        imprimir("Valor em graus ° : " + graus + " Valor em radianos (rad) : " + radianos);
    }

    public static void EX36_2() {
        processarMediasVariadas();
    }

    public static void processarMediasVariadas() {
        mostrarMediasVariadas();
    }

    public static void mostrarMediasVariadas() {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        int n = 4;
        double media_aritmetica = 0;
        double media_harmonica = 0;
        double media_geometrica = 0;
        double media_quadratica = 0;
        imprimir("Informe o valor de a:");
        a = lerValorDouble();
        imprimir("Informe o valor de b:");
        b = lerValorDouble();
        imprimir("Informe o valor de c:");
        c = lerValorDouble();
        imprimir("Informe o valor de d:");
        d = lerValorDouble();
        media_aritmetica = ((a + b + c + d) / n);
        media_harmonica = n / ((1 / a) + (1 / b) + (1 / c) + (1 / d));
        media_geometrica = Math.sqrt(Math.sqrt((a * b * c * d)));
        media_quadratica = Math.sqrt((a * a + b * b + c * c + d * d) / n);
        imprimir("Média Aritmética: " + media_aritmetica);
        imprimir("Média Harmônica: " + media_harmonica);
        imprimir("Média Geométrica: " + media_geometrica);
        imprimir("Média Quadrática: " + media_quadratica);
    }

    public static void EX37_2() {
        processarCelsiusParaFahrenheit();
    }

    public static void processarCelsiusParaFahrenheit() {
        mostrarCelsiusParaFahrenheit();
    }

    public static void mostrarCelsiusParaFahrenheit() {
        double celsius = 0;
        double fahrenheit = 0;
        imprimir("Informe a temperatura em graus Celsius °C:");
        celsius = lerValorDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        imprimir("A temperatura em Fahrenheit é: " + fahrenheit + " °F");
    }

    public static void EX38_2() {
        processarCelsiusParaKelvin();
    }

    public static void processarCelsiusParaKelvin() {
        mostrarCelsiusParaKelvin();
    }

    public static void mostrarCelsiusParaKelvin() {
        double celsius = 0;
        double kelvin = 0;
        imprimir("Informe a temperatura em graus Celsius °C:");
        celsius = lerValorDouble();
        kelvin = celsius + 273.15;
        imprimir("A temperatura em Kelvin é: " + kelvin + " °K");
    }

    public static void EX39_2() {
        processarDuracaoPartida();
    }

    public static void processarDuracaoPartida() {
        mostrarDuracaoPartida();
    }

    public static void mostrarDuracaoPartida() {
        int hora_inicial = 0;
        int minuto_inicial = 0;
        int hora_final = 0;
        int minuto_final = 0;
        int minutos_inicio = 0;
        int minutos_fim = 0;
        int duracao = 0;
        int horas = 0;
        int minutos = 0;
        imprimir("Insira a hora inicial da partida:");
        hora_inicial = lerValorInt();
        imprimir("Insira os minutos do início da partida:");
        minuto_inicial = lerValorInt();
        imprimir("Insira a hora final da partida:");
        hora_final = lerValorInt();
        imprimir("Insira os minutos do final da partida:");
        minuto_final = lerValorInt();
        minutos_inicio = hora_inicial * 60 + minuto_inicial;
        minutos_fim = hora_final * 60 + minuto_final;
        duracao = minutos_fim - minutos_inicio;
        horas = duracao / 60;
        minutos = duracao % 60;
        imprimir("A duração total do jogo foi: " + horas + " horas, e " + minutos + " minutos");
    }

    public static void EX01_selecao() {
        processarMenorNumero();
    }

    public static void processarMenorNumero() {
        mostrarMenorNumero();
    }

    public static void mostrarMenorNumero() {
        int numero1 = 0;
        int numero2 = 0;
        imprimir("Informe um número:");
        numero1 = lerValorInt();
        imprimir("Informe outro número:");
        numero2 = lerValorInt();

        if (numero1 == numero2) {
            imprimir("Números iguais");
        } else {
            if (numero1 < numero2) {
                imprimir("Número menor: " + numero1);
            } else {
                imprimir("Número menor: " + numero2);
            }
        }
    }

    public static void EX02_selecao() {
        processarMaiorNumero();
    }

    public static void processarMaiorNumero() {
        mostrarMaiorNumero();
    }

    public static void mostrarMaiorNumero() {
        int numero1 = 0;
        int numero2 = 0;
        imprimir("Informe um número:");
        numero1 = lerValorInt();
        imprimir("Informe outro número:");
        numero2 = lerValorInt();

        if (numero1 == numero2) {
            imprimir("Números iguais");
        } else {
            if (numero1 > numero2) {
                imprimir("Número maior: " + numero1);
            } else {
                imprimir("Número maior: " + numero2);
            }
        }
    }

    public static void EX03_selecao() {
        processarMaiorNumero3();
    }

    public static void processarMaiorNumero3() {
        mostrarMaiorNumero3();
    }

    public static void mostrarMaiorNumero3() {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        imprimir("Informe um número:");
        numero1 = lerValorInt();
        imprimir("Informe outro número:");
        numero2 = lerValorInt();
        imprimir("Informe outro número:");
        numero3 = lerValorInt();

        if ((numero1 == numero2) && (numero1 == numero3) && (numero2 == numero3)) {
            imprimir("Números iguais");
        } else {
            if ((numero1 > numero2) && (numero1 > numero3)) {
                imprimir("Número maior: " + numero1);
            } else if ((numero2 > numero1) && (numero2 > numero3)) {
                imprimir("Número maior: " + numero2);
            } else if ((numero3 > numero1) && (numero3 > numero2)) {
                imprimir("Número maior: " + numero3);
            }
        }

        if ((numero1 < numero2) && (numero1 < numero3)) {
            imprimir("Número menor: " + numero1);
        } else if ((numero2 < numero1) && (numero2 < numero3)) {
            imprimir("Número menor: " + numero2);
        } else if ((numero3 < numero1) && (numero3 < numero2)) {
            imprimir("Número menor: " + numero3);
        }
    }

    public static void EX04_selecao() {
        processarMaiorNumero3Crescente();
    }

    public static void processarMaiorNumero3Crescente() {
        mostrarMaiorNumero3Crescente();
    }

    public static void mostrarMaiorNumero3Crescente() {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        imprimir("Informe um número:");
        numero1 = lerValorInt();
        imprimir("Informe outro número:");
        numero2 = lerValorInt();
        imprimir("Informe outro número:");
        numero3 = lerValorInt();

        if ((numero1 <= numero2) && (numero1 <= numero3)) {
            imprimeInt(numero1);
            if (numero2 <= numero3) {
                imprimeInt(numero2);
                imprimeInt(numero3);
            } else {
                imprimeInt(numero3);
                imprimeInt(numero2);

            }
        }

        if ((numero2 <= numero1) && (numero2 <= numero3)) {
            imprimeInt(numero2);
            if (numero1 <= numero3) {
                imprimeInt(numero1);
                imprimeInt(numero3);
            } else {
                imprimeInt(numero3);
                imprimeInt(numero1);

            }
        }

        if ((numero3 <= numero1) && (numero3 <= numero2)) {
            imprimeInt(numero3);
            if (numero2 <= numero1) {
                imprimeInt(numero2);
                imprimeInt(numero1);
            } else {
                imprimeInt(numero1);
                imprimeInt(numero2);

            }
        }
    }

    public static void EX05_selecao() {
        processarMaiorNumero5Crescente();
    }

    public static void processarMaiorNumero5Crescente() {
        mostrarMaiorNumero5Crescente();
    }

    public static void mostrarMaiorNumero5Crescente() {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int numero5 = 0;

        imprimir("Informe um número:");
        numero1 = lerValorInt();
        imprimir("Informe outro número:");
        numero2 = lerValorInt();
        imprimir("Informe outro número:");
        numero3 = lerValorInt();
        imprimir("Informe outro número:");
        numero4 = lerValorInt();
        imprimir("Informe outro número:");
        numero5 = lerValorInt();

        if (numero1 > numero2) {
            int swap = numero1;
            numero1 = numero2;
            numero2 = swap;
        }

        if (numero1 > numero3) {
            int swap = numero1;
            numero1 = numero3;
            numero3 = swap;
        }

        if (numero1 > numero4) {
            int swap = numero1;
            numero1 = numero4;
            numero4 = swap;
        }

        if (numero1 > numero5) {
            int swap = numero1;
            numero1 = numero5;
            numero5 = swap;
        }

        if (numero2 > numero3) {
            int swap = numero2;
            numero2 = numero3;
            numero3 = swap;
        }

        if (numero2 > numero4) {
            int swap = numero2;
            numero2 = numero4;
            numero4 = swap;
        }

        if (numero2 > numero5) {
            int swap = numero2;
            numero2 = numero5;
            numero5 = swap;
        }

        if (numero3 > numero4) {
            int swap = numero3;
            numero3 = numero4;
            numero4 = swap;
        }

        if (numero3 > numero5) {
            int swap = numero3;
            numero3 = numero5;
            numero5 = swap;
        }

        if (numero4 > numero5) {
            int swap = numero4;
            numero4 = numero5;
            numero5 = swap;
        }

        imprimeInt(numero1);
        imprimeInt(numero2);
        imprimeInt(numero3);
        imprimeInt(numero4);
        imprimeInt(numero5);
    }

    public static void EX06_selecao() {
        processarDivisiveisPor10_5_2();
    }

    public static void processarDivisiveisPor10_5_2() {
        mostrarDivisiveisPor10_5_2();
    }

    public static void mostrarDivisiveisPor10_5_2() {
        int numero = 0;
        imprimir("Insira um número:");
        numero = lerValorInt();

        if ((numero % 10) == 0) {
            imprimir("É divisível por 10");
        }
        if ((numero % 5) == 0) {
            imprimir("É divisível por 5");
        }
        if ((numero % 2) == 0) {
            imprimir("É divisível por 2");
        }

        if (((numero % 10) != 0) && ((numero % 5) != 0) && ((numero % 2) != 0)) {
            imprimir("Não é divisível por 10, 5, 2");
        }
    }

    public static void EX07_selecao() {
        processarDuziasMacas();
    }

    public static void processarDuziasMacas() {
        mostrarDuziasMacas();
    }

    public static void mostrarDuziasMacas() {
        int quantidade = 0;
        imprimir("Informe quantas maçãs deseja comprar:");
        quantidade = lerValorInt();

        if (quantidade > 0) {
            if (quantidade > 11) {
                imprimir("O valor de sua compra ficou em: " + (0.25 * quantidade) + " reais");
            } else {
                imprimir("O valor de sua compra ficou em: " + (0.30 * quantidade) + " reais");
            }
        } else {
            imprimir("Insira um valor maior que 0");
        }
    }

    public static void EX08_selecao() {
        processarPesoIdeal();
    }

    public static void processarPesoIdeal() {
        mostrarPesoIdeal();
    }

    public static void mostrarPesoIdeal() {
        char sexo = ' ';
        double altura = 0;
        imprimir("Informe seu sexo (M/F):");
        sexo = lerValorChar();
        imprimir("Informe sua altura em m");
        altura = lerValorDouble();

        if (sexo == 'M') {
            imprimir("Peso ideal = " + ((72.7 * altura) - 58));
        } else if (sexo == 'F') {
            imprimir("Peso ideal = " + ((62.1 * altura) - 44));
        } else {
            imprimir("Sexo informado inválido");
        }
    }

    public static void EX09_selecao() {
        processarOperadores();
    }

    public static void processarOperadores() {
        mostrarOperadores();
    }

    public static void mostrarOperadores() {
        int valor1 = 0;
        int valor2 = 0;
        char operador = ' ';

        imprimir("Informe um valor:");
        valor1 = lerValorInt();

        imprimir("Informe outro valor:");
        valor2 = lerValorInt();

        imprimir("Informe um operador:");
        operador = lerValorChar();

        if (operador == '*') {
            imprimeInt(valor1 * valor2);
        }

        if (operador == '/') {
            imprimeInt(valor1 / valor2);
        }

        if (operador == '+') {
            imprimeInt(valor1 + valor2);
        }

        if (operador == '-') {
            imprimeInt(valor1 - valor2);
        }
    }

    public static void EX10_selecao() {
        processarFormadorDeTriangulo();
    }

    public static void processarFormadorDeTriangulo() {
        mostrarFormadorDeTriangulo();
    }

    public static void mostrarFormadorDeTriangulo() {
        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;
        imprimir("Insira a medida do 1º lado do triângulo:");
        ladoA = lerValorDouble();
        imprimir("Insira a medida do 2º lado do triângulo:");
        ladoB = lerValorDouble();
        imprimir("Insira a medida do 3º lado do triângulo:");
        ladoC = lerValorDouble();
        if ((ladoA >= (ladoB + ladoC)) || (ladoB >= (ladoA + ladoC)) || (ladoC >= (ladoA + ladoB))) {
            imprimir("Não pode existir um triângulo com essas medidas");
        } else {
            imprimir("Pode existir um triângulo com essas medidas");
        }
    }

    public static void EX11_selecao() {
        processarPoligono();
    }

    public static void processarPoligono() {
        identificarPoligono();
    }

    public static void identificarPoligono() {
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        int qtdLados = 0;
        imprimir("Informe a quantidade de lados do polígono:");
        qtdLados = lerValorInt();
        switch (qtdLados) {

            case 3:
                imprimir("Informe a medida do 1º lado:");
                lado1 = lerValorDouble();
                imprimir("Informe a medida do 2º lado:");
                lado2 = lerValorDouble();
                imprimir("Informe a medida do 3º lado:");
                lado3 = lerValorDouble();
                double semiperimetro = ((lado1 + lado2 + lado3) / 2);
                double areaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2)
                        * (semiperimetro * lado3));
                imprimir("Seu polígono é do tipo TRIÂNGULO e sua área é aproximadamente: " + areaTriangulo
                        + " cm²");
                break;

            case 4:
                imprimir("Informe a medida do 1º lado:");
                lado1 = lerValorDouble();
                double areaQuadrado = lado1 * lado1;
                imprimir("Seu polígono é do tipo QUADRADO e sua área é aproximadamente: " + areaQuadrado
                        + " cm²");
                break;

            case 5:
                imprimir("Informe a medida do 1º lado:");
                lado1 = lerValorDouble();
                double areaPentagono = (5 * (lado1 * lado1)) / (4 * Math.sqrt(5 - (2 * Math.sqrt(5))));
                imprimir("Seu polígono é do tipo PENTÁGONO e sua área é aproximadamente: " + areaPentagono
                        + " cm²");
                break;

            default:
                if (qtdLados > 5) {
                    imprimir("POLÍGONO NÃO IDENTIFICADO");
                } else if (qtdLados < 3) {
                    imprimir("NÃO É UM POLÍGONO");
                }
                break;
        }
    }

    public static void EX12_selecao() {
        processarParOuImpar();
    }

    public static void processarParOuImpar() {
        mostrarParOuImpar();
    }

    public static void mostrarParOuImpar() {
        int numero = 0;
        imprimir("Informe um número");
        numero = lerValorInt();
        if ((numero % 2) == 0) {
            imprimir("Número par");
        } else {
            imprimir("Número ímpar");
        }
    }

    public static void EX13_selecao() {
        processarParEPositivo();
    }

    public static void processarParEPositivo() {
        mostrarParEPositivo();
    }

    public static void mostrarParEPositivo() {
        int numero = 0;
        imprimir("Informe um número");
        numero = lerValorInt();
        if ((numero > 0) && ((numero % 2) == 0)) {
            imprimir("O número é Positivo e Par ao mesmo tempo");
        } else {
            imprimir("O número não é Positivo e Par ao mesmo tempo");
        }
    }

    public static void EX23_selecao() {
        processarCedulas();
    }

    public static void processarCedulas() {
        mostrarCedulas();
    }

    public static void mostrarCedulas() {
        int valor_saque = 0;
        IO.imprimir("Qual valor deseja sacar? ");
        valor_saque = IO.lerValorInt();
        if (valor_saque < 601 && valor_saque > 0) {

            while (true) {
                int total = valor_saque;

                if (total >= 100) {
                    int qtd_notas = total / 100;
                    if (qtd_notas > 1) {
                        imprimir(qtd_notas + " notas de 100");
                    } else {
                        imprimir(qtd_notas + " nota de 100");
                    }
                    total -= qtd_notas * 100;
                }

                if (total >= 50) {
                    int qtd_notas = total / 50;
                    if (qtd_notas > 1) {
                        imprimir(qtd_notas + " notas de 50");
                    } else {
                        imprimir(qtd_notas + " nota de 50");
                    }
                    total -= qtd_notas * 50;
                }

                if (total >= 10) {
                    int qtd_notas = total / 10;
                    if (qtd_notas > 1) {
                        imprimir(qtd_notas + " notas de 10");
                    } else {
                        imprimir(qtd_notas + " nota de 10");
                    }
                    total -= qtd_notas * 10;
                }

                if (total >= 5) {
                    int qtd_notas = total / 5;
                    if (qtd_notas > 1) {
                        imprimir(qtd_notas + " notas de 5");
                    } else {
                        imprimir(qtd_notas + " nota de 5");
                    }
                    total -= qtd_notas * 5;
                }

                if (total >= 1) {
                    int qtd_notas = total / 1;
                    if (qtd_notas > 1) {
                        imprimir(qtd_notas + " notas de 1");
                    } else {
                        imprimir(qtd_notas + " nota de 1");
                    }
                    total -= qtd_notas * 1;
                }

                if (total == 0) {
                    break;
                }

            }

        } else {
            IO.imprimir("Valor de saque fora do intervalo válido!");
        }
    }

    public static void EX24_selecao() {
        processarCrime();
    }

    public static void processarCrime() {
        mostrarCrime();
    }

    public static void mostrarCrime() {
        int contador = 0;
        char resposta = ' ';
        IO.imprimir("Telefonou para a vítima?(S/N)");
        resposta = IO.lerValorChar();
        if (resposta == 'S' || resposta == 's') {
            contador++;
        }
        IO.imprimir("Esteve no local do crime?(S/N)");
        resposta = IO.lerValorChar();
        if (resposta == 'S' || resposta == 's') {
            contador++;
        }
        IO.imprimir("Mora perto da vítima?(S/N)");
        resposta = IO.lerValorChar();
        if (resposta == 'S' || resposta == 's') {
            contador++;
        }
        IO.imprimir("Devia para a vítima?(S/N)");
        resposta = IO.lerValorChar();
        if (resposta == 'S' || resposta == 's') {
            contador++;
        }
        IO.imprimir("Já trabalhou com a vítima?(S/N)");
        resposta = IO.lerValorChar();
        if (resposta == 'S' || resposta == 's') {
            contador++;
        }
        if (contador == 0) {
            IO.imprimir("Inocente");
        }

        if (contador == 2) {
            IO.imprimir("Suspeito");
        }
        if (contador > 2 && contador < 5) {
            IO.imprimir("Cúmplice");
        }
        if (contador == 5) {
            IO.imprimir("Assasino");
        }
    }

    public static void EX25_selecao() {
        mostrarDescontoCombustivel();
    }

    public static void mostrarDescontoCombustivel() {
        processarDescontoCombustivel();
    }

    public static void processarDescontoCombustivel() {
        double preco_combustivel = 0;
        double preco_final = 0;
        IO.imprimir("Quantos litros de combustível foram vendidos?");
        double litragem = IO.lerValorDouble();
        IO.lerValorString(); //Para capturar '/n' da quebra de linha
        IO.imprimir("E-Etanol ou G-Gasolina?");
        String combustivel = IO.lerValorString();

        if (combustivel.equals("Etanol") || combustivel.equals("E")) {
            preco_combustivel = 3.15;
        } else if (combustivel.equals("Gasolina") || combustivel.equals("G")) {
            preco_combustivel = 4.50;
        }
        if (litragem <= 20) {
            if (combustivel.equals("Etanol") || combustivel.equals("E")) {
                preco_final = litragem * (preco_combustivel - (preco_combustivel * 0.03));
            }

            if (combustivel.equals("Gasolina") || combustivel.equals("G")) {
                preco_final = litragem * (preco_combustivel - (preco_combustivel * 0.04));
            }
        }

        if (litragem > 20) {
            if (combustivel.equals("Etanol") || combustivel.equals("E")) {
                preco_final = litragem * (preco_combustivel - (preco_combustivel * 0.05));
            }

            if (combustivel.equals("Gasolina") || combustivel.equals("G")) {
                preco_final = litragem * (preco_combustivel - (preco_combustivel * 0.06));
            }
        }
        IO.imprimir("Preço total: R$ " + preco_final);
    }

    public static void EX26_selecao(){
        processarDeltaEquacao2oGrau();
    }

    public static void processarDeltaEquacao2oGrau(){
        mostrarDeltaEquacao2oGrau();
    }


}

// TEORIA GERAL DE EUCLIDES PARA NÚMEROS PERFEITOS
// 2 p−1 ×(2p−1)

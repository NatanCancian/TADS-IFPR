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

public static void EX01_2(){
    processarAntecessoresSucessores();
}

public static void processarAntecessoresSucessores(){
    mostrarAntecessoresSucessores();
}

public static void mostrarAntecessoresSucessores(){
    int numero = 0;
    imprimir("Informe um número:");
    numero = lerValorInt();
    imprimir("O antecessor é: " + (numero-1) + "o valor sucessor é: " + (numero+1));  
  }

public static void EX02_2(){
    mostrarBoaTarde();
}

public static void mostrarBoaTarde(){
    processarBoaTarde();
}

public static void processarBoaTarde(){
    String nome = null;
    imprimir("Informe seu nome:");
    nome = lerValorString();
    imprimir("Boa tarde " + nome + " !");
}

public static void EX03_2(){
    processarCuboNumero();
}

public static void processarCuboNumero(){
    mostrarCuboNumero();
}

public static void mostrarCuboNumero(){
    int numero = 0;
    imprimir("Informe um número: ");
    numero = lerValorInt();
    imprimir("O cubo do número é: " + Math.pow(numero, 3));
}

public static void EX04_2(){
    processarSegundosPassados();
}

public static void processarSegundosPassados(){
    mostrarSegundosPassados();
}

public static void mostrarSegundosPassados(){
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

    total_segundos = (hora_atual * 3600 ) + (minuto_atual * 60) + (segundo_atual);

    imprimir("Passaram cerca de " + total_segundos + "segundos");
}

public static void EX05_2(){
    processarRaizes();
}

public static void processarRaizes(){
    mostrarRaizes();
}

public static void mostrarRaizes(){
    double numero = 0;
    imprimir("Informe um número:");
    numero = lerValorDouble();
    imprimir("A raiz quadrade desse número é: " + Math.sqrt(numero) 
    + " e a raiz cúbica é: " + Math.cbrt(numero));
}

public static void EX06_2(){
    processarCustoLocacao();
}

public static void processarCustoLocacao(){
    mostrarCustoLocacao();
}

public static void mostrarCustoLocacao(){
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

public static void EX07_2(){
    processarPerimetroAreaRetangulo();
}

public static void processarPerimetroAreaRetangulo(){
    mostrarPerimetroAreaRetangulo();
}

public static void mostrarPerimetroAreaRetangulo(){
    double base = 0;
    double altura = 0;
    double perimetro = 0;
    double area = 0;
    imprimir("Informe a base do retângulo:");
    base = lerValorDouble();
    imprimir("Informe a altura do retângulo:");
    altura = lerValorDouble();
    perimetro = (2 *(base + altura));
    area = base * altura;
    imprimir("O perímetro do retângulo é: " + perimetro + " , e a área do retângulo é: " + area);
  }
 
  public static void EX08_2(){
    processarRaioCirculo();
  }

  public static void processarRaioCirculo(){
    mostrarRaioCirculo();
  }

  public static void mostrarRaioCirculo(){
    double perimetro = 0;
    double raio = 0;
    double area = 0;

    imprimir("Informe um o raio da circunferência:");
    raio = lerValorDouble();
    perimetro = 2 * Math.PI * raio;
    area  = Math.PI * Math.pow(raio, 2);
    imprimir("O perímetro da circunferência é: " + perimetro + " , a área da circuferência é: " + area);
  }

  public static void EX10_2(){
    processarDesconto();
  }

  public static void processarDesconto(){
    mostrarDesconto();
  }

  public static void mostrarDesconto(){
    double preco = 0;
    double desconto = 0;
    double percentual = 0;
    imprimir("Informe o preço da mercadoria:");
    preco = lerValorDouble();
    imprimir("Informe o percentual(%) de desconto (de 0 a 100): ");
    desconto = lerValorDouble();
    if((desconto >= 0) && (desconto < 101)){
        desconto = desconto / 100;
        percentual = preco * desconto;
        preco = preco - percentual;
        imprimir("A porcentagem desconto é: " + percentual + "% , " + "e o preço a pagar é: " + preco);                
    }else{
        imprimir("Desconto fora do percentual permitido!");
    }
  }

  public static void EX11_2(){
    processarAumento();
  }

  public static void processarAumento(){
    mostrarAumento();
  }

  public static void mostrarAumento(){
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

    public static void EX12_2(){
        processarBoleto();
    }

    public static void processarBoleto(){
        mostrarBoleto();
    }

    public static void mostrarBoleto(){
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

    public static void EX13_2(){
        processarEleicao();
    }

    public static void processarEleicao(){
        mostrarEleicao();
    }

    public static void mostrarEleicao(){
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

    public static void EX14_2(){
        processarCustoCarro();
    }

    public static void processarCustoCarro(){
        mostrarCustoCarro();
    }

    public static void mostrarCustoCarro(){
        double custo = 0;
        imprimir("Informe o custo do carro:");
        custo = lerValorDouble();
        imprimir("O custo do carro é: " + (custo + (custo * 0.28) + (custo * 0.45)));
    }

    public static void EX15_2(){
        processarComissaoVendas();
    }

    public static void processarComissaoVendas(){
        mostrarComissaoVendas();
    }

    public static void mostrarComissaoVendas(){
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

    public static void EX32_2(){
        processarEquacao2oGrau();
    }

    public static void processarEquacao2oGrau(){
        mostrarEquacao2oGrau();
    }

    public static void mostrarEquacao2oGrau(){
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

    public static void EX33_2(){
        processarBhaskara();
    }

    public static void processarBhaskara(){
        mostrarBhaskara();
    }

    public static void mostrarBhaskara(){
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
       x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
       x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
       imprimir("Raiz positiva: " + x1 + " Raiz negativa: " + x2);
    }

    public static void EX34_2(){
        processarDistanciaEntrePontos();
    } 

    public static void processarDistanciaEntrePontos(){
        mostrarDistanciaEntrePontos();
    }

    public static void mostrarDistanciaEntrePontos(){
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
        d = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1, 2));
        imprimir("A distância entre os 2 pontos é: " + d);
    }



}













































































































    // TEORIA GERAL DE EUCLIDES PARA NÚMEROS PERFEITOS
    // 2 p−1 ×(2p−1)

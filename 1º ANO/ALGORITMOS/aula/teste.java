package aula;
public class teste {

    /* IMPORTAÇÃO DOS MÉTODOS UTILIZADOS EM FLUXOGRAMA 
     * CRIAR UMA INSTÂNCIA DA CLASSE OU BUSCAR DA PRÓPRIA CLASSE
     * 
     * CRIAR INSTANCIA DA CLASSE == NomedaClasse nomedoObjeto = new NomedaClasse();
     * OBJETO CRIADO, MÉTODOS DISPONÍVEIS 
     * CHAMA O MÉTODO PELO == NOME DO OBJETO. NOME MÉTODO
     *  
     * BUSCAR PELA CLASSE == NomedaClasse.NOME MÉTODO
     * 
     * \\\\\VERIFICAR///// 
     * 
     *
     * ONDE TEM STATIC PERTENCE A CLASSE LOGO NÃO PRECISA DE OBJETO, (CLASSE == COMPORTAMENTO FIXO)
     * ONDE TEM VOID(SEM RETORNO) E SEM STATIC, INSTANCIA UM OBJETO (OBJETO == COMPORTAMENTO DINÂMICO)
     * 
     * 
     */

     public static void main(String[] args) {
     
        // metodosLista Metodos = new metodosLista();

        //chamando aos metodos da classe sem instanciar objeto
        aula06ex2.imprimir("Teste sem objeto");
        aula06ex2.imprimir("Digite um valor inteiro na tela");
        int valorInt = aula06ex2.lerInteiro();
        aula06ex2.imprimir("Teste se o método sem objeto funcionou: inteiro -> " + valorInt);

    //    metodosLista Metodos = new metodosLista();

     /*    //chamando aos metodos da classe instanciando objeto
        Metodos.imprimir("Teste com objeto");
        Metodos.lerValorString();
        Metodos.imprimir("Digite uma String na tela");
        resposta = Metodos.lerValorString();
        Metodos.imprimir("Teste se o método com objeto funcionou: String -> " + resposta); 
    */
        /* AO CHAMAR PELA CLASSE RECEBE O ACESSO DA CLASSE (ESTÁTICO?)
         * AO CHAMAR PELO OBJETO RECEBE O ACESSO PELO OBJETO (DINÂMICO??)
         * VERIFICAR DIFERENÇA DE PERFOMANCE/SEGURANÇA ENTRE AMBOS 
         */
    }
}

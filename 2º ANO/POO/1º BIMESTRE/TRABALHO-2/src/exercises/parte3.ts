import { exibirMensagem } from "../utils/msg";
import { somar } from "../utils/math";
import { perguntar } from "../utils/io";
import { verificarVazio, testarInteiro, entre, parseNumeroInteiro } from "../utils/validators";
//import prompt from "prompt-sync";

export async function executarParte3(): Promise<void>{

    async function ex11(){
        exibirMensagem("EXERCÍCIO 11:")
        const nome = (await perguntar("Nome: ")).trim();
        const idade = (await perguntar("Idade: ")).trim();
        const cidade = (await perguntar("Cidade: ")).trim();
        exibirMensagem(`Nome: ${nome}, Idade: ${idade}, Cidade: ${cidade}\n`);
    }

    async function ex12(){
        exibirMensagem("EXERCÍCIO 12:");
        const n1 = Number(await perguntar("Número 1: "));
        const n2 = Number(await perguntar("Número 2: "));
        exibirMensagem(`Soma: ${somar(n1,n2)}`);
    }
    
    async function ex13(){
        exibirMensagem("EXERCÍCIO 13:");
        const nome = (await perguntar("Digite seu nome: "));
        verificarVazio(nome,"nome");
        exibirMensagem(`Olá ${nome}`);
    }

    async function ex14(){
        exibirMensagem("\nEXERCÍCIO 14:");
        const numero = Number(await perguntar("Informe um número inteiro: "));
        testarInteiro(numero);
    }

    async function ex15(){
        exibirMensagem("\nEXERCÍCIO 15:");
        const idadeStr = (await perguntar("Digite sua idade: ")).trim();
        verificarVazio(idadeStr,"idade");
        const idade = Number(idadeStr);
        entre(idade,0,120,"idade");
        exibirMensagem(`${idade} anos`);
    }

    async function ex16(){
        exibirMensagem("\nEXERCÍCIO 16:");
        const nome = (await perguntar("Digite seu nome: "));
        verificarVazio(nome,"nome");
        const idadeStr = (await perguntar("Digite sua idade: ")).trim();
        verificarVazio(idadeStr,"idade");
        const idade = parseNumeroInteiro(idadeStr,"idade");
        entre(idade,0,120,"IDADE");
        const nota = (await perguntar("Digite sua nota: "));
        verificarVazio(nota, "nota");
        entre(parseNumeroInteiro(nota, "nota"),0,10,"nota");
        exibirMensagem("Cadastro Válido!")
    }
      await ex11();
      await ex12();
      await ex13();
      await ex14();
      await ex15();
      await ex16();
}
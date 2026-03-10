import readline from "node:readline";
import { stdin as input, stdout as output } from "node:readline";

const rl = readline.createInterface({input, output});

function perguntar(texto: string): Promise<string>{
    return new Promise((resolve) => {
        rl.question(texto, (resposta: string) => resolve(resposta));
    });
}

function parseNumero(valor: string): number{
    const n = Number(valor);
    if(Number.isNaN(n)){
        throw new Error(`Valor inválido: "${valor}" não é número.`);
    }
    return n;
}

async function main() {
    try {
        const nome = await perguntar("Digite seu nome: ");   

        const idadeStr = await perguntar("Digite sua idade: ");

        const idade = parseNumero(idadeStr);

        console.log(`Olá, ${nome}! E 5 anos você terá ${idade + 5} anos. `);
    } catch (e){
        console.error("Erro: ", (e as Error).message);
    }finally{
        rl.close();
    }
}
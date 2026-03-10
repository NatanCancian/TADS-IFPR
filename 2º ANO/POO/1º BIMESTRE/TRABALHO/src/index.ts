import { log } from "node:console";
import { perguntar,fecharIO } from "./io";
import { obrigatorio,parseNumeroInteiro, entre } from "./validators";
//import { ReadLine } from "node:readline";

type Turma = "1TADS" | "2TADS" | "3TADS";

interface Aluno {
  nome: string;
  idade: number;
  turma: Turma;
}


async function main() {
    try{
    console.log("=== Cadastro de Aluno (CLI) ===");
    const nome = (await perguntar("Digite seu nome: ")).trim();
    obrigatorio(nome, "nome");
    const idadeStr = (await perguntar("Digite sua idade: ")).trim();
    obrigatorio(idadeStr,"idade");
    //console.log(`$nome`, `{$idade}`);
    
    const idade = Number(idadeStr);
    parseNumeroInteiro(idadeStr, "idade");
    if (Number.isNaN(idade)) {
      console.log("\nIdade inválida:", idadeStr);
    } else {
      console.log("\nResultado:");
      console.log({ nome: nome || "(vazio)", idade });
    }
  } finally {
    fecharIO();
  }
}
main();



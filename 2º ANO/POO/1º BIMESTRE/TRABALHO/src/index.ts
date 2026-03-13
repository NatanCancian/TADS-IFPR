import { log } from "node:console";
import { perguntar,fecharIO } from "./io";
import { obrigatorio,parseNumeroInteiro, entre, validarTurma } from "./validators";
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
    const idade = parseNumeroInteiro(idadeStr, "idade");
    obrigatorio(idadeStr,"idade");
    entre(idade,0,120,"IDADE");    
    const turmaInput = Number((await perguntar("[1] 1ºTADS\n[2] 2ºTADS\n[3] 3ºTADS\nInforme a turma do aluno: ")).trim());
    let turma: Turma;
    turma = validarTurma(turmaInput);

    const aluno: Aluno = {
       nome,
       idade,
       turma
    };
    console.log("\nAluno cadastrado! Dados do aluno:\n")
    console.log(aluno);
    }
     finally {
    fecharIO();
  }
}
main();



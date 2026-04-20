import { Calculadora } from "../models/Calculadora";
import { Lampada } from "../models/Lampada";
import { exibirMensagem } from "../utils/msg";
import { Usuario } from "../models/Usuario";
import { Saudacao } from "../models/Saudacao";
import { Aluno } from "../models/Aluno";
import { perguntar } from "@utils/io";
import { NOMEM } from "node:dns";
export async function executarParte5(){
    
    function ex24(){
         exibirMensagem("EXERCÍCIO 24:");
         const calc = new Calculadora();
         exibirMensagem(`Soma: ${calc.somar(2,5)}`);
         exibirMensagem(`Soma: ${calc.multiplicar(2,5)}`);
         exibirMensagem(`Soma: ${calc.subtrair(2,5)}`);
    }
    function ex25(){
         exibirMensagem("\nEXERCÍCIO 25:");
         const lamp = new Lampada();
         lamp.ligar();
         exibirMensagem(lamp.estaLigada());
         lamp.desligar();
         exibirMensagem(lamp.estaLigada());
    }
    function ex26(){
         exibirMensagem("\nEXERCÍCIO 26:");
         const usuario1 = Usuario.criarVisitante();
         usuario1.apresentar();
    }
    function ex27(){
         exibirMensagem("\nEXERCÍCIO 27:");
         const aluno = new Saudacao();
         aluno.exibir("Natan");
         aluno.exibir("Natan", "Aluno");
    }
    async function ex28(){
         exibirMensagem("\nEXERCÍCIO 28:");
         const nome = (await perguntar("Nome: "));
         const matricula = (await perguntar("Matricula: "));
         const idade = Number(await perguntar("Idade: "));
         const nota = Number(await perguntar("Nota: "));
         const alunoNelson = new Aluno(nome, matricula, idade, nota);
         exibirMensagem(alunoNelson.verificarSituacao());
         alunoNelson.validar();
         alunoNelson.dadosAluno();
    }
    ex24();
    ex25();
    ex26();
    ex27();
    await ex28();
}
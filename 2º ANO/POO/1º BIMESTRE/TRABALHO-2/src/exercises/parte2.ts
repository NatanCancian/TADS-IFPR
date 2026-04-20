import { somar, subtrair, multiplicar, dividir } from "../utils/math";
import { ehPar } from "../utils/validators";
import { exibirMensagem } from "../utils/msg";

export function executarParte2(): void {

    function ex05() {
        const nome: string = "Natan";
        const idade: number = 23;
        const aprendendo: boolean = true;
        const notas: number[] = [10, 8.5, 9, 7];
        const tecnologias: string[] = ["TypeScript", "JavaScript", "Node"];
        const coordenadas: [number, number] = [-23.5505, -46.6333];
        enum Perfil { ADMIN = "Administrador ", USER = "Usuário", GUEST = "Visitante" }
        let meuPerfil: Perfil = Perfil.ADMIN;
        exibirMensagem(`
         EXERCÍCIO 5:
         Nome: ${nome} 
         Idade: ${idade}
         Status: ${aprendendo}
         Notas: ${notas}
         Stacks: ${tecnologias}
         Coordenadas: Lat ${coordenadas[0]}, Long ${coordenadas[1]}
         Perfil do Usuário: ${meuPerfil}\n`);
    }

    function ex06() {
        let nome = "Natan"; // inferido como string
        let idade: number = 22; // anotado
        let total = 10 + 5; // inferência suficiente ou let ativo = true;

        // anotação melhora clareza       
        let resultado: number;
        resultado = total;
    }

    function ex07() {
        let soma: number = somar(10, 10)
        let sub: number = subtrair(10, 2)
        let mult: number = multiplicar(10, 2)
        let div: number = dividir(6, 2)
    }

    function ex08() {
        exibirMensagem("EXERCÍCIO 8\nTeste de Mensagem!\n");
    }

    function ex09() {
        exibirMensagem(`EXERCÍCIO 9: ${ehPar(2)}\n`);
    }

    function ex10() {
        interface Aluno {
            id: number;
            nome: string;
            email?: string;
            ativo: boolean;
        }

        type Turma = "1TADS" | "2TADS" | "3TADS";

        function matricular(aluno: Aluno, turma: Turma) {
            exibirMensagem(`EXERCÍCIO 10: ${aluno.nome} matriculado na turma ${turma}`);
        }

        const aluno1: Aluno = {
            id: 1,
            nome: "Natan",
            ativo: true
        };

        matricular(aluno1, "2TADS");
    }

    ex05();
    ex06();
    ex07();
    ex08();
    ex09();
    ex10();
}
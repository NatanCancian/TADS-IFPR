import { exibirMensagem } from "../utils/msg";
import { entre } from "../utils/validators";

export class Aluno {
    
    constructor(
    public nome: string,
    public matricula: string,
    public idade: number,
    public nota: number){}
    
    public getNome(): string{
        return this.nome;
    }

    public setNome(nome : string): void{
        this.nome = nome;
    }

    public getMatricula(): string{
        return this.matricula;
    }

    public setMatricula(matricula : string): void{
        this.matricula = matricula;
    }

    public getIdade(): number{
        return this.idade;
    }

    public setIdade(idade : number): void{
        this.idade = idade;
    }

    public getNota(): number{
        return this.nota;
    }

    public setNota(nota : number): void{
        this.nota = nota;
    }

    public verificarSituacao(): string{
        return this.nota >= 6 ? "Aprovado" : "Reprovado";        
    }

    public validar(): void{
        if (!this.getNome()){ console.log("Nome obrigatório");}
        else if(!this.matricula.trim()){console.log("Matricula inválida");}
        else if(!entre(this.idade,0,120,"idade")){ console.log("Idade inválida!");}
        else if(!entre(this.nota, 0, 10, "nota")){ console.log("Nota Inválida");}
        else{
            const aluno = new Aluno(this.nome, this.matricula, this.idade, this.nota);
        }
    }
    
    public dadosAluno(): void{
        exibirMensagem(`
            Nome: ${this.nome}
            Matrícula: ${this.matricula}
            Idade: ${this.idade}
            Nota: ${this.nota}
            Situação: ${this.verificarSituacao()}`);
    }
}
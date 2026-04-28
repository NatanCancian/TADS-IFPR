class Pessoa{
    public nome: string;
    public idade: number;

    constructor(nome: string, idade: number){
        this.nome = nome;
        this.idade = idade;
    }

    public apresentar(): void{
        console.log(`Olá, meu nome é ${this.nome} e tenho ${this.idade} anos.`);
    }

}

class Aluno extends Pessoa{
    public matricula: string;
    public curso: string;

    constructor(nome: string, idade: number, matricula: string, curso: string){
        super(nome, idade); // super isolado -> é para chamar o método construtor da superclasse 
        this.matricula = matricula;
        this.curso = curso;
    }

    public exibirMatricula(): void{
        console.log(`Matrícula: ${this.matricula}`);
    }
}

console.log("\n=== 05 - Herança Básica ===");

const alunoNelson = new Aluno("Nelson", 35, "2025001", "Meio Ambiente");
alunoNelson.apresentar();
alunoNelson.curso;

export{};
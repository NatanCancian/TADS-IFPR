export class Usuario{

    private nome: string;
    private tipo: string;

    constructor(nome: string, tipo: string){
        this.nome = nome;
        this.tipo = tipo;
    }

    public static criarVisitante(): Usuario{
        return new Usuario("Visitante", "Convidado");
    }

    public apresentar(): void{
        console.log(`Nome: ${this.nome} | Tipo: ${this.tipo}`);
    }

}
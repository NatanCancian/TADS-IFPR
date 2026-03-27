class Usuario{

    private nome: string;
    private tipo: string;

    constructor(nome: string, tipo: string){
        this.nome = nome;
        this.tipo = tipo;
    }

    public static criarVisitante(): Usuario{
        return new Usuario("Visitante", "Convidado");
    }
    
    public static criarAdm(nome: string): Usuario{
        return new Usuario(nome, "Administrador");
    }

    public static criarAluno(nome: string): Usuario{
        return new Usuario(nome, "Aluno");
    }

    public apresentar(): void{
        console.log(`Nome: ${this.nome} | Tipo: ${this.tipo}`);
    }

}

const usuario1 = Usuario.criarVisitante();
const usuario2 = Usuario.criarAdm("NELSO REI DA PREFA"); 
const usuario3 = Usuario.criarAdm("FI DO NELSO REI DA PREFA");
const usuario4 = new Usuario(" 2o FI DO NELSO REI DA PREFA", "Aluno");

usuario1.apresentar();
usuario2.apresentar();
usuario3.apresentar();
usuario4.apresentar();
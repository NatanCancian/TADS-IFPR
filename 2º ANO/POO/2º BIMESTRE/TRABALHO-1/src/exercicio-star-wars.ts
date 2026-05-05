 class Personagem{
    protected nome: string;
    protected planeta_origem: string;
    protected nivel_energia: number;

    constructor(nome: string, planeta_origem: string, nivel_energia: number){
        this.nome = nome;
        this.planeta_origem = planeta_origem;
        this.nivel_energia = nivel_energia;
    }
    
    public apresentar(): void{
        console.log(` Meu nome é ${this.nome}
            , sou do planeta ${this.planeta_origem}, 
            meu poder é ${this.nivel_energia}`);
    }

    public usarHabilidade(): void{
        console.log(`${this.nome} usou o poder`);
    }
 }
    class Jedi extends Personagem{
        private sabre : string;
        constructor(nome: string, planeta_origem: string, nivel_energia: number, sabre: string){
            super(nome,planeta_origem, nivel_energia);
            this.sabre = sabre;
        }
        
    }
 

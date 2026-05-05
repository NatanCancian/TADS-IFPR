 class Personagem{
    protected nome: string;
    protected planeta_origem: string;
    protected nivel_energia: number;

    constructor(nome: string, planeta_origem: string, nivel_energia: number){
        this.nome = nome;
        this.planeta_origem = planeta_origem;
        this.nivel_energia = nivel_energia;
    }
    
     apresentar(): void{
        console.log(` Meu nome é ${this.nome}
            , sou do planeta ${this.planeta_origem}, 
            meu poder é ${this.nivel_energia}
            `);
    }

     usarHabilidade(): void{
        console.log(`${this.nome} usou o poder
            `);
    }
 }
    class Jedi extends Personagem{
        private corSabre : string;
        constructor(nome: string, planeta_origem: string, nivel_energia: number, sabre: string){
            super(nome,planeta_origem, nivel_energia);
            this.corSabre = sabre;
        }
        apresentar(): void {
        console.log(`======== Jedi ======== 
                        Nome ${this.nome} 
                        Planeta: ${this.planeta_origem}  
                        Energia: ${this.nivel_energia}
            `);
    }
        usarHabilidade(): void {
        console.log(`O Jedi ${this.nome} usou a Força para proteger a galaxia 
                     Cor do sabre de luz: ${this.corSabre}
            `);
    }    
}

    class Sith extends Personagem{
        private nivelRaiva : number;
        constructor(nome: string, planeta: string, energia: number, nivelRaiva: number){
            super(nome,planeta,energia);
            this.nivelRaiva = nivelRaiva;
        }

         apresentar(): void {
            console.log(`======== Sith ======== 
                           Nome ${this.nome} 
                           Planeta: ${this.planeta_origem}  
                           Energia: ${this.nivel_energia}
            `);
         }

        usarHabilidade(): void {
            console.log(`O Sith ${this.nome} usou o lado sombrio da Força.
                         Nível de raiva: ${this.nivelRaiva}
                `);
    }
  }

  class Droide extends Personagem{
    protected funcao: string;
    constructor(nome: string, planeta: string, energia: number, funcao: string){
        super(nome, planeta, energia);
        this.funcao = funcao;
    }
    
    apresentar(): void {
       console.log(`======== Droide ======== 
                     Nome ${this.nome} 
                     Planeta: ${this.planeta_origem}  
                     Energia: ${this.nivel_energia}
       `);
    }

    usarHabilidade(): void {
            console.log(`O Droide ${this.nome} executou sua função - ${this.funcao}
            `);
    }
  }

  class Mandaloriano extends Personagem{
    protected armaPrincipal: string;
    constructor(nome: string, planeta: string, energia: number, armaPrincipal: string){
        super(nome,planeta,energia);
        this.armaPrincipal = armaPrincipal;        
    }

     apresentar(): void {
       console.log(`======== Mandaloriano ======== 
                     Nome ${this.nome} 
                     Planeta: ${this.planeta_origem}  
                     Energia: ${this.nivel_energia}
       `);
    }

    usarHabilidade(): void {
            console.log(`O Mandaloriano ${this.nome} atacou com - ${this.armaPrincipal}
            `);
    } 
  }

const jedi1 = new Jedi("Yoda", "Dagobah", 98, "verde");
jedi1.apresentar();
jedi1.usarHabilidade();

const sith1 = new Sith("Lord Palpatine", "Exegol", 98, 100);
sith1.apresentar();
sith1.usarHabilidade();

const droide1 = new Droide("C3PO", "Tatooine", 80, "Protocolo e comunicação");
droide1.apresentar();
droide1.usarHabilidade();

const mandaloriano1 = new Mandaloriano("Boba Fett", "Concord Down", 85, "blaster");
mandaloriano1.apresentar();
mandaloriano1.usarHabilidade();



 

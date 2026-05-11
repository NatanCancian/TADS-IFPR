class Pessoa {
    protected nome : string;
    protected idade : number;

    constructor(nome: string, idade: number){
        this.nome = nome;
        this.idade = idade;
    }

    apresentar(): void{
        console.log(`Meu nome é ${this.nome}, tenho ${this.idade}`);
    }
}
    class Aluno extends Pessoa{
        protected matricula : string;
        protected curso : string;

        constructor(nome: string, idade: number, matricula: string, curso: string){
            super(nome, idade);
            this.matricula = matricula;
            this.curso = curso;
        }
        
        exibirDadosAluno(): void{
            console.log(`Nome: ${this.nome}, 
                idade: ${this.idade}, 
                matricula: ${this.matricula},
                curso: ${this.curso}`);
        }
    }
    
    class Professor extends Pessoa{
        protected disciplina : string;
        constructor(nome: string, idade: number, disciplina: string){
            super(nome,idade);
            this.disciplina = disciplina;
        }

       apresentar(): void {
            console.log(`Eu sou o professor ${this.nome}, tenho ${this.idade} anos,
                 leciono a disciplina de: ${this.disciplina}`);
        }    

        darAula(): void{
            console.log(`O professor ${this.nome}, está dando aula de ${this.disciplina}`);
        }
    }

    class Coordenador extends Pessoa{
        protected cursoCoordenado: string;

        constructor(nome: string, idade: number, curso: string){
            super(nome,idade);
            this.cursoCoordenado = curso;
        }

        apresentar(): void {
            console.log(`Eu sou o coordenador ${this.nome}, e coordeno o curso de: ${this.cursoCoordenado}`);
        }

        fazerReuniao(): void{
            console.log(`O ${this.nome}, está em reunião de colegiado do curso de ${this.cursoCoordenado}`);
        }
    }


    class Veiculo{
        protected marca: string;
        protected modelo: string;

        constructor(marca: string, modelo: string){
            this.marca = marca;
            this.modelo = modelo;
        }

        exibirDados(): void{
            console.log(`${this.constructor.name}, marca: ${this.marca}, modelo: ${this.modelo}`);
             
        }
    }

    class Carro extends Veiculo{ 
        protected quantidadePortas: number;
        constructor(marca: string, modelo: string, portas: number){
            super(marca, modelo);
            this.quantidadePortas = portas;
        }

        ligarSom(): void{
            console.log(`Som do ${this.modelo} ligado: ♪♪♫♫♪♪ TUTS TUTS QUERO VER ♪♪♫♫♪♪`);
        }

        exibirDados(): void {
            console.log(`Carro : ${this.marca} ${this.modelo}, ${this.quantidadePortas} portas`);
            
        }
    }

    class Moto extends Veiculo{
        protected cilindradas: number;
        constructor(marca: string, modelo: string, cilindradas: number){
        super(marca, modelo);
        this.cilindradas = cilindradas;    
        }

        acelerar(): void{
            console.log(`${this.modelo}: VRUMMMM`);
        }
        
        exibirDados(): void {
            console.log(`Moto : ${this.marca} ${this.modelo}, ${this.cilindradas}cc`);
            
        }        
    }

    class Caminhao extends Veiculo{
        protected carga : string;
        constructor(marca: string, modelo: string, carga: string){
            super(marca,modelo);
            this.carga = carga;
        }

        carregar(): void{
            console.log(`O ${this.constructor.name} de ${this.carga} está carregado!`);
        }

        exibirDados(): void {
            console.log(`Caminhão : ${this.marca} ${this.modelo}, levando ${this.carga}`);
        }       
    }

    class Funcionario{
        protected nome: string;
        protected salario: number;

        constructor(nome: string, salario: number){
            this.nome = nome;
            this.salario = salario;
        }
    }

    class Gerente extends Funcionario{

        exibirDadosGerente(): void{
            console.log(`Nome: ${this.nome}, salário: ${this.salario}`);
        }
    }

    class Conta{
        private saldo : number;
        constructor(saldo: number){
            this.saldo = saldo;
        }
    }

    class ContaPremium extends Conta{
        constructor(saldo: number){
            super(saldo);
        }

        acessarSaldo(): void{
            console.log(`${this.saldo}`)
        }

        /* 1. O código funciona?
       R: Funciona, porém a classe ContaPremium não consegue 
       acessar o saldo diretamente por ser atributo privado
       
       2. Por que private impede esse acesso?
       R: Porque quando um atributo é definido como Private ele
       só é acessível na classe onde foi declarado/instânciado, 
       ou por meio de um método getSaldo(), acessando através do 
       método sem acessar diretamente saldo.

       3. O que mudaria se o atributo fosse protected?
       R: Se fosse definido para protected o saldo poderia ser
       acessado diretamente, pois protected permite as classes 
       de dentro do package ou subclasse acessar o atributo. 
    */        
    }

    class FuncionarioEscola{
        protected nome: string;
        protected idade: number;
        protected salario: number;

        constructor(nome: string, idade: number, salario: number){
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;            
        }
    }

    class ProfessorEscola extends FuncionarioEscola{
        constructor(nome: string, idade: number, salario: number){
            super(nome,idade,salario);
        }

        darAula(): void{
            console.log(`O professor ${this.nome}, está dando aula!`);
        }
    }

    class Zelador extends FuncionarioEscola{
        constructor(nome: string, idade: number, salario: number){
            super(nome,idade,salario);
        }

        limparAmbiente(): void{
            console.log(`O ${this.constructor.name} ${this.nome}, está limpando o ambiente!`);
        }
    }

    class Secretario extends FuncionarioEscola{
        constructor(nome: string, idade: number, salario: number){
            super(nome,idade,salario);
        }

        organizarDocumentos(): void{
            console.log(`O ${this.constructor.name} ${this.nome}, está organizando documentos!`);
        }
    }

    class PessoaSistema{
        protected nome: string;
        protected idade: number;
        constructor(nome: string, idade: number){
            this.nome = nome;
            this.idade = idade;
        }

        apresentar(){
            console.log(`Olá meu nome é ${this.nome}`);            
        }
    }

    class AlunoSistema extends PessoaSistema{
        private matricula: string;
        constructor(nome: string, idade: number, matricula: string){
            super(nome,idade);
            this.matricula = matricula;
        }

        apresentar(): void {
            console.log(`Meu nome é ${this.nome}, e minha matrícula é ${this.matricula}`);
        }
    }

    class ProfessorSistema extends PessoaSistema{
        private disciplina: string;
         constructor(nome: string, idade: number, disciplina: string){
            super(nome,idade);
            this.disciplina = disciplina;
        }

        apresentar(): void {
            console.log(`Meu nome é ${this.nome}, sou professor da disciplina ${this.disciplina}`);
        }
    }
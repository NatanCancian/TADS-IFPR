class Animal{
    protected nome: string;

    constructor(nome: string){
        this.nome = nome;
    }

    public emitirSom(): void{

    }
}

class Cachorro extends Animal{
    
    public emitirSom(): void{
        console.log(`${this.nome} latiu: Au Au!`);                
    }
}

class Gato extends Animal{

    public emitirSom(): void{
        console.log(`${this.nome} miou: Miau!`);                
    }
}

class Vaca extends Animal{

    public emitirSom(): void{
        console.log(`${this.nome} mugiu: Muuuu!`);                
    }
}

const animal1 = new Cachorro("Rex");
const animal2 = new Gato("Mimi");
const animal3 = new Vaca("Marylou");

animal1.emitirSom();
animal2.emitirSom();
animal3.emitirSom();
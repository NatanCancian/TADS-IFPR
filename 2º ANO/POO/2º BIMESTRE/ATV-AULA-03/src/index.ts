abstract class Personagem{
    constructor(protected nome: string, protected energia: number){}

    abstract atacar(): void;

    exibirStatus(): void{
        console.log(`Nome: ${this.nome} , Energia: ${this.energia} `);
    }
}

class Guerreiro extends Personagem{
    atacar(): void {
        console.log("ESPADADA");
    }
}

class Mago extends Personagem{
    atacar(): void {
        console.log("BOLA DE FOGO");
    }
}

class Arqueiro extends Personagem{
    atacar(): void {
        console.log("FLECHADA NA PALETA");
    }
}

const listaPersonagens: Personagem[] = [];
listaPersonagens.push(new Guerreiro("Conan",200));
listaPersonagens.push(new Mago("Gandalf", 400));
listaPersonagens.push(new Arqueiro("Legolas", 200));

for (const personagens of listaPersonagens) {
    personagens.exibirStatus();
    personagens.atacar();
}
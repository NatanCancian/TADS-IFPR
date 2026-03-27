class Pessoa {

  constructor(private nome: string, private idade: number) {}

  public copiar(): Pessoa {
    return new Pessoa(this.nome, this.idade);
  }

  public apresentar(): string {
    return `Nome: ${this.nome}, Idade: ${this.idade}`;
  }
}

const pessoa1 = new Pessoa("Nelson", 40);
const pessoa2 = pessoa1.copiar();

console.log("\nPessoa 1: ");
console.log(pessoa1.apresentar());

console.log("\nPessoa 2: ");
console.log(pessoa2.apresentar());

console.log("\nOs objetos são iguais na memória?", pessoa1 === pessoa2)
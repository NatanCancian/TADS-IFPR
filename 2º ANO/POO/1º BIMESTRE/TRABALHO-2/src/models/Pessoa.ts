export class Pessoa {

  constructor(private nome: string, private idade: number) {}

  public copiar(): Pessoa {
    return new Pessoa(this.nome, this.idade);
  }

  public apresentar(): string {
    return `Nome: ${this.nome}, Idade: ${this.idade}`;
  }
}
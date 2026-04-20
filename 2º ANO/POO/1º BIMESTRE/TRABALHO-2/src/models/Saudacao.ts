export class Saudacao{
public exibir(nome: string): void;
  public exibir(nome: string, titulo: string): void;

  public exibir(nome: string, titulo?: string): void {
    if (titulo) {
      console.log(`Olá, ${titulo} ${nome}!`);
    } else {
      console.log(`Olá, ${nome}!`);
    }
  }
}


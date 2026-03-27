class Saudacao {
  public falar(nome: string): void {
    console.log(`Olá, ${nome}!`);
  }
}

const s = new Saudacao();
s.falar("Nelson");
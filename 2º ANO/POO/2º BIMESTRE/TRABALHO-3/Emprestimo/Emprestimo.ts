export class Emprestimo {
  protected n: number;
  protected j: number;
  protected corrente: number;
  protected p: number;

  constructor(s: number, n: number, j: number) {
    this.n = n;
    this.j = j;
    this.corrente = 1;
    this.p = s;
  }

  public proximaParcela(): number {
    let retorno = this.p;
    this.corrente++;
    if (this.corrente <= this.n) {
      this.p = this.p + (this.p * (this.j / 100));
    } else {
      this.p = 0;
    }
    return retorno;
  }
}

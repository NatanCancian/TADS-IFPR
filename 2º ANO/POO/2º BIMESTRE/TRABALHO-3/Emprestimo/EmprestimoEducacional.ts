import { Emprestimo } from "./Emprestimo";

export class EmprestimoEducacional extends Emprestimo {
  private periodoIsencao: number;

  constructor(s: number, n: number, j: number, periodoIsencao: number) {
    super(s, n, j);
    this.periodoIsencao = periodoIsencao;
  }

  public getPeriodoIsencao(): number {
    return this.periodoIsencao;
  }

  public override proximaParcela(): number {
    const parcela = this.p;

    this.corrente++;

    if (this.corrente <= this.n) {
      if (this.corrente > this.periodoIsencao + 1) {
        this.p = this.p + (this.p * (this.j / 100));
      }
    } else {
      this.p = 0;
    }

    return parcela;
  }
}

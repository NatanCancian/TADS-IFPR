import { Emprestimo } from "./Emprestimo";

export class EmprestimoComDesconto extends Emprestimo {
  private percentualDesconto: number;

  constructor(s: number, n: number, j: number, percentualDesconto: number) {
    super(s, n, j);
    this.percentualDesconto = percentualDesconto;
  }

  public getPercentualDesconto(): number {
    return this.percentualDesconto;
  }

  public override proximaParcela(): number {
    const ultimaParcela = this.corrente === this.n;
    let parcela = super.proximaParcela();

    if (parcela > 0 && ultimaParcela) {
      parcela -= parcela * (this.percentualDesconto / 100);
    }

    return parcela;
  }
}

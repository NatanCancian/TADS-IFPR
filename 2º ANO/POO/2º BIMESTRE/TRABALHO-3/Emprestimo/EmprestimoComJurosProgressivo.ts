import { Emprestimo } from "./Emprestimo";

export class EmprestimoComJurosProgressivo extends Emprestimo {
  private acrescimoJuros: number;

  constructor(s: number, n: number, jurosInicial: number, acrescimoJuros: number) {
    super(s, n, jurosInicial);
    this.acrescimoJuros = acrescimoJuros;
  }

  public getAcrescimoJuros(): number {
    return this.acrescimoJuros;
  }

  public override proximaParcela(): number {
    const parcela = super.proximaParcela();

    if (parcela > 0) {
      this.j += this.acrescimoJuros;
    }

    return parcela;
  }
}

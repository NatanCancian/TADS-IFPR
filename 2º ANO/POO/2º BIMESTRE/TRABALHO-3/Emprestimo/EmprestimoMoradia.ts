import { Emprestimo } from "./Emprestimo";

export class EmprestimoMoradia extends Emprestimo {
  private seguroMoradia: boolean;

  constructor(s: number, n: number, j: number, temSeguroMoradia: boolean) {
    super(s, n, n > 120 ? j * 0.85 : j);
    this.seguroMoradia = temSeguroMoradia;
  }

  public temSeguro(): boolean {
    return this.seguroMoradia;
  }

  public override proximaParcela(): number {
    let parcela = super.proximaParcela();

    if (parcela > 0 && this.seguroMoradia) {
      parcela += 10;
    }

    return parcela;
  }
}

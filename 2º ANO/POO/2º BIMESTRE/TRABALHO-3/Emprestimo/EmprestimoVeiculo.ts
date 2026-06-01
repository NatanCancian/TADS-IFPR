import { Emprestimo } from "./Emprestimo";

export class EmprestimoVeiculo extends Emprestimo {
  private tipo: string;
  private parcelasOriginais: number;

  constructor(s: number, n: number, j: number, tipo: string) {
    super(s, n, tipo === "usado" ? j + 1 : j);

    this.tipo = tipo;
    this.parcelasOriginais = n;
  }

  public getTipo(): string {
    return this.tipo;
  }

  public override proximaParcela(): number {
    let parcela = super.proximaParcela();

    if (parcela > 0 && this.parcelasOriginais > 60) {
      parcela += parcela * 0.02;
    }

    return parcela;
  }
}

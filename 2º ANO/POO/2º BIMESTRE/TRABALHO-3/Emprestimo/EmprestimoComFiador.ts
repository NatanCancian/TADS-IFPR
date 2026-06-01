import { Emprestimo } from "./Emprestimo";

export class EmprestimoComFiador extends Emprestimo {
  private temFiador: boolean;

  constructor(s: number, n: number, j: number, temFiador: boolean) {
    super(s, n, temFiador ? j * 0.8 : j * 1.05);
    this.temFiador = temFiador;
  }

  public verificarFiador(): boolean {
    return this.temFiador;
  }

  public override proximaParcela(): number {
    return super.proximaParcela();
  }
}

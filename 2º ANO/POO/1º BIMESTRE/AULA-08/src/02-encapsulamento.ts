class _ContaBancaria {
  private saldo: number = 0;

  public depositar(valor: number): void {
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public consultarSaldo(): number {
    return this.saldo;
  }
}

const _conta = new _ContaBancaria();
_conta.depositar(500);
console.log("Saldo:", conta.consultarSaldo());

// Erro de compilação se descomentar a linha abaixo:
// console.log(conta.saldo);

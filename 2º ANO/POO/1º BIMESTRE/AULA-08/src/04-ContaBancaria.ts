class ContaBancaria {
  private titular: string;
  private saldo: number;

  constructor(titular: string, saldoInicial: number = 0) {
    this.titular = titular;
    this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
  }

  public depositar(valor: number): void {
    if (valor <= 0) {
      console.log("Valor de depósito inválido.");
      return;
    }

    this.saldo += valor;
    console.log(`Depósito de R$ ${valor.toFixed(2)} realizado com sucesso.`);
  }

  public sacar(valor: number): void {
    if (valor <= 0) {
      console.log("Valor de saque inválido.");
      return;
    }

    if (valor > this.saldo) {
      console.log("Saldo insuficiente.");
      return;
    }

    this.saldo -= valor;
    console.log(`Saque de R$ ${valor.toFixed(2)} realizado com sucesso.`);
  }

  public consultarSaldo(): number {
    return this.saldo;
  }

  public exibirDados(): void {
    console.log(`Titular: ${this.titular}`);
    console.log(`Saldo: R$ ${this.saldo.toFixed(2)}`);
  }
}

const conta = new ContaBancaria("Nelson", 1000);
conta.exibirDados();
conta.depositar(250);
conta.sacar(100);
console.log(`Saldo atual: R$ ${conta.consultarSaldo().toFixed(2)}`);
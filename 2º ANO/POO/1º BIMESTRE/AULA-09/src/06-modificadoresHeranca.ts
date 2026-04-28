class Animal {
  nome: string;

  constructor(nome: string) {
    this.nome = nome;
  }
}
  class Gato extends Animal{
    public miar(): void{
        console.log(`${this.nome} miou!`);
    }
  }

  const gato = new Gato("Mimi");
  gato.miar();

  class Conta{
    private saldo: number;

    constructor(saldo: number){
        this.saldo = saldo;
    }

    public consultarSaldo(): number {
        return this.saldo;
    }
  }

    class ContaEspacial extends Conta {
        public exibirMsg(): void{
            console.log("A subclasse não acessa diretamente um atributo private da superclasse");
        }
    }

    const conta1 = new ContaEspacial(1000);
    conta1.exibirMsg();
    console.log(`Saldo consultado por método público R$ ${conta1.consultarSaldo().toFixed(2)}`);

    export{};
  


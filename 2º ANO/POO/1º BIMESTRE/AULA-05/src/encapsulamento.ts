class ContaBancaria{

    private saldo: number = 0;

    public depositar(valor:number):void{
        if(valor > 0){
            this.saldo += valor;
        }
    }
    
    public consultaSaldo():number{
        return this.saldo;
    }
    
    public exibirMsg():void{
        console.log("Executando operação....");
    }
}

const conta = new ContaBancaria();
conta.depositar(500);
console.log("Saldo: ", conta.consultaSaldo());


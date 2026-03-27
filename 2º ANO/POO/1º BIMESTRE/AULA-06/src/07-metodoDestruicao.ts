class Conexao {
    private ativa: boolean = true;

    public fechar(): void{
        this.ativa = false;
        console.log("Conexão encerrada...");
    }

    public estaAtiva(): boolean{
        return this.ativa;
    }

    public exibirStatus(): void{
        console.log(`A conexão está ${this.ativa ? "ativa" : "encerrada!"}`);         
        
    }
}

const conexao1 = new Conexao();
conexao1.exibirStatus();
console.log("Está ativa? ", conexao1.estaAtiva());

conexao1.fechar();

console.log("Está ativa? ", conexao1.estaAtiva());
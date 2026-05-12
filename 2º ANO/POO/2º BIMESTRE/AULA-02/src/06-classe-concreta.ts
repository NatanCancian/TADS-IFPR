class Produto{
    private nome: string;
    private preco: number;

    constructor(nome: string, preco: number){
        this.nome = nome;
        this.preco = preco;
    }

    public exibirDados(): void{
        console.log(`Produto: ${this.nome}`);
        console.log(`Preço: ${this.preco.toFixed(2)}`);        
    }
}

const prod = new Produto("Mouse", 89.9);
prod.exibirDados();

export{};